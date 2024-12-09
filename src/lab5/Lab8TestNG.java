package lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab8TestNG {
	WebDriver driver;

	@BeforeTest
	public void beforeTestsetup() {
		System.out.println("intialize the browser and other setup");
	}
	@AfterTest
	public void afterTestteardown() {
		System.out.println("Test completed");

}
		
	@BeforeMethod
	public void beforeTestCode() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
		
	
	@Test    
	public void handleAlert() throws InterruptedException {
			        // Type name in the name field
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abebe");

        // Click the alert button
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        // Get the alert message
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("Alert message: " + alertMessage);

        // Pause for demonstration purposes (use WebDriverWait instead in real scenarios)
        Thread.sleep(2000);

        // Accept the alert
        driver.switchTo().alert().accept();                    
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}               	 
		 
}

