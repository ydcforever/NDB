package com.antlr;

import com.antlr.generate.SqlBaseListener;
import com.antlr.generate.SqlParser;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ydc on 2019/8/29.
 */
public class SqlListenerImpl extends SqlBaseListener {

    private String tbl;

    private List<String> selectCols = new LinkedList<String>();

    private String left;

    private String comp;

    private String right;

    @Override public void enterStatement(SqlParser.StatementContext ctx) {
        SqlParser.TableIdentifierContext tableCtx = ctx.tableIdentifier();
        SqlParser.TableNameContext name = tableCtx.tableName(0);
        tbl = name.getText();
        SqlParser.ColsContext cols = ctx.cols();
        for(SqlParser.ColContext col : cols.col()) {
            selectCols.add(col.qualifiedName().column().getText());
        }
        SqlParser.WhereClauseContext clauseCtx = ctx.whereClause();
        SqlParser.ExpressionContext expressionCtx = clauseCtx.expression(0);
        SqlParser.ExprContext exprLeftCtx = expressionCtx.expr(0);
        left = exprLeftCtx.getText();
        SqlParser.CompareSymbolContext symbolCtx = expressionCtx.compareSymbol();
        comp = symbolCtx.getText();
        SqlParser.ExprContext exprRightCtx = expressionCtx.expr(1);
        right = exprRightCtx.getText();
    }


    public boolean isString(SqlParser.ExprContext ctx) {
        SqlParser.QualifiedNameContext c = ctx.qualifiedName();
        return c.isEmpty();
    }

    public boolean symbolCompare(SqlParser.ExprContext ctx) {
        SqlParser.QualifiedNameContext c = ctx.qualifiedName();
        return c.isEmpty();
    }

    public String getTbl() {
        return tbl;
    }

    public void setTbl(String tbl) {
        this.tbl = tbl;
    }

    public List<String> getSelectCols() {
        return selectCols;
    }

    public void setSelectCols(List<String> selectCols) {
        this.selectCols = selectCols;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
}
