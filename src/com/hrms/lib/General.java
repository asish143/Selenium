package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.Utility.Log;


public class General extends Global{
//Re UsableFunction
	public void openApplication(){
		System.setProperty("webdriver.chrome.driver", "E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Log in Compleated");
		Reporter.log("Login Compleated");
		Log.info("Log in Completed");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Log Out Compleated");
		Reporter.log("Log Out Compleated");
		Log.info("Log out Completed");
	}
	public void AddEmployee(){
		
		System.out.println("Add Employee Completed");
		
		Reporter.log("Add Employee");
		Log.info("Add Employee");
	}
	public void DeleteEmployee() {
		System.out.println("Delete Employee");
		Reporter.log("Delete Employee");
		Log.info("Delete Employee");
	}
	public void closeApplication(){
		driver.close();
		
	}
}
	
