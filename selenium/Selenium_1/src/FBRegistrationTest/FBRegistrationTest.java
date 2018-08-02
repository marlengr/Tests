package FBRegistrationTest;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBRegistrationTest {

	private WebDriver driver;
	private String url;
	private String imie;
	private String nazwisko;
	private String telefon;
	private String haslo;
	private String telefondwa;
		
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
                "C:\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		url = "http://www.facebook.com";
		imie = "Ania";
		nazwisko = "Kowalska";
		telefon = "lena.qwertyyyy@onet.eu";
		telefondwa = "lena.qwertyyyy@onet.eu";
		haslo = "aniakowalska!@2";
						
	}
	
	@Test
	public void fbTest() {
		
		driver.get(url);
		driver.manage().window().maximize();

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.clear();
		firstName.sendKeys(imie);
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.clear();
		lastName.sendKeys(nazwisko);
		
		WebElement telephone = driver.findElement(By.name("reg_email__"));
		telephone.clear();
		telephone.sendKeys(telefon);
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.clear();
		password.sendKeys(haslo);
				
		List<WebElement>radioButton = driver.findElements(By.tagName("sex"));
		driver.findElement(By.id("u_0_a")).click();		
		driver.findElement(By.id("u_0_13")).click();
		
		WebElement secondtelephone = driver.findElement(By.name("reg_email_confirmation__"));
		secondtelephone.clear();
		secondtelephone.sendKeys(telefondwa);
		print();
		
		driver.findElement(By.id("u_0_13")).click();
		
		
		//driver.switchTo().alert().dismiss();		
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[3]/button")).click();//tak
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[3]/a")).click();//nie
		//driver.findElement(By.partialLinkText("OK")).click();
		//driver.findElement(By.partialLinkText("Rejestracja")).click();
		
//		System.out.println(
//				driver.findElement(By.xpath("//img[@xpath='static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png']")).getAttribute("src")
//				);
		searchCount();
		
	}
	
	public void print() {
		System.out.println(
				driver.findElement(By.name("reg_passwd__")).getLocation()
				);
	}
	
	public void searchCount() {
		String searchCount = "There are 280 results";
		int sc = Integer.parseInt(searchCount.replaceAll("\\D", ""));
		System.out.println(sc);
	}
	
	@After
	
	public void end() {
		driver.quit();
	}
	
}
