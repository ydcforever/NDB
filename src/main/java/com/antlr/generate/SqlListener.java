// Generated from E:/IDEA/NDB/src/main/resources\Sql.g4 by ANTLR 4.6
package com.antlr.generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(SqlParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(SqlParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(SqlParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(SqlParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(SqlParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(SqlParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#connector}.
	 * @param ctx the parse tree
	 */
	void enterConnector(SqlParser.ConnectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#connector}.
	 * @param ctx the parse tree
	 */
	void exitConnector(SqlParser.ConnectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#compareSymbol}.
	 * @param ctx the parse tree
	 */
	void enterCompareSymbol(SqlParser.CompareSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#compareSymbol}.
	 * @param ctx the parse tree
	 */
	void exitCompareSymbol(SqlParser.CompareSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SqlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(SqlParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(SqlParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(SqlParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(SqlParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(SqlParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(SqlParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SqlParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SqlParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(SqlParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(SqlParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SqlParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SqlParser.NonReservedContext ctx);
}