package testLayer;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pageLayer.ProductPage;

public class Product extends Base {
	
	ProductPage prp = new ProductPage(driver);
	
	@BeforeTest
	public void initialize() throws IOException{
		
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	public void Productpage() throws InterruptedException {
		
		// user selects Apple
		prp.Brand().click();
		Thread.sleep(2000);
		
		// user selects a product
		prp.Product().click();
		Thread.sleep(2000);
		
		// user clicks on the buy now button and rejects coverage
		prp.Button().click();
		prp.Reject().click();
		
	}

}
