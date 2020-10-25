package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPOM extends Base{

    public AddToCartPOM(WebDriver driver) {
        super(driver);
    }

    final By addToCart = By.xpath("//ul[@id='homefeatured']/li[1]/div[@class='product-container']//div[@class='product-image-container']/a[@title='Faded Short Sleeve T-shirts']/img[@alt='Faded Short Sleeve T-shirts']");

    final By addToCartBtn = By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']");

    final By proceedToCheckout = By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span");


}
