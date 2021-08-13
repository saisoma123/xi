// Generated from xig.g4 by ANTLR 4.9.2

package xi.parser;
import xi.expinterface.*;
import xi.enums.*;
import xi.operations.*;
import xi.literals.*;
import xi.expandstatements.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.AbstractMap;
import java.util.HashMap;
import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, MODULO=5, HIGHMULT=6, ASSIGN=7, EO=8, 
		EQ=9, NOTEQ=10, GREATEQ=11, LESSEQ=12, GREAT=13, LESS=14, NOT=15, AND=16, 
		OR=17, INT=18, BOOL=19, TRUE=20, FALSE=21, IF=22, ELSE=23, WHILE=24, RETURN=25, 
		LENGTH=26, PRINT=27, PRINTLN=28, GETCHAR=29, PARSEINT=30, UNPARSEINT=31, 
		READLN=32, COMMENT=33, ID=34, NUMBER=35, MIX=36, USCORE=37, QUOTE=38, 
		SQUOTE=39, LPAREN=40, RPAREN=41, LBRACE=42, RBRACE=43, LBRACKET=44, RBRACKET=45, 
		COLON=46, SCOLON=47, COMMA=48, USE=49, EXT=50, WHITESPACE=51, SPACE=52;
	public static final int
		RULE_parse = 0, RULE_type = 1, RULE_functiondef = 2, RULE_exp = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "type", "functiondef", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'>>'", "'='", "'eof'", "'=='", 
			"'!='", "'>='", "'<='", "'>'", "'<'", "'!'", "'&'", "'|'", "'int'", "'bool'", 
			"'true'", "'FALSE'", "'if'", "'else'", "'while'", "'return'", "'length'", 
			"'print'", "'println'", "'getchar'", "'parseint'", "'unparseint'", "'readln'", 
			null, null, null, null, "'_'", "'\"'", "'''", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "':'", "';'", "','", "'use'", "'.ixi'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULT", "DIV", "MODULO", "HIGHMULT", "ASSIGN", 
			"EO", "EQ", "NOTEQ", "GREATEQ", "LESSEQ", "GREAT", "LESS", "NOT", "AND", 
			"OR", "INT", "BOOL", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "RETURN", 
			"LENGTH", "PRINT", "PRINTLN", "GETCHAR", "PARSEINT", "UNPARSEINT", "READLN", 
			"COMMENT", "ID", "NUMBER", "MIX", "USCORE", "QUOTE", "SQUOTE", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "COLON", "SCOLON", 
			"COMMA", "USE", "EXT", "WHITESPACE", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "xig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public Map<String, FunctionDef<?>> val = new HashMap<>();
		public Token ID;
		public FunctiondefContext functiondef;
		public TerminalNode USE() { return getToken(xigParser.USE, 0); }
		public TerminalNode ID() { return getToken(xigParser.ID, 0); }
		public TerminalNode EOF() { return getToken(xigParser.EOF, 0); }
		public List<FunctiondefContext> functiondef() {
			return getRuleContexts(FunctiondefContext.class);
		}
		public FunctiondefContext functiondef(int i) {
			return getRuleContext(FunctiondefContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(USE);
				setState(9);
				((ParseContext)_localctx).ID = match(ID);

				     //BufferedReader file = new BufferedReader(new FileReader("C:/Users/surya/Desktop/xi/test/" + (((ParseContext)_localctx).ID!=null?((ParseContext)_localctx).ID.getText():null) + ".ixi")); 
				     //String line = file.readLine();
				     //while(line != Double.valueOf(2.0))
				     //{
				     //    _localctx.val.put(.);
				     //}
				    
				}
				break;
			case EOF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(11);
					((ParseContext)_localctx).functiondef = functiondef();
					_localctx.val.put(((ParseContext)_localctx).functiondef.val.getKey(), ((ParseContext)_localctx).functiondef.val.getValue());
					}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(19);
				match(EOF);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(xigParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(xigParser.BOOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(xigParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(xigParser.RBRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(23);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(24);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(27);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(28);
					match(LBRACKET);
					setState(29);
					match(RBRACKET);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctiondefContext extends ParserRuleContext {
		public Map.Entry<String, FunctionDef<?>> val;
		public List<String> varnames = new LinkedList<>();
		public List<Expression<Void>> block = new LinkedList<>();
		public Token funcname;
		public Token argname;
		public ExpContext statement;
		public ExpContext ret;
		public TerminalNode LPAREN() { return getToken(xigParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(xigParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(xigParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(xigParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(xigParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(xigParser.RETURN, 0); }
		public List<TerminalNode> SCOLON() { return getTokens(xigParser.SCOLON); }
		public TerminalNode SCOLON(int i) {
			return getToken(xigParser.SCOLON, i);
		}
		public TerminalNode RBRACE() { return getToken(xigParser.RBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(xigParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xigParser.ID, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(xigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xigParser.COMMA, i);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).exitFunctiondef(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functiondef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((FunctiondefContext)_localctx).funcname = match(ID);
			setState(36);
			match(LPAREN);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(37);
				((FunctiondefContext)_localctx).argname = match(ID);
				setState(38);
				match(COLON);
				setState(39);
				type(0);
				setState(40);
				match(COMMA);
				_localctx.varnames.add((((FunctiondefContext)_localctx).argname!=null?((FunctiondefContext)_localctx).argname.getText():null));
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(RPAREN);
			setState(49);
			match(COLON);
			setState(50);
			type(0);
			setState(51);
			match(LBRACE);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EO) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << GETCHAR) | (1L << PARSEINT) | (1L << UNPARSEINT) | (1L << READLN) | (1L << COMMENT) | (1L << ID) | (1L << NUMBER) | (1L << QUOTE) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(52);
				((FunctiondefContext)_localctx).statement = exp(0);
				setState(53);
				match(SCOLON);
				_localctx.block.add(new TypeChecker<Void>(((FunctiondefContext)_localctx).statement.val, Double.valueOf(2.0)).enforce());
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(RETURN);
			setState(62);
			((FunctiondefContext)_localctx).ret = exp(0);
			setState(63);
			match(SCOLON);
			setState(64);
			match(RBRACE);
			((FunctiondefContext)_localctx).val =  new AbstractMap.SimpleEntry<String, FunctionDef<?>>((((FunctiondefContext)_localctx).funcname!=null?((FunctiondefContext)_localctx).funcname.getText():null), new FunctionDef(_localctx.varnames, new Block(_localctx.block), ((FunctiondefContext)_localctx).ret.val)); 
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

	public static class ExpContext extends ParserRuleContext {
		public Expression<?> val;
		public List<Expression<?>> expList = new LinkedList<>();
		public List<Expression<Void>> statements = new LinkedList<>();;
		public ExpContext array;
		public ExpContext left;
		public Token ID;
		public ExpContext exp;
		public ExpContext expr;
		public Token NUMBER;
		public Token alpha;
		public ExpContext r;
		public ExpContext rhs;
		public ExpContext guard;
		public ExpContext body;
		public ExpContext condition;
		public ExpContext conseq;
		public ExpContext alt;
		public ExpContext arg;
		public ExpContext right;
		public ExpContext index;
		public ExpContext value;
		public TerminalNode COMMENT() { return getToken(xigParser.COMMENT, 0); }
		public TerminalNode ID() { return getToken(xigParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(xigParser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(xigParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(xigParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(xigParser.NOT, 0); }
		public TerminalNode NUMBER() { return getToken(xigParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(xigParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(xigParser.FALSE, 0); }
		public TerminalNode LBRACE() { return getToken(xigParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(xigParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(xigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xigParser.COMMA, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(xigParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(xigParser.QUOTE, i);
		}
		public TerminalNode MIX() { return getToken(xigParser.MIX, 0); }
		public TerminalNode COLON() { return getToken(xigParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(xigParser.ASSIGN, 0); }
		public List<TerminalNode> SCOLON() { return getTokens(xigParser.SCOLON); }
		public TerminalNode SCOLON(int i) {
			return getToken(xigParser.SCOLON, i);
		}
		public TerminalNode WHILE() { return getToken(xigParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(xigParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(xigParser.ELSE, 0); }
		public TerminalNode PRINT() { return getToken(xigParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(xigParser.PRINTLN, 0); }
		public TerminalNode GETCHAR() { return getToken(xigParser.GETCHAR, 0); }
		public TerminalNode READLN() { return getToken(xigParser.READLN, 0); }
		public TerminalNode EO() { return getToken(xigParser.EO, 0); }
		public TerminalNode PARSEINT() { return getToken(xigParser.PARSEINT, 0); }
		public TerminalNode UNPARSEINT() { return getToken(xigParser.UNPARSEINT, 0); }
		public TerminalNode MULT() { return getToken(xigParser.MULT, 0); }
		public TerminalNode HIGHMULT() { return getToken(xigParser.HIGHMULT, 0); }
		public TerminalNode DIV() { return getToken(xigParser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(xigParser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(xigParser.PLUS, 0); }
		public TerminalNode LESS() { return getToken(xigParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(xigParser.LESSEQ, 0); }
		public TerminalNode GREATEQ() { return getToken(xigParser.GREATEQ, 0); }
		public TerminalNode GREAT() { return getToken(xigParser.GREAT, 0); }
		public TerminalNode EQ() { return getToken(xigParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(xigParser.NOTEQ, 0); }
		public TerminalNode AND() { return getToken(xigParser.AND, 0); }
		public TerminalNode OR() { return getToken(xigParser.OR, 0); }
		public TerminalNode LBRACKET() { return getToken(xigParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(xigParser.RBRACKET, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xigListener ) ((xigListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(68);
				match(COMMENT);
				}
				break;
			case 2:
				{
				setState(69);
				((ExpContext)_localctx).ID = match(ID);
				((ExpContext)_localctx).val =  new ReadVariable((((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null));
				}
				break;
			case 3:
				{
				setState(71);
				match(LPAREN);
				setState(72);
				((ExpContext)_localctx).exp = exp(0);
				setState(73);
				match(RPAREN);
				 ((ExpContext)_localctx).val =  ((ExpContext)_localctx).exp.val;
				}
				break;
			case 4:
				{
				setState(76);
				match(MINUS);
				setState(77);
				((ExpContext)_localctx).expr = ((ExpContext)_localctx).exp = exp(36);
				 ((ExpContext)_localctx).val =  new BasicOp(ArithOp.SUBTRACT, new IntegerLiteral(0), new TypeChecker<Integer>(((ExpContext)_localctx).expr.val, Integer.valueOf(0)).enforce()); 
				}
				break;
			case 5:
				{
				setState(80);
				match(NOT);
				setState(81);
				((ExpContext)_localctx).expr = ((ExpContext)_localctx).exp = exp(35);
				 ((ExpContext)_localctx).val =  new NotOp(BoolOp.NOT, new TypeChecker<Boolean>(((ExpContext)_localctx).expr.val, Boolean.valueOf(true)).enforce()); 
				}
				break;
			case 6:
				{
				setState(84);
				((ExpContext)_localctx).NUMBER = match(NUMBER);
				 ((ExpContext)_localctx).val =  new IntegerLiteral(Integer.parseInt((((ExpContext)_localctx).NUMBER!=null?((ExpContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case 7:
				{
				setState(86);
				match(TRUE);
				 ((ExpContext)_localctx).val =  new BooleanLiteral(true); 
				}
				break;
			case 8:
				{
				setState(88);
				match(FALSE);
				 ((ExpContext)_localctx).val =  new BooleanLiteral(false); 
				}
				break;
			case 9:
				{
				setState(90);
				match(LBRACE);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EO) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << GETCHAR) | (1L << PARSEINT) | (1L << UNPARSEINT) | (1L << READLN) | (1L << COMMENT) | (1L << ID) | (1L << NUMBER) | (1L << QUOTE) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(91);
					((ExpContext)_localctx).exp = exp(0);
					setState(92);
					match(COMMA);
					 _localctx.expList.add(((ExpContext)_localctx).exp.val); 
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(RBRACE);
				 ((ExpContext)_localctx).val =  new ArrayLiteral(_localctx.expList.toArray(new Expression<?>[0])); 
				}
				break;
			case 10:
				{
				setState(102);
				match(QUOTE);
				setState(103);
				((ExpContext)_localctx).alpha = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << MIX))) != 0)) ) {
					((ExpContext)_localctx).alpha = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				match(QUOTE);

				        IntegerLiteral[] newarr = new IntegerLiteral[(((ExpContext)_localctx).alpha!=null?((ExpContext)_localctx).alpha.getText():null).length()];
				        for(int i = 0; i < newarr.length; i++)
				        {  
				            newarr[i] = new IntegerLiteral((int)((((ExpContext)_localctx).alpha!=null?((ExpContext)_localctx).alpha.getText():null).toCharArray()[i]));
				        }
				        ((ExpContext)_localctx).val =  new ArrayLiteral(newarr);
				    
				}
				break;
			case 11:
				{
				setState(106);
				((ExpContext)_localctx).ID = match(ID);
				setState(107);
				match(COLON);
				setState(108);
				type(0);
				 ((ExpContext)_localctx).val =  new DeclareVar((((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null)); 
				}
				break;
			case 12:
				{
				setState(111);
				((ExpContext)_localctx).ID = match(ID);
				setState(112);
				match(COLON);
				setState(113);
				type(0);
				setState(114);
				match(ASSIGN);
				setState(115);
				((ExpContext)_localctx).r = ((ExpContext)_localctx).exp = exp(14);

				        ((ExpContext)_localctx).val =  new DeclareVar((((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null), ((ExpContext)_localctx).r.val);
				     
				}
				break;
			case 13:
				{
				setState(118);
				((ExpContext)_localctx).ID = match(ID);
				setState(119);
				match(ASSIGN);
				setState(120);
				((ExpContext)_localctx).rhs = ((ExpContext)_localctx).exp = exp(13);
				 ((ExpContext)_localctx).val =  new SetLocation(new ReadVariable((((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null)), ((ExpContext)_localctx).rhs.val); 
				}
				break;
			case 14:
				{
				setState(123);
				match(LBRACE);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EO) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << GETCHAR) | (1L << PARSEINT) | (1L << UNPARSEINT) | (1L << READLN) | (1L << COMMENT) | (1L << ID) | (1L << NUMBER) | (1L << QUOTE) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(124);
					((ExpContext)_localctx).exp = exp(0);
					setState(125);
					match(SCOLON);
					 _localctx.statements.add(new TypeChecker<Void>(((ExpContext)_localctx).exp.val, Double.valueOf(2.0)).enforce()); 
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(RBRACE);
				 ((ExpContext)_localctx).val =  new Block(_localctx.statements); 
				}
				break;
			case 15:
				{
				setState(135);
				match(WHILE);
				setState(136);
				((ExpContext)_localctx).guard = ((ExpContext)_localctx).exp = exp(0);
				setState(137);
				((ExpContext)_localctx).body = ((ExpContext)_localctx).exp = exp(10);
				((ExpContext)_localctx).val =  new WhileLoop(new TypeChecker<Boolean>(((ExpContext)_localctx).guard.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Void>(((ExpContext)_localctx).body.val, Double.valueOf(2.0)).enforce()); 
				}
				break;
			case 16:
				{
				setState(140);
				match(IF);
				setState(141);
				((ExpContext)_localctx).condition = ((ExpContext)_localctx).exp = exp(0);
				setState(142);
				((ExpContext)_localctx).conseq = ((ExpContext)_localctx).exp = exp(0);
				setState(143);
				match(ELSE);
				setState(144);
				((ExpContext)_localctx).alt = ((ExpContext)_localctx).exp = exp(9);
				((ExpContext)_localctx).val =  new ConditionalOp(new TypeChecker<Boolean>(((ExpContext)_localctx).condition.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Void>(((ExpContext)_localctx).conseq.val, Double.valueOf(2.0)).enforce(), new TypeChecker<Void>(((ExpContext)_localctx).alt.val, Double.valueOf(2.0)).enforce()); 
				}
				break;
			case 17:
				{
				setState(147);
				((ExpContext)_localctx).ID = match(ID);
				setState(148);
				match(LPAREN);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EO) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << GETCHAR) | (1L << PARSEINT) | (1L << UNPARSEINT) | (1L << READLN) | (1L << COMMENT) | (1L << ID) | (1L << NUMBER) | (1L << QUOTE) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(149);
					((ExpContext)_localctx).arg = ((ExpContext)_localctx).exp = exp(0);
					setState(150);
					match(COMMA);
					_localctx.expList.add(((ExpContext)_localctx).arg.val);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(RPAREN);
				((ExpContext)_localctx).val =  new FunctionCall((((ExpContext)_localctx).ID!=null?((ExpContext)_localctx).ID.getText():null), _localctx.expList); 
				}
				break;
			case 18:
				{
				setState(160);
				match(PRINT);
				setState(161);
				match(LPAREN);
				setState(162);
				((ExpContext)_localctx).exp = exp(0);
				setState(163);
				match(RPAREN);
				 ((ExpContext)_localctx).val =  new Print((Expression<Object[]>)((ExpContext)_localctx).exp.val); 
				}
				break;
			case 19:
				{
				setState(166);
				match(PRINTLN);
				setState(167);
				match(LPAREN);
				setState(168);
				((ExpContext)_localctx).exp = exp(0);
				setState(169);
				match(RPAREN);
				 ((ExpContext)_localctx).val =  new Print((Expression<Object[]>)((ExpContext)_localctx).exp.val); 
				}
				break;
			case 20:
				{
				setState(172);
				match(GETCHAR);
				setState(173);
				match(LPAREN);
				setState(174);
				match(RPAREN);
				((ExpContext)_localctx).val =  new Getchar();
				}
				break;
			case 21:
				{
				setState(176);
				match(READLN);
				setState(177);
				match(LPAREN);
				setState(178);
				match(RPAREN);
				 ((ExpContext)_localctx).val =  new Readln(); 
				}
				break;
			case 22:
				{
				setState(180);
				match(EO);
				setState(181);
				match(LPAREN);
				setState(182);
				match(RPAREN);
				((ExpContext)_localctx).val =  new Eof(); 
				}
				break;
			case 23:
				{
				setState(184);
				match(PARSEINT);
				setState(185);
				match(LPAREN);
				setState(186);
				((ExpContext)_localctx).exp = exp(0);
				setState(187);
				match(RPAREN);
				((ExpContext)_localctx).val =  new ParseInt((Expression<Object[]>)((ExpContext)_localctx).exp.val);
				}
				break;
			case 24:
				{
				setState(190);
				match(UNPARSEINT);
				setState(191);
				match(LPAREN);
				setState(192);
				((ExpContext)_localctx).exp = exp(0);
				setState(193);
				match(RPAREN);
				((ExpContext)_localctx).val =  new UnparseInt(new TypeChecker<Integer>(((ExpContext)_localctx).exp.val, Integer.valueOf(0)).enforce());
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(198);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(199);
						match(MULT);
						setState(200);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(35);
						 ((ExpContext)_localctx).val =  new BasicOp(ArithOp.MULTIPLY, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(203);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(204);
						match(HIGHMULT);
						setState(205);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(34);
						 ((ExpContext)_localctx).val =  new BasicOp(ArithOp.HIGHMULTIPLY, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(208);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(209);
						match(DIV);
						setState(210);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(33);
						 ((ExpContext)_localctx).val =  new BasicOp(ArithOp.DIVIDE, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(213);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(214);
						match(MODULO);
						setState(215);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(32);
						 ((ExpContext)_localctx).val =  new BasicOp(ArithOp.MODULO, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(218);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(219);
						match(PLUS);
						setState(220);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(31);
						 
						                  ((ExpContext)_localctx).val =  new BasicOp(ArithOp.ADD, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce());
						                  
						              
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(223);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(224);
						match(MINUS);
						setState(225);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(30);
						 ((ExpContext)_localctx).val =  new BasicOp(ArithOp.SUBTRACT, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(229);
						match(LESS);
						setState(230);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(29);
						 ((ExpContext)_localctx).val =  new CompareOp(Compare.LESS_THAN, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(233);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(234);
						match(LESSEQ);
						setState(235);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(28);
						 ((ExpContext)_localctx).val =  new CompareOp(Compare.LESS_THAN_OR_EQUAL_TO, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(238);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(239);
						match(GREATEQ);
						setState(240);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(27);
						 ((ExpContext)_localctx).val =  new CompareOp(Compare.GREATER_THAN_OR_EQUAL_TO, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(243);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(244);
						match(GREAT);
						setState(245);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(26);
						 ((ExpContext)_localctx).val =  new CompareOp(Compare.GREATER_THAN, new TypeChecker<Integer>(((ExpContext)_localctx).left.val, Integer.valueOf(0)).enforce(), new TypeChecker<Integer>(((ExpContext)_localctx).right.val, Integer.valueOf(0)).enforce()); 
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(248);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(249);
						match(EQ);
						setState(250);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(25);
						 ((ExpContext)_localctx).val =  new GenEqOperation(EqualityOp.EQUAL, ((ExpContext)_localctx).left.val, ((ExpContext)_localctx).right.val); 
						}
						break;
					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(253);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(254);
						match(NOTEQ);
						setState(255);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(24);
						 ((ExpContext)_localctx).val =  new GenEqOperation(EqualityOp.NOTEQUAL, ((ExpContext)_localctx).left.val, ((ExpContext)_localctx).right.val); 
						}
						break;
					case 13:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(258);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(259);
						match(AND);
						setState(260);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(23);
						 ((ExpContext)_localctx).val =  new Bool(BoolOp.AND, new TypeChecker<Boolean>(((ExpContext)_localctx).left.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Boolean>(((ExpContext)_localctx).right.val, Boolean.valueOf(true)).enforce()); 
						}
						break;
					case 14:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(263);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(264);
						match(OR);
						setState(265);
						((ExpContext)_localctx).right = ((ExpContext)_localctx).exp = exp(22);
						 ((ExpContext)_localctx).val =  new Bool(BoolOp.OR, new TypeChecker<Boolean>(((ExpContext)_localctx).left.val, Boolean.valueOf(true)).enforce(), new TypeChecker<Boolean>(((ExpContext)_localctx).right.val, Boolean.valueOf(true)).enforce()); 
						}
						break;
					case 15:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.array = _prevctx;
						_localctx.array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(268);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(269);
						match(LBRACKET);
						setState(270);
						((ExpContext)_localctx).index = ((ExpContext)_localctx).exp = exp(0);
						setState(271);
						match(RBRACKET);
						setState(272);
						match(ASSIGN);
						setState(273);
						((ExpContext)_localctx).rhs = ((ExpContext)_localctx).exp = exp(13);
						 ((ExpContext)_localctx).val =  new SetLocation(new ReadArrIndex(((ExpContext)_localctx).array.val, ((ExpContext)_localctx).index.val), ((ExpContext)_localctx).rhs.val); 
						}
						break;
					case 16:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.array = _prevctx;
						_localctx.array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(276);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(277);
						match(LBRACKET);
						setState(278);
						((ExpContext)_localctx).value = ((ExpContext)_localctx).exp = exp(0);
						setState(279);
						match(RBRACKET);
						((ExpContext)_localctx).val =  new ReadArrIndex(((ExpContext)_localctx).array.val, ((ExpContext)_localctx).value.val);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 34);
		case 2:
			return precpred(_ctx, 33);
		case 3:
			return precpred(_ctx, 32);
		case 4:
			return precpred(_ctx, 31);
		case 5:
			return precpred(_ctx, 30);
		case 6:
			return precpred(_ctx, 29);
		case 7:
			return precpred(_ctx, 28);
		case 8:
			return precpred(_ctx, 27);
		case 9:
			return precpred(_ctx, 26);
		case 10:
			return precpred(_ctx, 25);
		case 11:
			return precpred(_ctx, 24);
		case 12:
			return precpred(_ctx, 23);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 12);
		case 16:
			return precpred(_ctx, 38);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0122\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24"+
		"\13\2\3\2\5\2\27\n\2\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\7\3!\n\3\f\3\16"+
		"\3$\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5b\n\5\f\5\16\5e\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0083\n\5\f\5\16\5\u0086"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u009c\n\5\f\5\16\5\u009f\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00c7"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u011d"+
		"\n\5\f\5\16\5\u0120\13\5\3\5\2\4\4\b\6\2\4\6\b\2\3\3\2$&\2\u014d\2\26"+
		"\3\2\2\2\4\33\3\2\2\2\6%\3\2\2\2\b\u00c6\3\2\2\2\n\13\7\63\2\2\13\f\7"+
		"$\2\2\f\27\b\2\1\2\r\16\5\6\4\2\16\17\b\2\1\2\17\21\3\2\2\2\20\r\3\2\2"+
		"\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2"+
		"\2\25\27\7\2\2\3\26\n\3\2\2\2\26\22\3\2\2\2\27\3\3\2\2\2\30\31\b\3\1\2"+
		"\31\34\7\24\2\2\32\34\7\25\2\2\33\30\3\2\2\2\33\32\3\2\2\2\34\"\3\2\2"+
		"\2\35\36\f\3\2\2\36\37\7.\2\2\37!\7/\2\2 \35\3\2\2\2!$\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#\5\3\2\2\2$\"\3\2\2\2%&\7$\2\2&/\7*\2\2\'(\7$\2\2()\7"+
		"\60\2\2)*\5\4\3\2*+\7\62\2\2+,\b\4\1\2,.\3\2\2\2-\'\3\2\2\2.\61\3\2\2"+
		"\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7+\2\2\63\64"+
		"\7\60\2\2\64\65\5\4\3\2\65<\7,\2\2\66\67\5\b\5\2\678\7\61\2\289\b\4\1"+
		"\29;\3\2\2\2:\66\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2"+
		"\2\2?@\7\33\2\2@A\5\b\5\2AB\7\61\2\2BC\7-\2\2CD\b\4\1\2D\7\3\2\2\2EF\b"+
		"\5\1\2F\u00c7\7#\2\2GH\7$\2\2H\u00c7\b\5\1\2IJ\7*\2\2JK\5\b\5\2KL\7+\2"+
		"\2LM\b\5\1\2M\u00c7\3\2\2\2NO\7\4\2\2OP\5\b\5&PQ\b\5\1\2Q\u00c7\3\2\2"+
		"\2RS\7\21\2\2ST\5\b\5%TU\b\5\1\2U\u00c7\3\2\2\2VW\7%\2\2W\u00c7\b\5\1"+
		"\2XY\7\26\2\2Y\u00c7\b\5\1\2Z[\7\27\2\2[\u00c7\b\5\1\2\\c\7,\2\2]^\5\b"+
		"\5\2^_\7\62\2\2_`\b\5\1\2`b\3\2\2\2a]\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2ec\3\2\2\2fg\7-\2\2g\u00c7\b\5\1\2hi\7(\2\2ij\t\2\2\2"+
		"jk\7(\2\2k\u00c7\b\5\1\2lm\7$\2\2mn\7\60\2\2no\5\4\3\2op\b\5\1\2p\u00c7"+
		"\3\2\2\2qr\7$\2\2rs\7\60\2\2st\5\4\3\2tu\7\t\2\2uv\5\b\5\20vw\b\5\1\2"+
		"w\u00c7\3\2\2\2xy\7$\2\2yz\7\t\2\2z{\5\b\5\17{|\b\5\1\2|\u00c7\3\2\2\2"+
		"}\u0084\7,\2\2~\177\5\b\5\2\177\u0080\7\61\2\2\u0080\u0081\b\5\1\2\u0081"+
		"\u0083\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7-\2\2\u0088\u00c7\b\5\1\2\u0089\u008a\7\32\2\2\u008a\u008b\5\b\5\2\u008b"+
		"\u008c\5\b\5\f\u008c\u008d\b\5\1\2\u008d\u00c7\3\2\2\2\u008e\u008f\7\30"+
		"\2\2\u008f\u0090\5\b\5\2\u0090\u0091\5\b\5\2\u0091\u0092\7\31\2\2\u0092"+
		"\u0093\5\b\5\13\u0093\u0094\b\5\1\2\u0094\u00c7\3\2\2\2\u0095\u0096\7"+
		"$\2\2\u0096\u009d\7*\2\2\u0097\u0098\5\b\5\2\u0098\u0099\7\62\2\2\u0099"+
		"\u009a\b\5\1\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1\u00c7\b\5\1\2\u00a2\u00a3\7\35"+
		"\2\2\u00a3\u00a4\7*\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\7+\2\2\u00a6\u00a7"+
		"\b\5\1\2\u00a7\u00c7\3\2\2\2\u00a8\u00a9\7\36\2\2\u00a9\u00aa\7*\2\2\u00aa"+
		"\u00ab\5\b\5\2\u00ab\u00ac\7+\2\2\u00ac\u00ad\b\5\1\2\u00ad\u00c7\3\2"+
		"\2\2\u00ae\u00af\7\37\2\2\u00af\u00b0\7*\2\2\u00b0\u00b1\7+\2\2\u00b1"+
		"\u00c7\b\5\1\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7*\2\2\u00b4\u00b5\7+\2"+
		"\2\u00b5\u00c7\b\5\1\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9"+
		"\7+\2\2\u00b9\u00c7\b\5\1\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\7*\2\2\u00bc"+
		"\u00bd\5\b\5\2\u00bd\u00be\7+\2\2\u00be\u00bf\b\5\1\2\u00bf\u00c7\3\2"+
		"\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c2\7*\2\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4"+
		"\7+\2\2\u00c4\u00c5\b\5\1\2\u00c5\u00c7\3\2\2\2\u00c6E\3\2\2\2\u00c6G"+
		"\3\2\2\2\u00c6I\3\2\2\2\u00c6N\3\2\2\2\u00c6R\3\2\2\2\u00c6V\3\2\2\2\u00c6"+
		"X\3\2\2\2\u00c6Z\3\2\2\2\u00c6\\\3\2\2\2\u00c6h\3\2\2\2\u00c6l\3\2\2\2"+
		"\u00c6q\3\2\2\2\u00c6x\3\2\2\2\u00c6}\3\2\2\2\u00c6\u0089\3\2\2\2\u00c6"+
		"\u008e\3\2\2\2\u00c6\u0095\3\2\2\2\u00c6\u00a2\3\2\2\2\u00c6\u00a8\3\2"+
		"\2\2\u00c6\u00ae\3\2\2\2\u00c6\u00b2\3\2\2\2\u00c6\u00b6\3\2\2\2\u00c6"+
		"\u00ba\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c7\u011e\3\2\2\2\u00c8\u00c9\f$"+
		"\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\5\b\5%\u00cb\u00cc\b\5\1\2\u00cc"+
		"\u011d\3\2\2\2\u00cd\u00ce\f#\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5\b"+
		"\5$\u00d0\u00d1\b\5\1\2\u00d1\u011d\3\2\2\2\u00d2\u00d3\f\"\2\2\u00d3"+
		"\u00d4\7\6\2\2\u00d4\u00d5\5\b\5#\u00d5\u00d6\b\5\1\2\u00d6\u011d\3\2"+
		"\2\2\u00d7\u00d8\f!\2\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\b\5\"\u00da"+
		"\u00db\b\5\1\2\u00db\u011d\3\2\2\2\u00dc\u00dd\f \2\2\u00dd\u00de\7\3"+
		"\2\2\u00de\u00df\5\b\5!\u00df\u00e0\b\5\1\2\u00e0\u011d\3\2\2\2\u00e1"+
		"\u00e2\f\37\2\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5\b\5 \u00e4\u00e5\b\5"+
		"\1\2\u00e5\u011d\3\2\2\2\u00e6\u00e7\f\36\2\2\u00e7\u00e8\7\20\2\2\u00e8"+
		"\u00e9\5\b\5\37\u00e9\u00ea\b\5\1\2\u00ea\u011d\3\2\2\2\u00eb\u00ec\f"+
		"\35\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\5\b\5\36\u00ee\u00ef\b\5\1\2"+
		"\u00ef\u011d\3\2\2\2\u00f0\u00f1\f\34\2\2\u00f1\u00f2\7\r\2\2\u00f2\u00f3"+
		"\5\b\5\35\u00f3\u00f4\b\5\1\2\u00f4\u011d\3\2\2\2\u00f5\u00f6\f\33\2\2"+
		"\u00f6\u00f7\7\17\2\2\u00f7\u00f8\5\b\5\34\u00f8\u00f9\b\5\1\2\u00f9\u011d"+
		"\3\2\2\2\u00fa\u00fb\f\32\2\2\u00fb\u00fc\7\13\2\2\u00fc\u00fd\5\b\5\33"+
		"\u00fd\u00fe\b\5\1\2\u00fe\u011d\3\2\2\2\u00ff\u0100\f\31\2\2\u0100\u0101"+
		"\7\f\2\2\u0101\u0102\5\b\5\32\u0102\u0103\b\5\1\2\u0103\u011d\3\2\2\2"+
		"\u0104\u0105\f\30\2\2\u0105\u0106\7\22\2\2\u0106\u0107\5\b\5\31\u0107"+
		"\u0108\b\5\1\2\u0108\u011d\3\2\2\2\u0109\u010a\f\27\2\2\u010a\u010b\7"+
		"\23\2\2\u010b\u010c\5\b\5\30\u010c\u010d\b\5\1\2\u010d\u011d\3\2\2\2\u010e"+
		"\u010f\f\16\2\2\u010f\u0110\7.\2\2\u0110\u0111\5\b\5\2\u0111\u0112\7/"+
		"\2\2\u0112\u0113\7\t\2\2\u0113\u0114\5\b\5\17\u0114\u0115\b\5\1\2\u0115"+
		"\u011d\3\2\2\2\u0116\u0117\f(\2\2\u0117\u0118\7.\2\2\u0118\u0119\5\b\5"+
		"\2\u0119\u011a\7/\2\2\u011a\u011b\b\5\1\2\u011b\u011d\3\2\2\2\u011c\u00c8"+
		"\3\2\2\2\u011c\u00cd\3\2\2\2\u011c\u00d2\3\2\2\2\u011c\u00d7\3\2\2\2\u011c"+
		"\u00dc\3\2\2\2\u011c\u00e1\3\2\2\2\u011c\u00e6\3\2\2\2\u011c\u00eb\3\2"+
		"\2\2\u011c\u00f0\3\2\2\2\u011c\u00f5\3\2\2\2\u011c\u00fa\3\2\2\2\u011c"+
		"\u00ff\3\2\2\2\u011c\u0104\3\2\2\2\u011c\u0109\3\2\2\2\u011c\u010e\3\2"+
		"\2\2\u011c\u0116\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\t\3\2\2\2\u0120\u011e\3\2\2\2\16\22\26\33\"/<c\u0084"+
		"\u009d\u00c6\u011c\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}