package StepDefination.seller;

import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.seller.ProductPage;

public class ProductPageSteps {
	private WebDriver driver;
    private ProductPage productpage;

  //Constructor to initialise the driver and wait
    public ProductPageSteps() {
        this.driver = hooks.driver;
        this.productpage = new ProductPage(driver);
    }
    
    //Function to click the Add new Button in the Product page
    @When("I click the Add new Button in the product page")
    public void i_click_the_add_new_button_in_the_product_page() {
    	productpage.clickAddNewButton();
    }
    
    //Function to verify the Create New Product popup
    @Then("I can view the Create New Product popup")
    public void i_can_view_the_create_new_product_popup() {
    	productpage.verifyCreateNewPropuctPopup();
    }
    
    //Function to click the Create from Catalog builder Button
    @When("I click the Create From Catalog Builder Button")
    public void i_click_the_create_from_catalog_builder_button() {
    	productpage.clickCreateFromCatalogBuilderButton();
    }
    
    //Function to display all the buisness Types displayed in the catalog
    @Then("I see the all buisiness types displayed for the shop")
    public void i_see_the_all_buisiness_types_displayed_for_the_shop() {
    	productpage.verifyDisplyedBuisnessTypeInCatalog();
    }
    
    //Function to click the Business Type displayed in the catalog
    @When("I click the First Business type displayed")
    public void i_click_the_first_business_type_displayed() {
    	productpage.clickDisplyedBuisnessTypeInCatalog();
    }
    
    //Function to display all the Categories listed in the business type
    @Then("I see all the Categories listed in the Business Type")
    public void i_see_all_the_categories_listed_in_the_business_type() {
    	productpage.verifyDisplyedCategoriesInBuisnessType();
    }
    
    //Function to click the First Category type displayed
    @When("I click the First Category type displayed")
    public void i_click_the_first_category_type_displayed() {
    	productpage.clickCategoriesInBuisnessType();
    }

    //Function to verify the sub category of the category lists displayed
    @Then("I see all Sub Category listedof the category displayed")
    public void i_see_the_product_list_of_the_category() {
    	productpage.verifySubCategoryDisplayed();
    }

    //Function to click the first Sub Category type
    @When("I click the First Sub Category type displayed")
    public void i_click_the_first_sub_category_type_displayed() {
    	productpage.clickSubCategoryDisplayed();
    }

    //Function to select the products that needed to be added
    @Then("I select the product to be added")
    public void i_select_the_product_to_be_added() {
    	productpage.clickProductsCheckbox();
    }


}
