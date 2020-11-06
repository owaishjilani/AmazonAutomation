package testLayer;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pageLayer.HomePage;

public class Home extends Base{
	
	HomePage hp = new HomePage(driver);
	
	@BeforeTest
	public void initialize() throws IOException{
		
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	public void Homepage() throws InterruptedException {
		
		// user navigates to mobile phones
		hp.Nav().click();
		Thread.sleep(3000);
		
		// user selects the range
		hp.Range().click();
		Thread.sleep(3000);
		
	}

}
