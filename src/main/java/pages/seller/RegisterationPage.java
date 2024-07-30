package pages.seller;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.newsellerinfoLoader;

public class RegisterationPage {

	WebDriver driver;
	WebDriverWait wait;
	newsellerinfoLoader newSellerInfo;

	// Constructor to initialise the driver and wait
	public RegisterationPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.newSellerInfo = new newsellerinfoLoader();
	}

	// --Locators
	By registerNowButton = By.xpath("//button[text()='Register Now']");
	By registerPopup = By.className("login_container");
	By registerText = By.xpath("//h5[text()='Register']");
	By registerSubHeadingText = By.className("signin-subheading");
	By registerStoreName = By.id("storeName");
	By registerEmailId = By.id("emailId");
	By registerMobileNumber = By.id("mobileNumber");
	By registerpassword = By.id("password");
	//By eyeCloseButton = By.xpath("//img[@alt='Eye Close image']");
	By registerMyShopButton = By.xpath("//button[text()='Register my shop now']");
	By loginButton = By.xpath("//button[text()='Login Now']");
	By enterOtpField = By.xpath("//input[@aria-label='Please enter OTP character 1']");
	By verifyButton = By.xpath("//button[text()='Verify']");
	
	
	
	

	// Function to Click the register Now button
	public void clickRegisterButton() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(registerNowButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerNowButton));
			wait.until(ExpectedConditions.elementToBeClickable(registerNowButton));
			driver.findElement(registerNowButton).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Function to verify the Register Popup
	public void verifyRegistrationPopup() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerPopup));
			Assert.assertTrue(driver.findElement(registerPopup).isDisplayed(), "Register Popup is not visible");
			Assert.assertTrue(driver.findElement(registerText).isDisplayed(), "Register Text is not visible");
			Assert.assertTrue(driver.findElement(registerSubHeadingText).isDisplayed(),
					"Register Sub Heading is not visible");
			Assert.assertTrue(driver.findElement(registerStoreName).isDisplayed(),
					"Register Store Name field is not visible");
			Assert.assertTrue(driver.findElement(registerEmailId).isDisplayed(),
					"Register email Id field is not visible");
			Assert.assertTrue(driver.findElement(registerMobileNumber).isDisplayed(),
					"Register mobile number field is not visible");
			Assert.assertTrue(driver.findElement(registerpassword).isDisplayed(),
					"Register password field is not visible");
			//Assert.assertTrue(driver.findElement(eyeCloseButton).isDisplayed(), "Register eye button is not visible");
			Assert.assertTrue(driver.findElement(registerMyShopButton).isDisplayed(),
					"Register My Shop Button is not visible");
			Assert.assertTrue(driver.findElement(loginButton).isDisplayed(), "Login Button is not visible");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Function to enter Store Name in the Register Popup
	public void enterStoreNameInRegisterPopup() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(registerStoreName));
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerStoreName));
			wait.until(ExpectedConditions.elementToBeClickable(registerStoreName));
			driver.findElement(registerStoreName).sendKeys(newSellerInfo.getStoreName());

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Function to enter Email id in the Register Popup
	public void enterEmailIdInRegisterPopup() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(registerEmailId));
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerEmailId));
			wait.until(ExpectedConditions.elementToBeClickable(registerEmailId));
			driver.findElement(registerEmailId).sendKeys(newSellerInfo.getEmailId());

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Function to enter Mobile Number in the Register Popup
	public void enterMobileNumberInRegisterPopup() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(registerMobileNumber));
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerMobileNumber));
			wait.until(ExpectedConditions.elementToBeClickable(registerMobileNumber));
			driver.findElement(registerMobileNumber).sendKeys(newSellerInfo.getMobileNumber());

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Function to enter Password in the Register Popup
	public void enterPasswordInRegisterPopup() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(registerpassword));
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerpassword));
			wait.until(ExpectedConditions.elementToBeClickable(registerpassword));
			driver.findElement(registerpassword).sendKeys(newSellerInfo.getPassword());

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	//Function to Click Register My Shop Button
	public void clickRegisterMyShopButton() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(registerMyShopButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(registerMyShopButton));
			wait.until(ExpectedConditions.elementToBeClickable(registerMyShopButton));
			driver.findElement(registerMyShopButton).click();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Function to enter 4 digit OTP
	public void enterOTP() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(enterOtpField));
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterOtpField));
			wait.until(ExpectedConditions.elementToBeClickable(enterOtpField));
		    driver.findElement(enterOtpField).sendKeys(newSellerInfo.getOTP());
		}catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
	}

	//Function to click verify button
	public void clickVerifyButton() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(verifyButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(verifyButton));
			wait.until(ExpectedConditions.elementToBeClickable(verifyButton));
		    driver.findElement(verifyButton).click();
		}catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
	}
	
	

	

}
