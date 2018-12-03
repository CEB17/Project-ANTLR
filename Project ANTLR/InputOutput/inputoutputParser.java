// Generated from inputoutput.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class inputoutputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, VAR=19, NUM=20, VALUE=21, WS=22;
	public static final int
		RULE_struktur = 0, RULE_parameter = 1, RULE_d_type = 2, RULE_ret = 3;
	public static final String[] ruleNames = {
		"struktur", "parameter", "d_type", "ret"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'}'", "'*'", "'['", "']'", "','", "'unsigned'", 
		"'signed'", "'short'", "'long'", "'int'", "'char'", "'double'", "'float'", 
		"'void'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "VAR", "NUM", "VALUE", "WS"
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
	public String getGrammarFileName() { return "inputoutput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public inputoutputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StrukturContext extends ParserRuleContext {
		public D_typeContext d_type() {
			return getRuleContext(D_typeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(inputoutputParser.VAR, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public StrukturContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struktur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterStruktur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitStruktur(this);
		}
	}

	public final StrukturContext struktur() throws RecognitionException {
		StrukturContext _localctx = new StrukturContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_struktur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			d_type();
			setState(9);
			match(VAR);
			setState(10);
			match(T__0);
			setState(11);
			parameter();
			setState(12);
			match(T__1);
			setState(13);
			match(T__2);
			setState(14);
			ret();
			setState(15);
			match(T__3);
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

	public static class ParameterContext extends ParserRuleContext {
		public List<D_typeContext> d_type() {
			return getRuleContexts(D_typeContext.class);
		}
		public D_typeContext d_type(int i) {
			return getRuleContext(D_typeContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(inputoutputParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(inputoutputParser.VAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(inputoutputParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(inputoutputParser.NUM, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(17);
				d_type();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(18);
					match(T__4);
					}
				}

				setState(21);
				match(VAR);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(22);
					match(T__5);
					setState(23);
					match(NUM);
					setState(24);
					match(T__6);
					}
				}

				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(27);
					match(T__7);
					}
				}

				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class D_typeContext extends ParserRuleContext {
		public D_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterD_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitD_type(this);
		}
	}

	public final D_typeContext d_type() throws RecognitionException {
		D_typeContext _localctx = new D_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_d_type);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9) {
					{
					setState(35);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
				case T__12:
					{
					{
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
						{
						setState(38);
						match(T__10);
						}
						break;
					case T__11:
						{
						{
						setState(39);
						match(T__11);
						setState(41);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__11) {
							{
							setState(40);
							match(T__11);
							}
						}

						}
						}
						break;
					case T__12:
						break;
					default:
						break;
					}
					setState(45);
					match(T__12);
					}
					}
					break;
				case T__13:
					{
					setState(46);
					match(T__13);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(49);
					match(T__11);
					}
				}

				setState(52);
				match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(T__16);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(inputoutputParser.VALUE, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__17);
			setState(58);
			match(VALUE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\26"+
		"\n\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\5\3\37\n\3\7\3!\n\3\f\3\16\3$\13\3"+
		"\3\4\5\4\'\n\4\3\4\3\4\3\4\5\4,\n\4\5\4.\n\4\3\4\3\4\5\4\62\n\4\3\4\5"+
		"\4\65\n\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\3\2\13"+
		"\f\2G\2\n\3\2\2\2\4\"\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\n\13\5\6\4\2\13\f"+
		"\7\25\2\2\f\r\7\3\2\2\r\16\5\4\3\2\16\17\7\4\2\2\17\20\7\5\2\2\20\21\5"+
		"\b\5\2\21\22\7\6\2\2\22\3\3\2\2\2\23\25\5\6\4\2\24\26\7\7\2\2\25\24\3"+
		"\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\33\7\25\2\2\30\31\7\b\2\2\31\32"+
		"\7\26\2\2\32\34\7\t\2\2\33\30\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\37"+
		"\7\n\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \23\3\2\2\2!$\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$\"\3\2\2\2%\'\t\2\2\2&%\3\2\2\2&\'\3"+
		"\2\2\2\'\61\3\2\2\2(.\7\r\2\2)+\7\16\2\2*,\7\16\2\2+*\3\2\2\2+,\3\2\2"+
		"\2,.\3\2\2\2-(\3\2\2\2-)\3\2\2\2-.\3\2\2\2./\3\2\2\2/\62\7\17\2\2\60\62"+
		"\7\20\2\2\61-\3\2\2\2\61\60\3\2\2\2\62:\3\2\2\2\63\65\7\16\2\2\64\63\3"+
		"\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66:\7\21\2\2\67:\7\22\2\28:\7\23\2"+
		"\29&\3\2\2\29\64\3\2\2\29\67\3\2\2\298\3\2\2\2:\7\3\2\2\2;<\7\24\2\2<"+
		"=\7\27\2\2=\t\3\2\2\2\f\25\33\36\"&+-\61\649";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}