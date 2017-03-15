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
		T__0=1, T__1=2, T__2=3, T__3=4, CLOCK=5, SEMI=6, NUMBER=7, FGM=8, FGA=9, 
		TEAM=10, WS=11;
	public static final int
		RULE_start = 0, RULE_shot = 1, RULE_rebound = 2, RULE_assist = 3, RULE_assistAtt = 4, 
		RULE_player = 5, RULE_turnover = 6, RULE_foul = 7, RULE_freethrow = 8;
	public static final String[] ruleNames = {
		"start", "shot", "rebound", "assist", "assistAtt", "player", "turnover", 
		"foul", "freethrow"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'t'", "'f'", "'m'", "'a'", null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "CLOCK", "SEMI", "NUMBER", "FGM", "FGA", 
		"TEAM", "WS"
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
		public TerminalNode SEMI() { return getToken(BasketballParser.SEMI, 0); }
		public ShotContext shot() {
			return getRuleContext(ShotContext.class,0);
		}
		public FoulContext foul() {
			return getRuleContext(FoulContext.class,0);
		}
		public TurnoverContext turnover() {
			return getRuleContext(TurnoverContext.class,0);
		}
		public TerminalNode CLOCK() { return getToken(BasketballParser.CLOCK, 0); }
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
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
			case FGM:
			case FGA:
				{
				setState(18);
				shot();
				}
				break;
			case T__1:
				{
				setState(19);
				foul();
				}
				break;
			case T__0:
				{
				setState(20);
				turnover();
				}
				break;
			case CLOCK:
				{
				setState(21);
				match(CLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(24);
			match(SEMI);
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

	public static class ShotContext extends ParserRuleContext {
		public TerminalNode FGM() { return getToken(BasketballParser.FGM, 0); }
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public AssistContext assist() {
			return getRuleContext(AssistContext.class,0);
		}
		public TerminalNode FGA() { return getToken(BasketballParser.FGA, 0); }
		public ReboundContext rebound() {
			return getRuleContext(ReboundContext.class,0);
		}
		public AssistAttContext assistAtt() {
			return getRuleContext(AssistAttContext.class,0);
		}
		public ShotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterShot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitShot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitShot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShotContext shot() throws RecognitionException {
		ShotContext _localctx = new ShotContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_shot);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FGM:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(FGM);
				setState(27);
				player();
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEAM) {
					{
					setState(28);
					assist();
					}
				}

				}
				break;
			case FGA:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(FGA);
				setState(32);
				player();
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(33);
					assistAtt();
					}
					break;
				}
				setState(36);
				rebound();
				}
				break;
			case SEMI:
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

	public static class ReboundContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public ReboundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rebound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterRebound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitRebound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitRebound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReboundContext rebound() throws RecognitionException {
		ReboundContext _localctx = new ReboundContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rebound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			player();
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

	public static class AssistContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public AssistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterAssist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitAssist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitAssist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistContext assist() throws RecognitionException {
		AssistContext _localctx = new AssistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			player();
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

	public static class AssistAttContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public AssistAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assistAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterAssistAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitAssistAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitAssistAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssistAttContext assistAtt() throws RecognitionException {
		AssistAttContext _localctx = new AssistAttContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assistAtt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			player();
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

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode TEAM() { return getToken(BasketballParser.TEAM, 0); }
		public TerminalNode NUMBER() { return getToken(BasketballParser.NUMBER, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(TEAM);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(48);
				match(NUMBER);
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

	public static class TurnoverContext extends ParserRuleContext {
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public TurnoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterTurnover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitTurnover(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitTurnover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnoverContext turnover() throws RecognitionException {
		TurnoverContext _localctx = new TurnoverContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_turnover);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__0);
				setState(52);
				player();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__0);
				setState(54);
				player();
				setState(55);
				player();
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

	public static class FoulContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode CLOCK() { return getToken(BasketballParser.CLOCK, 0); }
		public List<FreethrowContext> freethrow() {
			return getRuleContexts(FreethrowContext.class);
		}
		public FreethrowContext freethrow(int i) {
			return getRuleContext(FreethrowContext.class,i);
		}
		public FoulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterFoul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitFoul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitFoul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoulContext foul() throws RecognitionException {
		FoulContext _localctx = new FoulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_foul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__1);
			setState(60);
			player();
			setState(61);
			match(CLOCK);
			 System.out.println("What time is it?"); 
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				freethrow();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
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

	public static class FreethrowContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public ReboundContext rebound() {
			return getRuleContext(ReboundContext.class,0);
		}
		public FreethrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freethrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).enterFreethrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BasketballListener ) ((BasketballListener)listener).exitFreethrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasketballVisitor ) return ((BasketballVisitor<? extends T>)visitor).visitFreethrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreethrowContext freethrow() throws RecognitionException {
		FreethrowContext _localctx = new FreethrowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_freethrow);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__2);
				setState(69);
				player();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__3);
				setState(71);
				player();
				setState(72);
				rebound();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rO\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\5\2\31\n\2\3\2\3\2\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\3\3\5\3%\n\3\3\3"+
		"\3\3\3\3\5\3*\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\64\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b<\n\b\3\t\3\t\3\t\3\t\3\t\6\tC\n\t\r\t\16\tD\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nM\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2P\2\30\3"+
		"\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\f\61\3\2\2\2\16;\3"+
		"\2\2\2\20=\3\2\2\2\22L\3\2\2\2\24\31\5\4\3\2\25\31\5\20\t\2\26\31\5\16"+
		"\b\2\27\31\7\7\2\2\30\24\3\2\2\2\30\25\3\2\2\2\30\26\3\2\2\2\30\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\33\7\b\2\2\33\3\3\2\2\2\34\35\7\n\2\2\35\37\5\f"+
		"\7\2\36 \5\b\5\2\37\36\3\2\2\2\37 \3\2\2\2 *\3\2\2\2!\"\7\13\2\2\"$\5"+
		"\f\7\2#%\5\n\6\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\5\6\4\2\'*\3\2\2\2("+
		"*\3\2\2\2)\34\3\2\2\2)!\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\5\f\7\2,\7\3\2"+
		"\2\2-.\5\f\7\2.\t\3\2\2\2/\60\5\f\7\2\60\13\3\2\2\2\61\63\7\f\2\2\62\64"+
		"\7\t\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\r\3\2\2\2\65\66\7\3\2\2\66<\5"+
		"\f\7\2\678\7\3\2\289\5\f\7\29:\5\f\7\2:<\3\2\2\2;\65\3\2\2\2;\67\3\2\2"+
		"\2<\17\3\2\2\2=>\7\4\2\2>?\5\f\7\2?@\7\7\2\2@B\b\t\1\2AC\5\22\n\2BA\3"+
		"\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\21\3\2\2\2FG\7\5\2\2GM\5\f\7\2H"+
		"I\7\6\2\2IJ\5\f\7\2JK\5\6\4\2KM\3\2\2\2LF\3\2\2\2LH\3\2\2\2M\23\3\2\2"+
		"\2\n\30\37$)\63;DL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}