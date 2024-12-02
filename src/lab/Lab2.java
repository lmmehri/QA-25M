package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab2 extends Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//webelement locatorwith ID
		
		driver.findElement(By.id("name")).sendKeys("Hello Team");
		
		//locate by name
		driver.findElement(By.name("enter name")).sendKeys("Name locator");
		
		//locator with class
		driver.findElement(By.className("inputs")).sendKeys("class Name locator");
		
		//link locator
		driver.findElement(By.linkText("Free Access to interviewQues/ResumeAssistance/material")).click();
		driver.findElement(By.partialLinkText("interviewQues/ResumeAssistance/")).click();
		// css selector locator
		driver.findElement(By.cssSelector("input[id = name]")).click();

	}

}
