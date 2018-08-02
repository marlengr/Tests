import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestClass {
	private WebDriver wd;
	private String url;
	private String userName;
	private String userPass;
	
	@Before 
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
                "C:\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");		
		//przypisujemy wart do zmiennych
		wd = new FirefoxDriver();
		url = "http://www.tlen.pl";
		userName = "userName";
		userPass = "userPass";
	}
	
	@Test
	public void loginNegative() {
		wd.get(url);
		//wd.findElement(By.partialLinkText("Poczta")).click();
		//szukanie elementu po widocznym czesciowo lub calkowicie elemencie
		
		WebElement loginName = wd.findElement(By.name("username"));
		loginName.clear();
		loginName.sendKeys(userName);
		
		//elementy mozna szukac po roznych atrybutach typu name, id, odwolanie do elementu po xpath
		
		WebElement loginPass = wd.findElement(By.id("password"));
		loginPass.clear();
		loginPass.sendKeys(userPass);
		
		wd.findElement(By.id("login-button")).click();
		
		//asercje - sprawdza czy warunki ktory zakladamy nast¹pi³y 
		
		Assert.assertTrue(wd.getPageSource().contains("Podany login i/lub has³o s¹ nieprawid³owe."));
		
		
	}
	
	
	@After
	public void tearDown() {
		wd.quit();
	}
	
}
