// Generated from ExpressionGrammar.g4 by ANTLR 4.6

 package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExp(ExpressionGrammarParser.NumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handle}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 * @throws Exception 
	 */
	T visitHandle(ExpressionGrammarParser.HandleContext ctx) throws Exception;
	/**
	 * Visit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(ExpressionGrammarParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExp(ExpressionGrammarParser.SubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(ExpressionGrammarParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(ExpressionGrammarParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExp(ExpressionGrammarParser.LetExpContext ctx);
}