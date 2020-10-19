package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStoreLoginPOM extends Base{

        final By username = By.xpath("//*[@id=\"email\"]");

        final By password = By.xpath("/html//input[@id='passwd']");

        final By signInClick = By.xpath("//button[@id='SubmitLogin']/span");


        public MyStoreLoginPOM(WebDriver driver){
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
    }
