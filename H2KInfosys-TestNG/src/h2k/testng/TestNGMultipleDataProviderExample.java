package h2k.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGMultipleDataProviderExample {

	@Test(dataProvider = "addMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	public void testAddMethod(int a, int b, int expectedResult) {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.add(a, b), expectedResult);
	}

	@Test(dataProvider = "subtractMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	public void testSubtractMethod(int a, int b, int expectedResult) {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.subtract(a, b), expectedResult);
	}

	@Test(dataProvider = "multiplyMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
	public void testMultiplyMethod(int a, int b, int expectedResult) {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.multiply(a, b), expectedResult);
	}

}