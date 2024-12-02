package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	}

}
