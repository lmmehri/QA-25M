package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// automate check box
		var isSelected = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println("checkBoxOption1 is " + (isSelected? "Selected" : "Not Selected"));
		
		//Select it
		driver.findElement(By.id("checkBoxOption1")).click();
		
		isSelected = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println("checkBoxOption1 is " + (isSelected? "Selected" : "Not Selected"));
		
		// Automate static drop down
		Select s = new Select(driver.findElement(By.id("dropdown-class-exampe")));
		s.selectByValue("option3");
		s.selectByIndex(1);
		s.deselectByVisibleText("option2");
		
		//Automate Dynamic drop down
		driver.findElement(By.id("autocomplete")).sendKeys("eth");
		
	}

}
