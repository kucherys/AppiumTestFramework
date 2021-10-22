package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EligibilityPage {

    AndroidDriver<AndroidElement> driver;

    ProductCarouselPage productCarouselPage;

    By closeButton = By.id("button.close");
    By eligibilityLabel = By.id("label.title");

    public EligibilityPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
    }

    public void verifyCloseButton(){
        String actualName = driver.findElement(closeButton).getText();
        Assert.assertEquals("multiply", actualName);
    }

    public ProductCarouselPage closeEligibilityModal(){
        driver.findElementByAccessibilityId("button.close").click();
        productCarouselPage = new ProductCarouselPage(driver);
        return productCarouselPage;
    }

    public void verifyEligibilityLabelName(String expectedName){
        String actualName = driver.findElement(eligibilityLabel).getText();
        Assert.assertEquals(expectedName, actualName);
    }

    public void verifyEligibilityList(List<String> expectedString){
        String str = driver.findElementByAccessibilityId("text.eligibilityCriteria").getText();
        List<String> actualString = Pattern.compile("•\t")
                .splitAsStream(str)
                .collect(Collectors.toList());
        List<String> transformActual = new ArrayList<>();
        actualString.forEach(s -> transformActual.add(s.replace("\n", "")));
        transformActual.removeAll(Arrays.asList("", null));
        Collections.sort(transformActual);
        Collections.sort(expectedString);
        Assert.assertTrue(transformActual.equals(expectedString));
    }
}
