package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id="prependedInput")
    public WebElement userNameElement;

    @FindBy(id="prependedInput2")
    public WebElement passwordElement;

    @FindBy(id="_submit")
    public WebElement loginButtonElement;

    @FindBy(className=".custom-checkbox__icon")
    public WebElement rememberMeElement;

    @FindBy(linkText = "/user/reset-request")
    public WebElement forgotPasswordElement;

    @FindBy(className="title")
    public WebElement titleElement;

    @FindBy(xpath = "Invalid user name or password.")
    public WebElement errorMessageElement;


    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        System.out.println();
        System.out.println();
        loginButtonElement.click();
    }

    public void login(){
        String username = ConfigurationReader.getProperty("storemanager_username");
        String password = ConfigurationReader.getProperty("storemanager_password");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        System.out.println("Hello from the outside");
        loginButtonElement.click();
    }

}
