package lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		driver.findElement(By.id("origin-city-input")).sendKeys("New");
		
		Thread.sleep(2000);
		
		var searchResuls = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchResuls);
		searchResuls.click();
		
		//Destination
	     driver.findElement(By.xpath("//input[@id='destination-city-input']")).sendKeys("Wash");
	     Thread.sleep(2000);
	     
	     var destsearchResuls = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", destsearchResuls);
			destsearchResuls.click();
	     
	   
		driver.findElement(By.xpath("//*[@id='destination-city-input']")).sendKeys(Keys.ARROW_DOWN);
	}

}
////*[@id="destination-dropdown"]/div[2]/div/div/div[2]/div[2]/div/span[1]/span
//*[@id="destination-dropdown"]/div[2]/div/div/div[1]
//*[@id="destination-city-input"]//*[@id="destination-dropdown"]/div[2]/div/div/div[2]