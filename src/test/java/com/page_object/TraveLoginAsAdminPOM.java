package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TraveLoginAsAdminPOM extends Base{


        final By username = By.xpath("/html/body/div[2]/form[1]//input[@name='email']");

        final By password = By.xpath("/html/body/div[2]/form[1]//input[@name='password']");

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
    }
