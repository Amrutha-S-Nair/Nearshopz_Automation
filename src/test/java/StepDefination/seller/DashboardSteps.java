package StepDefination.seller;

import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.seller.DashboardPage;

public class DashboardSteps {
	private WebDriver driver;
    private DashboardPage dashboardpage;

  //Constructor to initialise the driver and wait
    public DashboardSteps() {
        this.driver = hooks.driver;
        this.dashboardpage = new DashboardPage(driver);
    }
    
    //Function to verify the Welcome Text
    @Then("I should view the welcome Store Name text")
    public void i_should_view_the_welcome_store_name_text() {
    	dashboardpage.verifyWelcomeText();
    }
    
    //Function to click the Navbar profile image in the top right corner
    @When("I click the Navbar profile image in the top right corner")
    public void i_click_the_navbar_profile_image_in_the_top_right_corner() {
    	dashboardpage.clickNavbarProfileImage();
    }

    //Function to verify the Navbar Dropdown
    @Then("I see the dropdown displayed in the navbar")
    public void i_see_the_dropdown_displayed_in_the_navbar() {
    	dashboardpage.verifyNavbarDropdown();
    }

    //Function to click Logout Button from the dropdown
    @When("I click Logout Button from the dropdown")
    public void i_click_logout_button_from_the_dropdown() {
    	dashboardpage.clickLogoutDropdown();
    }

    //Function to verify the logout confirmation popup
    @Then("I see the Logout confirmation popup")
    public void i_see_the_logout_confirmation_popup() {
    	dashboardpage.verifyLogoutConfirmationPopup();
    }

    //Function to click Logout button in the confirmation popup
    @Then("I click Logout in the confirmation popup")
    public void i_click_logout_in_the_confirmation_popup() {
    	dashboardpage.clickLogoutConfirmationPopup();
    }

    //Function to click the Add Products tab from the Menu
    @When("I click Add Products tab from the menu")
    public void i_click_add_products_tab_from_the_menu() {
    	dashboardpage.clickAddProductsMenu();
    }
    

}
