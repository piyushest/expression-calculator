package evaluator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import antlr4.ExpressionGrammarLexer;
import antlr4.ExpressionGrammarParser;

public class Calculator {

	private static final Logger log = (Logger) LoggerFactory.getLogger(Calculator.class);
	public static String logLevel = null;

	public static void main(String[] args) throws Exception {

		if (args.length == 0) {
			log.warn("Cannot proceed as this is not proper input");
			throw new Exception();
		}
		if (args.length > 1) {
			logLevel = args[1];
			setLogLevel(logLevel);
		} else {
			logLevel = "INFO";
		}

		String expression = args[0];
		boolean isValid = validateExpression(expression);
		if (isValid) {
			try {
				Double ans = evaluateExpression(expression);
				long val = Math.round(ans);
				if (val != ans) {
					System.out.println(ans);
				} else {
					System.out.println(val);
				}
			} catch (Exception e) {
				log.error("Error while evaluating the expression ", e);
			}
		}
	}

	protected static void setLogLevel(String logLevel) {
		Logger logSetting = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		switch (logLevel) {
		case "error":
			logSetting.setLevel(Level.ERROR);
			break;
		case "info":
			logSetting.setLevel(Level.INFO);
			break;
		case "debug":
			logSetting.setLevel(Level.DEBUG);
			break;
		default:
			logSetting.setLevel(Level.INFO);
		}
	}

	protected static Double evaluateExpression(String expression) throws Exception {
		InputStream stream = new ByteArrayInputStream(expression.getBytes(StandardCharsets.UTF_8));
		CharStream input = new ANTLRInputStream(stream);
		ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(input);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		ExpressionGrammarParser parser = new ExpressionGrammarParser(tokenStream);
		ParseTree tree;

		parser.getBuildParseTree();
		tree = parser.prog();
		ExpressionEvaluation visitor = new ExpressionEvaluation();
		Double ans = visitor.visit(tree);
		return ans;
	}

	private static boolean validateExpression(String expression) {
		if (expression == null || expression.length() == 0) {
			log.error("Either expression is null or the length is 0, cannot proceed further");
			return false;
		}
		return true;
	}
}
