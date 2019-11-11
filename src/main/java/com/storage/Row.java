package com.storage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ydc on 2019/9/1.
 */
public class Row {

    private Column id;

    protected byte statueA;

    protected byte statueB;

    /**
     * 定长部分大小
     */
    protected byte size;

    /**
     * 定长列
     */
    protected Map<String, Column> cols;

    /**
     * 列数
     */
    protected byte len;

    /**
     * 空值位图
     */
    protected String nullBits;

    /**
     * 变长列数
     */
    protected byte varLen;

    /**
     * 变长列偏移位
     */
    protected int[] varOffset;

    /**
     * 变长列数据
     */
    protected Map<String, Column> varCols;

    public Row() {
        id = new Column(0, "RowId", String.class, 8);
        statueA = 0xF;
        cols = new HashMap<String, Column>();
        varCols = new HashMap<String, Column>();
    }

    public Column getId() {
        return id;
    }

    public void setId(Column id) {
        this.id = id;
    }

    public Map<String, Column> showAll() {
        cols.put("id", id);
        return cols;
    }

    public void addCol(Column... column) {
        for(Column col : column) {
            cols.put(col.getName(), col);
        }
    }

    public byte getStatueA() {
        return statueA;
    }

    public void setStatueA(byte statueA) {
        this.statueA = statueA;
    }

    public void addVarCol(Column column){
        int index = column.index;
        varCols.put(column.getName(), column);
        varOffset[index] = column.len;
    }

    public Map<String, Column> getCols() {
        return cols;
    }

    public Map<String, Column> getVarCols() {
        return varCols;
    }

    @Override
    public String toString() {
        return "Row{" +
                "cols=" + cols +
                '}';
    }
}
