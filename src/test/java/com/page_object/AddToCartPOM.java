package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPOM extends Base{



    final By addToCart = By.xpath("//ul[@id='homefeatured']/li[1]/div[@class='product-container']//div[@class='product-image-container']/a[@title='Faded Short Sleeve T-shirts']/img[@alt='Faded Short Sleeve T-shirts']");

    final By addToCartBtn = By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']");

    final By proceedToCheckout = By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span");

    final By hoveredElement = By.xpath("/html//header[@id='header']/div[3]/div[@class='container']//a[@title='View my shopping cart']");

    public AddToCartPOM(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(){
            clickElement(addToCart);
    }

    public void addToCartButton(){
        clickElement(addToCartBtn);
    }

    public void proceedTocheckoutBnt(){
        clickElement(proceedToCheckout);
    }

    public void onHoverElement(){
        hoverElement(hoveredElement);

    }

}
