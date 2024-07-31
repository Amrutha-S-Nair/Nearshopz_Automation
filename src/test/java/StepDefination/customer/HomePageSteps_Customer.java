package StepDefination.customer;

import org.openqa.selenium.WebDriver;
import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.customer.HomePage_Customer;
import io.cucumber.java.en.And;

public class HomePageSteps_Customer {
	private WebDriver driver;
	private HomePage_Customer homepage;

	public HomePageSteps_Customer() {
		this.driver = hooks.driver;
		this.homepage = new HomePage_Customer(driver);
	}


	@Given("I am on the customer home page")
       public void i_am_on_the_customer_home_page() {
           homepage.navigateToHomePage();
       }
	@Then ("I able to enter the location")
	public void i_able_enter_the_location() {
		homepage.enterLocation();
		
	}
	@And ("I able view the continue button")
	public void i_able_view_the_continue_button() {
		homepage.continueButtonClick();
		
	}
	@And ("I able to enter the store listing page")
	public void I_able_to_enter_the_store_listing_page() {
		homepage.navigateToStoreListingPage();
		
	}
	
}
