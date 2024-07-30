package StepDefination.seller;

import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.seller.RegisterationPage;

public class RegistrationPageSteps {

	private WebDriver driver;
	private RegisterationPage registerpage;

	// Constructor to initialise the driver and wait
	public RegistrationPageSteps() {
		this.driver = hooks.driver;
		this.registerpage = new RegisterationPage(driver);
	}

	// Function to Click the register Now button
	@When("I click the Register Now Button")
	public void i_click_the_register_now_button() {
		registerpage.clickRegisterButton();
	}

	// Function to verify the Registration page
	@Then("I should be view the Registration popup")
	public void i_should_be_view_to_the_registeration_popup() {
		registerpage.verifyRegistrationPopup();
	}

	// Function to enter Store Name in the Registration page
	@When("I enter the Store Name in the Register popup")
	public void i_enter_the_store_name_in_the_register_popup() {
		registerpage.enterStoreNameInRegisterPopup();
	}

	// Function to enter Email id in the Registration page
	@When("I enter the Email Id in the Register popup")
	public void i_enter_the_email_id_in_the_register_popup() {
		registerpage.enterEmailIdInRegisterPopup();
	}

	// Function to enter Mobile Number in the Registration page
	@When("I enter the Mobile Number in the Register popup")
	public void i_enter_the_mobile_number_in_the_register_popup() {
		registerpage.enterMobileNumberInRegisterPopup();
	}

	// Function to enter Password in the Registration page
	@When("I enter the Password in the Register popup")
	public void i_enter_the_password_in_the_register_popup() {
		registerpage.enterPasswordInRegisterPopup();
	}

	// Function to Click Register My Shop Button
	@Then("I click the Register My Shop Button")
	public void i_click_the_register_my_shop_button() {
		registerpage.clickRegisterMyShopButton();
	}

	// Function to enter 4 digit OTP
	@Then("I enter the 4 digit OTP")
	public void i_enter_the_4_digit_otp() {
		registerpage.enterOTP();
	}

	// Function to click verify button
	@Then("I click the Verify button")
	public void i_click_the_verify_button() {
		registerpage.clickVerifyButton();
	}
}
