package FBRegistrationTest;

import java.awt.Desktop.Action;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDropTest {
	
	//przesuwanie elementu w dowolne miejsce na stronie 

	private WebDriver driver;
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver",
	            "C:\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.yesco.com/test/tmp/dnd.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropDragTest() {
		WebElement From = driver.findElement(By.xpath("//*[@id=\"get_adobe3dIi15v\"]/img"));
		//WebElement To = driver.findElement(By.id("/html"));
		
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action dragDrop = builder.clickAndHold(From).moveByOffset(200, 200).build();
		
		dragDrop.perform();
	}
}