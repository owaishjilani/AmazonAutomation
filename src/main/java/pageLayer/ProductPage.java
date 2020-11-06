package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[@id=\\\"p_89/Apple\\\"]/span/a/div/label/i")
	WebElement Apple;
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/h2/a/span")
	WebElement Product;
	
	@FindBy(xpath = "//*[@id=\"buy-now-button\"]")
	WebElement Buy;
	
	@FindBy(xpath = "//*[@id=\"siNoCoverage-announce\"]")
	WebElement Coverage;
	
	public WebElement Brand() {

		System.out.println(Apple.isSelected());
		Assert.assertTrue(Apple.isSelected());
		Assert.assertTrue(true);
		return Apple;
		
	}
	
	public WebElement Product() {
		
		return Product;
		
	}
	
	public WebElement Button() {
		
		return Buy;
		
	}
	
	public WebElement Reject() {
		
		return Coverage;
		
	}

}
