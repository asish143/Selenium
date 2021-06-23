package testNg_Example;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class ScreenShot {
	WebDriver driver;
	@BeforeMethod
	public void startUp(){
		System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
		Reporter.log("Lunch Browser SucessFully");
		driver=new ChromeDriver();
	}
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
	@Test
	public void tc002()throws Exception{
		try {
			driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
			Reporter.log(driver.getTitle());
			driver.findElement(By.name("txtUserName")).sendKeys("admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin");
			driver.findElement(By.name("Submit")).click();
			Reporter.log("Log In completed");
			Thread.sleep(3000);
			WebElement element =driver.findElement(By.linkText("PIM"));
			Actions ac =new Actions (driver);
			ac.moveToElement(element).perform();
			driver.findElement(By.linkText("Add Employee 123")).click();
			Thread.sleep(4000);
			System.out.println("Click on sub menue");
		}
		
		catch (Exception e){
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("E:\\Snap.png"));
		}
		driver.quit();
	}
}
	 