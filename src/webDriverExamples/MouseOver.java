package webDriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args)throws Exception {
System.setProperty("webdriver.chrome.driver","E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.naukri.com/mnjuser/homepage");
driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[1]/a/div"));
System.out.println(driver.getTitle());
Thread.sleep(8000);
Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[1]/div/ul[1]/li[1]/a"))).perform();
Thread.sleep(6000);
System.out.println("mouse over complete");
Thread.sleep(2000);
driver.quit();
}
}
