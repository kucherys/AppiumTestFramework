package baseClasses;

import capabilities.AndroidClass;
import capabilities.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class BaseClass extends Capabilities {

    public static AndroidDriver<AndroidElement> driver;

    @BeforeClass
    public void setupClassGlobal() throws IOException, InterruptedException {
        System.out.println("Global class setup");
        service = startServer();
        driver = capabilities("digibank-0.0.4-debug.apk");
    }

    @AfterClass
    public void cleanUpClassGlobal(){
        System.out.println("Global class clean up");
        service.stop();
    }

    @BeforeMethod
    public void setupGlobal(){
        System.out.println("Global method setup");
    }
}
