package tests.android;

import baseClasses.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LaunchPage;

import java.io.IOException;

public class TestAndroid extends BaseClass {

    @Test (enabled = false)
    public void androidEmulator() throws IOException, InterruptedException {
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("password");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();

        String actual = driver.findElementByClassName("android.widget.EditText").getText();
        //TNEN
        System.out.println("Actual password: " + actual );
        //get connection status
        Assert.assertEquals(actual, "password");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }

}
