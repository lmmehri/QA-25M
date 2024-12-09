package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab9TestNgAssig {
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
	public void beforeTestCode() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aman");

        // Click the alert button
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        // Get the alert message
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("Alert message: " + alertMessage);

        // Pause for demonstration purposes (use WebDriverWait instead in real scenarios)
        Thread.sleep(2000);
		
	}
		
	
	@Test    
	public void handleC0nfirm() throws InterruptedException {
		// Click the alert button
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

        // Get the alert message
        String confirmMessage = driver.switchTo().alert().getText();
        System.out.println("Alert message: " + confirmMessage);
                
        // Pause for demonstration purposes (use WebDriverWait instead in real scenarios)
        Thread.sleep(2000);

        // Accept the alert
        driver.switchTo().alert().accept();
	}
	
     @Test 
     public void handleConfirm() throws InterruptedException {// Click the alert button
         driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
       
         // Get the alert message
         String confirmMessage = driver.switchTo().alert().getText();
         System.out.println("Confirm message: " + confirmMessage);

         // Pause for demonstration purposes (use WebDriverWait instead in real scenarios)
         Thread.sleep(2000);
    	 
    	 driver.switchTo().alert().dismiss();
     
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}               	 
		 
}

