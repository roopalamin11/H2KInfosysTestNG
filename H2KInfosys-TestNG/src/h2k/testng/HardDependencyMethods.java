package h2k.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardDependencyMethods {

	@Test
	public void login() {
		Assert.assertEquals(2, 3);
	}

	@Test(dependsOnMethods = { "login" })
	public void search() {

	}

	@Test(dependsOnMethods = { "search" })
	public void logout() {

	}
}
