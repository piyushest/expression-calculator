// Generated from ExpressionGrammar.g4 by ANTLR 4.6

 package antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENING=1, COMMA=2, ENDING=3, ADD=4, SUB=5, MULT=6, DIV=7, LET=8, HANDLE=9, 
		INT=10, NEWLINE=11, WS=12;
	public static final int
		RULE_prog = 0, RULE_expression = 1;
	public static final String[] ruleNames = {
		"prog", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'add'", "'sub'", "'mult'", "'div'", "'let'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPENING", "COMMA", "ENDING", "ADD", "SUB", "MULT", "DIV", "LET", 
		"HANDLE", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetExpContext extends ExpressionContext {
		public TerminalNode LET() { return getToken(ExpressionGrammarParser.LET, 0); }
		public TerminalNode OPENING() { return getToken(ExpressionGrammarParser.OPENING, 0); }
		public TerminalNode HANDLE() { return getToken(ExpressionGrammarParser.HANDLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ExpressionGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpressionGrammarParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ENDING() { return getToken(ExpressionGrammarParser.ENDING, 0); }
		public LetExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterLetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitLetExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitLetExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(ExpressionGrammarParser.SUB, 0); }
		public TerminalNode OPENING() { return getToken(ExpressionGrammarParser.OPENING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public TerminalNode ENDING() { return getToken(ExpressionGrammarParser.ENDING, 0); }
		public SubExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitSubExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitSubExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpContext extends ExpressionContext {
		public TerminalNode MULT() { return getToken(ExpressionGrammarParser.MULT, 0); }
		public TerminalNode OPENING() { return getToken(ExpressionGrammarParser.OPENING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public TerminalNode ENDING() { return getToken(ExpressionGrammarParser.ENDING, 0); }
		public MultExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterMultExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitMultExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitMultExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpContext extends ExpressionContext {
		public TerminalNode ADD() { return getToken(ExpressionGrammarParser.ADD, 0); }
		public TerminalNode OPENING() { return getToken(ExpressionGrammarParser.OPENING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public TerminalNode ENDING() { return getToken(ExpressionGrammarParser.ENDING, 0); }
		public AddExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HandleContext extends ExpressionContext {
		public TerminalNode HANDLE() { return getToken(ExpressionGrammarParser.HANDLE, 0); }
		public HandleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterHandle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitHandle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor )
				try {
					return ((ExpressionGrammarVisitor<? extends T>)visitor).visitHandle(this);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else return visitor.visitChildren(this);
			return null;
		}
	}
	public static class DivExpContext extends ExpressionContext {
		public TerminalNode DIV() { return getToken(ExpressionGrammarParser.DIV, 0); }
		public TerminalNode OPENING() { return getToken(ExpressionGrammarParser.OPENING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public TerminalNode ENDING() { return getToken(ExpressionGrammarParser.ENDING, 0); }
		public DivExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDivExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDivExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExpContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ExpressionGrammarParser.INT, 0); }
		public NumExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNumExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNumExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNumExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NumExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(INT);
				}
				break;
			case HANDLE:
				_localctx = new HandleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				match(HANDLE);
				}
				break;
			case ADD:
				_localctx = new AddExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				match(ADD);
				setState(9);
				match(OPENING);
				setState(10);
				expression();
				setState(11);
				match(COMMA);
				setState(12);
				expression();
				setState(13);
				match(ENDING);
				}
				break;
			case SUB:
				_localctx = new SubExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				match(SUB);
				setState(16);
				match(OPENING);
				setState(17);
				expression();
				setState(18);
				match(COMMA);
				setState(19);
				expression();
				setState(20);
				match(ENDING);
				}
				break;
			case MULT:
				_localctx = new MultExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(MULT);
				setState(23);
				match(OPENING);
				setState(24);
				expression();
				setState(25);
				match(COMMA);
				setState(26);
				expression();
				setState(27);
				match(ENDING);
				}
				break;
			case DIV:
				_localctx = new DivExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				match(DIV);
				setState(30);
				match(OPENING);
				setState(31);
				expression();
				setState(32);
				match(COMMA);
				setState(33);
				expression();
				setState(34);
				match(ENDING);
				}
				break;
			case LET:
				_localctx = new LetExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				match(LET);
				setState(37);
				match(OPENING);
				setState(38);
				match(HANDLE);
				setState(39);
				match(COMMA);
				setState(40);
				expression();
				setState(41);
				match(COMMA);
				setState(42);
				expression();
				setState(43);
				match(ENDING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\62\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\2\2\4\2\4\2\2\65\2\6\3\2\2"+
		"\2\4/\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\60\7\f\2\2\t\60\7\13\2\2\n\13"+
		"\7\6\2\2\13\f\7\3\2\2\f\r\5\4\3\2\r\16\7\4\2\2\16\17\5\4\3\2\17\20\7\5"+
		"\2\2\20\60\3\2\2\2\21\22\7\7\2\2\22\23\7\3\2\2\23\24\5\4\3\2\24\25\7\4"+
		"\2\2\25\26\5\4\3\2\26\27\7\5\2\2\27\60\3\2\2\2\30\31\7\b\2\2\31\32\7\3"+
		"\2\2\32\33\5\4\3\2\33\34\7\4\2\2\34\35\5\4\3\2\35\36\7\5\2\2\36\60\3\2"+
		"\2\2\37 \7\t\2\2 !\7\3\2\2!\"\5\4\3\2\"#\7\4\2\2#$\5\4\3\2$%\7\5\2\2%"+
		"\60\3\2\2\2&\'\7\n\2\2\'(\7\3\2\2()\7\13\2\2)*\7\4\2\2*+\5\4\3\2+,\7\4"+
		"\2\2,-\5\4\3\2-.\7\5\2\2.\60\3\2\2\2/\b\3\2\2\2/\t\3\2\2\2/\n\3\2\2\2"+
		"/\21\3\2\2\2/\30\3\2\2\2/\37\3\2\2\2/&\3\2\2\2\60\5\3\2\2\2\3/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}