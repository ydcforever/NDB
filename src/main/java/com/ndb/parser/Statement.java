package com.ndb.parser;

import com.ndb.lexer.token.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydc on 2019/8/16.
 */
public interface Statement {
    class Field {
        String name;
        String type;
        int len;
        String value;

        public Field(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getLen() {
            return len;
        }

        public void setLen(int len) {
            this.len = len;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Field{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", length='" + len + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    class SingleExp {
        Token left;
        Token operator;
        Token right;

        public SingleExp() {
        }

        public Token getLeft() {
            return left;
        }

        public void setLeft(Token left) {
            this.left = left;
        }

        public Token getOperator() {
            return operator;
        }

        public void setOperator(Token operator) {
            this.operator = operator;
        }

        public Token getRight() {
            return right;
        }

        public void setRight(Token right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "SingleExp{" +
                    "left=" + left +
                    ", operator=" + operator +
                    ", right=" + right +
                    '}';
        }
    }


    class Exp {
        private SingleExp left;
        private Token operator;

        public Exp() {

        }

        public SingleExp getLeft() {
            return left;
        }

        public void setLeft(SingleExp left) {
            this.left = left;
        }

        public Token getOperator() {
            return operator;
        }

        public void setOperator(Token operator) {
            this.operator = operator;
        }

        @Override
        public String toString() {
            return "Exp{" +
                    "left=" + left +
                    ", operator=" + operator +
                    '}';
        }
    }

    class Where {
        List<Exp> exps;

        public Where() {
            exps = new ArrayList<Exp>();
        }

        public Where add(Exp exp) {
            exps.add(exp);
            return this;
        }

        @Override
        public String toString() {
            return "Where{" +
                    "exps=" + exps +
                    '}';
        }
    }

    class Insert {
        String tableName;
        List<Field> fields;
        String value;

        public Insert() {
            fields = new ArrayList<Field>(100);
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public List<Field> getFields() {
            return fields;
        }

        public void setFields(List<Field> fields) {
            this.fields = fields;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    class Update {
        String tableName;
        Field[] fields;
        Where where;

        public Update() {
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public Field[] getFields() {
            return fields;
        }

        public void setFields(Field[] fields) {
            this.fields = fields;
        }

        public Where getWhere() {
            return where;
        }

        public void setWhere(Where where) {
            this.where = where;
        }
    }

    class Select {
        List<Field> fields;
        List<Token> tables;
        Where where;

        public Select() {
            fields = new ArrayList<Field>(100);
        }

        public void addField(Field field) {
            fields.add(field);
        }

        public List<Token> getTables() {
            return tables;
        }

        public void setTables(List<Token> tables) {
            this.tables = tables;
        }

        public List<Field> getFields() {
            return fields;
        }

        public void setFields(List<Field> fields) {
            this.fields = fields;
        }

        public Where getWhere() {
            return where;
        }

        public void setWhere(Where where) {
            this.where = where;
        }

        @Override
        public String toString() {
            return "Select{" +
                    "fields=" + fields +
                    ", tables=" + tables +
                    ", where=" + where +
                    '}';
        }
    }

    class Delete {
        String tableName;
        Where where;

        public Delete() {
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public Where getWhere() {
            return where;
        }

        public void setWhere(Where where) {
            this.where = where;
        }
    }
}
