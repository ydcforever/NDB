package com.ndb.lexer;

/**
 * Created by ydc on 2019/5/26.
 */
public class CharacterClassify {

    /**
     * End of input.
     */
    public static final byte EOI = 0x1A;

    /**
     * Judge is whitespace or not.
     *
     * @param ch to be judged char
     * @return is whitespace or not
     */
    public static boolean isWhitespace(final char ch) {
        return ch <= 0x20 && EOI != ch || ch >= 0x7F && ch <= 0xA0;
    }

    /**
     * Judge is end of input or not.
     *
     * @param ch to be judged char
     * @return is end of input or not
     */
    public static boolean isEndOfInput(final char ch) {
        return ch == EOI;
    }

    /**
     * Judge is alphabet or not.
     *
     * @param ch to be judged char
     * @return is alphabet or not
     */
    public static boolean isAlphabet(final char ch) {
        return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
    }

    /**
     * Judge is digital or not.
     *
     * @param ch to be judged char
     * @return is alphabet or not
     */
    public static boolean isDigital(final char ch) {
        return ch >= '0' && ch <= '9';
    }

    /**
     * Judge is symbol or not.
     *
     * @param ch to be judged char
     * @return is symbol or not
     */
    public static boolean isSymbol(final char ch) {
        return '(' == ch || ')' == ch || '[' == ch || ']' == ch || '{' == ch || '}' == ch
                || '+' == ch || '-' == ch || '*' == ch || '/' == ch
                || '%' == ch || '^' == ch || '=' == ch || '>' == ch || '<' == ch
                || '~' == ch || '!' == ch || '?' == ch || '&' == ch ||
                '|' == ch || '.' == ch || ':' == ch || '#' == ch
                || ',' == ch || ';' == ch;
    }
}
