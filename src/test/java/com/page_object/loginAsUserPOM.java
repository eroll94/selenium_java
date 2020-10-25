package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginAsUserPOM extends Base{

//    final By adminLogin = By.linkText("https://www.phptravels.net/admin");

    final By loginAsUser = By.xpath("/html//header[@id='header']//nav//a[@title='Log in to your customer account']");

    final By username = By.id("email");
    final By password = By.id("passwd");

    final By signInClick = By.id("SubmitLogin");


    public loginAsUserPOM(WebDriver driver){
        super(driver);
    }

    public void usernameSendKeys(String string){
        sendKeys(username, string);
    }

    public void passwordSendKeys(String string){
        sendKeys(password, string);
    }

    public void clickOnLoginBtn(){
        clickElement(signInClick);
    }

    public void clickOnAdminLink(){
        clickElement(loginAsUser);
    }
}
