package webDriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Window_handels {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.naukri.com/mnjuser/homepage");
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/a"));
	System.out.println("Logo Find Sucess Fully");
	driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[2]/a/div")).click();
	System.out.println("Window 2 open");
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[3]/a/div")).click();
	System.out.println("Window 3 open");
	ArrayList<String> window =new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(window.get(2));
	driver.close();
	
	
}
}
