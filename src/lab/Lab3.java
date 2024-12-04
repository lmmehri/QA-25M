package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Lab3 {

	//private Object keys;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// automate check box
	  //	var isSelected = driver.findElement(By.id("checkBoxOption1")).isSelected();
		//System.out.println("checkBoxOption1 is " + (isSelected? "Selected" : "Not Selected"));
		
		//Select it
		//driver.findElement(By.id("checkBoxOption1")).click();
		
		//isSelected = driver.findElement(By.id("checkBoxOption1")).isSelected();
		//System.out.println("checkBoxOption1 is " + (isSelected? "Selected" : "Not Selected"));
		
		//System.out.println(driver.findElement(By.cssSelector("input{type='checkbox']")).getSize());
		//driver.findElement(By.cssSelector("input{type='checkbox']")).click();
		
		// Automate static drop down
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue("option3");
		s.selectByIndex(1);
		s.selectByVisibleText("Option2");
		
		//Automate Dynamic drop down
		driver.findElement(By.id("autocomplete")).sendKeys("eth");
		Thread.sleep(2000);
		/*driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);*/
		
		//for(int i =1; i<=3; i++)
		//{
			//var element = driver.findElement(By.id("autocomplete"));
			//element.sendKeys(Keys.ARROW_DOWN); //3
			//Thread.sleep(2000);
		//}
		
		Thread.sleep(2000);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
	}

}
