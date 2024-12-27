package lab5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
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
		System.out.println("before method");
		}
	@AfterMethod
	public void afterTestCode() {
		System.out.println("aftermethod");
		}
	@Test		    // test case
	public void showmessage() {
		System.out.println("Hello QA 25 team Method 1"); 
		}
	@Test		    // test case
	public void showmessage1() {
			System.out.println("Hello QA 25 team method 2");
			}
	@Test			 // test case
	public void showmessage2() {
				System.out.println("Hello QA 25 team method 3"); 
				}
	 
				
    @Test    // test case
	public void showmessage3() {
					System.out.println("Hello QA 25 team method 4");
					}
    @Test
	public void showmessage4() {
					System.out.println("Hello QA 25 team Method 5");	
		}
    @Test
	public void showmessage5() {
					System.out.println("Hello QA 25 team method 6");	
		}	
    @AfterTest
	public void teardown() {
		System.out.println("close the connection");
	}
	    
	}
	


