package com.ndb.lexer.token;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ydc on 2019/5/26.
 */
public enum Symbol implements TokenType, Keyword {

    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACE("{"),
    RIGHT_BRACE("}"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    SEMI(";"),
    COMMA(","),
    DOT("."),
    DOUBLE_DOT(".."),
    PLUS("+"),
    SUB("-"),
    STAR("*"),
    SLASH("/"),
    QUESTION("?"),
    EQ("="),
    GT(">"),
    LT("<"),
    BANG("!"),
    TILDE("~"),
    CARET("^"),
    PERCENT("%"),
    COLON(":"),
    DOUBLE_COLON("::"),
    COLON_EQ(":="),
    LT_EQ("<="),
    GT_EQ(">="),
    LT_EQ_GT("<=>"),
    LT_GT("<>"),
    BANG_EQ("!="),
    BANG_GT("!>"),
    BANG_LT("!<"),
    AMP("&"),
    BAR("|"),
    DOUBLE_AMP("&&"),
    DOUBLE_BAR("||"),
    DOUBLE_LT("<<"),
    DOUBLE_GT(">>"),
    AT("@"),
    POUND("#");

    private static Map<String, Symbol> symbols = new HashMap<String, Symbol>();

    private static Symbol[] operators;

    private final String literals;

    Symbol(String literals) {
        this.literals = literals;
    }

    static {
        for (Symbol each : Symbol.values()) {
            symbols.put(each.getLiterals(), each);
        }
        operators = new Symbol[]
                {PLUS, SUB, STAR, SLASH, EQ, GT, LT, CARET, PERCENT, LT_EQ, GT_EQ, LT_EQ_GT, LT_GT,
                        BANG_EQ, BANG_GT, BANG_LT, AMP, BAR, DOUBLE_AMP, DOUBLE_BAR, DOUBLE_LT, DOUBLE_GT};
    }

    /**
     * 通过字面量查找词法符号.
     *
     * @param literals 字面量
     * @return 词法符号
     */
    public static Symbol literalsOf(final String literals) {
        return symbols.get(literals);
    }

    public String getLiterals() {
        return literals;
    }

    public static Symbol[] getOperators() {
        return operators;
    }

    public static boolean isOperator(final String literals){
        for(Symbol each : Symbol.getOperators()){
            if(literals.equals(each.getLiterals())){
                return true;
            }
        }
        return false;
    }
}
