package com.tests;

import com.page_object.HomePage;
import com.page_object.LoginAsUserPOM;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class E2E_WholeProcessOfBuy {


    HomePage homePage;
    WebDriver driver;
    
    @BeforeTest
    public void setUpTest() throws InterruptedException {

        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.openUrl(HomePage.URL);
        driver.manage().window().maximize();

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
    public void e2eTestWholeProcess(){


    }
}
