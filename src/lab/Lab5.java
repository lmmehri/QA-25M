package lab;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab5 {
	static WebDriver driver;  // global variable
	// main method
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    driver =new ChromeDriver();
		
		driver.get("https://www.busbud.com/en");
		
		// call method
		Lab5 la =new Lab5();
		la.calender();
	}
	
	// Calender method
	public void calender() {
		//System.out.println("Hi Teame I am from calender method");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('outbound-date-input').value ='Sat,Nov 30'");
	}

}
