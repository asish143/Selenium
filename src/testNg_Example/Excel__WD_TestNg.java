package testNg_Example;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Excel__WD_TestNg{
	WebDriver driver;

public void tc004() {
	System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
	Reporter.log("Lunch Browser SucessFully");
	driver=new ChromeDriver();
}
@Test
public void data() throws Exception {
	FileInputStream file =new FileInputStream("E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\UnPw.xls");
	Workbook wb =Workbook.getWorkbook(file);
	Sheet st =wb.getSheet(0);
	String un =st.getCell(0,1).getContents();
	String pw =st.getCell(1,1).getContents();
	Reporter.log(un);
	Reporter.log(pw);
        driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(6000);
		System.out.println("Log in Compleated");
		Reporter.log("Log in Compleated");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Log Out Compleated");
		Reporter.log("Log out Compleated");
}
}
