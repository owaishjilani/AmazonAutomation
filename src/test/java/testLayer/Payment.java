package testLayer;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pageLayer.PaymentPage;

public class Payment extends Base {
	
	PaymentPage payp = new PaymentPage(driver);

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")
	public void Productpage() throws InterruptedException {
		
		// user clicks on add new card
		payp.Add().click();
		
		// displays popup
		payp.PopUp().isDisplayed();
		
		// user enters card number
		payp.CardNumber(prop.getProperty("cardnumber"));
		
		// user enters name on card
		payp.CardName(prop.getProperty("cardname"));
		
		// user selects expiry date
		payp.Month();
		payp.Year();
		
		// user clicks button to save details
		payp.AddCard().click();
		
		// print out the error message
		payp.Validation().getText();
		
	}

}
