package evaluator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import antlr4.ExpressionGrammarLexer;
import antlr4.ExpressionGrammarParser;

public class Calculator {

	private static final Logger log = (Logger) LoggerFactory.getLogger(Calculator.class);
	public static String logLevel = null;

	public static void main(String[] args) throws Exception {
		/*
		 * if (args.length == 0) {
		 * log.warn("Cannot proceed as this is not proper input"); throw new
		 * Exception(); } if (args.length > 1) { logLevel = args[1]; } else {
		 * logLevel = "INFO"; }
		 */
		String expression = "div(9,8)";
		boolean isValid = validateExpression(expression);
		if (isValid) {
			evaluateExpression(expression);
		}
	}

	private static void evaluateExpression(String expression) throws IOException {

		InputStream stream = new ByteArrayInputStream(expression.getBytes(StandardCharsets.UTF_8));
		CharStream input = new ANTLRInputStream(stream);
		ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(input);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		ExpressionGrammarParser parser = new ExpressionGrammarParser(tokenStream);
		ParseTree tree;
		try {
			parser.getBuildParseTree();
			tree = parser.prog();
			ExpressionEvaluation visitor = new ExpressionEvaluation();
			Double ans = visitor.visit(tree);
			System.out.println(ans);;
			long val = Math.round(ans);
			if(val!=ans){
				System.out.println(ans);
			}
			System.out.println(val);
		} catch (Exception e) {
			log.error("Error while evaluating the expression ", e);
		}

	}

	private static boolean validateExpression(String expression) {
		if (expression == null || expression.length() == 0) {
			log.error("Either expression is null or the length is 0, cannot proceed further");
			return false;
		}
		return true;
	}
}
