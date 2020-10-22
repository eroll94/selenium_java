package com.tests;

import com.page_object.HomePage;
import com.page_object.TraveLoginAsAdminPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuccessfulyLogin {

    final static String USER = "admin@phptravels.com";
    final static String PW = "demoadmin";

    WebDriver driver;
    HomePage homePage;
    TraveLoginAsAdminPOM traveLoginAsAdminPOM;


    @BeforeTest
    public void setUpTest() throws InterruptedException {

        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.openUrl(HomePage.URL);
        driver.manage().window().setSize(new Dimension(1920, 1080));

        traveLoginAsAdminPOM = new TraveLoginAsAdminPOM(driver);
        traveLoginAsAdminPOM.clickOnAdminLink();
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
        Thread.sleep(3000);
        traveLoginAsAdminPOM.usernameSendKeys("admin@phptravels.com");
        traveLoginAsAdminPOM.passwordSendKeys("demoadmin");
        traveLoginAsAdminPOM.clickOnLoginBtn();

        String verMsg = driver.findElement(By.xpath("//*[@id=\"mainHeader\"]/strong")).getText();
        Assert.assertEquals(verMsg, "Admin", "Message is not same - failed!");

        //test
    }

}
