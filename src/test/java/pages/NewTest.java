package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {

		WebDriver driver1;
		RemoteWebDriver driver2;
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
