package com.tests;

import com.page_object.HomePage;
import com.page_object.LoginAsUserPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuccessfulyLogin {

    WebDriver driver;
    HomePage homePage;
    LoginAsUserPOM loginAsUser;


    @BeforeTest
    public void setUpTest() throws InterruptedException {

        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.openUrl(HomePage.URL);
        driver.manage().window().setSize(new Dimension(1920, 1080));

        loginAsUser = new LoginAsUserPOM(driver);
        Thread.sleep(3000);
    }
    @AfterTest
    public void tearDownTest(){
        //topMenu.clickLogOut();
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void adminLogin() throws InterruptedException{
        loginAsUser.clickOnAdminLink();
        Thread.sleep(3000);
        loginAsUser.usernameSendKeys("kamacrown94@gmail.com");
        loginAsUser.passwordSendKeys("ferari2231");
        loginAsUser.clickOnLoginBtn();
        Thread.sleep(3000);

        String verMsg = driver.findElement(By.className("info-account")).getText();
        System.out.print("Loged page text: " + verMsg);
        Assert.assertEquals(verMsg, "Welcome to your account. Here you can manage all of your personal information and orders.", "Message in not same failed");
    }

}
