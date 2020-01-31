package com.vytrack.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestBase {

    protected WebDriver driver;
    protected SoftAssert softAssert;
    //private  final Logger logger = LogManager.getLogger();




    public void setUp (String browser){
        driver = Driver.getDriver(browser);
        softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String url = ConfigurationReader.getProperty("url");
        driver.get(url);

    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }


}
