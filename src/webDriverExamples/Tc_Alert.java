package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
public class Tc_Alert {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
	System.out.println(a.getText());
	a.accept();
	System.out.println("Alert Accepted");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Log in Compleated");
	Thread.sleep(4000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Log Out Compleated");
	driver.close();
	}
}
