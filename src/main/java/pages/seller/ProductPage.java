package pages.seller;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ProductPage {
	WebDriver driver;
	WebDriverWait wait;

	// Constructor to initialise the driver and wait
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	// --Locators
	By addNewButton = By.xpath("//p[text()='Add New']");
	By createNewProductText = By.xpath("//p[text()='Create new product']");
	By createFromCatalogBuilderButton = By.xpath("//p[text()='Create From Catalog Builder']");
	By addNewProductButton =By.xpath("//p[text()='Add New Product']");
	By displayedBuisnessTypes = By.xpath("//div[@class=\"Business-card-1\"]");
	By displayedcategoryTypes = By.xpath("//div[@class='MuiBox-root css-i9gxme']");
	By snacksAndBrandedCategory = By.xpath("//p[text()='Snacks & Branded Foods']");
	By spreadsSaucesSubCategory = By.xpath("//p[text()='Spreads, Sauces, Ketchup']");
	By productscheckbox = By.xpath("(//input[@type='checkbox'])[1]");
	
	
	//Function to click Add New Button
	public void clickAddNewButton() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(addNewButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(addNewButton));
			wait.until(ExpectedConditions.elementToBeClickable(addNewButton));
			driver.findElement(addNewButton).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Add New Button : " + e.getMessage(), e);
		}
	}

	//Function to verify the Create New Product popup
	public void verifyCreateNewPropuctPopup() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(createNewProductText));
			wait.until(ExpectedConditions.visibilityOfElementLocated(createNewProductText));
			Assert.assertTrue(driver.findElement(createNewProductText).isDisplayed());
			
			wait.until(ExpectedConditions.presenceOfElementLocated(createFromCatalogBuilderButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(createFromCatalogBuilderButton));
			Assert.assertTrue(driver.findElement(createFromCatalogBuilderButton).isDisplayed());

			wait.until(ExpectedConditions.presenceOfElementLocated(addNewProductButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(addNewProductButton));
			Assert.assertTrue(driver.findElement(addNewProductButton).isDisplayed());
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to verify the Create New Product popup : " + e.getMessage(), e);
		}
	}

	//Function to click the Create from Catalog builder Button
	public void clickCreateFromCatalogBuilderButton() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(createFromCatalogBuilderButton));
			wait.until(ExpectedConditions.visibilityOfElementLocated(createFromCatalogBuilderButton));
			wait.until(ExpectedConditions.elementToBeClickable(createFromCatalogBuilderButton));
			driver.findElement(createFromCatalogBuilderButton).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click create From Catalog Builder Button : " + e.getMessage(), e);
		}
	}

	//Function to display all the buisness Types displayed in the catalog
	public void verifyDisplyedBuisnessTypeInCatalog() {
		try {
			List<WebElement> businessTypeElements =driver.findElements(displayedBuisnessTypes);
			for(WebElement element : businessTypeElements) {
                System.out.println(element.getText());
            }
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click create From Catalog Builder Button : " + e.getMessage(), e);
		}
	}

	//Function to click the Business Type displayed in the catalog
	public void clickDisplyedBuisnessTypeInCatalog() {
		try {
			List<WebElement> businessTypeElements =driver.findElements(displayedBuisnessTypes);
			if(!businessTypeElements.isEmpty()) {
				WebElement firstBusinessType = businessTypeElements.get(0);
			wait.until(ExpectedConditions.visibilityOf(firstBusinessType));
			wait.until(ExpectedConditions.elementToBeClickable(firstBusinessType));
			firstBusinessType.click();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click first Business Type Button : " + e.getMessage(), e);
		}
	}

	//Function to display all the Categories listed in the business type
	public void verifyDisplyedCategoriesInBuisnessType() {
		try {
			List<WebElement> categoryTypeElements =driver.findElements(displayedcategoryTypes);
			for(WebElement element : categoryTypeElements) {
                System.out.println(element.getText());
            }
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click create From Catalog Builder Button : " + e.getMessage(), e);
		}
	}

	//Function to click the Category type displayed
	public void clickCategoriesInBuisnessType() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(snacksAndBrandedCategory));
			wait.until(ExpectedConditions.visibilityOfElementLocated(snacksAndBrandedCategory));
			wait.until(ExpectedConditions.elementToBeClickable(snacksAndBrandedCategory));
			driver.findElement(snacksAndBrandedCategory).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Snacks and Branded Foods Button : " + e.getMessage(), e);
		}
	}

	//Function to verify the Product lists displayed
	public void verifySubCategoryDisplayed() {
		try {
			List<WebElement> categoryTypeElements =driver.findElements(displayedcategoryTypes);
			for(WebElement element : categoryTypeElements) {
                System.out.println(element.getText());
            }
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click create From Catalog Builder Button : " + e.getMessage(), e);
		}
	}

	//Function to click the first Sub Category type
	public void clickSubCategoryDisplayed() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(spreadsSaucesSubCategory));
			wait.until(ExpectedConditions.visibilityOfElementLocated(spreadsSaucesSubCategory));
			wait.until(ExpectedConditions.elementToBeClickable(spreadsSaucesSubCategory));
			driver.findElement(spreadsSaucesSubCategory).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Spreads, Sauces, Ketchup Button : " + e.getMessage(), e);
		}
	}

	//Function to select the products that needed to be added
	public void clickProductsCheckbox() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(productscheckbox));
			wait.until(ExpectedConditions.visibilityOfElementLocated(productscheckbox));
			wait.until(ExpectedConditions.elementToBeClickable(productscheckbox));
			driver.findElement(productscheckbox).click();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			throw new RuntimeException("Failed to click Products checkbox Button : " + e.getMessage(), e);
		}
	}
	
	
	
}
