package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Keybord1 {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/index.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Enter");
		System.out.println("Log In compleated");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout"));
		System.out.println("Log out Compleated");
		driver.close();
		
	}

}
