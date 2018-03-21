package evaluator;

import org.junit.Assert;
import org.junit.Test;
public class CalculatorUTest {

	@Test
	public void testAdd() throws Exception {
		String expression = "add(5,0)";
		Double result = Calculator.evaluateExpression(expression);
		Assert.assertTrue(5 == result);
	}

	@Test
	public void testAddNegative() throws Exception {
		String expression = "add(-5,10)";
		Double result = Calculator.evaluateExpression(expression);
		Assert.assertTrue(5 == result);
	}

	@Test
	public void testMult() throws Exception {
		String expression = "mult(-5,10)";
		Double result = Calculator.evaluateExpression(expression);
		Assert.assertTrue(-50 == result);
	}

	@Test
	public void testFromQuestions() throws Exception {
		String expression = "add(1, mult(2, 3))";
		Double result = Calculator.evaluateExpression(expression);
		Assert.assertTrue(7 == result);

		String expression1 = "mult(add(2, 2), div(9, 3))";
		Double result1 = Calculator.evaluateExpression(expression1);
		Assert.assertTrue(12 == result1);

	}

	@Test
	public void testFromQuestionsPart1() throws Exception {
		String expression2 = "let(a, 5, add(a, a))";
		Double result2 = Calculator.evaluateExpression(expression2);
		Assert.assertTrue(10 == result2);

		String expression3 = "let(a, 5, let(b, mult(a, 10), add(b, a)))";
		Double result3 = Calculator.evaluateExpression(expression3);
		Assert.assertTrue(55 == result3);

		String expression4 = "let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b)))";
		Double result4 = Calculator.evaluateExpression(expression4);
		Assert.assertTrue(40 == result4);
	}

	@Test
	public void testFromQuestions_whenIntmax() throws Exception {
		String expression = "mult(2147483647,2147483647)";
		Double result1 = Calculator.evaluateExpression(expression);
		Assert.assertTrue(result1 == 4.6116860141324206E18);
	}

	@Test
	public void testDiv() throws Exception {
		String expression = "div(9,8)";
		Double result1 = Calculator.evaluateExpression(expression);
		Assert.assertTrue(result1 == 1.125);
	}

	@Test(expected = Exception.class)
	public void testFailure() throws Exception {
		String expression = "div(9,a)";
		Calculator.evaluateExpression(expression);
	}
	
	@Test(expected = Exception.class)
	public void testFailureOutOfRange() throws Exception {
		String expression = "div(3147483647,2147483647)";
		Calculator.evaluateExpression(expression);
	}
	@Test(expected = Exception.class)
	public void testFailureNull() throws Exception {
		String expression = null;
		Calculator.evaluateExpression(expression);
	}

}
