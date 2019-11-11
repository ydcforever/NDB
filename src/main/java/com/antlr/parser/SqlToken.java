package com.antlr.parser;

/**
 * Created by ydc on 2019/8/29.
 */
public class SqlToken {
    private String token;

    public SqlToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token;
    }
}
