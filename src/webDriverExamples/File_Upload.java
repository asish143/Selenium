package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
public class File_Upload {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	WebDriverWait wait = new WebDriverWait(driver,5000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Log in Compleated");
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Behera");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Asish");
	WebElement fileinput =driver.findElement(By.name("photofile"));
	Thread.sleep(3000);
	fileinput.sendKeys("E:\\ASISH FOLDER\\IMG-20200124-WA0007.jpeg");
	Thread.sleep(8000);
	System.out.println("Photo Added SucessFully");
	driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@value='Save']"));
	System.out.println("EmployeeAdded SucessFully");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Log Out Compleated");
	driver.close();
	
	
}
}
