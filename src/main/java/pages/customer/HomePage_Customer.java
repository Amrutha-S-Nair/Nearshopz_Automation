package pages.customer;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import config.config;
 
public class HomePage_Customer {
	WebDriver driver;
	WebDriverWait wait;
 
	public HomePage_Customer(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	}
 
	// Locators
	By usernameField = By.id("username");
	By homeLocation = By.xpath("//input[@id='LocationSearchInput']");
	By continueButtonClick = By.xpath("//button[@class='continuebutton']");
	By storeListingPage = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']");
	By ernakulamOptionLocator = By.xpath("//span[text()='Ernakulam']");
 
	public void navigateToHomePage() {
		driver.get(config.Customer_BASE_URL);
		wait.until(ExpectedConditions.urlToBe(config.Customer_BASE_URL));
		Assert.assertEquals(config.Customer_BASE_URL, driver.getCurrentUrl());
 
	}
	public void enterLocation()
	{
		 driver.findElement(homeLocation).sendKeys("Ernakulam");
		 // Define the locator for the dropdown option "Ernakulam"
		    
		    
		    // Wait for the dropdown option to be visible and then click it
		    wait.until(ExpectedConditions.visibilityOfElementLocated(ernakulamOptionLocator));
		    driver.findElement(ernakulamOptionLocator).click();
	}
	
	public void continueButtonClick()
	{
		 driver.findElement(continueButtonClick).click();
		// Wait until the new URL appears
	        wait.until(ExpectedConditions.urlToBe("https://testcustomer.nearshopz.com/stores"));
		 
	}
	public void navigateToStoreListingPage()
	{
		 
		// Wait until the store listing appears
	        wait.until(ExpectedConditions.visibilityOfElementLocated(storeListingPage));
	    
	}
	
}
