package com.tests;

import com.page_object.AddToCartPOM;
import com.page_object.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class AddProductToCart {

    final By hoveredElement = By.xpath("/html//header[@id='header']/div[3]/div[@class='container']//a[@title='View my shopping cart']");

    WebDriver driver;
    HomePage homePage;
    AddToCartPOM addToCartPOM;

    @BeforeTest
    public void setUp() throws InterruptedException {

        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.openUrl(HomePage.URL);
        driver.manage().window().maximize();
        addToCartPOM = new AddToCartPOM(driver); // main class which contains all POM Elements should be last init in beforeTest

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
    public void addToCart() throws InterruptedException{

          addToCartPOM.addProductToCart();
          Thread.sleep(1200);

          addToCartPOM.addToCartButton();
          Thread.sleep(1500);

          addToCartPOM.proceedTocheckoutBnt();
          Thread.sleep(4000);

          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,500)"); //Scroll vertically down by 200 pixels

          addToCartPOM.finalCheckoutClick();

    }


}
