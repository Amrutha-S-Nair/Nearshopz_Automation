package StepDefination.seller;


import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.seller.HomePage;

public class HomePageSteps{

	private WebDriver driver;
    private HomePage homepage;

  //Constructor to initialise the driver and wait
    public HomePageSteps() {
        this.driver = hooks.driver;
        this.homepage = new HomePage(driver);
    }

    //Function to Navigate to the Seller Portal
	@Given("I am on the seller homepage")
    public void i_am_on_the_seller_homepage() {
        homepage.navigateToHomePage();
    }

	//Function to verify the URl of the Homepage
	@Then("the URL should be correct")
    public void the_url_should_be_correct() {
		homepage.verifyHomepageURL();
	}
	
	//Function to verify the Register Now button
	@When("I see the Register Now Button")
	public void i_see_the_register_now_button() {
		homepage.verifyRegisterButton();
	}

	//Function to enter Email id in the sigin 
	@When("I enter the Email Id in the Sigin popup")
	public void i_enter_the_email_id_in_the_sigin_popup() {
		homepage.enterEmailId_Login();
	}

	//Function to enter password in the Sigin 
	@When("I enter the Password in the Sigin popup")
	public void i_enter_the_password_in_the_sigin_popup() {
		homepage.enterPassword_Login();
	}

	//Function to click login button
	@When("I click the Login Button")
	public void i_click_the_login_button() {
		homepage.clickLoginButton();
	}
	
	//Function to Verify the user successfully logged out
	@Then("I am successfully logged out of the store")
    public void i_am_successfully_logged_out_of_the_store() {
		homepage.verifyUserSuccessfullyLoggedOut();
    }
	

}
