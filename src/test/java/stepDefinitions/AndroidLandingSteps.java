package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.testng.Assert;
import pages.EligibilityPage;
import pages.LaunchPage;
import pages.ProductCarouselPage;
import tests.android.AndroidLandingTests;


import static io.restassured.RestAssured.given;

public class AndroidLandingSteps extends AndroidLandingTests {

    LaunchPage launchPage;
    EligibilityPage eligibilityPage;
    ProductCarouselPage productCarouselPage;

    @Given("^Appium server is running$")
    public void appium_server_up() throws Throwable {
        System.out.println("Appium server is up and running");
    }

    @When("^I open landing page$")
    public void open_landing_page() throws Throwable {
        System.out.println("Landing page opened");
    }

    @When("^I set WiFi checkbox in state (.+) and fill WiFi password with value (.+)$")
    public void set_wifi_settings(String checkBoxState, String value) throws Throwable {
        System.out.println("WIfi checkbox set in status '" + checkBoxState + "'");
        System.out.println("WIfi setting value set to '" + value + "'");
    }

    @Then("^I verify elements on landing page$")
    public void verify_elements_landing_page() throws Throwable {
        launchPage = new LaunchPage(driver);
        launchPage.verifyLogo();
        launchPage.verifyWelcomeLabel("Welcome to", "ARBM Digibank");
    }


//    @Given("^Running emulator tests first$")
//    public void Testing_emulatorFirst() throws Throwable {
//        System.out.println("Android emulator is up and running");
//        emulator.androidEmulatorFirst();
//    }
//
//
//    @Given("^Running emulator tests second$")
//    public void Testing_emulator() throws Throwable {
//        System.out.println("Android emulator is up and running");
//        emulator.androidEmulatorSecond();
//    }

}
