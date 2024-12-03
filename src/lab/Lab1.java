package lab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    String url = "https://www.facebook.com";
    driver.get(url);
    
   // how to get title
    //String title = driver.getTitle();
    //System.out.println(title); //or Systemout.out.println(driver.getTitle());
    
    ///System.out.println(driver.getCurrentUrl());
    //System.out.println(driver.getPageSource());
   // driver.findElement(By.id("email")).sendKeys("aman@gmail.com");
   // driver.findElement(By.id("pass")).sendKeys("amanuel@7");
   // driver.findElement(By.name("login")).click();
    //driver.findElement(By.linkText("Forgot Password?")).click();
    //driver.findElement(By.partialLinkText("Password?")).click();
    //driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("abebe");
    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("christian@gmail.com");
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
    driver.findElement(By.xpath("//button[@name='login']")).click();
    
    

	}

}
