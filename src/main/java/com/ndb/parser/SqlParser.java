package com.ndb.parser;

import com.ndb.lexer.Lexer;
import com.ndb.lexer.token.Token;

import java.util.List;

/**
 * Created by ydc on 2019/8/25.
 */
public abstract class SqlParser {

    public Statement.Select SelectParser(Lexer lexer) {
        Statement.Select select = new Statement.Select();
        select.setFields(FieldParser(lexer));
        select.setTables(FromParser(lexer));
        if(!lexer.isEnd()) {
            select.setWhere(WhereParser(lexer));
        }
        return select;
    }

    public abstract List<Statement.Field> FieldParser(Lexer lexer);

    public abstract List<Token> FromParser(Lexer lexer);

    public abstract Statement.Where WhereParser(Lexer lexer);

}
