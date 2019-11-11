// Generated from E:/IDEA/NDB/src/main/resources\Sql.g4 by ANTLR 4.6
package com.antlr.generate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SELECT=3, FROM=4, ADD=5, AS=6, ALL=7, DISTINCT=8, WHERE=9, 
		GROUP=10, BY=11, GROUPING=12, SETS=13, CUBE=14, ROLLUP=15, ORDER=16, HAVING=17, 
		LIMIT=18, AT=19, OR=20, AND=21, IN=22, NOT=23, NO=24, EXISTS=25, BETWEEN=26, 
		LIKE=27, RLIKE=28, IS=29, NULL=30, TRUE=31, FALSE=32, NULLS=33, ASC=34, 
		DESC=35, FOR=36, INTERVAL=37, CASE=38, WHEN=39, THEN=40, ELSE=41, END=42, 
		JOIN=43, CROSS=44, OUTER=45, INNER=46, LEFT=47, SEMI=48, RIGHT=49, FULL=50, 
		NATURAL=51, ON=52, LATERAL=53, WINDOW=54, OVER=55, PARTITION=56, RANGE=57, 
		ROWS=58, UNBOUNDED=59, PRECEDING=60, FOLLOWING=61, CURRENT=62, FIRST=63, 
		AFTER=64, LAST=65, ROW=66, WITH=67, VALUES=68, CREATE=69, TABLE=70, DIRECTORY=71, 
		VIEW=72, REPLACE=73, INSERT=74, DELETE=75, INTO=76, DESCRIBE=77, EXPLAIN=78, 
		FORMAT=79, LOGICAL=80, CODEGEN=81, COST=82, CAST=83, SHOW=84, TABLES=85, 
		COLUMNS=86, COLUMN=87, USE=88, PARTITIONS=89, FUNCTIONS=90, DROP=91, UNION=92, 
		EXCEPT=93, SETMINUS=94, INTERSECT=95, TO=96, TABLESAMPLE=97, STRATIFY=98, 
		ALTER=99, RENAME=100, ARRAY=101, MAP=102, STRUCT=103, COMMENT=104, SET=105, 
		RESET=106, DATA=107, START=108, TRANSACTION=109, COMMIT=110, ROLLBACK=111, 
		MACRO=112, IGNORE=113, BOTH=114, LEADING=115, TRAILING=116, IF=117, POSITION=118, 
		EQ=119, NSEQ=120, NEQ=121, NEQJ=122, LT=123, LTE=124, GT=125, GTE=126, 
		PLUS=127, MINUS=128, ASTERISK=129, SLASH=130, PERCENT=131, DIV=132, TILDE=133, 
		AMPERSAND=134, PIPE=135, CONCAT_PIPE=136, HAT=137, PERCENTLIT=138, BUCKET=139, 
		OUT=140, OF=141, SORT=142, CLUSTER=143, DISTRIBUTE=144, OVERWRITE=145, 
		TRANSFORM=146, REDUCE=147, USING=148, SERDE=149, SERDEPROPERTIES=150, 
		RECORDREADER=151, RECORDWRITER=152, DELIMITED=153, FIELDS=154, TERMINATED=155, 
		COLLECTION=156, ITEMS=157, KEYS=158, ESCAPED=159, LINES=160, SEPARATED=161, 
		FUNCTION=162, EXTENDED=163, REFRESH=164, CLEAR=165, CACHE=166, UNCACHE=167, 
		LAZY=168, FORMATTED=169, GLOBAL=170, TEMPORARY=171, OPTIONS=172, UNSET=173, 
		TBLPROPERTIES=174, DBPROPERTIES=175, BUCKETS=176, SKEWED=177, STORED=178, 
		DIRECTORIES=179, LOCATION=180, EXCHANGE=181, ARCHIVE=182, UNARCHIVE=183, 
		FILEFORMAT=184, TOUCH=185, COMPACT=186, CONCATENATE=187, CHANGE=188, CASCADE=189, 
		RESTRICT=190, CLUSTERED=191, SORTED=192, PURGE=193, INPUTFORMAT=194, OUTPUTFORMAT=195, 
		DATABASE=196, DATABASES=197, DFS=198, TRUNCATE=199, ANALYZE=200, COMPUTE=201, 
		LIST=202, STATISTICS=203, PARTITIONED=204, EXTERNAL=205, DEFINED=206, 
		REVOKE=207, GRANT=208, LOCK=209, UNLOCK=210, MSCK=211, REPAIR=212, RECOVER=213, 
		EXPORT=214, IMPORT=215, LOAD=216, ROLE=217, ROLES=218, COMPACTIONS=219, 
		PRINCIPALS=220, TRANSACTIONS=221, INDEX=222, INDEXES=223, LOCKS=224, OPTION=225, 
		ANTI=226, LOCAL=227, INPATH=228, STRING=229, BIGINT_LITERAL=230, SMALLINT_LITERAL=231, 
		TINYINT_LITERAL=232, INTEGER_VALUE=233, DECIMAL_VALUE=234, DOUBLE_LITERAL=235, 
		BIGDECIMAL_LITERAL=236, IDENTIFIER=237, BACKQUOTED_IDENTIFIER=238, SIMPLE_COMMENT=239, 
		BRACKETED_EMPTY_COMMENT=240, BRACKETED_COMMENT=241, WS=242, UNRECOGNIZED=243;
	public static final int
		RULE_statement = 0, RULE_whereClause = 1, RULE_expression = 2, RULE_expr = 3, 
		RULE_cols = 4, RULE_col = 5, RULE_qualifiedName = 6, RULE_tableIdentifier = 7, 
		RULE_connector = 8, RULE_tableName = 9, RULE_alias = 10, RULE_column = 11, 
		RULE_compareSymbol = 12, RULE_identifier = 13, RULE_strictIdentifier = 14, 
		RULE_quotedIdentifier = 15, RULE_number = 16, RULE_nonReserved = 17;
	public static final String[] ruleNames = {
		"statement", "whereClause", "expression", "expr", "cols", "col", "qualifiedName", 
		"tableIdentifier", "connector", "tableName", "alias", "column", "compareSymbol", 
		"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'DISTINCT'", 
		"'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", 
		"'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, 
		"'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", 
		"'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", 
		"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
		"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
		"'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", 
		"'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", "'AFTER'", 
		"'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'DIRECTORY'", 
		"'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", 
		"'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", "'CAST'", 
		"'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
		"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
		"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
		"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
		"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", 
		"'LEADING'", "'TRAILING'", "'IF'", "'POSITION'", null, "'<=>'", "'<>'", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", "'BUCKET'", 
		"'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
		"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
		"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
		"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
		"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
		"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
		"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
		"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
		"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
		"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
		null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
		"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
		"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
		"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
		"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
		"'LOCAL'", "'INPATH'", null, null, null, null, null, null, null, null, 
		null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SELECT", "FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", 
		"GROUP", "BY", "GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", 
		"LIMIT", "AT", "OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", 
		"RLIKE", "IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", 
		"INTERVAL", "CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", 
		"INNER", "LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "LATERAL", 
		"WINDOW", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", 
		"FOLLOWING", "CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", 
		"CREATE", "TABLE", "DIRECTORY", "VIEW", "REPLACE", "INSERT", "DELETE", 
		"INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", 
		"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
		"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
		"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", 
		"RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", 
		"IGNORE", "BOTH", "LEADING", "TRAILING", "IF", "POSITION", "EQ", "NSEQ", 
		"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
		"SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", 
		"HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", 
		"OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
		"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", 
		"ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", "EXTENDED", 
		"REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", "GLOBAL", 
		"TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", 
		"SKEWED", "STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", "ARCHIVE", 
		"UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", "CHANGE", 
		"CASCADE", "RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", 
		"OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", 
		"COMPUTE", "LIST", "STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", 
		"REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", 
		"IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", 
		"INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "STRING", 
		"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public boolean isValidDecimal() {
	         int nextChar = _input.LA(1);
	         if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' || nextChar == '_') {
	              return false;
	         } else {
	              return true;
	         }
	    }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(SELECT);
			setState(37);
			cols();
			setState(38);
			match(FROM);
			setState(39);
			tableIdentifier();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(40);
				match(WHERE);
				setState(41);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ConnectorContext> connector() {
			return getRuleContexts(ConnectorContext.class);
		}
		public ConnectorContext connector(int i) {
			return getRuleContext(ConnectorContext.class,i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			expression();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(45);
				connector();
				setState(46);
				expression();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareSymbolContext compareSymbol() {
			return getRuleContext(CompareSymbolContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			expr();
			setState(54);
			compareSymbol();
			setState(55);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				qualifiedName();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColsContext extends ParserRuleContext {
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			col();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(62);
				match(T__0);
				setState(63);
				col();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			qualifiedName();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENTIFIER) {
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(70);
					match(AS);
					}
				}

				setState(73);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			alias();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(77);
				match(T__1);
				setState(78);
				column();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			tableName();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(82);
				alias();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(85);
				match(T__0);
				setState(86);
				tableName();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(87);
					alias();
					}
				}

				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public ConnectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConnector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConnector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectorContext connector() throws RecognitionException {
		ConnectorContext _localctx = new ConnectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_connector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareSymbolContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlParser.GTE, 0); }
		public CompareSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompareSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompareSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompareSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareSymbolContext compareSymbol() throws RecognitionException {
		CompareSymbolContext _localctx = new CompareSymbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compareSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (EQ - 119)) | (1L << (NEQ - 119)) | (1L << (LT - 119)) | (1L << (LTE - 119)) | (1L << (GT - 119)) | (1L << (GTE - 119)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SqlParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SqlParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SqlParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(115);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(116);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(117);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(118);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(119);
				match(SETMINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_strictIdentifier);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(129);
					match(MINUS);
					}
				}

				setState(132);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(133);
					match(MINUS);
					}
				}

				setState(136);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(137);
					match(MINUS);
					}
				}

				setState(140);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(141);
					match(MINUS);
					}
				}

				setState(144);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(145);
					match(MINUS);
					}
				}

				setState(148);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(149);
					match(MINUS);
					}
				}

				setState(152);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(153);
					match(MINUS);
					}
				}

				setState(156);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SqlParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SqlParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SqlParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SqlParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(SqlParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SqlParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SqlParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(SqlParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SqlParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SqlParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SqlParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SqlParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SqlParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SqlParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SqlParser.USE, 0); }
		public List<TerminalNode> TO() { return getTokens(SqlParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(SqlParser.TO, i);
		}
		public TerminalNode BUCKET() { return getToken(SqlParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlParser.OF, 0); }
		public TerminalNode SET() { return getToken(SqlParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(SqlParser.POSITION, 0); }
		public TerminalNode NO() { return getToken(SqlParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SqlParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SqlParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SqlParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SqlParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SqlParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SqlParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SqlParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SqlParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SqlParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SqlParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SqlParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SqlParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SqlParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SqlParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SqlParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SqlParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SqlParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SqlParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SqlParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SqlParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SqlParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SqlParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SqlParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SqlParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SqlParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SqlParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SqlParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SqlParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SqlParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SqlParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SqlParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SqlParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SqlParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SqlParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SqlParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SqlParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SqlParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SqlParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SqlParser.OUTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(SqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(SqlParser.TABLE, i);
		}
		public TerminalNode TRUE() { return getToken(SqlParser.TRUE, 0); }
		public List<TerminalNode> WITH() { return getTokens(SqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlParser.WITH, i);
		}
		public TerminalNode RLIKE() { return getToken(SqlParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SqlParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SqlParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SqlParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SqlParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SqlParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SqlParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(SqlParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << LATERAL) | (1L << WINDOW) | (1L << OVER) | (1L << PARTITION) | (1L << RANGE) | (1L << ROWS) | (1L << UNBOUNDED) | (1L << PRECEDING) | (1L << FOLLOWING) | (1L << CURRENT) | (1L << FIRST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)) | (1L << (IF - 64)) | (1L << (POSITION - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (DIV - 132)) | (1L << (PERCENTLIT - 132)) | (1L << (BUCKET - 132)) | (1L << (OUT - 132)) | (1L << (OF - 132)) | (1L << (SORT - 132)) | (1L << (CLUSTER - 132)) | (1L << (DISTRIBUTE - 132)) | (1L << (OVERWRITE - 132)) | (1L << (TRANSFORM - 132)) | (1L << (REDUCE - 132)) | (1L << (SERDE - 132)) | (1L << (SERDEPROPERTIES - 132)) | (1L << (RECORDREADER - 132)) | (1L << (RECORDWRITER - 132)) | (1L << (DELIMITED - 132)) | (1L << (FIELDS - 132)) | (1L << (TERMINATED - 132)) | (1L << (COLLECTION - 132)) | (1L << (ITEMS - 132)) | (1L << (KEYS - 132)) | (1L << (ESCAPED - 132)) | (1L << (LINES - 132)) | (1L << (SEPARATED - 132)) | (1L << (FUNCTION - 132)) | (1L << (EXTENDED - 132)) | (1L << (REFRESH - 132)) | (1L << (CLEAR - 132)) | (1L << (CACHE - 132)) | (1L << (UNCACHE - 132)) | (1L << (LAZY - 132)) | (1L << (FORMATTED - 132)) | (1L << (GLOBAL - 132)) | (1L << (TEMPORARY - 132)) | (1L << (OPTIONS - 132)) | (1L << (UNSET - 132)) | (1L << (TBLPROPERTIES - 132)) | (1L << (DBPROPERTIES - 132)) | (1L << (BUCKETS - 132)) | (1L << (SKEWED - 132)) | (1L << (STORED - 132)) | (1L << (DIRECTORIES - 132)) | (1L << (LOCATION - 132)) | (1L << (EXCHANGE - 132)) | (1L << (ARCHIVE - 132)) | (1L << (UNARCHIVE - 132)) | (1L << (FILEFORMAT - 132)) | (1L << (TOUCH - 132)) | (1L << (COMPACT - 132)) | (1L << (CONCATENATE - 132)) | (1L << (CHANGE - 132)) | (1L << (CASCADE - 132)) | (1L << (RESTRICT - 132)) | (1L << (CLUSTERED - 132)) | (1L << (SORTED - 132)) | (1L << (PURGE - 132)) | (1L << (INPUTFORMAT - 132)) | (1L << (OUTPUTFORMAT - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (DATABASE - 196)) | (1L << (DATABASES - 196)) | (1L << (DFS - 196)) | (1L << (TRUNCATE - 196)) | (1L << (ANALYZE - 196)) | (1L << (COMPUTE - 196)) | (1L << (LIST - 196)) | (1L << (STATISTICS - 196)) | (1L << (PARTITIONED - 196)) | (1L << (EXTERNAL - 196)) | (1L << (DEFINED - 196)) | (1L << (REVOKE - 196)) | (1L << (GRANT - 196)) | (1L << (LOCK - 196)) | (1L << (UNLOCK - 196)) | (1L << (MSCK - 196)) | (1L << (REPAIR - 196)) | (1L << (RECOVER - 196)) | (1L << (EXPORT - 196)) | (1L << (IMPORT - 196)) | (1L << (LOAD - 196)) | (1L << (ROLE - 196)) | (1L << (ROLES - 196)) | (1L << (COMPACTIONS - 196)) | (1L << (PRINCIPALS - 196)) | (1L << (TRANSACTIONS - 196)) | (1L << (INDEX - 196)) | (1L << (INDEXES - 196)) | (1L << (LOCKS - 196)) | (1L << (OPTION - 196)) | (1L << (LOCAL - 196)) | (1L << (INPATH - 196)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00f5\u00a4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\7\3\63\n\3"+
		"\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\7\6C\n"+
		"\6\f\6\16\6F\13\6\3\7\3\7\5\7J\n\7\3\7\5\7M\n\7\3\b\3\b\3\b\5\bR\n\b\3"+
		"\t\3\t\5\tV\n\t\3\t\3\t\3\t\5\t[\n\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17{\n\17\3\20\3\20\3\20\5\20"+
		"\u0080\n\20\3\21\3\21\3\22\5\22\u0085\n\22\3\22\3\22\5\22\u0089\n\22\3"+
		"\22\3\22\5\22\u008d\n\22\3\22\3\22\5\22\u0091\n\22\3\22\3\22\5\22\u0095"+
		"\n\22\3\22\3\22\5\22\u0099\n\22\3\22\3\22\5\22\u009d\n\22\3\22\5\22\u00a0"+
		"\n\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\5\3\2\26\27\5\2yy{{}\u0080\n\2\5,//\67]bx\u0086\u0086\u008c\u0095"+
		"\u0097\u00e3\u00e5\u00e6\u00b8\2&\3\2\2\2\4.\3\2\2\2\6\67\3\2\2\2\b=\3"+
		"\2\2\2\n?\3\2\2\2\fG\3\2\2\2\16N\3\2\2\2\20S\3\2\2\2\22a\3\2\2\2\24c\3"+
		"\2\2\2\26e\3\2\2\2\30g\3\2\2\2\32i\3\2\2\2\34z\3\2\2\2\36\177\3\2\2\2"+
		" \u0081\3\2\2\2\"\u009f\3\2\2\2$\u00a1\3\2\2\2&\'\7\5\2\2\'(\5\n\6\2("+
		")\7\6\2\2),\5\20\t\2*+\7\13\2\2+-\5\4\3\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2"+
		"\2.\64\5\6\4\2/\60\5\22\n\2\60\61\5\6\4\2\61\63\3\2\2\2\62/\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\67"+
		"8\5\b\5\289\5\32\16\29:\5\b\5\2:\7\3\2\2\2;>\5\16\b\2<>\7\u00e7\2\2=;"+
		"\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?D\5\f\7\2@A\7\3\2\2AC\5\f\7\2B@\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\13\3\2\2\2FD\3\2\2\2GL\5\16\b\2HJ\7\b"+
		"\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\5\26\f\2LI\3\2\2\2LM\3\2\2\2M\r\3"+
		"\2\2\2NQ\5\26\f\2OP\7\4\2\2PR\5\30\r\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2"+
		"SU\5\24\13\2TV\5\26\f\2UT\3\2\2\2UV\3\2\2\2V^\3\2\2\2WX\7\3\2\2XZ\5\24"+
		"\13\2Y[\5\26\f\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\W\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`^\3\2\2\2ab\t\2\2\2b\23\3\2\2\2cd\7\u00ef"+
		"\2\2d\25\3\2\2\2ef\7\u00ef\2\2f\27\3\2\2\2gh\7\u00ef\2\2h\31\3\2\2\2i"+
		"j\t\3\2\2j\33\3\2\2\2k{\5\36\20\2l{\7\u00e4\2\2m{\7\64\2\2n{\7\60\2\2"+
		"o{\7\61\2\2p{\7\62\2\2q{\7\63\2\2r{\7\65\2\2s{\7-\2\2t{\7.\2\2u{\7\66"+
		"\2\2v{\7^\2\2w{\7a\2\2x{\7_\2\2y{\7`\2\2zk\3\2\2\2zl\3\2\2\2zm\3\2\2\2"+
		"zn\3\2\2\2zo\3\2\2\2zp\3\2\2\2zq\3\2\2\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2"+
		"zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\35\3\2\2\2|\u0080"+
		"\7\u00ef\2\2}\u0080\5 \21\2~\u0080\5$\23\2\177|\3\2\2\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\37\3\2\2\2\u0081\u0082\7\u00f0\2\2\u0082!\3\2\2\2\u0083"+
		"\u0085\7\u0082\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u00a0\7\u00ec\2\2\u0087\u0089\7\u0082\2\2\u0088\u0087\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u00a0\7\u00eb\2\2"+
		"\u008b\u008d\7\u0082\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u00a0\7\u00e8\2\2\u008f\u0091\7\u0082\2\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00a0\7\u00e9\2"+
		"\2\u0093\u0095\7\u0082\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u00a0\7\u00ea\2\2\u0097\u0099\7\u0082\2\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a0\7\u00ed\2"+
		"\2\u009b\u009d\7\u0082\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\7\u00ee\2\2\u009f\u0084\3\2\2\2\u009f\u0088"+
		"\3\2\2\2\u009f\u008c\3\2\2\2\u009f\u0090\3\2\2\2\u009f\u0094\3\2\2\2\u009f"+
		"\u0098\3\2\2\2\u009f\u009c\3\2\2\2\u00a0#\3\2\2\2\u00a1\u00a2\t\4\2\2"+
		"\u00a2%\3\2\2\2\26,\64=DILQUZ^z\177\u0084\u0088\u008c\u0090\u0094\u0098"+
		"\u009c\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}