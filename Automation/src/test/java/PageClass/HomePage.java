package PageClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	WebElement element = null;

	private By appplylink = By.xpath("(//a[text () = 'Apply Now '])");
	private By applybutton = By.xpath("(//a[contains(@class,'box-btn')])[1]");
	private By applyNowOnNewCarFinance = By.xpath("(//a[contains(@class,'active')])[1]");
	//private By clickHereLinkOnNewCarFinance = By.xpath("(//select[contains(@class,'valid')])[1]");
	private By elementText = By.xpath("//label[text ()='Product Interested in']");
	private By clickHereLinkOnNewCarFinance = By.xpath("(//a[text () = 'Click here'])[1]");
	private By elementProductIntrestedIn = By.xpath("(//select[contains(@class,'valid')])[1]");
	private By elementName = By.xpath("//input[contains(@class,'txt-name')]");
	private By elementEmail = By.xpath("//input[contains(@class,'txt-email')]");
	private By elementMobile = By.xpath("//input[contains(@class,'txtmobile')]");
	private By elementCity = By.xpath("//select[contains(@class,'requestCallCity')]");
	private By elementTermsCheckbox = By.xpath("//label[contains(@class,'declration-cformtxt')]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitToPageLoad() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnApplyLink() {
		waitToPageLoad();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(appplylink));
		driver.findElement(appplylink).click();
	}

	public void clickOnApplybutton() {
		waitToPageLoad();
		driver.findElement(applybutton).click();
	}

	public void clickOnApplyNowOnNewCarFinance() {
		waitToPageLoad();
		driver.findElement(applyNowOnNewCarFinance).sendKeys(Keys.TAB);
		waitToPageLoad();
		driver.findElement(applyNowOnNewCarFinance).click();
	}

	public void clickHereLink() {
		waitToPageLoad();
		waitToPageLoad();
		driver.findElement(clickHereLinkOnNewCarFinance).click();
	}

	public void setDetailsOnRequestCallPopup() {
		waitToPageLoad();
		driver.findElement(elementText).click();
//		waitToPageLoad();
//		Select select = new Select(driver.findElement(elementProductIntrestedIn));
//		select.selectByValue("2");
		waitToPageLoad();
		driver.findElement(elementName).sendKeys("Kunal Mahajan");
		waitToPageLoad();
		driver.findElement(elementEmail).sendKeys("test@gmail.com");
		waitToPageLoad();
		driver.findElement(elementMobile).sendKeys("9876543210");
		waitToPageLoad();
		Select selectCity = new Select(driver.findElement(elementCity));
		selectCity.selectByValue("MUMBAI");
		waitToPageLoad();
		driver.findElement(elementTermsCheckbox).click();
	}

}
