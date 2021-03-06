package FBRegistrationTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
	
	private WebDriver driver;
	
	
	@Before
	public void beforeTest() {
	
		System.setProperty("webdriver.gecko.driver",
	            "C:\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	
	
	@Test
	public void testTest() throws InterruptedException  {
		
		//akceptowanie okienek pop up, pobieranie ich zawartości, wpisywanie wartosci do wyskakujacego okienka
		
		
		driver.manage().window().maximize();
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.print("Alert Text:" + alert.getText());
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		System.out.println("/nGo button text" + driver.findElement(By.name("proceed")).getAttribute("value"));
		
		test2();
		
	}
	
	public static void test2() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		driver.findElement(By.id("prompt")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.print("Alert Text:" + alert.getText());
		alert.sendKeys("Marlen");
		Thread.sleep(3000);
		alert.accept();
		driver.switchTo().defaultContent();
	}
	
	@After
	public void afterTest() {
		driver.close();
	}
	}

