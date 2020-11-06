package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
	WebElement Mobile;
	
	@FindBy(xpath = "//*[@id=\"leftNav\"]/ul[16]/div/li[7]/span/a")
	WebElement PriceRange;

	public WebElement Nav() {
		
		return Mobile;
		
	}
	
	public WebElement Range() {
		
		return PriceRange;
		
	}

}
