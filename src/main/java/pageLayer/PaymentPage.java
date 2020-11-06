package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {
	
	WebDriver driver;
	
	public PaymentPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(className = "a-link-emphasis")
	WebElement AddNewCard;
	
	@FindBy(xpath = "//div[@class='a-popover-wrapper']")
	WebElement popup;
	
	@FindBy(xpath = "//input[starts-with(@id,'pp')][14]")
//	@FindBy(xpath = "//input[@class='a-input-text a-form-normal']")
//	@FindBy(xpath = "//input[contains(@id, '-14')]")
//	@FindBy(xpath = "//input[@name='addCreditCardNumber']")
	WebElement Number;

//	@FindBy(xpath = "//input[starts-with(@id,'pp')]")
	@FindBy(xpath = "//input[@class='a-input-text a-form-normal'][2]")
	WebElement Name;

//	@FindBy(xpath = "//select[starts-with(@id,'pp')]")
	@FindBy(xpath = "//span[@class='a-button-text a-declarative'][1]")
	WebElement Month;

//	@FindBy(xpath = "//select[starts-with(@id,'pp')]")
	@FindBy(xpath = "//span[@class='a-button-text a-declarative'][2]")
	WebElement Year;
	
//	@FindBy(xpath = "//input[starts-with(@id,'pp')]")
	@FindBy(xpath = "//span[@class='a-button-input'][1]")
	WebElement AddCard;
	
//	@FindBy(xpath = "//div[starts-with(@id,'pp')]")
	@FindBy(xpath = "//div[@class='a-box-inner a-alert-container'][1]")
	WebElement Error;

	public WebElement Add() {

		return AddNewCard;

	}
	
	public WebElement PopUp() {
		
		return popup;
		
	}

	public WebElement CardNumber(String number) {

		Number.sendKeys(number);
		return Number;

	}

	public WebElement CardName(String name) {

		Name.sendKeys(name);
		return Name;

	}

	public WebElement Month() {

		Select m = new Select(Month);
		m.selectByIndex(10);
		System.out.println("The month select is: " + Month.getText());
		return Month;

	}

	public WebElement Year() {

		Select y = new Select(Year);
		y.selectByIndex(4);
		System.out.println("The year select is: " + Year.getText());
		return Year;

	}
	
	public WebElement AddCard() {
		
		return AddCard;
		
	}
	
	public WebElement Validation() {
		
		System.out.println(Error.getText());
		return Error;
		
	}

}
