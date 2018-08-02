package FBRegistrationTest;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonTest {

	//klikanie w radiobutton, checkbox, po id, name lub czymkolwiek 
	// wybieranie czegos z rozsuwanej listy elementów - dropbox (daty itp)
	private WebDriver driver;
	
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver",
	            "C:\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() {
		// klikanie w checkbox, radiobutton 
		driver.findElement(By.id("u_0_9")).click();
		System.out.println(driver.findElement(By.id("u_0_9")).isSelected());
		System.out.println(driver.findElement(By.id("u_0_9")).isEnabled());
		System.out.println(driver.findElement(By.id("u_0_9")).isDisplayed());
		
		//wybieranie daty z rozsuwanej liczby elementów
		Select dropdown = new Select(driver.findElement(By.id("day")));
		dropdown.selectByIndex(1);
		System.out.println(driver.findElement(By.id("day")).isSelected());
		System.out.println(driver.findElement(By.id("day")).isEnabled());
		System.out.println(driver.findElement(By.id("day")).isDisplayed());
				
		
	}
	
}
