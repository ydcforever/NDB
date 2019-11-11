package com.plane;

import com.antlr.SqlListenerImpl;
import com.storage.Column;
import com.storage.Row;
import com.storage.Table;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ydc on 2019/11/11.
 */
public abstract class AbstractLogicPlane {

    public List<Row> executor(SqlListenerImpl sqlListener, Map<String, Table> tableMap) {
        List<Row> result = new LinkedList<Row>();
        Table table = tableMap.get(sqlListener.getTbl());
        List<Row> rows = table.getRows();
        for(Row row : rows) {
            Map<String,Column> columns = row.getCols();
            if (selectRow(columns, sqlListener.getLeft(), sqlListener.getComp(), sqlListener.getRight())) {
                Row newRow = selectColumn(columns, sqlListener.getSelectCols());
                result.add(newRow);
            };
        }
        return result;
    }

    public abstract Row selectColumn(Map<String,Column> columns, List<String> selectCols);

    public abstract boolean selectRow(Map<String, Column> columns, String columnName, String compareSymbol, String value);
}
