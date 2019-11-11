package com.ndb.lexer;

import com.ndb.lexer.token.Assist;
import com.ndb.lexer.token.Token;

/**
 * Created by ydc on 2019/5/26.
 */
public class Lexer {

    private final String input;

    private final Dictionary dictionary;

    private int offset;

    private Token currentToken;

    public Lexer(String input, Dictionary dictionary, int offset) {
        this.input = input;
        this.dictionary = dictionary;
        this.offset = offset;
    }

    /**
     * Analyse next token.
     */
    public final void nextToken() {
        skipIgnoredToken();
        if (isVariableBegin()) {
            currentToken = new Tokenizer(input, dictionary, offset).scanVariable();
        } else if (isNCharBegin()) {
            currentToken = new Tokenizer(input, dictionary, ++offset).scanChars();
        } else if (isIdentifierBegin()) {
            currentToken = new Tokenizer(input, dictionary, offset).scanIdentifier();
        } else if (isHexDecimalBegin()) {
            currentToken = new Tokenizer(input, dictionary, offset).scanHexDecimal();
        } else if (isNumberBegin()) {
            currentToken = new Tokenizer(input, dictionary, offset).scanNumber();
        } else if (isSymbolBegin()) {
            currentToken = new Tokenizer(input, dictionary, offset).scanSymbol();
        } else if (isCharsBegin()) {
            currentToken = new Tokenizer(input, dictionary, offset).scanChars();
        } else if (isEnd()) {
            currentToken = new Token(Assist.END, "", offset);
        } else {
            throw new IllegalStateException("ERROR");
        }
        offset = currentToken.getEndPosition();
    };

    private void skipIgnoredToken() {
        offset = new Tokenizer(input, dictionary, offset).skipWhitespace();
        while (isHintBegin()) {
            offset = new Tokenizer(input, dictionary, offset).skipHint();
            offset = new Tokenizer(input, dictionary, offset).skipWhitespace();
        }
        while (isCommentBegin()) {
            offset = new Tokenizer(input, dictionary, offset).skipComment();
            offset = new Tokenizer(input, dictionary, offset).skipWhitespace();
        }
    }

    protected boolean isHintBegin() {
        return false;
    }

    protected boolean isCommentBegin() {
        char current = getCurrentChar(0);
        char next = getCurrentChar(1);
        return '/' == current && '/' == next || '-' == current && '-' == next || '/' == current && '*' == next;
    }

    protected boolean isVariableBegin() {
        return false;
    }

    protected boolean isSupportNChars() {
        return false;
    }

    private boolean isNCharBegin() {
        return isSupportNChars() && 'N' == getCurrentChar(0) && '\'' == getCurrentChar(1);
    }

    private boolean isIdentifierBegin() {
        return isIdentifierBegin(getCurrentChar(0));
    }

    protected boolean isIdentifierBegin(final char ch) {
        return CharacterClassify.isAlphabet(ch) || '`' == ch || '_' == ch || '$' == ch;
    }

    private boolean isHexDecimalBegin() {
        return '0' == getCurrentChar(0) && 'x' == getCurrentChar(1);
    }

    private boolean isNumberBegin() {
        return CharacterClassify.isDigital(getCurrentChar(0)) || ('.' == getCurrentChar(0) && CharacterClassify.isDigital(getCurrentChar(1)) && !isIdentifierBegin(getCurrentChar(-1))
                || ('-' == getCurrentChar(0) && ('.' == getCurrentChar(1) || CharacterClassify.isDigital(getCurrentChar(1)))));
    }

    private boolean isSymbolBegin() {
        return CharacterClassify.isSymbol(getCurrentChar(0));
    }

    protected boolean isCharsBegin() {
        return '\'' == getCurrentChar(0) || '\"' == getCurrentChar(0);
    }

    public boolean isEnd() {
        return offset >= input.length();
    }

    protected final char getCurrentChar(final int offset) {
        return this.offset + offset >= input.length() ? (char) CharacterClassify.EOI : input.charAt(this.offset + offset);
    }

    public String getInput() {
        return input;
    }

    public Token getCurrentToken() {
//        skipIgnoredToken();
//        if (isVariableBegin()) {
//            currentToken = new Tokenizer(input, dictionary, offset).scanVariable();
//        } else if (isNCharBegin()) {
//            currentToken = new Tokenizer(input, dictionary, ++offset).scanChars();
//        } else if (isIdentifierBegin()) {
//            currentToken = new Tokenizer(input, dictionary, offset).scanIdentifier();
//        } else if (isHexDecimalBegin()) {
//            currentToken = new Tokenizer(input, dictionary, offset).scanHexDecimal();
//        } else if (isNumberBegin()) {
//            currentToken = new Tokenizer(input, dictionary, offset).scanNumber();
//        } else if (isSymbolBegin()) {
//            currentToken = new Tokenizer(input, dictionary, offset).scanSymbol();
//        } else if (isCharsBegin()) {
//            currentToken = new Tokenizer(input, dictionary, offset).scanChars();
//        } else if (isEnd()) {
//            currentToken = new Token(Assist.END, "", offset);
//        } else {
//            throw new IllegalStateException("ERROR");
//        }
        return currentToken;
    }
}
