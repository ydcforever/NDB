package com.antlr;

import com.antlr.generate.SqlLexer;
import com.antlr.generate.SqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by ydc on 2019/8/29.
 */
public class SqlFactory {

    private SqlListenerImpl listener;

    public void parser(String str) throws Exception {
        //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream in = new ANTLRInputStream(str);
        //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        SqlLexer lexer = new SqlLexer(in);
        //用词法分析器 lexer 构造一个记号流 tokes
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        SqlParser parser = new SqlParser(tokens);
        //最终调用语法分析器的规则 prog，完成对表达式的验证
        ParseTree tree = parser.statement();
        ParseTreeWalker walker = new ParseTreeWalker();
        listener = new SqlListenerImpl();
        walker.walk(listener, tree);
    }

    public SqlListenerImpl getListener() {
        return listener;
    }
}
