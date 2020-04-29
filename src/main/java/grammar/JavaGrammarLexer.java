// Generated from /Users/konradmikucki/projects/java-to-uml-agh/src/main/java/grammar/JavaGrammar.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, Identifier=35, NEWLINE=36, WS=37, ErrorCharacter=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "Identifier", "Letter", "JavaLetterOrDigit", "NEWLINE", "WS", 
			"ErrorCharacter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'package'", "';'", "'import'", "'static'", "'boolean'", 
			"'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", 
			"'['", "']'", "'extends'", "'<'", "'>'", "','", "'?'", "'class'", "'implements'", 
			"'abstract'", "'final'", "'{}'", "'{'", "'}'", "'public'", "'protected'", 
			"'private'", "'interface'", "'('", "')'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "Identifier", 
			"NEWLINE", "WS", "ErrorCharacter"
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


	public JavaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\7$\u0106\n$\f$\16$\u0109\13$\3%\3%\3&\3&\3\'\5\'\u0110\n\'\3\'"+
		"\3\'\3(\6(\u0115\n(\r(\16(\u0116\3(\3(\3)\3)\3)\3)\2\2*\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I\2K\2M&O\'Q(\3\2\5\16\2&&C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u2001"+
		"\u3042\u3191\u3302\u3381\u3402\u3d2f\u4e02\ua001\uf902\ufb01\21\2\62;"+
		"\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1"+
		"\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b"+
		"\u0ed2\u0edb\u1042\u104b\5\2\13\f\16\17\"\"\2\u011f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13f\3\2"+
		"\2\2\rm\3\2\2\2\17u\3\2\2\2\21z\3\2\2\2\23\u0080\3\2\2\2\25\u0084\3\2"+
		"\2\2\27\u0089\3\2\2\2\31\u008e\3\2\2\2\33\u0094\3\2\2\2\35\u009b\3\2\2"+
		"\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ab"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00af\3\2\2\2-\u00b5\3\2\2\2/\u00c0\3\2\2\2\61"+
		"\u00c9\3\2\2\2\63\u00cf\3\2\2\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d6"+
		"\3\2\2\2;\u00dd\3\2\2\2=\u00e7\3\2\2\2?\u00ef\3\2\2\2A\u00f9\3\2\2\2C"+
		"\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u0102\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2"+
		"\2\2M\u010f\3\2\2\2O\u0114\3\2\2\2Q\u011a\3\2\2\2ST\7\60\2\2T\4\3\2\2"+
		"\2UV\7r\2\2VW\7c\2\2WX\7e\2\2XY\7m\2\2YZ\7c\2\2Z[\7i\2\2[\\\7g\2\2\\\6"+
		"\3\2\2\2]^\7=\2\2^\b\3\2\2\2_`\7k\2\2`a\7o\2\2ab\7r\2\2bc\7q\2\2cd\7t"+
		"\2\2de\7v\2\2e\n\3\2\2\2fg\7u\2\2gh\7v\2\2hi\7c\2\2ij\7v\2\2jk\7k\2\2"+
		"kl\7e\2\2l\f\3\2\2\2mn\7d\2\2no\7q\2\2op\7q\2\2pq\7n\2\2qr\7g\2\2rs\7"+
		"c\2\2st\7p\2\2t\16\3\2\2\2uv\7d\2\2vw\7{\2\2wx\7v\2\2xy\7g\2\2y\20\3\2"+
		"\2\2z{\7u\2\2{|\7j\2\2|}\7q\2\2}~\7t\2\2~\177\7v\2\2\177\22\3\2\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\24\3\2\2\2\u0084"+
		"\u0085\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7i\2\2"+
		"\u0088\26\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b\7j\2\2\u008b\u008c\7"+
		"c\2\2\u008c\u008d\7t\2\2\u008d\30\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7q\2\2\u0091\u0092\7c\2\2\u0092\u0093\7v\2\2\u0093"+
		"\32\3\2\2\2\u0094\u0095\7f\2\2\u0095\u0096\7q\2\2\u0096\u0097\7w\2\2\u0097"+
		"\u0098\7d\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\34\3\2\2\2\u009b"+
		"\u009c\7]\2\2\u009c\36\3\2\2\2\u009d\u009e\7_\2\2\u009e \3\2\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7z\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7u\2\2\u00a6\"\3\2"+
		"\2\2\u00a7\u00a8\7>\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa&\3\2\2"+
		"\2\u00ab\u00ac\7.\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7A\2\2\u00ae*\3\2\2\2"+
		"\u00af\u00b0\7e\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7u\2\2\u00b3\u00b4\7u\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7"+
		"\7o\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7o\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\u00bf\7u\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7d\2"+
		"\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7v\2\2\u00c8\60\3\2\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0\u00d1\7\177\2"+
		"\2\u00d1\64\3\2\2\2\u00d2\u00d3\7}\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7"+
		"\177\2\2\u00d58\3\2\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9"+
		"\7d\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7e\2\2\u00dc"+
		":\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7f\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7r\2"+
		"\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7x\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7g\2\2\u00ee>\3\2\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7e\2\2"+
		"\u00f7\u00f8\7g\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7*\2\2\u00faB\3\2\2\2\u00fb"+
		"\u00fc\7+\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7x\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7f\2\2\u0101F\3\2\2\2\u0102\u0107\5I%\2\u0103"+
		"\u0106\5I%\2\u0104\u0106\5K&\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2"+
		"\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108H\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\t\2\2\2\u010bJ\3\2\2\2\u010c\u010d"+
		"\t\3\2\2\u010dL\3\2\2\2\u010e\u0110\7\17\2\2\u010f\u010e\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\f\2\2\u0112N\3\2\2\2"+
		"\u0113\u0115\t\4\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b(\2\2\u0119"+
		"P\3\2\2\2\u011a\u011b\13\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b)\2\2"+
		"\u011dR\3\2\2\2\7\2\u0105\u0107\u010f\u0116\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}