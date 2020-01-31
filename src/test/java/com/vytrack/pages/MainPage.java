package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    WebDriver driver = Driver.getDriver();
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }



    public void navigateToTab(String tabName){
        WebElement tab = driver.findElement(By.xpath(""));
    }

    public void navigateToModule(String moduleName){

    }

}
