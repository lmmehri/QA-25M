package lab;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.facebook.com");
   // how to get title
    String title = driver.getTitle();
    System.out.println(title); //or Systemout.out.println(driver.getTitle());
    
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getPageSource());
    
    

	}

}
