package com.ndb.parser;

import com.ndb.lexer.Dictionary;
import com.ndb.lexer.Lexer;
import com.ndb.lexer.token.DefaultKeyword;
import com.ndb.lexer.token.Token;
import com.ndb.lexer.token.TokenType;
import com.ndb.parser.select.SelectParser;

/**
* Created by ydc on 2019/8/25.
*/
public class SqlParserFactory {
    public static SqlParser newInstance(final Lexer lexer) throws SqlParserException{
        lexer.nextToken();
        Token token = lexer.getCurrentToken();
        TokenType tokenType = token.getTokenType();
        // 第一个token类型一定是默认关键词，否则抛出异常。构造这种异常很简单，只需要定义的SQL以MySQLKeyword中的关键词开头即可，例如"show create table t_order o"
        if (!(tokenType instanceof DefaultKeyword)) {
            throw new SqlParserException("failure");
        }
        // 根据第一个token类型得到具体解析器，且第一个token一定是：select，insert，update，delete，create，alter，drop，truncate中的一个，否则会抛出SQLParsingUnsupportedException异常。构造这种异常很简单，只需要定义的sql以DefaultKeyword中的关键词开头，且不是下面枚举的关键词即可，例如"DATABASE SELECT o.* FROM t_order o"
        switch ((DefaultKeyword) tokenType) {
            // 从这里可知，为什么前面要调用lexerEngine.nextToken()获取第一个token，SQLParserFactory根据这个token才能确实哪种类型的SQL解析器
            case SELECT:
                return new SelectParser(); //SelectParserFactory.newInstance(dbType, shardingRule, lexerEngine);
//            case INSERT:
//                return InsertParserFactory.newInstance(dbType, shardingRule, lexerEngine);
//            case UPDATE:
//                return UpdateParserFactory.newInstance(dbType, shardingRule, lexerEngine);
//            case DELETE:
//                return DeleteParserFactory.newInstance(dbType, shardingRule, lexerEngine);
//            case CREATE:
//                return CreateParserFactory.newInstance(dbType, shardingRule, lexerEngine);
//
//          case ALTER:
//                return AlterParserFactory.newInstance(dbType, shardingRule, lexerEngine);
//            case DROP:
//                return DropParserFactory.newInstance(dbType, shardingRule, lexerEngine);
//            case TRUNCATE:
//                return TruncateParserFactory.newInstance(dbType, shardingRule, lexerEngine);
            default:
                throw new IllegalStateException("failure");
        }
    }

    public static void main(String[] args) throws Exception{
        Lexer lexer = new Lexer("select a, b from dual where a=b", new Dictionary(), 0);
        Statement.Select select = SqlParserFactory.newInstance(lexer).SelectParser(lexer);
        System.out.println(select.toString());
    }
}
