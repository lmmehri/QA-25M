package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab2 extends Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lmmeh\\OneDrive\\Desktop\\QA_24\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//web element locator with ID
		
		//driver.findElement(By.id("name")).sendKeys("Hi Mani");
		
		//locate by name
		//driver.findElement(By.name("enter name")).sendKeys("Name locator");
		
		//locator with class
		//driver.findElement(By.className("inputs")).sendKeys("class Name locator");
		
		//link locator
		//driver.findElement(By.linkText("Career focussed QA meetup by RahulShetty at Bangalore.check details")).click();
		//driver.findElement(By.partialLinkText("meetup by RahulShetty at Bangalore")).click();
		// css selector locator
		//driver.findElement(By.cssSelector("input[id = 'name']")).sendKeys("css selector");
		
		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys("xpath selector");

	}

}
