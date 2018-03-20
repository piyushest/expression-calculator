package evaluator;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import antlr4.ExpressionGrammarBaseVisitor;
import antlr4.ExpressionGrammarParser;
import antlr4.Operations;

public class ExpressionEvaluation extends ExpressionGrammarBaseVisitor<Double> {
	private static final Logger log = (Logger) LoggerFactory.getLogger(ExpressionEvaluation.class);

	Map<String, Double> tempVariables = new HashMap<>();

	@Override
	public Double visit(ParseTree tree) {
		return tree.accept(this);
	}

	@Override
	public Double visitProg(ExpressionGrammarParser.ProgContext ctx) {
		log.info("Entering the starting node");
		return visitChildren(ctx);
	}

	/**
	 * This method is to visit the Integer expression
	 */
	@Override
	public Double visitNumExp(ExpressionGrammarParser.NumExpContext ctx) {
		log.info("Found the Number value to be used");
		Double number = Double.parseDouble(ctx.INT().getText());
		return number;
	}

	/**
	 * This will be used by Let expression it is to recognize the ID
	 */
	@Override
	public Double visitHandle(ExpressionGrammarParser.HandleContext ctx) throws Exception {
		String handle = ctx.HANDLE().getText();
		if (!tempVariables.containsKey(handle)) {
			log.error("No value found for the handle in the memory,cannot proceed further");
			throw new Exception("Not a valid Expression");
		}
		return tempVariables.get(handle);
	}

	/**
	 * This is to evaluate add expression
	 */
	@Override
	public Double visitAddExp(ExpressionGrammarParser.AddExpContext ctx) {
		Double value1 = visit(ctx.expression(0));
		Double value2 = visit(ctx.expression(1));
		log.debug("Inside add expression and the values are" + value1 + "and" + value2);
		try {
			Double result = applyOperation(Operations.ADD, value1, value2);
			return result;
		} catch (Exception e) {
			log.error("Error encountered while adding the expression ", e);
		}
		throw new ArithmeticException("Addtion operation failed");
	}

	/**
	 * This is to evaluate subtraction expression
	 */
	@Override
	public Double visitSubExp(ExpressionGrammarParser.SubExpContext ctx) {
		Double value1 = visit(ctx.expression(0));
		Double value2 = visit(ctx.expression(1));
		log.debug("Inside Sub expression and the values are" + value1 + "and" + value2);
		try {
			Double result = applyOperation(Operations.SUB, value1, value2);
			return result;
		} catch (Exception e) {
			log.error("Error encountered while substraction expression ", e);
		}
		throw new ArithmeticException("Subtraction operation failed");
	}

	/**
	 * This is to evaluate Multiplication expression
	 */
	@Override
	public Double visitMultExp(ExpressionGrammarParser.MultExpContext ctx) {
		Double value1 = visit(ctx.expression(0));
		Double value2 = visit(ctx.expression(1));
		log.debug("Inside Multiply expression and the values are" + value1 + "and" + value2);
		try {
			Double result = applyOperation(Operations.MULT, value1, value2);
			return result;
		} catch (Exception e) {
			log.error("Error encountered while multiplication expression ", e);
		}
		throw new ArithmeticException("Multiplication operation failed");
	}

	/**
	 * This method will handle Division
	 */
	@Override
	public Double visitDivExp(ExpressionGrammarParser.DivExpContext ctx) {
		Double value1 = visit(ctx.expression(0));
		Double value2 = visit(ctx.expression(1));
		log.debug("Inside Division expression and the values are" + value1 + "and" + value2);
		try {
			Double result = applyOperation(Operations.DIV, value1, value2);
			return result;
		} catch (Exception e) {
			log.error("Error encountered while division expression ", e);
		}
		throw new ArithmeticException("Division operation failed");
	}

	public Double applyOperation(Operations operation, Double value1, Double value2) throws Exception {
		checkValidity(value1, value2);
		return appyOperationHelper(operation, value1, value2);
	}

	/***
	 * Check the validity of input
	 * 
	 * @param value1
	 * @param value2
	 * @throws Exception
	 */
	private void checkValidity(Double value1, Double value2) throws Exception {
		if (value1 == null || value2 == null) {
			throw new Exception("No value should be null");
		}
		if (value1 > Integer.MAX_VALUE || value1 < Integer.MIN_VALUE) {
			throw new Exception("Frist value is out of range cannot proceed further");
		}
		if (value2 > Integer.MAX_VALUE || value2 < Integer.MIN_VALUE) {
			throw new Exception("Second value is out of range cannot proceed further");
		}
	}

	/**
	 * This is an generic method that will actually perform the operation
	 * 
	 * @param operation
	 * @param val1
	 * @param val2
	 * @return
	 * @throws Exception
	 */
	public Double appyOperationHelper(Operations operation, Double val1, Double val2) throws Exception {
		Double result = null;
		if (operation.equals(Operations.ADD)) {
			result = val1 + val2;
			log.info("Resultant of Addition is " + result);
			return result;
		} else if (operation.equals(Operations.SUB)) {
			result = val1 - val2;
			log.info("Resultant of Substraction is " + result);
			return result;
		} else if (operation.equals(Operations.MULT)) {
			result = val1 * val2;
			log.info("Resultant of Multiplication is " + result);
			return result;
		} else if (operation.equals(Operations.DIV)) {
			result = val1 / val2;
			log.info("Resultant of Division is " + result);
			return result;
		}
		throw new Exception("Not a valid operation");
	}

	/**
	 * This will handle the let expression
	 */
	@Override
	public Double visitLetExp(ExpressionGrammarParser.LetExpContext ctx) {
		String handle = ctx.HANDLE().getText();
		Double intValue = new Double(visit(ctx.expression(0)));
		log.debug("Inside Let expression where handle is " + handle + "and value is " + intValue);
		tempVariables.put(handle, intValue);
		log.debug("Number of variables stored are " + tempVariables.size());
		return visit(ctx.expression(1));
	}

}
