package lab5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab7 {
	@BeforeTest
	public void setup() {
		System.out.println("intialize the browser and other setup");
	}
	@BeforeMethod
	public void beforeTestCode() {
		
	}
	@AfterMethod
	public void afterTestCode() {
		
	}
	
		@Test    // test case
	public void showmessage() {
		System.out.println("Hello QA 25 team"); 
		}
		
		@Test    // test case
	public void showmessage1() {
			System.out.println("Hello QA 25 team");
			}
			
			@Test    // test case
	public void showmessage2() {
				System.out.println("Hello QA 25 team"); 
				}
				
				@Test    // test case
	public void showmessage3() {
					System.out.println("Hello QA 25 team");
					
		}	
				
				public void showmessage4() {
					System.out.println("Hello QA 25 team");	
		}
				public void showmessage5() {
					System.out.println("Hello QA 25 team");	
		}	
	}
	


