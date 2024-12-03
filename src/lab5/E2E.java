package lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.busbud.com/en");
		driver.manage().window().maximize();
		
		//origin city
		driver.findElement(By.id("origin-city-input")).sendKeys("new");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role='button'])[8]")).click();
		
		//Destination
		driver.findElement(By.xpath("//input[@id='destination-city-input']")).sendKeys("was");
		
		
	}

}
