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
		RULE_struktur = 0, RULE_function = 1, RULE_parameter = 2, RULE_d_type = 3, 
		RULE_ret = 4, RULE_input = 5, RULE_output = 6, RULE_input_d = 7, RULE_format = 8, 
		RULE_variable = 9, RULE_sign = 10, RULE_empty_arr = 11, RULE_arr = 12;
	public static final String[] ruleNames = {
		"struktur", "function", "parameter", "d_type", "ret", "input", "output", 
		"input_d", "format", "variable", "sign", "empty_arr", "arr"
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
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
				setState(26);
				function();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				input();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
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

	public static class FunctionContext extends ParserRuleContext {
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
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			setState(63);
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
				setState(31);
				d_type();
				setState(32);
				variable();
				setState(33);
				match(T__0);
				setState(34);
				parameter();
				setState(35);
				match(T__1);
				setState(36);
				match(T__2);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==T__20) {
					{
					setState(39);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__17:
						{
						setState(37);
						input();
						}
						break;
					case T__20:
						{
						setState(38);
						output();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				ret();
				setState(45);
				match(T__3);
				setState(46);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(T__5);
				setState(49);
				variable();
				setState(50);
				match(T__0);
				setState(51);
				parameter();
				setState(52);
				match(T__1);
				setState(53);
				match(T__2);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==T__20) {
					{
					setState(56);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__17:
						{
						setState(54);
						input();
						}
						break;
					case T__20:
						{
						setState(55);
						output();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(T__4);
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
		enterRule(_localctx, 4, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				{
				setState(67);
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
					setState(65);
					d_type();
					}
					break;
				case T__5:
					{
					setState(66);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(69);
					match(T__6);
					}
				}

				setState(72);
				variable();
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(73);
					arr();
					}
					break;
				case T__37:
					{
					setState(74);
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
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(77);
					match(T__7);
					}
				}

				}
				}
				setState(84);
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
		enterRule(_localctx, 6, RULE_d_type);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9) {
					{
					setState(85);
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

				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__11:
				case T__12:
					{
					{
					setState(93);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
						{
						setState(88);
						match(T__10);
						}
						break;
					case T__11:
						{
						{
						setState(89);
						match(T__11);
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__11) {
							{
							setState(90);
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
					setState(95);
					match(T__12);
					}
					}
					break;
				case T__13:
					{
					setState(96);
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
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(99);
					match(T__11);
					}
				}

				setState(102);
				match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
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
		enterRule(_localctx, 8, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__16);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_DATA:
			case OUTPUT_DATA:
			case CHAR:
				{
				setState(107);
				variable();
				}
				break;
			case NUM:
				{
				setState(108);
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
		enterRule(_localctx, 10, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__17);
			setState(112);
			match(T__0);
			setState(113);
			match(T__18);
			setState(114);
			input_d();
			setState(115);
			match(T__18);
			setState(116);
			match(T__7);
			setState(117);
			match(T__19);
			setState(118);
			variable();
			setState(119);
			match(T__1);
			setState(120);
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
		enterRule(_localctx, 12, RULE_output);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(122);
						match(T__20);
						setState(123);
						match(T__0);
						setState(124);
						match(T__18);
						setState(130);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(128);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case INPUT_DATA:
								case OUTPUT_DATA:
								case CHAR:
									{
									setState(125);
									variable();
									}
									break;
								case OUTPUT_FORMAT:
									{
									setState(126);
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
									setState(127);
									sign();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								} 
							}
							setState(132);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						}
						setState(133);
						match(T__18);
						setState(134);
						match(T__1);
						setState(135);
						match(T__3);
						}
						break;
					case 2:
						{
						setState(136);
						match(T__20);
						setState(137);
						match(T__0);
						setState(138);
						match(T__18);
						setState(146);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(144);
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
									setState(139);
									sign();
									}
									break;
								case INPUT_DATA:
								case OUTPUT_DATA:
								case CHAR:
									{
									setState(140);
									variable();
									}
									break;
								case OUTPUT_FORMAT:
									{
									setState(141);
									format();
									}
									break;
								case T__21:
									{
									setState(142);
									match(T__21);
									setState(143);
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
							setState(148);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
						}
						setState(149);
						match(T__18);
						setState(150);
						match(T__7);
						setState(151);
						variable();
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__7) {
							{
							{
							setState(152);
							match(T__7);
							setState(153);
							variable();
							}
							}
							setState(158);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(159);
						match(T__1);
						setState(160);
						match(T__3);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
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
		enterRule(_localctx, 14, RULE_input_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(T__21);
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INPUT_DATA:
					{
					setState(167);
					match(INPUT_DATA);
					}
					break;
				case T__37:
					{
					setState(168);
					empty_arr();
					}
					break;
				case T__21:
					{
					setState(169);
					match(T__21);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(174); 
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
		enterRule(_localctx, 16, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 18, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(179); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(178);
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
						setState(181); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(183);
						match(NUM);
						}
						}
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 20, RULE_sign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(217);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SYMBOL:
						{
						setState(193);
						match(SYMBOL);
						}
						break;
					case T__19:
						{
						setState(194);
						match(T__19);
						}
						break;
					case T__6:
						{
						setState(195);
						match(T__6);
						}
						break;
					case T__0:
						{
						setState(196);
						match(T__0);
						}
						break;
					case T__1:
						{
						setState(197);
						match(T__1);
						}
						break;
					case T__22:
						{
						setState(198);
						match(T__22);
						}
						break;
					case T__23:
						{
						setState(199);
						match(T__23);
						}
						break;
					case T__24:
						{
						setState(200);
						match(T__24);
						}
						break;
					case T__25:
						{
						setState(201);
						match(T__25);
						}
						break;
					case T__26:
						{
						setState(202);
						match(T__26);
						}
						break;
					case T__27:
						{
						setState(203);
						match(T__27);
						}
						break;
					case T__28:
						{
						setState(204);
						match(T__28);
						}
						break;
					case T__3:
						{
						setState(205);
						match(T__3);
						}
						break;
					case T__29:
						{
						setState(206);
						match(T__29);
						}
						break;
					case T__18:
						{
						setState(207);
						match(T__18);
						}
						break;
					case T__7:
						{
						setState(208);
						match(T__7);
						}
						break;
					case T__30:
						{
						setState(209);
						match(T__30);
						}
						break;
					case T__31:
						{
						setState(210);
						match(T__31);
						}
						break;
					case T__32:
						{
						setState(211);
						match(T__32);
						}
						break;
					case T__33:
						{
						setState(212);
						match(T__33);
						}
						break;
					case T__34:
						{
						setState(213);
						match(T__34);
						}
						break;
					case T__35:
						{
						setState(214);
						match(T__35);
						}
						break;
					case T__36:
						{
						setState(215);
						match(T__36);
						}
						break;
					case T__37:
						{
						setState(216);
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
				setState(219); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 22, RULE_empty_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 24, RULE_arr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__35);
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(224);
				match(NUM);
				}
				break;
			case T__29:
				{
				setState(225);
				match(T__29);
				setState(226);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT_DATA) | (1L << OUTPUT_DATA) | (1L << CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				match(T__29);
				}
				break;
			case T__36:
				break;
			default:
				break;
			}
			setState(230);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\5\3B\n\3\3\4\3\4\5\4F\n"+
		"\4\3\4\5\4I\n\4\3\4\3\4\3\4\5\4N\n\4\3\4\5\4Q\n\4\7\4S\n\4\f\4\16\4V\13"+
		"\4\3\5\5\5Y\n\5\3\5\3\5\3\5\5\5^\n\5\5\5`\n\5\3\5\3\5\5\5d\n\5\3\5\5\5"+
		"g\n\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0083\n\b\f\b\16\b\u0086"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16"+
		"\b\u0096\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16\b\u00a0\13\b\3"+
		"\b\3\b\3\b\6\b\u00a5\n\b\r\b\16\b\u00a6\3\t\3\t\3\t\3\t\5\t\u00ad\n\t"+
		"\6\t\u00af\n\t\r\t\16\t\u00b0\3\n\3\n\3\13\6\13\u00b6\n\13\r\13\16\13"+
		"\u00b7\3\13\7\13\u00bb\n\13\f\13\16\13\u00be\13\13\6\13\u00c0\n\13\r\13"+
		"\16\13\u00c1\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00dc\n\f\r\f\16\f\u00dd\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\16\2\2\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\13\f\3\2)*\4\2)*,,\2\u011d\2"+
		"\37\3\2\2\2\4A\3\2\2\2\6T\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\fq\3\2\2\2\16"+
		"\u00a4\3\2\2\2\20\u00ae\3\2\2\2\22\u00b2\3\2\2\2\24\u00bf\3\2\2\2\26\u00db"+
		"\3\2\2\2\30\u00df\3\2\2\2\32\u00e1\3\2\2\2\34 \5\4\3\2\35 \5\f\7\2\36"+
		" \5\16\b\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \3\3\2\2\2!\"\5\b"+
		"\5\2\"#\5\24\13\2#$\7\3\2\2$%\5\6\4\2%&\7\4\2\2&+\7\5\2\2\'*\5\f\7\2("+
		"*\5\16\b\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2"+
		"\2-+\3\2\2\2./\5\n\6\2/\60\7\6\2\2\60\61\7\7\2\2\61B\3\2\2\2\62\63\7\b"+
		"\2\2\63\64\5\24\13\2\64\65\7\3\2\2\65\66\5\6\4\2\66\67\7\4\2\2\67<\7\5"+
		"\2\28;\5\f\7\29;\5\16\b\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\7\2\2@B\3\2\2\2A!\3\2\2\2A\62\3\2\2\2B"+
		"\5\3\2\2\2CF\5\b\5\2DF\7\b\2\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GI\7\t\2\2"+
		"HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JM\5\24\13\2KN\5\32\16\2LN\5\30\r\2MK\3"+
		"\2\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\7\n\2\2PO\3\2\2\2PQ\3\2\2\2QS\3"+
		"\2\2\2RE\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VT\3\2\2\2WY"+
		"\t\2\2\2XW\3\2\2\2XY\3\2\2\2Yc\3\2\2\2Z`\7\r\2\2[]\7\16\2\2\\^\7\16\2"+
		"\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_`\3\2\2\2`a\3\2"+
		"\2\2ad\7\17\2\2bd\7\20\2\2c_\3\2\2\2cb\3\2\2\2dk\3\2\2\2eg\7\16\2\2fe"+
		"\3\2\2\2fg\3\2\2\2gh\3\2\2\2hk\7\21\2\2ik\7\22\2\2jX\3\2\2\2jf\3\2\2\2"+
		"ji\3\2\2\2k\t\3\2\2\2lo\7\23\2\2mp\5\24\13\2np\7-\2\2om\3\2\2\2on\3\2"+
		"\2\2p\13\3\2\2\2qr\7\24\2\2rs\7\3\2\2st\7\25\2\2tu\5\20\t\2uv\7\25\2\2"+
		"vw\7\n\2\2wx\7\26\2\2xy\5\24\13\2yz\7\4\2\2z{\7\6\2\2{\r\3\2\2\2|}\7\27"+
		"\2\2}~\7\3\2\2~\u0084\7\25\2\2\177\u0083\5\24\13\2\u0080\u0083\5\22\n"+
		"\2\u0081\u0083\5\26\f\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\25\2\2\u0088\u0089\7"+
		"\4\2\2\u0089\u00a5\7\6\2\2\u008a\u008b\7\27\2\2\u008b\u008c\7\3\2\2\u008c"+
		"\u0094\7\25\2\2\u008d\u0093\5\26\f\2\u008e\u0093\5\24\13\2\u008f\u0093"+
		"\5\22\n\2\u0090\u0091\7\30\2\2\u0091\u0093\t\3\2\2\u0092\u008d\3\2\2\2"+
		"\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\25\2\2\u0098\u0099\7\n\2\2\u0099\u009e\5"+
		"\24\13\2\u009a\u009b\7\n\2\2\u009b\u009d\5\24\13\2\u009c\u009a\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\7\6\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4|\3\2\2\2\u00a4\u008a\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00ac"+
		"\7\30\2\2\u00a9\u00ad\7)\2\2\u00aa\u00ad\5\30\r\2\u00ab\u00ad\7\30\2\2"+
		"\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00a8\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3\23\3\2\2\2\u00b4"+
		"\u00b6\t\4\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\7-\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00b5\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\25\3\2\2"+
		"\2\u00c3\u00dc\7.\2\2\u00c4\u00dc\7\26\2\2\u00c5\u00dc\7\t\2\2\u00c6\u00dc"+
		"\7\3\2\2\u00c7\u00dc\7\4\2\2\u00c8\u00dc\7\31\2\2\u00c9\u00dc\7\32\2\2"+
		"\u00ca\u00dc\7\33\2\2\u00cb\u00dc\7\34\2\2\u00cc\u00dc\7\35\2\2\u00cd"+
		"\u00dc\7\36\2\2\u00ce\u00dc\7\37\2\2\u00cf\u00dc\7\6\2\2\u00d0\u00dc\7"+
		" \2\2\u00d1\u00dc\7\25\2\2\u00d2\u00dc\7\n\2\2\u00d3\u00dc\7!\2\2\u00d4"+
		"\u00dc\7\"\2\2\u00d5\u00dc\7#\2\2\u00d6\u00dc\7$\2\2\u00d7\u00dc\7%\2"+
		"\2\u00d8\u00dc\7&\2\2\u00d9\u00dc\7\'\2\2\u00da\u00dc\5\30\r\2\u00db\u00c3"+
		"\3\2\2\2\u00db\u00c4\3\2\2\2\u00db\u00c5\3\2\2\2\u00db\u00c6\3\2\2\2\u00db"+
		"\u00c7\3\2\2\2\u00db\u00c8\3\2\2\2\u00db\u00c9\3\2\2\2\u00db\u00ca\3\2"+
		"\2\2\u00db\u00cb\3\2\2\2\u00db\u00cc\3\2\2\2\u00db\u00cd\3\2\2\2\u00db"+
		"\u00ce\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d1\3\2"+
		"\2\2\u00db\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2\2\2\u00db"+
		"\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\27\3\2\2\2\u00df\u00e0\7(\2\2"+
		"\u00e0\31\3\2\2\2\u00e1\u00e6\7&\2\2\u00e2\u00e7\7-\2\2\u00e3\u00e4\7"+
		" \2\2\u00e4\u00e5\t\4\2\2\u00e5\u00e7\7 \2\2\u00e6\u00e2\3\2\2\2\u00e6"+
		"\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\'"+
		"\2\2\u00e9\33\3\2\2\2#\37)+:<AEHMPTX]_cfjo\u0082\u0084\u0092\u0094\u009e"+
		"\u00a4\u00a6\u00ac\u00b0\u00b7\u00bc\u00c1\u00db\u00dd\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}