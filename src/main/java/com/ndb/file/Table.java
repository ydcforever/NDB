package com.ndb.file;

/**
 * Created by ydc on 2019/5/23.
 */
public class Table {
    private String name;

    private DBField[] dbFields;

    private Row[] rows;

    private int primary;

    public Table(String name, DBField[] dbFields) {
        this.name = name;
    }
}
