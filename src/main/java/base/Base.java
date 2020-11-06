package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\owamusta\\eclipse-workspace\\DummyAutomation\\src\\main\\java\\config\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			
			// execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\owamusta\\Downloads\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equals("IE")) {
			
			// execute in IE
			System.setProperty("webdriver.ie.driver", "C:\\Users\\owamusta\\Downloads\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	
}