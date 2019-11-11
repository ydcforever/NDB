package com.ndb.lexer.token;

import com.ndb.lexer.token.TokenType;

/**
 * Created by ydc on 2019/5/26.
 */
public enum Literals implements TokenType {
    INT, FLOAT, HEX, CHARS, IDENTIFIER, VARIABLE;
}
