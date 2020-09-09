package h2k.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderExample {

	@DataProvider(name = "addMethodDataProvider")
	public Object[][] dataprovider() {
		return new Object[][] { { 2, 5, 7 }, { 1, 4, 5 }, { 4, 5, 9 } };
	}

	@Test(dataProvider = "addMethodDataProvider")
	public void testAddMethod(int a, int b, int result) {
		Calculator calculator = new Calculator();
		Assert.assertEquals(calculator.add(a, b), result);
	}
}
