package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

public class SeleniumUtils {

    public static void waitPlease(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void clickWithWait(By by, int attempts){
        int counter = 0;
        while (counter<attempts){
            try{
                Driver.getDriver().findElement(by).click();
                break;
            }catch(WebDriverException e){
                System.out.println(e);
                System.out.println("Attempt:: "+ counter);
                ++counter;
                waitPlease(2);
            }
        }
    }
}
