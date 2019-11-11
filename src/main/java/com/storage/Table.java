package com.storage;


import com.exception.NDBException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ydc on 2019/9/1.
 */
public class Table {

    String tableName;

    String path;

    protected List<Column> cols;

    protected List<Row> rows;

    public Table(String tableName) {
        this.tableName = tableName;
        rows = new ArrayList<Row>();
        cols = new LinkedList<Column>();
    }

    public Column getColumn(int index, String value) throws NDBException{
        Column cs = cols.get(index - 1);
        return cs.copy(value);
    }

    public void addCol(Column... column) {
        cols.addAll(Arrays.asList(column));
    }

    public void addRow(Row row) {
        rows.add(row);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Row> getRows() {
        return rows;
    }

    public List<Column> getCols() {
        return cols;
    }

    public String getTableName() {
        return tableName;
    }
}
