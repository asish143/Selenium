package webDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Table {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("file:///E:/ASISH%20FOLDER/Software%20Testing/AUTOMATION%20TESTING/WebTable.html");
	int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	int col =driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).size();
	int rowcol=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
	System.out.println(row);
	System.out.println(col);
	System.out.println(rowcol);
	String data1=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[3]")).getText();
			System.out.println(data1);
	String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[+i+]")).getText();
}
}
