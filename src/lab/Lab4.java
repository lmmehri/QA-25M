package lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab4 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		driver.navigate().back();  // facebook
		
		Thread.sleep(2000);
		driver.navigate().forward(); // google
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
