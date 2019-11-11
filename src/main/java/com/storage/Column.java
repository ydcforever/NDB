package com.storage;

import com.exception.Msg;
import com.exception.NDBException;

/**
 * Created by ydc on 2019/9/1.
 */
public class Column {
    int index;

    String name;

    Class type;

    int defaultLen;

    boolean isNull;

    String defaultValue;

    String value;

    int len;

    String comment;

    public Column(int index, String name, Class type, int len) {
        this.index = index;
        this.name = name;
        this.type = type;
        this.len = len;
    }

    public Column copy(){
        return new Column(this.index, this.name, this.type, this.len);
    }

    public Column copy(String value) throws NDBException{
        Column newCol = copy();
        if(value.length() > newCol.len) {
            throw new NDBException(Msg.COLUMN_EXCEEDED_LENGTH);
        }
        newCol.setValue(value);
        return newCol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setNull(boolean isNull) {
        this.isNull = isNull;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value)  throws NDBException{
        if(value.length() > this.len) {
            throw new NDBException(Msg.COLUMN_EXCEEDED_LENGTH);
        }
        if(value.length() < this.len) {
            this.value = String.format("%" + this.len + "s", value);
        } else {
            this.value = value;
        }
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Column{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", len=" + len +
                '}';
    }
}
