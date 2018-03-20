// Generated from ExpressionGrammar.g4 by ANTLR 4.6

 package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExp(ExpressionGrammarParser.NumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExp(ExpressionGrammarParser.NumExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handle}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHandle(ExpressionGrammarParser.HandleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handle}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHandle(ExpressionGrammarParser.HandleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	Integer enterAddExp(ExpressionGrammarParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(ExpressionGrammarParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExp(ExpressionGrammarParser.SubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExp(ExpressionGrammarParser.SubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(ExpressionGrammarParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(ExpressionGrammarParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExp(ExpressionGrammarParser.DivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExp(ExpressionGrammarParser.DivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	Integer enterLetExp(ExpressionGrammarParser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(ExpressionGrammarParser.LetExpContext ctx);
}