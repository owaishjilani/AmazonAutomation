package stepDefinitions;

import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.PaymentPage;
import pageLayer.ProductPage;

public class StepDefinition extends Base {

	public StepDefinition() {

		super();

	}

	@Given("^user navigates to Amazon site$")
	public void user_navigates_to_amazon_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Then("^user navigated to Mobile Phones$")
	public void user_navigated_to_Mobile_Phones() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		HomePage hp = new HomePage(driver);
		hp.Nav().click();
		Thread.sleep(2000);

	}

	@Then("^user selects the price range of above AED two thousand five hundred$")
	public void user_selects_the_price_range_of_above_AED_two_thousand_five_hundred() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		HomePage hp = new HomePage(driver);
		hp.Range().click();
		Thread.sleep(2000);

	}

	@Given("^user selects the brand Apple$")
	public void user_selects_the_brand_Apple() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		WebElement apple = driver.findElement(By.xpath("//*[@id=\"p_89/Apple\"]/span/a/div/label/i"));
		apple.click();
		Thread.sleep(2000);

	}

	@Then("^user selects the product$")
	public void user_selects_the_product() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ProductPage prp = new ProductPage(driver);
		prp.Product().click();

	}

	@Then("^user clicks on Buy Now$")
	public void user_clicks_on_Buy_Now() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ProductPage prp = new ProductPage(driver);
		prp.Button().click();

		Thread.sleep(2000);

		prp.Reject().click();

		Thread.sleep(2000);

	}

	@Given("^user enters email address")
	public void user_enters_email_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LoginPage lp = new LoginPage(driver);
		lp.EmailID(prop.getProperty("email"));
		Thread.sleep(2000);

	}

	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LoginPage lp = new LoginPage(driver);
		lp.Continue().click();
		Thread.sleep(2000);

	}

	@Then("^user enters password")
	public void user_enters_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LoginPage lp = new LoginPage(driver);
		lp.PassWord(prop.getProperty("pass"));
		Thread.sleep(2000);

	}

	@Then("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LoginPage lp = new LoginPage(driver);
		lp.Submit().click();
		Thread.sleep(2000);

	}

	@Then("^user selects Use this address$")
	public void user_selects_Use_this_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LoginPage lp = new LoginPage(driver);
		lp.Address().click();
		Thread.sleep(2000);
		lp.AddressButton().click();
		Thread.sleep(2000);

	}

	@Given("^user selects add card detail cta$")
	public void user_selects_add_card_detail_cta() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		PaymentPage payp = new PaymentPage(driver);
		payp.Add().click();
		Thread.sleep(4000);

	}

	@Then("^user enters card number")
	public void user_enters_card_number() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Switch to new window opened
//		for (String winHandle : driver.getWindowHandles()) {
//			driver.switchTo().window(winHandle);
//			System.out.println("Window switch");
//			if (driver.getTitle().contains("amazon.ae Checkout")) {
//				Thread.sleep(3000);
//				driver.findElement(By.id("//input[starts-with(@id,'pp')][14]")).sendKeys("4658 2826 2837 1038");
//				System.out.println("Email found");
//				Thread.sleep(2000);
//				driver.findElement(By.id("Passwd")).sendKeys("xxxxxxx");
//				System.out.println("Password found");
//				Thread.sleep(3000);
//				driver.findElement(By.id("signIn")).click();
//				Thread.sleep(1000);
//			}
//		}

//		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//	    String subWindowHandler = null;
//
//	    Set<String> handles = driver.getWindowHandles(); // get all window handles
//	    Iterator<String> iterator = handles.iterator();
//	    while (iterator.hasNext()){
//	        subWindowHandler = iterator.next();
//	    }
//	    driver.switchTo().window(subWindowHandler); // switch to popup window

//		payp.PopUp().isDisplayed();
//		Thread.sleep(2000);

//		driver.switchTo().alert();

//		Robot rob = new Robot();
//		
//		rob.mouseMove(450, 250);
		
		PaymentPage payp = new PaymentPage(driver);
		payp.CardNumber(prop.getProperty("cardnumber"));

		Thread.sleep(3000);

	}

	@Then("^user enters name on card")
	public void user_enters_name_on_card() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		PaymentPage payp = new PaymentPage(driver);
		payp.CardName(prop.getProperty("cardname"));
		Thread.sleep(3000);

	}

	@Then("^user selects expiry date from the dropdown$")
	public void user_selects_expiry_date_from_the_dropdown() throws Throwable {

		PaymentPage payp = new PaymentPage(driver);
		payp.Month();
		Thread.sleep(2000);

		payp.Year();
		Thread.sleep(2000);

	}

	@Then("^user clicks on add your card button$")
	public void user_clicks_on_add_your_card_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		PaymentPage payp = new PaymentPage(driver);
		payp.AddCard().click();
		payp.Validation().getText();

	}

}