package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "email")
	WebElement Email;

	@FindBy(xpath = "//input[@id=\"continue\"]")
	WebElement Continue;

	@FindBy(xpath = "//*[@id=\"ap_password\"]")
	WebElement Password;
	
	@FindBy(id = "signInSubmit")
	WebElement SignIn;
	
	@FindBy(xpath = "//*[@id=\"address-list\"]/div/div[1]/div/fieldset[1]/div[1]/span/div/label/input")
	WebElement RadioButton;
	
	@FindBy(id = "orderSummaryPrimaryActionBtn")
	WebElement UseAddress;

	public WebElement EmailID(String ei) {

		Email.sendKeys(ei);
		return Email;

	}

	public WebElement Continue() {
		
		return Continue;

	}

	public WebElement PassWord(String pwd) {

		Password.sendKeys(pwd);
		return Password;

	}
	
	public WebElement Submit() {
		return SignIn;
		
	}
	
	public WebElement Address() {
		
		System.out.println(RadioButton.isSelected());
		Assert.assertTrue(RadioButton.isSelected());
		Assert.assertTrue(true);
		return RadioButton;
		
	}
	
	public WebElement AddressButton () {
		
		return UseAddress;

	}

}
