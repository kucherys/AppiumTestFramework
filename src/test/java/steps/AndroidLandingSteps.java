package steps;

import capabilities.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EligibilityPage;
import pages.LaunchPage;
import pages.ProductCarouselPage;
import sun.jvm.hotspot.debugger.cdbg.BaseClass;

import java.io.IOException;

public class AndroidLandingSteps extends Capabilities {

    public static AndroidDriver<AndroidElement> driver;

    LaunchPage launchPage;
    EligibilityPage eligibilityPage;
    ProductCarouselPage productCarouselPage;

    @Given("Appium server is running")
    public void appiumServerIsRunning() throws IOException, InterruptedException {
        service = startServer();
        System.out.println("Appium server is up and running");
    }

    @When("I open landing page")
    public void getLandingPage() throws IOException, InterruptedException {
        driver = capabilities("digibank-0.0.4-debug.apk");
        System.out.println("Android simulator started");
    }

    @Then("I verify elements on landing page")
    public void verifyElementsLandingPage() {
        launchPage = new LaunchPage(driver);
        launchPage.verifyLogo();
        launchPage.verifyWelcomeLabel("Welcome to", "ARBM Digibank");
        launchPage.verifySignUpButton("I'm new to [ARBM Digibank]");
        launchPage.verifyLogInButton("Log In");
    }

}
