package testNg_Example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Drag_Drop {
	WebDriver driver;
	@BeforeClass
public void StartUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
		Reporter.log("Lunch Browser");
		System.out.println("Lunch browser");		
		driver=new ChromeDriver();
}
	@AfterClass
	public void teardown(){
		driver.quit();
		}
	@Test
	public void D_G()throws Exception{
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(10000L);
	assertEquals("Droppable | jQuery UI",driver.getTitle());
	driver.switchTo().frame(0);
	Actions ac= new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
	Thread.sleep(6000l);
	
	
	}
}
