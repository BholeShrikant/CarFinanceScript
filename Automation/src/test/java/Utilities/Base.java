package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	public static ThreadLocal<WebDriver> tPath = new ThreadLocal<>();

	public static WebDriver baseMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://primeloans.kotak.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}
	
	public static void clickAndSelectByVaule(WebDriver driver, By locator) {
		WebElement element = null;
		element = driver.findElement(locator);
		
		
		Select select = new Select(element);
		
	}
}