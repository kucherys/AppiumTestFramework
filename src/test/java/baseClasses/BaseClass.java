package baseClasses;

import capabilities.AndroidClass;
import capabilities.Capabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass extends Capabilities {

    @BeforeClass
    public void setupClassGlobal(){
        System.out.println("Global class setup");
    }

    @BeforeMethod
    public void setupGlobal(){
        System.out.println("Global method setup");
    }
}
