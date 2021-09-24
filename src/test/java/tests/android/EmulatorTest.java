package tests.android;

import baseClasses.BaseClass;
import capabilities.AndroidClass;
import capabilities.CommonApiDataProviders;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.MalformedURLException;

//@Test (dependsOnGroups = "sanity")
public class EmulatorTest extends BaseClass {

    @Test
    public void androidEmulator() throws IOException, InterruptedException {
        //GIVEN
        service = startServer();
//        capabilities.StartEmulator();

        //follow workflow steps
        System.out.println("Starting test from Test NG");
        AndroidDriver<AndroidElement> driver = capabilities("ApiDemos-debug.apk");
        //WNEN
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("secret");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();

        String actual = driver.findElementByClassName("android.widget.EditText").getText();
        //TNEN
        System.out.println("Actual password: " + actual );
        //get connection status
        Assert.assertEquals(actual, "secret");
        driver.findElementsByClassName("android.widget.Button").get(1).click();

        service.stop();
    }

}
