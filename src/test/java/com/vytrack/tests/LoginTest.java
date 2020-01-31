package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void LoginToThePage(){
        loginPage.login();
    }

    @Test
    public void login() throws InterruptedException {
        WebDriver driver = Driver.getDriver("browser");
        driver.get("https://qa2.vytrack.com/user/login");
        Thread.sleep(3000);
        loginPage.login();
        Thread.sleep(3000);

    }
}
