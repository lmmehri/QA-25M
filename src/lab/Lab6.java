package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// to type name on name field
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abebe");
		
		//control Alert
		
		driver.findElement(By.xpath("//input[@id ='alertbtn']")).click();
		
		// to get information in the message box
		String alertmessage =driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(2000);
		
		//To click ok button on the alert page
		
		driver.switchTo().alert().accept();
		
		

	}

}
