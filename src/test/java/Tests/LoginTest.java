package Tests;

import POM.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static core.Main.driver;
import static core.Main.initializeDriver;

public class LoginTest {
    @BeforeClass
    public void setup(){
        initializeDriver();
    }
    @Test(priorty = 2)
    public void logintest() throws InterruptedException{}{
        LoginPage loginPage= new LoginPage(driver);
        loginPage.openLoginPage("https://aqaryaid.com/en");
        loginPage.closepopup();
        loginPage.clickLoginButton();

    }

}
