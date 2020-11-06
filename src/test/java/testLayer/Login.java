package testLayer;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pageLayer.LoginPage;

public class Login extends Base {

	LoginPage lp = new LoginPage(driver);

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")
	public void Productpage() throws InterruptedException {
		
		// user enters email
		lp.EmailID(prop.getProperty("email"));
		
		// user click on continue
		lp.Continue().click();
		
		// user enters password
		lp.PassWord(prop.getProperty("pass"));
		
		// user signs in
		lp.Submit().click();
		
		// user selects address
		lp.Address().click();
		lp.AddressButton().click();
		
		
	}

}
