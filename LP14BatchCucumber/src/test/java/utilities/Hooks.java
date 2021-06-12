package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import junit.framework.Assert;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void beforeclass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhishekMishra\\IBM\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void afterclass(){
		driver.quit();
	}
	
	public static void signUp(String FNAME, String LNAME, String EMAIL, String USERNAME, String PASS1, String PASS2){
		
		
		try {
			driver.findElement(By.xpath("//a[contains(text(),' Sign up! ')]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='registration_firstname']")).sendKeys(FNAME);
			driver.findElement(By.xpath("//*[@id='registration_lastname']")).sendKeys(LNAME);
			driver.findElement(By.xpath("//*[@id='registration_email']")).sendKeys(EMAIL);
			driver.findElement(By.xpath("//*[@id='username']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//*[@id='pass1']")).sendKeys(PASS1);
			driver.findElement(By.xpath("//*[@id='pass2']")).sendKeys(PASS2);
			driver.findElement(By.xpath("//*[@id='registration_submit']")).click();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	 public static void verifySignupMsg(String TEXT){
		 
		 try {
		 String text = driver.findElement(By.xpath("//p[contains(text(),'An e-mail has been sent to remind you of your login and password.')]")).getText();
		 Assert.assertEquals(TEXT, text);
		 }
		 
		 catch (Exception e) {
				e.printStackTrace();
			}
	}
	 
	 
	 public static void verifyLogin (String EMAIL, String PASS) {
		 
		 try {
			 
			 driver.findElement(By.xpath("//*[@id='login']")).sendKeys(EMAIL);
			 driver.findElement(By.xpath("//*[@id='password']")).sendKeys(PASS);
			 driver.findElement(By.xpath("//*[@type='submit']")).click();
			 
		 }
		 
		 catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 
	 public static void verifyEmailID (String EMAIL ) {
		 
		 try {
			 
			 driver.findElement(By.xpath("//a[@href='#']")).click();
			 String text = driver.findElement(By.xpath("//div[@class='text-center']/a/following-sibling::p")).getText();
			 Assert.assertTrue(text.contains(EMAIL));
			 
		 }
		 catch (Exception e) {
				e.printStackTrace();
			}
		} 
	 
	 
	 	public static void composeEmail (String MAIL, String SUB, String BODY ) {
		 
		 try {
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@id='profileCollapse']//ul/li[2]/a")).click();
			 driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).sendKeys(MAIL);
			 driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys(SUB);
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 }
		 catch (Exception e) {
				e.printStackTrace();
			}
		}
	 
	 
	 
	 
	 
	}

	

		
