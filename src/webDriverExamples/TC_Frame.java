package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Frame {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Log in Compleated");
	//Add Employee
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Asish");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Kumar");
	driver.findElement(By.id("btnEdit")).click();
	System.out.println("Add Employee Completed");
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Log Out Compleated");
	driver.close();
	
	
}
}
