// Generated from /Users/abramjstamper/Documents/Junior Year/2nd Semester/COS382/cos382LanguageStructs/ANTLR/Basketball.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasketballParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NUM=10, LETTER=11, WS=12;
	public static final int
		RULE_start = 0, RULE_list = 1, RULE_expr = 2, RULE_terms = 3, RULE_term = 4, 
		RULE_factors = 5, RULE_factor = 6, RULE_mod = 7, RULE_id = 8;
	public static final String[] ruleNames = {
		"start", "list", "expr", "terms", "term", "factors", "factor", "mod", 
		"id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'EOF'", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'MOD'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NUM", "LETTER", 
		"WS"
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
	public String getGrammarFileName() { return "Basketball.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasketballParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			list();
			setState(19);
			match(T__0);
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

	public static class ListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_list);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case NUM:
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				expr();
				setState(22);
				match(T__1);
				setState(23);
				list();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			term();
			setState(29);
			terms();
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

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_terms);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__2);
				setState(32);
				term();
				setState(33);
				terms();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__3);
				setState(36);
				term();
				setState(37);
				terms();
				}
				break;
			case T__1:
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			factor();
			setState(43);
			factors();
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

	public static class FactorsContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public FactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterFactors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitFactors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitFactors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorsContext factors() throws RecognitionException {
		FactorsContext _localctx = new FactorsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factors);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__4);
				setState(46);
				factor();
				setState(47);
				factors();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__5);
				setState(50);
				factor();
				setState(51);
				factors();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				mod();
				setState(54);
				factor();
				setState(55);
				factors();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode NUM() { return getToken(BasketballParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__6);
				setState(61);
				expr();
				setState(62);
				match(T__7);
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				id();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(NUM);
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

	public static class ModContext extends ParserRuleContext {
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__8);
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(BasketballParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(BasketballParser.LETTER, i);
		}
		public List<TerminalNode> NUM() { return getTokens(BasketballParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(BasketballParser.NUM, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LETTER);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM || _la==LETTER) {
				{
				{
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==LETTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(76);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t\3\n\3"+
		"\n\7\nK\n\n\f\n\16\nN\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\f\r"+
		"O\2\24\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f<\3\2"+
		"\2\2\16D\3\2\2\2\20F\3\2\2\2\22H\3\2\2\2\24\25\5\4\3\2\25\26\7\3\2\2\26"+
		"\3\3\2\2\2\27\30\5\6\4\2\30\31\7\4\2\2\31\32\5\4\3\2\32\35\3\2\2\2\33"+
		"\35\3\2\2\2\34\27\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\5\n\6\2\37"+
		" \5\b\5\2 \7\3\2\2\2!\"\7\5\2\2\"#\5\n\6\2#$\5\b\5\2$+\3\2\2\2%&\7\6\2"+
		"\2&\'\5\n\6\2\'(\5\b\5\2(+\3\2\2\2)+\3\2\2\2*!\3\2\2\2*%\3\2\2\2*)\3\2"+
		"\2\2+\t\3\2\2\2,-\5\16\b\2-.\5\f\7\2.\13\3\2\2\2/\60\7\7\2\2\60\61\5\16"+
		"\b\2\61\62\5\f\7\2\62=\3\2\2\2\63\64\7\b\2\2\64\65\5\16\b\2\65\66\5\f"+
		"\7\2\66=\3\2\2\2\678\5\20\t\289\5\16\b\29:\5\f\7\2:=\3\2\2\2;=\3\2\2\2"+
		"</\3\2\2\2<\63\3\2\2\2<\67\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\7\t\2\2?@\5"+
		"\6\4\2@A\7\n\2\2AE\3\2\2\2BE\5\22\n\2CE\7\f\2\2D>\3\2\2\2DB\3\2\2\2DC"+
		"\3\2\2\2E\17\3\2\2\2FG\7\13\2\2G\21\3\2\2\2HL\7\r\2\2IK\t\2\2\2JI\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\23\3\2\2\2NL\3\2\2\2\7\34*<DL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}