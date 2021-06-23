package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Keyes {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	System.out.println("Path Find Compleated");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("WhatsApp");
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	System.out.println("Web Site Search Compleated");
	Thread.sleep(4000);
	driver.close();
}
}
