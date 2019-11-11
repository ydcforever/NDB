package com.plane;

import com.storage.Column;
import com.storage.Row;

import java.util.List;
import java.util.Map;

/**
 * Created by ydc on 2019/11/11.
 */
public class LogicPlane extends AbstractLogicPlane {

    @Override
    public Row selectColumn(Map<String, Column> columns, List<String> selectCols) {
        Row row = new Row();
        for(String col : selectCols) {
            row.addCol(columns.get(col));
        }
        return row;
    }

    @Override
    public boolean selectRow(Map<String, Column> columns, String columnName, String compareSymbol, String value) {
        Column column = columns.get(columnName);
        String val = column.getValue();
        if ("=".equals(compareSymbol)) {
            return val.equals(value.replace("'", ""));
        } else {
            return false;
        }
    }

}
