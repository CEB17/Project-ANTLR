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
		RULE_struktur = 0, RULE_function = 1, RULE_parameter = 2, RULE_call = 3, 
		RULE_d_type = 4, RULE_ret = 5, RULE_input = 6, RULE_output = 7, RULE_input_d = 8, 
		RULE_format = 9, RULE_variable = 10, RULE_sign = 11, RULE_empty_arr = 12, 
		RULE_arr = 13;
	public static final String[] ruleNames = {
		"struktur", "function", "parameter", "call", "d_type", "ret", "input", 
		"output", "input_d", "format", "variable", "sign", "empty_arr", "arr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'{'", "';'", "'}'", "'void'", "'*'", "','", "'&'", 
		"'unsigned'", "'signed'", "'short'", "'long'", "'int'", "'char'", "'double'", 
		"'float'", "'return'", "'scanf'", "'\"'", "'printf'", "'%'", "'-'", "'_'", 
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
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				function();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				input();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				output();
				}
				break;
			case INPUT_DATA:
			case OUTPUT_DATA:
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				call();
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
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				d_type();
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
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__20) | (1L << INPUT_DATA) | (1L << OUTPUT_DATA) | (1L << CHAR))) != 0)) {
					{
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__18:
						{
						setState(40);
						input();
						}
						break;
					case T__20:
						{
						setState(41);
						output();
						}
						break;
					case INPUT_DATA:
					case OUTPUT_DATA:
					case CHAR:
						{
						setState(42);
						call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				ret();
				setState(49);
				match(T__3);
				setState(50);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__5);
				setState(53);
				variable();
				setState(54);
				match(T__0);
				setState(55);
				parameter();
				setState(56);
				match(T__1);
				setState(57);
				match(T__2);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__20) | (1L << INPUT_DATA) | (1L << OUTPUT_DATA) | (1L << CHAR))) != 0)) {
					{
					setState(61);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__18:
						{
						setState(58);
						input();
						}
						break;
					case T__20:
						{
						setState(59);
						output();
						}
						break;
					case INPUT_DATA:
					case OUTPUT_DATA:
					case CHAR:
						{
						setState(60);
						call();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
					{
					setState(70);
					d_type();
					}
					break;
				case T__5:
					{
					setState(71);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(74);
					match(T__6);
					}
				}

				setState(77);
				variable();
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(78);
					arr();
					}
					break;
				case T__37:
					{
					setState(79);
					empty_arr();
					}
					break;
				case T__1:
				case T__5:
				case T__7:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
					break;
				default:
					break;
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(82);
					match(T__7);
					}
				}

				}
				}
				setState(89);
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

	public static class CallContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inputoutputListener ) ((inputoutputListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			variable();
			setState(91);
			match(T__0);
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					match(T__6);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				}
				break;
			case T__8:
				{
				setState(97);
				match(T__8);
				}
				break;
			case T__1:
			case T__7:
			case INPUT_DATA:
			case OUTPUT_DATA:
			case CHAR:
				break;
			default:
				break;
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT_DATA) | (1L << OUTPUT_DATA) | (1L << CHAR))) != 0)) {
				{
				setState(100);
				variable();
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(103);
				match(T__7);
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(104);
						match(T__6);
						}
						}
						setState(107); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__6 );
					}
					break;
				case T__8:
					{
					setState(109);
					match(T__8);
					}
					break;
				case INPUT_DATA:
				case OUTPUT_DATA:
				case CHAR:
					break;
				default:
					break;
				}
				setState(112);
				variable();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__1);
			setState(119);
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
		enterRule(_localctx, 8, RULE_d_type);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(121);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
					{
					{
					setState(129);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
						{
						setState(124);
						match(T__11);
						}
						break;
					case T__12:
						{
						{
						setState(125);
						match(T__12);
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(126);
							match(T__12);
							}
						}

						}
						}
						break;
					case T__13:
						break;
					default:
						break;
					}
					setState(131);
					match(T__13);
					}
					}
					break;
				case T__14:
					{
					setState(132);
					match(T__14);
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
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(135);
					match(T__12);
					}
				}

				setState(138);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
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
		enterRule(_localctx, 10, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__17);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_DATA:
			case OUTPUT_DATA:
			case CHAR:
				{
				setState(143);
				variable();
				}
				break;
			case NUM:
				{
				setState(144);
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
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__18);
			setState(148);
			match(T__0);
			setState(149);
			match(T__19);
			setState(150);
			input_d();
			setState(151);
			match(T__19);
			setState(152);
			match(T__7);
			setState(153);
			match(T__8);
			setState(154);
			variable();
			setState(155);
			match(T__1);
			setState(156);
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
		enterRule(_localctx, 14, RULE_output);
		int _la;
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
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(158);
						match(T__20);
						setState(159);
						match(T__0);
						setState(160);
						match(T__19);
						setState(166);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(164);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case INPUT_DATA:
								case OUTPUT_DATA:
								case CHAR:
									{
									setState(161);
									variable();
									}
									break;
								case OUTPUT_FORMAT:
									{
									setState(162);
									format();
									}
									break;
								case T__0:
								case T__1:
								case T__3:
								case T__6:
								case T__7:
								case T__8:
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
									setState(163);
									sign();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								} 
							}
							setState(168);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						}
						setState(169);
						match(T__19);
						setState(170);
						match(T__1);
						setState(171);
						match(T__3);
						}
						break;
					case 2:
						{
						setState(172);
						match(T__20);
						setState(173);
						match(T__0);
						setState(174);
						match(T__19);
						setState(182);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(180);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case T__0:
								case T__1:
								case T__3:
								case T__6:
								case T__7:
								case T__8:
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
									setState(175);
									sign();
									}
									break;
								case INPUT_DATA:
								case OUTPUT_DATA:
								case CHAR:
									{
									setState(176);
									variable();
									}
									break;
								case OUTPUT_FORMAT:
									{
									setState(177);
									format();
									}
									break;
								case T__21:
									{
									setState(178);
									match(T__21);
									setState(179);
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
							setState(184);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						}
						setState(185);
						match(T__19);
						setState(186);
						match(T__7);
						setState(187);
						variable();
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__7) {
							{
							{
							setState(188);
							match(T__7);
							setState(189);
							variable();
							}
							}
							setState(194);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(195);
						match(T__1);
						setState(196);
						match(T__3);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 16, RULE_input_d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(T__21);
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INPUT_DATA:
					{
					setState(203);
					match(INPUT_DATA);
					}
					break;
				case T__37:
					{
					setState(204);
					empty_arr();
					}
					break;
				case T__21:
					{
					setState(205);
					match(T__21);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(210); 
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
		enterRule(_localctx, 18, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		enterRule(_localctx, 20, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(215); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(214);
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
						setState(217); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(219);
						match(NUM);
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 22, RULE_sign);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(253);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SYMBOL:
						{
						setState(229);
						match(SYMBOL);
						}
						break;
					case T__8:
						{
						setState(230);
						match(T__8);
						}
						break;
					case T__6:
						{
						setState(231);
						match(T__6);
						}
						break;
					case T__0:
						{
						setState(232);
						match(T__0);
						}
						break;
					case T__1:
						{
						setState(233);
						match(T__1);
						}
						break;
					case T__22:
						{
						setState(234);
						match(T__22);
						}
						break;
					case T__23:
						{
						setState(235);
						match(T__23);
						}
						break;
					case T__24:
						{
						setState(236);
						match(T__24);
						}
						break;
					case T__25:
						{
						setState(237);
						match(T__25);
						}
						break;
					case T__26:
						{
						setState(238);
						match(T__26);
						}
						break;
					case T__27:
						{
						setState(239);
						match(T__27);
						}
						break;
					case T__28:
						{
						setState(240);
						match(T__28);
						}
						break;
					case T__3:
						{
						setState(241);
						match(T__3);
						}
						break;
					case T__29:
						{
						setState(242);
						match(T__29);
						}
						break;
					case T__19:
						{
						setState(243);
						match(T__19);
						}
						break;
					case T__7:
						{
						setState(244);
						match(T__7);
						}
						break;
					case T__30:
						{
						setState(245);
						match(T__30);
						}
						break;
					case T__31:
						{
						setState(246);
						match(T__31);
						}
						break;
					case T__32:
						{
						setState(247);
						match(T__32);
						}
						break;
					case T__33:
						{
						setState(248);
						match(T__33);
						}
						break;
					case T__34:
						{
						setState(249);
						match(T__34);
						}
						break;
					case T__35:
						{
						setState(250);
						match(T__35);
						}
						break;
					case T__36:
						{
						setState(251);
						match(T__36);
						}
						break;
					case T__37:
						{
						setState(252);
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
				setState(255); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 24, RULE_empty_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 26, RULE_arr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__35);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(260);
				match(NUM);
				}
				break;
			case T__29:
				{
				setState(261);
				match(T__29);
				setState(262);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT_DATA) | (1L << OUTPUT_DATA) | (1L << CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				match(T__29);
				}
				break;
			case T__36:
				break;
			default:
				break;
			}
			setState(266);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16\3C\13\3\3\3\3\3"+
		"\5\3G\n\3\3\4\3\4\5\4K\n\4\3\4\5\4N\n\4\3\4\3\4\3\4\5\4S\n\4\3\4\5\4V"+
		"\n\4\7\4X\n\4\f\4\16\4[\13\4\3\5\3\5\3\5\6\5`\n\5\r\5\16\5a\3\5\5\5e\n"+
		"\5\3\5\5\5h\n\5\3\5\3\5\6\5l\n\5\r\5\16\5m\3\5\5\5q\n\5\3\5\7\5t\n\5\f"+
		"\5\16\5w\13\5\3\5\3\5\3\5\3\6\5\6}\n\6\3\6\3\6\3\6\5\6\u0082\n\6\5\6\u0084"+
		"\n\6\3\6\3\6\5\6\u0088\n\6\3\6\5\6\u008b\n\6\3\6\3\6\5\6\u008f\n\6\3\7"+
		"\3\7\3\7\5\7\u0094\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3\t\3\t\3\t\6\t\u00c9\n"+
		"\t\r\t\16\t\u00ca\3\n\3\n\3\n\3\n\5\n\u00d1\n\n\6\n\u00d3\n\n\r\n\16\n"+
		"\u00d4\3\13\3\13\3\f\6\f\u00da\n\f\r\f\16\f\u00db\3\f\7\f\u00df\n\f\f"+
		"\f\16\f\u00e2\13\f\6\f\u00e4\n\f\r\f\16\f\u00e5\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\6\r\u0100\n\r\r\r\16\r\u0101\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u010b\n\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\5\3\2\f\r\3\2)*\4\2)*,,\2\u014b\2\"\3\2\2\2\4F\3\2\2\2\6Y\3\2\2"+
		"\2\b\\\3\2\2\2\n\u008e\3\2\2\2\f\u0090\3\2\2\2\16\u0095\3\2\2\2\20\u00c8"+
		"\3\2\2\2\22\u00d2\3\2\2\2\24\u00d6\3\2\2\2\26\u00e3\3\2\2\2\30\u00ff\3"+
		"\2\2\2\32\u0103\3\2\2\2\34\u0105\3\2\2\2\36#\5\4\3\2\37#\5\16\b\2 #\5"+
		"\20\t\2!#\5\b\5\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\3\3"+
		"\2\2\2$%\5\n\6\2%&\5\26\f\2&\'\7\3\2\2\'(\5\6\4\2()\7\4\2\2)/\7\5\2\2"+
		"*.\5\16\b\2+.\5\20\t\2,.\5\b\5\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\61\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\5\f\7\2\63"+
		"\64\7\6\2\2\64\65\7\7\2\2\65G\3\2\2\2\66\67\7\b\2\2\678\5\26\f\289\7\3"+
		"\2\29:\5\6\4\2:;\7\4\2\2;A\7\5\2\2<@\5\16\b\2=@\5\20\t\2>@\5\b\5\2?<\3"+
		"\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3"+
		"\2\2\2DE\7\7\2\2EG\3\2\2\2F$\3\2\2\2F\66\3\2\2\2G\5\3\2\2\2HK\5\n\6\2"+
		"IK\7\b\2\2JH\3\2\2\2JI\3\2\2\2KM\3\2\2\2LN\7\t\2\2ML\3\2\2\2MN\3\2\2\2"+
		"NO\3\2\2\2OR\5\26\f\2PS\5\34\17\2QS\5\32\16\2RP\3\2\2\2RQ\3\2\2\2RS\3"+
		"\2\2\2SU\3\2\2\2TV\7\n\2\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WJ\3\2\2\2X[\3"+
		"\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\7\3\2\2\2[Y\3\2\2\2\\]\5\26\f\2]d\7\3\2\2"+
		"^`\7\t\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ce\7\13\2"+
		"\2d_\3\2\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\26\f\2gf\3\2\2\2gh\3\2"+
		"\2\2hu\3\2\2\2ip\7\n\2\2jl\7\t\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2nq\3\2\2\2oq\7\13\2\2pk\3\2\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\5"+
		"\26\f\2si\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy"+
		"\7\4\2\2yz\7\6\2\2z\t\3\2\2\2{}\t\2\2\2|{\3\2\2\2|}\3\2\2\2}\u0087\3\2"+
		"\2\2~\u0084\7\16\2\2\177\u0081\7\17\2\2\u0080\u0082\7\17\2\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2\u0083"+
		"\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\7\20"+
		"\2\2\u0086\u0088\7\21\2\2\u0087\u0083\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008f\3\2\2\2\u0089\u008b\7\17\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\7\22\2\2\u008d\u008f\7\23\2\2\u008e"+
		"|\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008d\3\2\2\2\u008f\13\3\2\2\2\u0090"+
		"\u0093\7\24\2\2\u0091\u0094\5\26\f\2\u0092\u0094\7-\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0092\3\2\2\2\u0094\r\3\2\2\2\u0095\u0096\7\25\2\2\u0096"+
		"\u0097\7\3\2\2\u0097\u0098\7\26\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7"+
		"\26\2\2\u009a\u009b\7\n\2\2\u009b\u009c\7\13\2\2\u009c\u009d\5\26\f\2"+
		"\u009d\u009e\7\4\2\2\u009e\u009f\7\6\2\2\u009f\17\3\2\2\2\u00a0\u00a1"+
		"\7\27\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a8\7\26\2\2\u00a3\u00a7\5\26\f"+
		"\2\u00a4\u00a7\5\24\13\2\u00a5\u00a7\5\30\r\2\u00a6\u00a3\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\26\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00c9\7\6\2\2\u00ae\u00af\7"+
		"\27\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b8\7\26\2\2\u00b1\u00b7\5\30\r\2"+
		"\u00b2\u00b7\5\26\f\2\u00b3\u00b7\5\24\13\2\u00b4\u00b5\7\30\2\2\u00b5"+
		"\u00b7\t\3\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\26"+
		"\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00c2\5\26\f\2\u00be\u00bf\7\n\2\2\u00bf"+
		"\u00c1\5\26\f\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\u00c7\7\6\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00a0\3\2"+
		"\2\2\u00c8\u00ae\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\21\3\2\2\2\u00cc\u00d0\7\30\2\2\u00cd\u00d1\7)\2"+
		"\2\u00ce\u00d1\5\32\16\2\u00cf\u00d1\7\30\2\2\u00d0\u00cd\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cc\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\23\3\2\2\2\u00d6\u00d7\7+\2\2\u00d7\25\3\2\2\2\u00d8\u00da\t\4\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\7-\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\27\3\2\2\2\u00e7\u0100\7.\2\2"+
		"\u00e8\u0100\7\13\2\2\u00e9\u0100\7\t\2\2\u00ea\u0100\7\3\2\2\u00eb\u0100"+
		"\7\4\2\2\u00ec\u0100\7\31\2\2\u00ed\u0100\7\32\2\2\u00ee\u0100\7\33\2"+
		"\2\u00ef\u0100\7\34\2\2\u00f0\u0100\7\35\2\2\u00f1\u0100\7\36\2\2\u00f2"+
		"\u0100\7\37\2\2\u00f3\u0100\7\6\2\2\u00f4\u0100\7 \2\2\u00f5\u0100\7\26"+
		"\2\2\u00f6\u0100\7\n\2\2\u00f7\u0100\7!\2\2\u00f8\u0100\7\"\2\2\u00f9"+
		"\u0100\7#\2\2\u00fa\u0100\7$\2\2\u00fb\u0100\7%\2\2\u00fc\u0100\7&\2\2"+
		"\u00fd\u0100\7\'\2\2\u00fe\u0100\5\32\16\2\u00ff\u00e7\3\2\2\2\u00ff\u00e8"+
		"\3\2\2\2\u00ff\u00e9\3\2\2\2\u00ff\u00ea\3\2\2\2\u00ff\u00eb\3\2\2\2\u00ff"+
		"\u00ec\3\2\2\2\u00ff\u00ed\3\2\2\2\u00ff\u00ee\3\2\2\2\u00ff\u00ef\3\2"+
		"\2\2\u00ff\u00f0\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f2\3\2\2\2\u00ff"+
		"\u00f3\3\2\2\2\u00ff\u00f4\3\2\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00f6\3\2"+
		"\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff"+
		"\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\31\3\2\2\2\u0103\u0104\7(\2\2\u0104\33\3\2\2\2\u0105"+
		"\u010a\7&\2\2\u0106\u010b\7-\2\2\u0107\u0108\7 \2\2\u0108\u0109\t\4\2"+
		"\2\u0109\u010b\7 \2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\'\2\2\u010d\35\3\2\2\2)\"-"+
		"/?AFJMRUYadgmpu|\u0081\u0083\u0087\u008a\u008e\u0093\u00a6\u00a8\u00b6"+
		"\u00b8\u00c2\u00c8\u00ca\u00d0\u00d4\u00db\u00e0\u00e5\u00ff\u0101\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}