package h2k.testng;
import org.testng.annotations.Test;

public class ExecutionOrder {

	/**
	 * Lowest priority method executes first priority is an attribute for @Test
	 * description enabled timeout=500 All the Tests are executed independently in
	 * the case of priority.
	 * 
	 */
	@Test(priority = 3, description = "Execution of the method m1", groups = { "regression" })
	public void m1() {

	}

	@Test(priority = 0, groups = { "sanity", "regression" })
	public void a2() {

	}

	@Test(priority = -1, groups = { "regression" })
	public void m3() {

	}

	public void m4() {

	}
}
