package com.ndb.parser.select;

import com.ndb.lexer.Lexer;
import com.ndb.lexer.token.DefaultKeyword;
import com.ndb.lexer.token.Keyword;
import com.ndb.lexer.token.Symbol;
import com.ndb.lexer.token.Token;
import com.ndb.parser.SqlParser;
import com.ndb.parser.Statement;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ydc on 2019/8/16.
 */
public class SelectParser extends SqlParser {


    public boolean isLogic(final String literals) {
        return equal(DefaultKeyword.AND, literals) || equal(DefaultKeyword.OR, literals);
    }

    public boolean equal(Keyword keyword, final String literals) {
        return keyword.toString().equals(literals.toUpperCase());
    }

    @Override
    public List<Statement.Field> FieldParser(Lexer lexer) {
        List<Statement.Field> fields = new LinkedList<Statement.Field>();
        while (!lexer.isEnd()) {
            lexer.nextToken();
            Token fieldToken = lexer.getCurrentToken();
            if(fieldToken.typeof(DefaultKeyword.FROM))
                break;
            if (!fieldToken.typeof(Symbol.COMMA)) {
                Statement.Field field = new Statement.Field(fieldToken.getPiece());
                fields.add(field);
            }
        }
        return fields;
    }

    @Override
    public List<Token> FromParser(Lexer lexer) {
        List<Token> tables = new LinkedList<Token>();
        while(!lexer.isEnd()) {
            lexer.nextToken();
            Token table = lexer.getCurrentToken();
            if(table.typeof(DefaultKeyword.WHERE)) {
                break;
            }
            tables.add(lexer.getCurrentToken());
        }
        return tables;
    }

    @Override
    public Statement.Where WhereParser(Lexer lexer) {
        Statement.Where where = new Statement.Where();
        Stack<Token> stack = new Stack<Token>();
        while (!lexer.isEnd()) {
            lexer.nextToken();
            Token token = lexer.getCurrentToken();
            if(isLogic(token.getPiece())) {
                Statement.SingleExp singleExp = new Statement.SingleExp();
                singleExp.setRight(stack.pop());
                singleExp.setOperator(stack.pop());
                singleExp.setLeft(stack.pop());
                Statement.Exp exp = new Statement.Exp();
                exp.setLeft(singleExp);
                exp.setOperator(token);
                where.add(exp);
            } else {
                stack.push(token);
            }
        }

        Statement.SingleExp singleExp = new Statement.SingleExp();
        singleExp.setRight(stack.pop());
        singleExp.setOperator(stack.pop());
        singleExp.setLeft(stack.pop());
        Statement.Exp end = new Statement.Exp();
        end.setLeft(singleExp);
        end.setOperator(null);
        where.add(end);
        return where;
    }
}
