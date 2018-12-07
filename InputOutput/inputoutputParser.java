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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, INPUT_DATA=27, OUTPUT_DATA=28, VAR=29, NUM=30, WS=31;
	public static final int
		RULE_struktur = 0, RULE_parameter = 1, RULE_d_type = 2, RULE_input = 3, 
		RULE_output = 4, RULE_input_d = 5, RULE_format = 6;
	public static final String[] ruleNames = {
		"struktur", "parameter", "d_type", "input", "output", "input_d", "format"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "'return'", "';'", "'}'", "'void'", "'*'", 
		"'['", "']'", "','", "'unsigned'", "'signed'", "'short'", "'long'", "'int'", 
		"'char'", "'double'", "'float'", "'scanf'", "'\"'", "'&'", "'printf'", 
		"'%'", "'[]'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INPUT_DATA", "OUTPUT_DATA", "VAR", "NUM", "WS"
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
		public List<TerminalNode> VAR() { return getTokens(inputoutputParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(inputoutputParser.VAR, i);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode NUM() { return getToken(inputoutputParser.NUM, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
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
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				d_type();
				setState(15);
				match(VAR);
				setState(16);
				match(T__0);
				setState(17);
				parameter();
				setState(18);
				match(T__1);
				setState(19);
				match(T__2);
				setState(20);
				match(T__3);
				{
				setState(21);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(22);
				match(T__4);
				}
				setState(24);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__6);
				setState(27);
				match(VAR);
				setState(28);
				match(T__0);
				setState(29);
				parameter();
				setState(30);
				match(T__1);
				setState(31);
				match(T__2);
				setState(32);
				match(T__5);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				input();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				output();
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

	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(inputoutputParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(inputoutputParser.VAR, i);
		}
		public List<D_typeContext> d_type() {
			return getRuleContexts(D_typeContext.class);
		}
		public D_typeContext d_type(int i) {
			return getRuleContext(D_typeContext.class,i);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) {
				{
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
					{
					setState(38);
					d_type();
					}
					break;
				case T__6:
					{
					setState(39);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(42);
					match(T__7);
					}
				}

				setState(45);
				match(VAR);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(46);
					match(T__8);
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NUM) {
						{
						setState(47);
						match(NUM);
						}
					}

					setState(50);
					match(T__9);
					}
				}

				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(53);
					match(T__10);
					}
				}

				}
				}
				setState(60);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(61);
					_la = _input.LA(1);
					if ( !(_la==T__11 || _la==T__12) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
				case T__14:
				case T__15:
					{
					{
					setState(69);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__13:
						{
						setState(64);
						match(T__13);
						}
						break;
					case T__14:
						{
						{
						setState(65);
						match(T__14);
						setState(67);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__14) {
							{
							setState(66);
							match(T__14);
							}
						}

						}
						}
						break;
					case T__15:
						break;
					default:
						break;
					}
					setState(71);
					match(T__15);
					}
					}
					break;
				case T__16:
					{
					setState(72);
					match(T__16);
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
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(75);
					match(T__14);
					}
				}

				setState(78);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__18);
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

	public static class InputContext extends ParserRuleContext {
		public Input_dContext input_d() {
			return getRuleContext(Input_dContext.class,0);
		}
		public TerminalNode VAR() { return getToken(inputoutputParser.VAR, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__19);
			setState(83);
			match(T__0);
			setState(84);
			match(T__20);
			setState(85);
			input_d();
			setState(86);
			match(T__20);
			setState(87);
			match(T__10);
			setState(88);
			match(T__21);
			setState(89);
			match(VAR);
			setState(90);
			match(T__1);
			setState(91);
			match(T__4);
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

	public static class OutputContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(inputoutputParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(inputoutputParser.VAR, i);
		}
		public List<FormatContext> format() {
			return getRuleContexts(FormatContext.class);
		}
		public FormatContext format(int i) {
			return getRuleContext(FormatContext.class,i);
		}
		public List<TerminalNode> INPUT_DATA() { return getTokens(inputoutputParser.INPUT_DATA); }
		public TerminalNode INPUT_DATA(int i) {
			return getToken(inputoutputParser.INPUT_DATA, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__22);
				setState(94);
				match(T__0);
				setState(95);
				match(T__20);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(98);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(96);
						match(VAR);
						}
						break;
					case T__25:
						{
						setState(97);
						format();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__25 || _la==VAR );
				setState(102);
				match(T__20);
				setState(103);
				match(T__1);
				setState(104);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__22);
				setState(106);
				match(T__0);
				setState(107);
				match(T__20);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(112);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(108);
						match(VAR);
						}
						break;
					case T__25:
						{
						setState(109);
						format();
						}
						break;
					case T__23:
						{
						setState(110);
						match(T__23);
						setState(111);
						match(INPUT_DATA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__25) | (1L << VAR))) != 0) );
				setState(116);
				match(T__20);
				setState(117);
				match(T__10);
				setState(118);
				match(VAR);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(119);
					match(T__10);
					setState(120);
					match(VAR);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__1);
				setState(127);
				match(T__4);
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

	public static class Input_dContext extends ParserRuleContext {
		public TerminalNode INPUT_DATA() { return getToken(inputoutputParser.INPUT_DATA, 0); }
		public Input_dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterInput_d(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitInput_d(this);
		}
	}

	public final Input_dContext input_d() throws RecognitionException {
		Input_dContext _localctx = new Input_dContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_input_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__23);
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << INPUT_DATA))) != 0)) ) {
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode OUTPUT_DATA() { return getToken(inputoutputParser.OUTPUT_DATA, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__25);
			setState(134);
			match(OUTPUT_DATA);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u008b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\'"+
		"\n\2\3\3\3\3\5\3+\n\3\3\3\5\3.\n\3\3\3\3\3\3\3\5\3\63\n\3\3\3\5\3\66\n"+
		"\3\3\3\5\39\n\3\7\3;\n\3\f\3\16\3>\13\3\3\4\5\4A\n\4\3\4\3\4\3\4\5\4F"+
		"\n\4\5\4H\n\4\3\4\3\4\5\4L\n\4\3\4\5\4O\n\4\3\4\3\4\5\4S\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\6\6e\n\6\r\6\16"+
		"\6f\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6s\n\6\r\6\16\6t\3\6\3\6"+
		"\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\5\3\2\37 \3\2\16\17\4\2\32"+
		"\33\35\35\2\u009b\2&\3\2\2\2\4<\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\n\u0082"+
		"\3\2\2\2\f\u0084\3\2\2\2\16\u0087\3\2\2\2\20\21\5\6\4\2\21\22\7\37\2\2"+
		"\22\23\7\3\2\2\23\24\5\4\3\2\24\25\7\4\2\2\25\26\7\5\2\2\26\27\7\6\2\2"+
		"\27\30\t\2\2\2\30\31\7\7\2\2\31\32\3\2\2\2\32\33\7\b\2\2\33\'\3\2\2\2"+
		"\34\35\7\t\2\2\35\36\7\37\2\2\36\37\7\3\2\2\37 \5\4\3\2 !\7\4\2\2!\"\7"+
		"\5\2\2\"#\7\b\2\2#\'\3\2\2\2$\'\5\b\5\2%\'\5\n\6\2&\20\3\2\2\2&\34\3\2"+
		"\2\2&$\3\2\2\2&%\3\2\2\2\'\3\3\2\2\2(+\5\6\4\2)+\7\t\2\2*(\3\2\2\2*)\3"+
		"\2\2\2+-\3\2\2\2,.\7\n\2\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\65\7\37\2\2"+
		"\60\62\7\13\2\2\61\63\7 \2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2"+
		"\64\66\7\f\2\2\65\60\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\7\r\2\28\67"+
		"\3\2\2\289\3\2\2\29;\3\2\2\2:*\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"\5\3\2\2\2><\3\2\2\2?A\t\3\2\2@?\3\2\2\2@A\3\2\2\2AK\3\2\2\2BH\7\20\2"+
		"\2CE\7\21\2\2DF\7\21\2\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GB\3\2\2\2GC\3\2"+
		"\2\2GH\3\2\2\2HI\3\2\2\2IL\7\22\2\2JL\7\23\2\2KG\3\2\2\2KJ\3\2\2\2LS\3"+
		"\2\2\2MO\7\21\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PS\7\24\2\2QS\7\25\2\2"+
		"R@\3\2\2\2RN\3\2\2\2RQ\3\2\2\2S\7\3\2\2\2TU\7\26\2\2UV\7\3\2\2VW\7\27"+
		"\2\2WX\5\f\7\2XY\7\27\2\2YZ\7\r\2\2Z[\7\30\2\2[\\\7\37\2\2\\]\7\4\2\2"+
		"]^\7\7\2\2^\t\3\2\2\2_`\7\31\2\2`a\7\3\2\2ad\7\27\2\2be\7\37\2\2ce\5\16"+
		"\b\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\27"+
		"\2\2ij\7\4\2\2j\u0083\7\7\2\2kl\7\31\2\2lm\7\3\2\2mr\7\27\2\2ns\7\37\2"+
		"\2os\5\16\b\2pq\7\32\2\2qs\7\35\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2st\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\27\2\2wx\7\r\2\2x}\7\37\2\2y"+
		"z\7\r\2\2z|\7\37\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\4\2\2\u0081\u0083\7\7\2\2\u0082_\3"+
		"\2\2\2\u0082k\3\2\2\2\u0083\13\3\2\2\2\u0084\u0085\7\32\2\2\u0085\u0086"+
		"\t\4\2\2\u0086\r\3\2\2\2\u0087\u0088\7\34\2\2\u0088\u0089\7\36\2\2\u0089"+
		"\17\3\2\2\2\25&*-\62\658<@EGKNRdfrt}\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}