package com.antlr.parser;

import java.util.*;

/**
 * Created by ydc on 2019/8/29.
 */
public abstract class SqlAbstractEntry implements SqlEntry{

    private Collection<SqlToken> tokens = new ArrayList<SqlToken>();

    public SqlAbstractEntry(String... rawValues) {
        for(String s : rawValues) {
            this.tokens.add(new SqlToken(s));
        }
    }

    public Collection<SqlToken> getTokens() {
        return tokens;
    }

    public void add(SqlToken token) {
        this.tokens.add(token);
    }

    public void add(String value){
        this.tokens.add(new SqlToken(value));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(SqlToken token : tokens) {
            builder.append(token).append(" ");
        }
        String s = builder.toString();
        return s.substring(0, s.length() - 1);
    }

    /**
     * 为什么第二个字符是名字
     * @return
     */
    public String getName() {
        if(getTokens().isEmpty()) {
            return  null;
        }
        return getTokens().iterator().next().toString();
    }

    /**
     * 为什么跳过第一个token
     * @return
     */
    public List<String> getValues() {
        ArrayList<String> values = new ArrayList<String>();
        if(getTokens().size() < 2) {
            return values;
        }
        Iterator<SqlToken> it = getTokens().iterator();
        it.next();
        while(it.hasNext()) {
            values.add(it.next().toString());
        }
        return values;
    }

    public String getValue() {
        Iterator<String> iterator = getValues().iterator();
        StringBuilder builder = new StringBuilder();
        while(iterator.hasNext()) {
            builder.append(iterator.next());
            if(iterator.hasNext()) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

}
