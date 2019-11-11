package com.ndb.lexer;

import com.ndb.lexer.token.Token;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydc on 2019/5/27.
 */
public class LexerTest {

    public static List<Token> analyzer(String input, Dictionary dictionary) {
        List<Token> list = new ArrayList<Token>();
        Lexer lexer = new Lexer(input, dictionary, 0);
        while(!lexer.isEnd()) {
            lexer.nextToken();
            list.add(lexer.getCurrentToken());
        }
        return list;
    }

    @Test
    public void test() {
        List<Token> list = analyzer("select * from atp f where f.abd = t.d", new Dictionary());
        for(Token token : list) {
            System.out.println(token.toString());
        }

//        Lexer lexer = new Lexer("select * from atp", new Dictionary(), 0);
//        lexer.nextToken();
//        Lexer lexer1 = new Lexer("select * from atp", new Dictionary(), lexer.getCurrentToken().getEndPosition());
//        lexer1.nextToken();
//        System.out.println(lexer1.getCurrentToken().getPiece());
    }

    @Test
    public void test1() {
        List<Token> list = analyzer("update user t set t.c = 'A' where t.d='C'", new Dictionary());
        for(Token token : list) {
            System.out.println(token.toString());
        }

//        Lexer lexer = new Lexer("select * from atp", new Dictionary(), 0);
//        lexer.nextToken();
//        Lexer lexer1 = new Lexer("select * from atp", new Dictionary(), lexer.getCurrentToken().getEndPosition());
//        lexer1.nextToken();
//        System.out.println(lexer1.getCurrentToken().getPiece());
    }
}
