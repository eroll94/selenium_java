package com.tests;

import com.page_object.AddToCartPOM;
import com.page_object.AddressShippingPaymentPOM;
import com.page_object.HomePage;
import com.page_object.LoginAsUserPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E2E_WholeProcessOfBuy {

    WebDriver driver;
    HomePage homePage;
    LoginAsUserPOM loginAsUser;
    AddToCartPOM addToCartPOM;
    AddressShippingPaymentPOM addressShippingPaymentPOM;

    String completedOrder = "Your order on My Store is complete.";



    @BeforeTest
    public void setUpTest() throws InterruptedException {

        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.openUrl(HomePage.URL);
        driver.manage().window().maximize();

        loginAsUser = new LoginAsUserPOM(driver);
        addToCartPOM = new AddToCartPOM(driver);
        addressShippingPaymentPOM = new AddressShippingPaymentPOM(driver);

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
    public void e2eTestWholeProcess() throws InterruptedException {
                    //LOGIN PART//
        loginAsUser.clickOnAdminLink();
        Thread.sleep(1500);
        loginAsUser.usernameSendKeys("kamacrown94@gmail.com");
        loginAsUser.passwordSendKeys("ferari2231");
        loginAsUser.clickOnLoginBtn();
        Thread.sleep(2000);
        loginAsUser.backOnMainPage();
        Thread.sleep(2000);
        // FINISHED LOGIN AND BACK TO MAIN PAGE//

            //ADD PRODUCT TO CART//
        addToCartPOM.addProductToCart();
        Thread.sleep(1200);

        addToCartPOM.addToCartButton();
        Thread.sleep(1500);

        addToCartPOM.proceedTocheckoutBnt();
        Thread.sleep(4000);

        //Scroll vertically down by 500 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

        addToCartPOM.finalCheckoutClick();
        Thread.sleep(3000);
            //FINISHED ADDED TO CART//

            //BILLING ADRESSE//

        //Scroll vertically down by 500 pixels
        js.executeScript("window.scrollBy(0,500)");

        addressShippingPaymentPOM.proccedToNextPage();
        Thread.sleep(2000);

        // SHIPPING//
        addressShippingPaymentPOM.checkbox();

        addressShippingPaymentPOM.goToPayment();
        //FINISHED SHIPPING//

        //PAYMENT//
        //Scroll vertically down by 500 pixels
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2500);

        addressShippingPaymentPOM.bankWire();

        addressShippingPaymentPOM.submitPayment();

        String verCompMsg = driver.findElement(By.className("cheque-indent")).getText();

        System.out.print("This is text from paragraph: "+ verCompMsg);

        Assert.assertEquals(verCompMsg,completedOrder, "Message in not same failed");

    }
}
