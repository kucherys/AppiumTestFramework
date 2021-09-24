package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.testng.Assert;
import tests.android.EmulatorTest;


import static io.restassured.RestAssured.given;

public class StepAndroidEmulator extends EmulatorTest {

//    EmulatorTestNg emulator;

    @Given("^Android emulator is up and running with application$")
    public void android_application_up() throws Throwable {
        System.out.println("Android emulator is up and running");
    }

    @When("^I click (.+) option$")
    public void click_option(String optionName) throws Throwable {
        System.out.println("Option '" + optionName + "' was clicked");
    }

    @When("^I set WiFi checkbox in state (.+) and fill WiFi password with value (.+)$")
    public void set_wifi_settings(String checkBoxState, String value) throws Throwable {
        System.out.println("WIfi checkbox set in status '" + checkBoxState + "'");
        System.out.println("WIfi setting value set to '" + value + "'");
    }

    @Then("^I verify WiFi connection status is (.+)$")
    public void verifyConnectionStatus(String actualStatus) throws Throwable {
        Assert.assertEquals(actualStatus, "Connected");
        System.out.println("WIfi connection status is '" + actualStatus + "'");
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
