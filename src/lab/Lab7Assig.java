package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab7Assig {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.xpath("//input[@id ='name']")).sendKeys("Aman");
			driver.findElement(By.xpath("//input[@id ='confirmbtn']")).click();
			
			String confirmmessage =driver.switchTo().alert().getText();
			System.out.println(confirmmessage);
			Thread.sleep(2000);
			//driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss();
			
	}

}
