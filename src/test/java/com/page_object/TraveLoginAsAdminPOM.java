package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TraveLoginAsAdminPOM extends Base{

//    final By adminLogin = By.linkText("https://www.phptravels.net/admin");

    final By adminLogin = By.xpath("/html//main[@id='Main']/section[@class='grey-box']/div[@class='container']/div[@class='row']/div[3]//a[@href='//www.phptravels.net/admin']/small[.='http://www.phptravels.net/admin']");

    final By username = By.name("email");
    final By password = By.name("password");

    final By signInClick = By.xpath("/html/body/div[2]/form[1]/button[@type='submit']");


    public TraveLoginAsAdminPOM(WebDriver driver){
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
        clickElement(adminLogin);
    }
}
