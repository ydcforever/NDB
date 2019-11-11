package com.ndb.lexer;

import com.ndb.lexer.token.DefaultKeyword;
import com.ndb.lexer.token.Keyword;
import com.ndb.lexer.token.TokenType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ydc on 2019/5/26.
 */
public final class Dictionary {

    private final Map<String, TokenType> tokens = new HashMap<String, TokenType>();

    public Dictionary() {
        fill();
    }

    /**
     * 生成对应的关键字表
     *
     * @param dialectKeywords 数据库独有关键字
     */
    public Dictionary(final Keyword... dialectKeywords) {
        fill();
        for (Keyword keyword : dialectKeywords) {
            tokens.put(keyword.toString(), keyword);
        }
    }

    private void fill() {
        for (DefaultKeyword key : DefaultKeyword.values()) {
            tokens.put(key.name(), key);
        }
    }

    public Map getTokens() {
        return tokens;
    }

    TokenType findTokenType(final String literals, final TokenType defaultTokenType) {
        try {
            return findTokenType(literals);
        } catch (IllegalArgumentException e) {
            return defaultTokenType;
        }
    }

    TokenType findTokenType(final String literals) {
        String key = null == literals ? null : literals.toUpperCase();
        if (tokens.containsKey(key)) {
            return tokens.get(key);
        }
        throw new IllegalArgumentException();
    }
}
