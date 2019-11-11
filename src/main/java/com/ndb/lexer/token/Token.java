package com.ndb.lexer.token;

/**
* Created by ydc on 2019/5/25.
*/
public class Token {

    /**
     * 词法类型标记
     */
    private TokenType tokenType;

    /**
     * 字符piece
     */
    private String piece;

    /**
     * 结束位置
     */
    private int endPosition;

    public Token() {

    }

    public Token(TokenType tokenType, String piece, int endPosition) {
        this.tokenType = tokenType;
        this.piece = piece;
        this.endPosition = endPosition;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public String getPiece() {
        return piece;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public boolean typeof(TokenType key){
        return tokenType.equals(key);
    }

    public boolean typeof(Symbol symbol){
        return symbol.getLiterals().equals(this.piece);
    }

    @Override
    public String toString() {
        return "Token{" +
                "piece='" + piece + '\'' +
                ", tokenType=" + tokenType +
                '}';
    }
}
