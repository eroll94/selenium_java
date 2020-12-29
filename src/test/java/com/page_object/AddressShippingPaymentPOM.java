package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressShippingPaymentPOM extends Base {

    final By proccedAddrese = By.name("processAddress");

    final By checkBoxShiping = By.id("cgv");

    final By procceedPayment = By.name("processCarrier");

    final By payByBankWire = By.className("bankwire");

    final By submitPayment = By.xpath("//p[@id='cart_navigation']//span");

    public AddressShippingPaymentPOM(WebDriver driver){
        super(driver);
    }

    public void proccedToNextPage(){
        clickElement(proccedAddrese);
    }

    public void checkbox(){
        clickElement(checkBoxShiping);
    }

    public void goToPayment(){
        clickElement(procceedPayment);
    }

    public void bankWire(){
        clickElement(payByBankWire);

    }

    public void submitPayment(){
        clickElement(submitPayment);

    }


}
