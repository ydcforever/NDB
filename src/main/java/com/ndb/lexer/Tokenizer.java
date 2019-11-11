package com.ndb.lexer;

import com.ndb.lexer.token.*;

/**
 * Created by ydc on 2019/5/26.
 */
public class Tokenizer {

    private static final int MYSQL_SPECIAL_COMMENT_BEGIN_SYMBOL_LENGTH = 1;

    private static final int COMMENT_BEGIN_SYMBOL_LENGTH = 2;

    private static final int HINT_BEGIN_SYMBOL_LENGTH = 3;

    private static final int COMMENT_AND_HINT_END_SYMBOL_LENGTH = 2;

    private static final int HEX_BEGIN_SYMBOL_LENGTH = 2;

    private final String input;

    private final Dictionary dictionary;

    private final int offset;

    public Tokenizer(String input, Dictionary dictionary, int offset) {
        this.input = input;
        this.dictionary = dictionary;
        this.offset = offset;
    }

    /**
     * skip whitespace.
     *
     * @return offset after whitespace skipped
     */
    public int skipWhitespace() {
        int length = 0;
        while (CharacterClassify.isWhitespace(charAt(offset + length))) {
            length++;
        }
        return offset + length;
    }

    /**
     * skip comment.
     *
     * @return offset after comment skipped
     */
    public int skipComment() {
        char current = charAt(offset);
        char next = charAt(offset + 1);
        if (isSingleLineCommentBegin(current, next)) {
            return skipSingleLineComment(COMMENT_BEGIN_SYMBOL_LENGTH);
        } else if ('#' == current) {
            return skipSingleLineComment(MYSQL_SPECIAL_COMMENT_BEGIN_SYMBOL_LENGTH);
        } else if (isMultipleLineCommentBegin(current, next)) {
            return skipMultiLineComment();
        }
        return offset;
    }

    /**
     * 单行注释
     *
     * @param ch
     * @param next
     * @return
     */
    private boolean isSingleLineCommentBegin(final char ch, final char next) {
        return '/' == ch && '/' == next || '-' == ch && '-' == next;
    }

    /**
     * 跳过单行注释
     * @param commentSymbolLength
     * @return
     */
    private int skipSingleLineComment(final int commentSymbolLength) {
        int length = commentSymbolLength;
        while (!CharacterClassify.isEndOfInput(charAt(offset + length)) && '\n' != charAt(offset + length)) {
            length++;
        }
        return offset + length + 1;
    }

    private boolean isMultipleLineCommentBegin(final char ch, final char next) {
        return '/' == ch && '*' == next;
    }

    private int skipMultiLineComment() {
        return untilCommentAndHintTerminateSign(COMMENT_BEGIN_SYMBOL_LENGTH);
    }

    /**
     * skip hint.
     *
     * @return offset after hint skipped
     */
    public int skipHint() {
        return untilCommentAndHintTerminateSign(HINT_BEGIN_SYMBOL_LENGTH);
    }

    private int untilCommentAndHintTerminateSign(final int beginSymbolLength) {
        int length = beginSymbolLength;
        while (!isMultipleLineCommentEnd(charAt(offset + length), charAt(offset + length + 1))) {
            if (CharacterClassify.isEndOfInput(charAt(offset + length))) {
                throw new IllegalStateException(String.valueOf("*/"));
            }
            length++;
        }
        return offset + length + COMMENT_AND_HINT_END_SYMBOL_LENGTH;
    }

    private boolean isMultipleLineCommentEnd(final char ch, final char next) {
        return '*' == ch && '/' == next;
    }

    /**
     * scan variable.
     *
     * @return variable token
     */
    public Token scanVariable() {
        int length = 1;
        if ('@' == charAt(offset + 1)) {
            length++;
        }
        while (isVariableChar(charAt(offset + length))) {
            length++;
        }
        return new Token(Literals.VARIABLE, input.substring(offset, offset + length), offset + length);
    }

    private boolean isVariableChar(final char ch) {
        return isIdentifierChar(ch) || '.' == ch;
    }

    /**
     * scan identifier.
     *
     * @return identifier token
     */
    public Token scanIdentifier() {
        if ('`' == charAt(offset)) {
            int length = getLengthUntilTerminatedChar('`');
            return new Token(Literals.IDENTIFIER, input.substring(offset, offset + length), offset + length);
        }
        if ('"' == charAt(offset)) {
            int length = getLengthUntilTerminatedChar('"');
            return new Token(Literals.IDENTIFIER, input.substring(offset, offset + length), offset + length);
        }
        if ('[' == charAt(offset)) {
            int length = getLengthUntilTerminatedChar(']');
            return new Token(Literals.IDENTIFIER, input.substring(offset, offset + length), offset + length);
        }
        int length = 0;
        while (isIdentifierChar(charAt(offset + length))) {
            length++;
        }
        String literals = input.substring(offset, offset + length);
        if (isAmbiguousIdentifier(literals)) {
            return new Token(processAmbiguousIdentifier(offset + length, literals), literals, offset + length);
        }
        return new Token(dictionary.findTokenType(literals, Literals.IDENTIFIER), literals, offset + length);
    }

    /**
     * 指定最近终止符位置
     *
     * @param terminatedChar
     * @return
     */
    private int getLengthUntilTerminatedChar(final char terminatedChar) {
        int length = 1;
        while (terminatedChar != charAt(offset + length) || hasEscapeChar(terminatedChar, offset + length)) {
            if (offset + length >= input.length()) {
                throw new IllegalStateException(String.valueOf(terminatedChar));
            }
            if (hasEscapeChar(terminatedChar, offset + length)) {
                length++;
            }
            length++;
        }
        return length + 1;
    }

    private boolean hasEscapeChar(final char charIdentifier, final int offset) {
        return charIdentifier == charAt(offset) && charIdentifier == charAt(offset + 1);
    }

    private boolean isIdentifierChar(final char ch) {
        return CharacterClassify.isAlphabet(ch) || CharacterClassify.isDigital(ch) || '_' == ch || '$' == ch || '#' == ch;
    }

    private boolean isAmbiguousIdentifier(final String literals) {
        return DefaultKeyword.ORDER.name().equalsIgnoreCase(literals) || DefaultKeyword.GROUP.name().equalsIgnoreCase(literals);
    }

    private TokenType processAmbiguousIdentifier(final int offset, final String literals) {
        int i = 0;
        while (CharacterClassify.isWhitespace(charAt(offset + i))) {
            i++;
        }
        if (DefaultKeyword.BY.name().equalsIgnoreCase(String.valueOf(new char[] {charAt(offset + i), charAt(offset + i + 1)}))) {
            return dictionary.findTokenType(literals);
        }
        return Literals.IDENTIFIER;
    }

    /**
     * scan hex decimal.
     *
     * @return hex decimal token
     */
    public Token scanHexDecimal() {
        int length = HEX_BEGIN_SYMBOL_LENGTH;
        if ('-' == charAt(offset + length)) {
            length++;
        }
        while (isHex(charAt(offset + length))) {
            length++;
        }
        return new Token(Literals.HEX, input.substring(offset, offset + length), offset + length);
    }

    private boolean isHex(final char ch) {
        return ch >= 'A' && ch <= 'F' || ch >= 'a' && ch <= 'f' || CharacterClassify.isDigital(ch);
    }

    /**
     * scan number.
     *
     * @return number token
     */
    public Token scanNumber() {
        int length = 0;
        if ('-' == charAt(offset + length)) {
            length++;
        }
        length += getDigitalLength(offset + length);
        boolean isFloat = false;
        if ('.' == charAt(offset + length)) {
            isFloat = true;
            length++;
            length += getDigitalLength(offset + length);
        }
        if (isScientificNotation(offset + length)) {
            isFloat = true;
            length++;
            if ('+' == charAt(offset + length) || '-' == charAt(offset + length)) {
                length++;
            }
            length += getDigitalLength(offset + length);
        }
        if (isBinaryNumber(offset + length)) {
            isFloat = true;
            length++;
        }
        return new Token(isFloat ? Literals.FLOAT : Literals.INT, input.substring(offset, offset + length), offset + length);
    }

    /**
     * 判断数字串长度
     * @param offset
     * @return
     */
    private int getDigitalLength(final int offset) {
        int len = 0;
        while (CharacterClassify.isDigital(charAt(offset + len))) {
            len++;
        }
        return len;
    }

    /**
     * 科学计数法字符
     *
     * @param offset
     * @return
     */
    private boolean isScientificNotation(final int offset) {
        char current = charAt(offset);
        return 'e' == current || 'E' == current;
    }

    private boolean isBinaryNumber(final int offset) {
        char current = charAt(offset);
        return 'f' == current || 'F' == current || 'd' == current || 'D' == current;
    }

    /**
     * 获取起止字符一致的中间字符串 scan chars.
     *
     * @return chars token
     */
    public Token scanChars() {
        return scanChars(charAt(offset));
    }

    /**
     * 获取其实字符到终止符前的字符串
     *
     * @param terminatedChar
     * @return
     */
    private Token scanChars(final char terminatedChar) {
        int length = getLengthUntilTerminatedChar(terminatedChar);
        return new Token(Literals.CHARS, input.substring(offset + 1, offset + length - 1), offset + length);
    }

    /**
     * 找到最近的symbol
     *
     * @return symbol token
     */
    public Token scanSymbol() {
        int length = 0;
        while (CharacterClassify.isSymbol(charAt(offset + length))) {
            length++;
        }
        //连续符号串
        String literals = input.substring(offset, offset + length);
        Symbol symbol;
        //单个有效符号
        while (null == (symbol = Symbol.literalsOf(literals))) {
            literals = input.substring(offset, offset + --length);
        }
        return new Token(symbol, literals, offset + length);
    }

    private char charAt(final int index) {
        return index >= input.length() ? (char) CharacterClassify.EOI : input.charAt(index);
    }

    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer("cc{>=;;;{B;;;}",new Dictionary(), 2);
        Token token = tokenizer.scanChars('}');
        System.out.println(token.getPiece());
    }
}
