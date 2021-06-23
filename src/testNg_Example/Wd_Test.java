package testNg_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Wd_Test {
	WebDriver driver ;
	@BeforeClass
public void startUp() {
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	driver =new ChromeDriver();
}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void Tc002()throws Exception {
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(6000);
		System.out.println("Log in Compleated");
		Reporter.log("Log in Compleated");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Log Out Compleated");
		Reporter.log("Log out Compleated");
	}
}
