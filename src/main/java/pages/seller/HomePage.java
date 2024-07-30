package pages.seller;

import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.config;
import utilities.existingsellerinfoLoader;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
	existingsellerinfoLoader oldSellerInfo;

	//Constructor to initialise the driver and wait
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.oldSellerInfo = new existingsellerinfoLoader();
	}

	// Locators
	By nearshopzLogo = By.xpath("//img[@alt='shop and deliver.png']");
	By downloadForIOSButton = By.xpath("//p[text()='Download for IOS']");
	By downloadForAndroidButton = By.xpath("//p[text()='Download for Android']");
	By emailId = By.id("userName");
	By password = By.id("password");
	By eyeCloseButton = By.xpath("//img[@alt='Eye Close image']");
	By stayLoggedInCheckbox = By.xpath("//input[@type='checkbox']");
	By forgotPassword = By.xpath("//button[text()='Forgot Password ?']");
	By loginButton =  By.id("login-btn");
	By loginAsShopAssistant = By.className("shop-assistant-login-text");
	By registerNowButton = By.xpath("//button[text()='Register Now']");
	By siginText = By.xpath("//h6[text()='Sign In']");



	// Function to verify element presence
    public boolean isElementPresent(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
	//Function to Navigate to the Seller Portal
	public void navigateToHomePage() {
		driver.get(config.Seller_BASE_URL);
		wait.until(ExpectedConditions.urlToBe(config.Seller_BASE_URL));

	}

	//Function to verify the URl of the Homepage
	public void verifyHomepageURL() {
		Assert.assertEquals(config.Seller_BASE_URL, driver.getCurrentUrl());
	}

	//Function to verify the Register Now button
	public void verifyRegisterButton() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(registerNowButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerNowButton));
			Assert.assertTrue(isElementPresent(registerNowButton), "Register Now button is not present.");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	//Function to enter Email id for login
	public void enterEmailId_Login() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
			wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
			wait.until(ExpectedConditions.elementToBeClickable(emailId));
			driver.findElement(emailId).sendKeys(oldSellerInfo.getEmailId());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	//Function to enter password for login
	public void enterPassword_Login() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(password));
			wait.until(ExpectedConditions.visibilityOfElementLocated(password));
			wait.until(ExpectedConditions.elementToBeClickable(password));
			driver.findElement(password).sendKeys(oldSellerInfo.getPassword());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

	//Function to click login Button
	public void clickLoginButton() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
			wait.until(ExpectedConditions.elementToBeClickable(loginButton));
			driver.findElement(loginButton).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	//Function to Verify the user successfully logged out
	public void verifyUserSuccessfullyLoggedOut() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(siginText));
			wait.until(ExpectedConditions.visibilityOfElementLocated(siginText));
			Assert.assertTrue(driver.findElement(siginText).isDisplayed());	
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	


}
