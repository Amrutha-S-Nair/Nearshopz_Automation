package pages.seller;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class DashboardPage {
	WebDriver driver;
	WebDriverWait wait;

	// Constructor to initialise the driver and wait
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	// --Locators
	By welcomeText = By.xpath("//div[text()='Welcome']");
	By navbarProfileImage = By.xpath("//img[@alt='Navbar Profile']");
	By profileDropdown = By.xpath("//span[text()='Profile']");
	By helpDropdown = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-39jd5h'][normalize-space()='Help']");
	By logoutDropdown =By.xpath("//span[@class='NavProfileFontStyle']");
	By logoutConfirmationPopup = By.id("alert-dialog-title");
	By logoutButtonConfirmation = By.xpath("//p[contains(text(),'Logout')]");
	By addProductsMenu = By.xpath("//p[contains(text(),'Add Products')]");
	
	
	//Function to verify the Welcome Text
	public void verifyWelcomeText() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(welcomeText));
			wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeText));
			Assert.assertTrue(driver.findElement(welcomeText).isDisplayed());
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to verify Welcome Text.");
		}
	}

	//Function to click the Navbar Profile Image
	public void clickNavbarProfileImage() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(navbarProfileImage));
			wait.until(ExpectedConditions.visibilityOfElementLocated(navbarProfileImage));
			wait.until(ExpectedConditions.elementToBeClickable(navbarProfileImage));
			driver.findElement(navbarProfileImage).click();
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Navbar Profile image : " + e.getMessage(), e);
		}
	}

	//Function to verify the Navbar Dropdown
	public void verifyNavbarDropdown() {
		try {
			Assert.assertTrue(driver.findElement(profileDropdown).isDisplayed());
			Assert.assertTrue(driver.findElement(helpDropdown).isDisplayed());
			Assert.assertTrue(driver.findElement(logoutDropdown).isDisplayed());
			System.out.println("All Navbar dropdown elements are displayed.");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to verify Navbar dropdown elements: " + e.getMessage(), e);
		}
		
	}

	//Function to click Logout Button from the dropdown
	public void clickLogoutDropdown() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(logoutDropdown));
			wait.until(ExpectedConditions.visibilityOfElementLocated(logoutDropdown));
			wait.until(ExpectedConditions.elementToBeClickable(logoutDropdown));
			driver.findElement(logoutDropdown).click();
			System.out.println("Logout button is clicked");
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Logout Button : " + e.getMessage(), e);
		}
	}

	//Function to verify the logout confirmation popup
	public void verifyLogoutConfirmationPopup() {
		boolean isPopupDisplayed = false;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(logoutConfirmationPopup));
			wait.until(ExpectedConditions.visibilityOfElementLocated(logoutConfirmationPopup));
			isPopupDisplayed = driver.findElement(logoutConfirmationPopup).isDisplayed();
	        if (isPopupDisplayed) {
	            System.out.println("Logout Confirmation popup is Displayed");
	        }
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to verify logout confirmation popup.");
		}
	}

	//Function to click Logout button in the confirmation popup
	public void clickLogoutConfirmationPopup() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(logoutButtonConfirmation));
			wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButtonConfirmation));
			wait.until(ExpectedConditions.elementToBeClickable(logoutButtonConfirmation));
			driver.findElement(logoutButtonConfirmation).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Logout Button in confirmation popup : " + e.getMessage(), e);
		}
	}

	//Function to click the Add Products tab from the Menu
	public void clickAddProductsMenu() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(addProductsMenu));
			wait.until(ExpectedConditions.visibilityOfElementLocated(addProductsMenu));
			wait.until(ExpectedConditions.elementToBeClickable(addProductsMenu));
			driver.findElement(addProductsMenu).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Add Product Menu Button : " + e.getMessage(), e);
		}
	}
}
