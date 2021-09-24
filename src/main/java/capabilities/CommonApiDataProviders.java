package capabilities;

import org.testng.annotations.DataProvider;

public class CommonApiDataProviders {

    @DataProvider
    public static Object[][] invalidCredentials() {
        return new Object[][]{
                {"correctLogin", "correctPassword","I land on welcome page"},
                {"correctLogin", "incorrectPassword", "Error displayed: Please use correct password"}
        };
    }
}
