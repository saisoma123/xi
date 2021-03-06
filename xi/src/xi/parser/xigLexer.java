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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xigLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULT", "DIV", "MODULO", "HIGHMULT", "ASSIGN", "EO", 
			"EQ", "NOTEQ", "GREATEQ", "LESSEQ", "GREAT", "LESS", "NOT", "AND", "OR", 
			"INT", "BOOL", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "RETURN", "LENGTH", 
			"PRINT", "PRINTLN", "GETCHAR", "PARSEINT", "UNPARSEINT", "READLN", "COMMENT", 
			"ID", "NUMBER", "MIX", "USCORE", "QUOTE", "SQUOTE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "COLON", "SCOLON", "COMMA", 
			"USE", "EXT", "WHITESPACE", "SPACE"
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


	public xigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u013e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00fa\n\"\f\"\16\"\u00fd\13\"\3\""+
		"\3\"\3#\3#\7#\u0103\n#\f#\16#\u0106\13#\3$\6$\u0109\n$\r$\16$\u010a\3"+
		"%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\6\64\u0132\n\64\r\64\16\64\u0133\3\64\3\64\3\65\6\65\u0139\n\65\r\65"+
		"\16\65\u013a\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66\3\2\7\4\2\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\3\2\62"+
		";\4\2\13\f\17\17\2\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2"+
		"\17x\3\2\2\2\21z\3\2\2\2\23~\3\2\2\2\25\u0081\3\2\2\2\27\u0084\3\2\2\2"+
		"\31\u0087\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!"+
		"\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0098\3\2\2\2)\u009d\3"+
		"\2\2\2+\u00a2\3\2\2\2-\u00a8\3\2\2\2/\u00ab\3\2\2\2\61\u00b0\3\2\2\2\63"+
		"\u00b6\3\2\2\2\65\u00bd\3\2\2\2\67\u00c4\3\2\2\29\u00ca\3\2\2\2;\u00d2"+
		"\3\2\2\2=\u00da\3\2\2\2?\u00e3\3\2\2\2A\u00ee\3\2\2\2C\u00f5\3\2\2\2E"+
		"\u0100\3\2\2\2G\u0108\3\2\2\2I\u010c\3\2\2\2K\u010f\3\2\2\2M\u0111\3\2"+
		"\2\2O\u0113\3\2\2\2Q\u0115\3\2\2\2S\u0117\3\2\2\2U\u0119\3\2\2\2W\u011b"+
		"\3\2\2\2Y\u011d\3\2\2\2[\u011f\3\2\2\2]\u0121\3\2\2\2_\u0123\3\2\2\2a"+
		"\u0125\3\2\2\2c\u0127\3\2\2\2e\u012b\3\2\2\2g\u0131\3\2\2\2i\u0138\3\2"+
		"\2\2kl\7-\2\2l\4\3\2\2\2mn\7/\2\2n\6\3\2\2\2op\7,\2\2p\b\3\2\2\2qr\7\61"+
		"\2\2r\n\3\2\2\2st\7\'\2\2t\f\3\2\2\2uv\7@\2\2vw\7@\2\2w\16\3\2\2\2xy\7"+
		"?\2\2y\20\3\2\2\2z{\7g\2\2{|\7q\2\2|}\7h\2\2}\22\3\2\2\2~\177\7?\2\2\177"+
		"\u0080\7?\2\2\u0080\24\3\2\2\2\u0081\u0082\7#\2\2\u0082\u0083\7?\2\2\u0083"+
		"\26\3\2\2\2\u0084\u0085\7@\2\2\u0085\u0086\7?\2\2\u0086\30\3\2\2\2\u0087"+
		"\u0088\7>\2\2\u0088\u0089\7?\2\2\u0089\32\3\2\2\2\u008a\u008b\7@\2\2\u008b"+
		"\34\3\2\2\2\u008c\u008d\7>\2\2\u008d\36\3\2\2\2\u008e\u008f\7#\2\2\u008f"+
		" \3\2\2\2\u0090\u0091\7(\2\2\u0091\"\3\2\2\2\u0092\u0093\7~\2\2\u0093"+
		"$\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097"+
		"&\3\2\2\2\u0098\u0099\7d\2\2\u0099\u009a\7q\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7n\2\2\u009c(\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7g\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7H\2\2\u00a3"+
		"\u00a4\7C\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a6\7U\2\2\u00a6\u00a7\7G\2\2"+
		"\u00a7,\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa.\3\2\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\60\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7"+
		"k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5\62\3\2\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7w\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc\64\3\2\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7v\2\2"+
		"\u00c2\u00c3\7j\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7"+
		"t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c98"+
		"\3\2\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7p\2\2"+
		"\u00d1:\3\2\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2"+
		"\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9"+
		"\7t\2\2\u00d9<\3\2\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7t\2\2"+
		"\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec"+
		"\7p\2\2\u00ec\u00ed\7v\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7g\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7n\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7\61\2\2"+
		"\u00f7\u00fb\3\2\2\2\u00f8\u00fa\n\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\b\"\2\2\u00ffD\3\2\2\2\u0100\u0104\t\3\2\2"+
		"\u0101\u0103\t\4\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105F\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0109\t\5\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010bH\3\2\2\2\u010c\u010d\5G$\2\u010d\u010e"+
		"\5E#\2\u010eJ\3\2\2\2\u010f\u0110\7a\2\2\u0110L\3\2\2\2\u0111\u0112\7"+
		"$\2\2\u0112N\3\2\2\2\u0113\u0114\7)\2\2\u0114P\3\2\2\2\u0115\u0116\7*"+
		"\2\2\u0116R\3\2\2\2\u0117\u0118\7+\2\2\u0118T\3\2\2\2\u0119\u011a\7}\2"+
		"\2\u011aV\3\2\2\2\u011b\u011c\7\177\2\2\u011cX\3\2\2\2\u011d\u011e\7]"+
		"\2\2\u011eZ\3\2\2\2\u011f\u0120\7_\2\2\u0120\\\3\2\2\2\u0121\u0122\7<"+
		"\2\2\u0122^\3\2\2\2\u0123\u0124\7=\2\2\u0124`\3\2\2\2\u0125\u0126\7.\2"+
		"\2\u0126b\3\2\2\2\u0127\u0128\7w\2\2\u0128\u0129\7u\2\2\u0129\u012a\7"+
		"g\2\2\u012ad\3\2\2\2\u012b\u012c\7\60\2\2\u012c\u012d\7k\2\2\u012d\u012e"+
		"\7z\2\2\u012e\u012f\7k\2\2\u012ff\3\2\2\2\u0130\u0132\t\6\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\b\64\2\2\u0136h\3\2\2\2\u0137\u0139\7\"\2\2"+
		"\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\65\2\2\u013dj\3\2\2\2\b\2\u00fb"+
		"\u0104\u010a\u0133\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}