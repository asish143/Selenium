package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC002 {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","E:\\\\ASISH FOLDER\\\\Software Testing\\\\AUTOMATION TESTING\\\\DRIVER\\\\chromedriver.exe");
WebDriver Driver =new ChromeDriver();
Driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
System.out.println("Application open sucessfully");
Driver.findElement(By.name("txtUserName")).sendKeys("admin");
Driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
Driver.findElement(By.name("Submit")).click();
if(Driver.getTitle().equals("OrangeHRM")){
	System.out.println("Titale Matched");
}
else {
	System.out.println("Title Not Matched");
	System.out.println(Driver.getTitle());
}
System.out.println("Log In completed");
Actions ac =new Actions(Driver);
ac.moveToElement(Driver.findElement(By.linkText("PIM"))).perform();
ac.moveToElement(Driver.findElement(By.linkText("Admin"))).perform();
ac.moveToElement(Driver.findElement(By.linkText("Change Password"))).perform();
System.out.println("Mouse Over Compleated");
Thread.sleep(5000);
Driver.findElement(By.linkText("Logout")).click();
System.out.println("log out Compleated");
Driver.close();


}
}
