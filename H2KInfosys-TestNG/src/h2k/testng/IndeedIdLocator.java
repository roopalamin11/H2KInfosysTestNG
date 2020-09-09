package h2k.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IndeedIdLocator {

	@Test(timeOut = 10000)
	public void validateJSSearch() {
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.linkText("Browser Automation")).click();
		driver.findElement(By.linkText("edit this page")).click();
		driver.findElement(By.id("login_field")).clear();
		driver.findElement(By.id("login_field")).sendKeys("abc");

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("xyz");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.cssSelector(".container")).getText());

	}
}
/**
 * If two elements are havign same properties(id/name/classname/tagname), if you
 * use findElement it selects the first one only. If we want to select the
 * second one we should depend on Xpath/CssSelector
 * 
 * 
 * <input class="input_text" maxlength="512" size="31" aria-labelledby=
 * "what_label_top hidden_colon what_label_bot" autocomplete="off">
 * 
 * class maxlength size name autocomplete id
 * 
 * 
 * 
 * <input class="input_text" maxlength="64" size="27" aria-labelledby=
 * "where_label_top hidden_colon where_label_bot" autocomplete="off" value=
 * "Bangalore">
 * 
 * class maxlength size aria name autocomplete id
 * 
 * 
 * <input id="fj" class="input_submit" value="Find Jobs" type="submit">
 **/
