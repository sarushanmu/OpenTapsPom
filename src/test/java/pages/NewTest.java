package pages;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo1.opentaps.org/");
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys("crmsfa");
	//	driver.findElementByCssSelector("input.decorativeSubmit");
		// driver.findElement(By.id("username")).clear();
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// driver.findElement(By.id("password")).clear();
		// driver.findElement(By.id("password")).sendKeys("crmsfa");
		// driver.findElement(By.cssSelector("input.decorativeSubmit")).click();
		// driver.findElement(By.cssSelector("input.decorativeSubmit")).click();
	}
}
