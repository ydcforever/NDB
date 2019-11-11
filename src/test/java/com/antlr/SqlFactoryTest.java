package com.antlr;

import com.plane.LogicPlane;
import com.storage.Column;
import com.storage.Row;
import com.storage.Table;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlFactoryTest {

    @Test
    public void testParser() throws Exception {
        String str = "SELECT B.C1 FROM YDC B WHERE C1 = 'acb'";
        SqlFactory factory = new SqlFactory();
        factory.parser(str);
        LogicPlane plane = new LogicPlane();
        List<Row> rs = plane.executor(factory.getListener(), gt());
        System.out.println(rs);
    }

    public Map<String, Table> gt() {
        Map<String, Table> s = new HashMap<String, Table>();
        Table table = create();
        s.put(table.getTableName(), table);
        return s;
    }

    public Table create() {
        Column column = new Column(1,"C1", String.class, 3);
        Column column2 = new Column(2,"C2", String.class, 2);
        Table table = new Table("YDC");
        table.addCol(column, column2);

        Row row = new Row();
        row.addCol(table.getColumn(1, "acb"), table.getColumn(2, "b"));
        table.addRow(row);

        Row row2 = new Row();
        row2.addCol(table.getColumn(1, "ac"), table.getColumn(2, "f"));
        table.addRow(row2);

        return table;
    }

}