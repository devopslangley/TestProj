package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class addbook {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
	  }

	
	@Test
  public void verifyaddbook() {
		driver.get("www.amazon.co.uk");
		driver.manage().window().maximize();
		
  }
	

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  

}
