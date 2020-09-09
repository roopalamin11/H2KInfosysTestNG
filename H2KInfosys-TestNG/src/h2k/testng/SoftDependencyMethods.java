package h2k.testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependencyMethods {

	@Test
	public void login() {

	}

	@Test(dependsOnMethods = { "login" })
	public void search() {
		Assert.assertEquals(2, 3);
	}

	@Test(dependsOnMethods = { "search" }, alwaysRun = true)
	public void logout() {

	}
}
