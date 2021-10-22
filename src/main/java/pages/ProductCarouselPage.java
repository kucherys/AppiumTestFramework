package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductCarouselPage {
    AndroidDriver<AndroidElement> driver;

    EligibilityPage eligibilityPage;

    By openBankAccountButton = By.id("button.openBankAccount");
    By eligibleButton = By.id("button.eligibilityCriteria");
    By logoLabel = By.id("label.logo");
    By instructionText = By.id("label.carousel.0");

    public ProductCarouselPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
    }

    public void verifyOpenBankAccountButton(String expectedName){
        String actualName = driver.findElement(openBankAccountButton).getText();
        Assert.assertEquals(expectedName, actualName);
    }

    public void verifyEligibilityLabel(String expectedName){
        String actualName = driver.findElement(eligibleButton).getText();
        Assert.assertEquals(expectedName, actualName);
    }

    public void verifyLogoLabel(String expectedName){
        String actualName = driver.findElement(logoLabel).getText();
        Assert.assertEquals(expectedName, actualName);
    }

    public void verifyInstructionText(String expectedName){
        String actualName = driver.findElement(instructionText).getText();
        Assert.assertEquals(expectedName, actualName);
    }

    public EligibilityPage openEligibilityModal(){
        driver.findElementByAccessibilityId("button.eligibilityCriteria").click();
        eligibilityPage = new EligibilityPage(driver);
        return eligibilityPage;
    }


}
