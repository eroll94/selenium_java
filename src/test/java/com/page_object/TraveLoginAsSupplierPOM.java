package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TraveLoginAsSupplierPOM extends Base{


    final By username = By.xpath("/html/body/div[2]/form[1]//input[@name='email']");
    final By password = By.xpath("/html/body/div[2]/form[1]//input[@name='password']");
    final By clickOnLogin = By.xpath("/html/body/div[2]/form[1]/button[@type='submit']");

    public TraveLoginAsSupplierPOM(WebDriver driver){
        super(driver);

    }
}
