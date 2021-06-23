package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class JSE {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	WebElement element =driver.findElement(By.name("Submit"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",element);
	Thread.sleep(3000);
	System.out.println("Log In Compleated");
	 WebElement Logout = driver.findElement(By.linkText("Logout"));
 JavascriptExecutor executer =(JavascriptExecutor)driver;
 executer.executeScript("arguement[0].click();",Logout);
System.out.println("Log Out compleated");
driver.close();
	
	
}
}
