package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TraveLoginAsUserPOM extends Base{


    final By username = By.xpath("//form[@id='loginfrm']/div[3]//input[@name='username']");
    final By password = By.xpath("//form[@id='loginfrm']/div[3]//input[@name='password']");
    final By clickOnLogin = By.xpath("//form[@id='loginfrm']/button[@type='submit']");


    public TraveLoginAsUserPOM(WebDriver driver){
        super(driver);

    }
}
