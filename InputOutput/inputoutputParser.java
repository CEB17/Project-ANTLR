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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INPUT_DATA=39, OUTPUT_DATA=40, OUTPUT_FORMAT=41, CHAR=42, NUM=43, SYMBOL=44, 
		WS=45;
	public static final int
		RULE_struktur = 0, RULE_parameter = 1, RULE_d_type = 2, RULE_ret = 3, 
		RULE_input = 4, RULE_output = 5, RULE_input_d = 6, RULE_format = 7, RULE_variable = 8, 
		RULE_sign = 9, RULE_empty_arr = 10, RULE_arr = 11;
	public static final String[] ruleNames = {
		"struktur", "parameter", "d_type", "ret", "input", "output", "input_d", 
		"format", "variable", "sign", "empty_arr", "arr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "';'", "'}'", "'void'", "'*'", "','", "'unsigned'", 
		"'signed'", "'short'", "'long'", "'int'", "'char'", "'double'", "'float'", 
		"'return'", "'scanf'", "'\"'", "'&'", "'printf'", "'%'", "'-'", "'_'", 
		"'='", "'+'", "'|'", "'\\'", "':'", "'''", "'.'", "'<'", "'>'", "'/'", 
		"'?'", "'['", "']'", "'[]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INPUT_DATA", "OUTPUT_DATA", "OUTPUT_FORMAT", "CHAR", 
		"NUM", "SYMBOL", "WS"
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
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
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				d_type();
				setState(25);
				variable();
				setState(26);
				match(T__0);
				setState(27);
				parameter();
				setState(28);
				match(T__1);
				setState(29);
				match(T__2);
				setState(30);
				ret();
				setState(31);
				match(T__3);
				setState(32);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__5);
				setState(35);
				variable();
				setState(36);
				match(T__0);
				setState(37);
				parameter();
				setState(38);
				match(T__1);
				setState(39);
				match(T__2);
				setState(40);
				match(T__4);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				input();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<D_typeContext> d_type() {
			return getRuleContexts(D_typeContext.class);
		}
		public D_typeContext d_type(int i) {
			return getRuleContext(D_typeContext.class,i);
		}
		public List<ArrContext> arr() {
			return getRuleContexts(ArrContext.class);
		}
		public ArrContext arr(int i) {
			return getRuleContext(ArrContext.class,i);
		}
		public List<Empty_arrContext> empty_arr() {
			return getRuleContexts(Empty_arrContext.class);
		}
		public Empty_arrContext empty_arr(int i) {
			return getRuleContext(Empty_arrContext.class,i);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					{
					setState(46);
					d_type();
					}
					break;
				case T__5:
					{
					setState(47);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(50);
					match(T__6);
					}
				}

				setState(53);
				variable();
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(54);
					arr();
					}
					break;
				case T__37:
					{
					setState(55);
					empty_arr();
					}
					break;
				case T__1:
				case T__5:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
					break;
				default:
					break;
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(58);
					match(T__7);
					}
				}

				}
				}
				setState(65);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9) {
					{
					setState(66);
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

				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
				case T__12:
					{
					{
					setState(74);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
						{
						setState(69);
						match(T__10);
						}
						break;
					case T__11:
						{
						{
						setState(70);
						match(T__11);
						setState(72);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__11) {
							{
							setState(71);
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
					setState(76);
					match(T__12);
					}
					}
					break;
				case T__13:
					{
					setState(77);
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
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(80);
					match(T__11);
					}
				}

				setState(83);
				match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__15);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NUM() { return getToken(inputoutputParser.NUM, 0); }
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
			setState(87);
			match(T__16);
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_DATA:
			case OUTPUT_DATA:
			case CHAR:
				{
				setState(88);
				variable();
				}
				break;
			case NUM:
				{
				setState(89);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InputContext extends ParserRuleContext {
		public Input_dContext input_d() {
			return getRuleContext(Input_dContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__17);
			setState(93);
			match(T__0);
			setState(94);
			match(T__18);
			setState(95);
			input_d();
			setState(96);
			match(T__18);
			setState(97);
			match(T__7);
			setState(98);
			match(T__19);
			setState(99);
			variable();
			setState(100);
			match(T__1);
			setState(101);
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

	public static class OutputContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FormatContext> format() {
			return getRuleContexts(FormatContext.class);
		}
		public FormatContext format(int i) {
			return getRuleContext(FormatContext.class,i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public List<TerminalNode> INPUT_DATA() { return getTokens(inputoutputParser.INPUT_DATA); }
		public TerminalNode INPUT_DATA(int i) {
			return getToken(inputoutputParser.INPUT_DATA, i);
		}
		public List<TerminalNode> OUTPUT_DATA() { return getTokens(inputoutputParser.OUTPUT_DATA); }
		public TerminalNode OUTPUT_DATA(int i) {
			return getToken(inputoutputParser.OUTPUT_DATA, i);
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
		enterRule(_localctx, 10, RULE_output);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(103);
					match(T__20);
					setState(104);
					match(T__0);
					setState(105);
					match(T__18);
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(109);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case INPUT_DATA:
							case OUTPUT_DATA:
							case CHAR:
								{
								setState(106);
								variable();
								}
								break;
							case OUTPUT_FORMAT:
								{
								setState(107);
								format();
								}
								break;
							case T__0:
							case T__1:
							case T__3:
							case T__6:
							case T__7:
							case T__18:
							case T__19:
							case T__22:
							case T__23:
							case T__24:
							case T__25:
							case T__26:
							case T__27:
							case T__28:
							case T__29:
							case T__30:
							case T__31:
							case T__32:
							case T__33:
							case T__34:
							case T__35:
							case T__36:
							case T__37:
							case SYMBOL:
								{
								setState(108);
								sign();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							} 
						}
						setState(113);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(114);
					match(T__18);
					setState(115);
					match(T__1);
					setState(116);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(117);
					match(T__20);
					setState(118);
					match(T__0);
					setState(119);
					match(T__18);
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(125);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case T__0:
							case T__1:
							case T__3:
							case T__6:
							case T__7:
							case T__18:
							case T__19:
							case T__22:
							case T__23:
							case T__24:
							case T__25:
							case T__26:
							case T__27:
							case T__28:
							case T__29:
							case T__30:
							case T__31:
							case T__32:
							case T__33:
							case T__34:
							case T__35:
							case T__36:
							case T__37:
							case SYMBOL:
								{
								setState(120);
								sign();
								}
								break;
							case INPUT_DATA:
							case OUTPUT_DATA:
							case CHAR:
								{
								setState(121);
								variable();
								}
								break;
							case OUTPUT_FORMAT:
								{
								setState(122);
								format();
								}
								break;
							case T__21:
								{
								setState(123);
								match(T__21);
								setState(124);
								_la = _input.LA(1);
								if ( !(_la==INPUT_DATA || _la==OUTPUT_DATA) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							} 
						}
						setState(129);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(130);
					match(T__18);
					setState(131);
					match(T__7);
					setState(132);
					variable();
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(133);
						match(T__7);
						setState(134);
						variable();
						}
						}
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(140);
					match(T__1);
					setState(141);
					match(T__3);
					}
					break;
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
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
		public List<TerminalNode> INPUT_DATA() { return getTokens(inputoutputParser.INPUT_DATA); }
		public TerminalNode INPUT_DATA(int i) {
			return getToken(inputoutputParser.INPUT_DATA, i);
		}
		public List<Empty_arrContext> empty_arr() {
			return getRuleContexts(Empty_arrContext.class);
		}
		public Empty_arrContext empty_arr(int i) {
			return getRuleContext(Empty_arrContext.class,i);
		}
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
		enterRule(_localctx, 12, RULE_input_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(T__21);
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INPUT_DATA:
					{
					setState(148);
					match(INPUT_DATA);
					}
					break;
				case T__37:
					{
					setState(149);
					empty_arr();
					}
					break;
				case T__21:
					{
					setState(150);
					match(T__21);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 );
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
		public TerminalNode OUTPUT_FORMAT() { return getToken(inputoutputParser.OUTPUT_FORMAT, 0); }
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
		enterRule(_localctx, 14, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(OUTPUT_FORMAT);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(inputoutputParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(inputoutputParser.NUM, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(inputoutputParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(inputoutputParser.CHAR, i);
		}
		public List<TerminalNode> INPUT_DATA() { return getTokens(inputoutputParser.INPUT_DATA); }
		public TerminalNode INPUT_DATA(int i) {
			return getToken(inputoutputParser.INPUT_DATA, i);
		}
		public List<TerminalNode> OUTPUT_DATA() { return getTokens(inputoutputParser.OUTPUT_DATA); }
		public TerminalNode OUTPUT_DATA(int i) {
			return getToken(inputoutputParser.OUTPUT_DATA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(160); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(159);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT_DATA) | (1L << OUTPUT_DATA) | (1L << CHAR))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(162); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(164);
						match(NUM);
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SignContext extends ParserRuleContext {
		public List<TerminalNode> SYMBOL() { return getTokens(inputoutputParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(inputoutputParser.SYMBOL, i);
		}
		public List<Empty_arrContext> empty_arr() {
			return getRuleContexts(Empty_arrContext.class);
		}
		public Empty_arrContext empty_arr(int i) {
			return getRuleContext(Empty_arrContext.class,i);
		}
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(198);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SYMBOL:
						{
						setState(174);
						match(SYMBOL);
						}
						break;
					case T__19:
						{
						setState(175);
						match(T__19);
						}
						break;
					case T__6:
						{
						setState(176);
						match(T__6);
						}
						break;
					case T__0:
						{
						setState(177);
						match(T__0);
						}
						break;
					case T__1:
						{
						setState(178);
						match(T__1);
						}
						break;
					case T__22:
						{
						setState(179);
						match(T__22);
						}
						break;
					case T__23:
						{
						setState(180);
						match(T__23);
						}
						break;
					case T__24:
						{
						setState(181);
						match(T__24);
						}
						break;
					case T__25:
						{
						setState(182);
						match(T__25);
						}
						break;
					case T__26:
						{
						setState(183);
						match(T__26);
						}
						break;
					case T__27:
						{
						setState(184);
						match(T__27);
						}
						break;
					case T__28:
						{
						setState(185);
						match(T__28);
						}
						break;
					case T__3:
						{
						setState(186);
						match(T__3);
						}
						break;
					case T__29:
						{
						setState(187);
						match(T__29);
						}
						break;
					case T__18:
						{
						setState(188);
						match(T__18);
						}
						break;
					case T__7:
						{
						setState(189);
						match(T__7);
						}
						break;
					case T__30:
						{
						setState(190);
						match(T__30);
						}
						break;
					case T__31:
						{
						setState(191);
						match(T__31);
						}
						break;
					case T__32:
						{
						setState(192);
						match(T__32);
						}
						break;
					case T__33:
						{
						setState(193);
						match(T__33);
						}
						break;
					case T__34:
						{
						setState(194);
						match(T__34);
						}
						break;
					case T__35:
						{
						setState(195);
						match(T__35);
						}
						break;
					case T__36:
						{
						setState(196);
						match(T__36);
						}
						break;
					case T__37:
						{
						setState(197);
						empty_arr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Empty_arrContext extends ParserRuleContext {
		public Empty_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterEmpty_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitEmpty_arr(this);
		}
	}

	public final Empty_arrContext empty_arr() throws RecognitionException {
		Empty_arrContext _localctx = new Empty_arrContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_empty_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__37);
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

	public static class ArrContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(inputoutputParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(inputoutputParser.CHAR, 0); }
		public TerminalNode INPUT_DATA() { return getToken(inputoutputParser.INPUT_DATA, 0); }
		public TerminalNode OUTPUT_DATA() { return getToken(inputoutputParser.OUTPUT_DATA, 0); }
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitArr(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__35);
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(205);
				match(NUM);
				}
				break;
			case T__29:
				{
				setState(206);
				match(T__29);
				setState(207);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT_DATA) | (1L << OUTPUT_DATA) | (1L << CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				match(T__29);
				}
				break;
			case T__36:
				break;
			default:
				break;
			}
			setState(211);
			match(T__36);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\5\3\63\n\3\3\3\5\3\66"+
		"\n\3\3\3\3\3\3\3\5\3;\n\3\3\3\5\3>\n\3\7\3@\n\3\f\3\16\3C\13\3\3\4\5\4"+
		"F\n\4\3\4\3\4\3\4\5\4K\n\4\5\4M\n\4\3\4\3\4\5\4Q\n\4\3\4\5\4T\n\4\3\4"+
		"\3\4\5\4X\n\4\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\3\7\3\7\6\7\u0092"+
		"\n\7\r\7\16\7\u0093\3\b\3\b\3\b\3\b\5\b\u009a\n\b\6\b\u009c\n\b\r\b\16"+
		"\b\u009d\3\t\3\t\3\n\6\n\u00a3\n\n\r\n\16\n\u00a4\3\n\7\n\u00a8\n\n\f"+
		"\n\16\n\u00ab\13\n\6\n\u00ad\n\n\r\n\16\n\u00ae\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\6\13\u00c9\n\13\r\13\16\13\u00ca\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00d4\n\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\5\3\2\13\f\3\2)*\4\2)*,,\2\u0107\2.\3\2\2\2\4A\3\2\2\2"+
		"\6W\3\2\2\2\bY\3\2\2\2\n^\3\2\2\2\f\u0091\3\2\2\2\16\u009b\3\2\2\2\20"+
		"\u009f\3\2\2\2\22\u00ac\3\2\2\2\24\u00c8\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce"+
		"\3\2\2\2\32\33\5\6\4\2\33\34\5\22\n\2\34\35\7\3\2\2\35\36\5\4\3\2\36\37"+
		"\7\4\2\2\37 \7\5\2\2 !\5\b\5\2!\"\7\6\2\2\"#\7\7\2\2#/\3\2\2\2$%\7\b\2"+
		"\2%&\5\22\n\2&\'\7\3\2\2\'(\5\4\3\2()\7\4\2\2)*\7\5\2\2*+\7\7\2\2+/\3"+
		"\2\2\2,/\5\n\6\2-/\5\f\7\2.\32\3\2\2\2.$\3\2\2\2.,\3\2\2\2.-\3\2\2\2/"+
		"\3\3\2\2\2\60\63\5\6\4\2\61\63\7\b\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63"+
		"\65\3\2\2\2\64\66\7\t\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		":\5\22\n\28;\5\30\r\29;\5\26\f\2:8\3\2\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2"+
		"\2<>\7\n\2\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?\62\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2DF\t\2\2\2ED\3\2\2\2EF\3\2\2\2FP\3"+
		"\2\2\2GM\7\r\2\2HJ\7\16\2\2IK\7\16\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2L"+
		"G\3\2\2\2LH\3\2\2\2LM\3\2\2\2MN\3\2\2\2NQ\7\17\2\2OQ\7\20\2\2PL\3\2\2"+
		"\2PO\3\2\2\2QX\3\2\2\2RT\7\16\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UX\7\21"+
		"\2\2VX\7\22\2\2WE\3\2\2\2WS\3\2\2\2WV\3\2\2\2X\7\3\2\2\2Y\\\7\23\2\2Z"+
		"]\5\22\n\2[]\7-\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^_\7\24\2\2_`\7\3"+
		"\2\2`a\7\25\2\2ab\5\16\b\2bc\7\25\2\2cd\7\n\2\2de\7\26\2\2ef\5\22\n\2"+
		"fg\7\4\2\2gh\7\6\2\2h\13\3\2\2\2ij\7\27\2\2jk\7\3\2\2kq\7\25\2\2lp\5\22"+
		"\n\2mp\5\20\t\2np\5\24\13\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2ps\3\2\2\2qo"+
		"\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\25\2\2uv\7\4\2\2v\u0092\7\6"+
		"\2\2wx\7\27\2\2xy\7\3\2\2y\u0081\7\25\2\2z\u0080\5\24\13\2{\u0080\5\22"+
		"\n\2|\u0080\5\20\t\2}~\7\30\2\2~\u0080\t\3\2\2\177z\3\2\2\2\177{\3\2\2"+
		"\2\177|\3\2\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\25"+
		"\2\2\u0085\u0086\7\n\2\2\u0086\u008b\5\22\n\2\u0087\u0088\7\n\2\2\u0088"+
		"\u008a\5\22\n\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\4\2\2\u008f\u0090\7\6\2\2\u0090\u0092\3\2\2\2\u0091i\3\2\2\2"+
		"\u0091w\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\r\3\2\2\2\u0095\u0099\7\30\2\2\u0096\u009a\7)\2\2\u0097\u009a"+
		"\5\26\f\2\u0098\u009a\7\30\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f"+
		"\u00a0\7+\2\2\u00a0\21\3\2\2\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9"+
		"\3\2\2\2\u00a6\u00a8\7-\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00a2\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\23\3\2\2\2\u00b0\u00c9\7.\2\2\u00b1\u00c9\7\26\2"+
		"\2\u00b2\u00c9\7\t\2\2\u00b3\u00c9\7\3\2\2\u00b4\u00c9\7\4\2\2\u00b5\u00c9"+
		"\7\31\2\2\u00b6\u00c9\7\32\2\2\u00b7\u00c9\7\33\2\2\u00b8\u00c9\7\34\2"+
		"\2\u00b9\u00c9\7\35\2\2\u00ba\u00c9\7\36\2\2\u00bb\u00c9\7\37\2\2\u00bc"+
		"\u00c9\7\6\2\2\u00bd\u00c9\7 \2\2\u00be\u00c9\7\25\2\2\u00bf\u00c9\7\n"+
		"\2\2\u00c0\u00c9\7!\2\2\u00c1\u00c9\7\"\2\2\u00c2\u00c9\7#\2\2\u00c3\u00c9"+
		"\7$\2\2\u00c4\u00c9\7%\2\2\u00c5\u00c9\7&\2\2\u00c6\u00c9\7\'\2\2\u00c7"+
		"\u00c9\5\26\f\2\u00c8\u00b0\3\2\2\2\u00c8\u00b1\3\2\2\2\u00c8\u00b2\3"+
		"\2\2\2\u00c8\u00b3\3\2\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00b5\3\2\2\2\u00c8"+
		"\u00b6\3\2\2\2\u00c8\u00b7\3\2\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00b9\3\2"+
		"\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00bc\3\2\2\2\u00c8"+
		"\u00bd\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c0\3\2"+
		"\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\25\3\2\2\2\u00cc\u00cd\7(\2\2\u00cd\27\3\2\2\2\u00ce\u00d3\7&\2\2\u00cf"+
		"\u00d4\7-\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\t\4\2\2\u00d2\u00d4\7 \2"+
		"\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6\31\3\2\2\2\36.\62\65:=AEJLPSW\\oq\177"+
		"\u0081\u008b\u0091\u0093\u0099\u009d\u00a4\u00a9\u00ae\u00c8\u00ca\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}