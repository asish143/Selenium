package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
public class Wait_Stmnt1 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	WebDriverWait wait = new WebDriverWait(driver,5000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	System.out.println("Log in Compleated");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Log Out Compleated");
	driver.close();
}
}
