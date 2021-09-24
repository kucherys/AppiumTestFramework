package tests.android;

import capabilities.AndroidClass;
import capabilities.CommonApiDataProviders;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;

public class DataProviderTest {

    AndroidClass android;

    @BeforeClass
    public void setupClassLocal() {
        System.out.println("Local class setup");
    }

    @BeforeMethod
    public void setupLocal() {
        System.out.println("Local method setup, Open android emulator");
        android = new AndroidClass("version X");
    }

    @AfterMethod(alwaysRun = true)
    public void cleanupLocal() {
        System.out.println("Closing android emulator");
    }

    @Test
    public void androidEmulatorPositiveTest() throws MalformedURLException {
        //GIVEN
//        AndroidClass android = new AndroidClass("version X");
        //WHEN
        String actualVersion = android.getAndroidVersion();
        System.out.println("Actual version: " + actualVersion);

        //THEN
        Assert.assertEquals(actualVersion, "version X");

    }

    @Test(enabled = false)
    public void androidEmulatorNegativeTest() throws MalformedURLException {
        //GIVEN
        AndroidClass android = new AndroidClass("version X");
        //WHEN

        String actualVersion = android.getAndroidVersion();
        System.out.println("Actual version: " + actualVersion);

        //THEN
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualVersion, "version Y");
        sa.assertEquals(actualVersion, "version X");
        sa.assertEquals(actualVersion, "version X");
        sa.assertAll();
    }

    @Test(dataProvider = "invalidCredentials", dataProviderClass = CommonApiDataProviders.class)
    public void loginAndroidExistentUser(String login, String password, String result) {
        //GIVEN
        //Start emulator
        //follow workflow steps
        System.out.println("Starting android login test");

        //WNEN
        System.out.println("I enter " + login);
        System.out.println("I enter " + password);

        //TNEN
        System.out.println(result);
        System.out.println("=========");
    }
}
