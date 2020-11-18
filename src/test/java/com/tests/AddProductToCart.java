package com.tests;

import com.page_object.AddToCartPOM;
import com.page_object.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddProductToCart {

    final By hoveredElement = By.xpath("/html//header[@id='header']/div[3]/div[@class='container']//a[@title='View my shopping cart']");


    WebDriver driver;
    HomePage homePage;
    AddToCartPOM addToCartPOM;

    @BeforeTest
    public void setUp() throws InterruptedException {

        addToCartPOM = new AddToCartPOM(driver);

        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.openUrl(HomePage.URL);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        Thread.sleep(3000);
    }


    @Test
    public void addToCart(){

        addToCartPOM.addProductToCart();
        addToCartPOM.addToCartButton();
        addToCartPOM.proceedTocheckoutBnt();
        
        Actions hover = new Actions(driver);

        WebElement ele_hover = driver.findElement(hoveredElement);

        hover.moveToElement(ele_hover);

        hover.build();

        hover.perform();
        //test
//        addToCartPOM.onHoverElement();

    }


}
