package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC001_login_logout  {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\ASISH FOLDER\\Software Testing\\AUTOMATION TESTING\\DRIVER\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Driver.findElement(By.className("loginText")).sendKeys("admin");
		Driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Driver.findElement(By.className("button")).click();
		System.out.println("Log In Compleated");
		//Verify Title
		if(Driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Titel Matched");
		}
		else {
			System.out.println("Title not Matched"+Driver.getTitle());
		}
		//Verify Mouse Hover
		Actions a=new Actions(Driver);
		a.moveToElement(Driver.findElement(By.linkText("Admin"))).perform();
		a.moveToElement(Driver.findElement(By.linkText("PIM"))).perform();
		a.moveToElement(Driver.findElement(By.linkText("Leave"))).perform();
		a.moveToElement(Driver.findElement(By.linkText("Leave Summary"))).perform();
		System.out.println("Mouse Over Completed");
		Driver.findElement(By.linkText("Logout")).click();
		System.out.println("Log Out Compleated");
		
		Thread.sleep(3000);
		
		Driver.close();
		
	}

}
