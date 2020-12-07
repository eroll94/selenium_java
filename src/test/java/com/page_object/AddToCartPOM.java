package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddToCartPOM extends Base{



//    final By addToCart = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");

//    final By addToCart = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]");
    final By addToCart = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");

    final By addToCartBtn = By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']");

    final By proceedToCheckout = By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span");
    //*[@id="center_column"]/p[2]/a[1]/span

    final By finalCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");

    final By hoveredElement = By.xpath("/html//header[@id='header']/div[3]/div[@class='container']//a[@title='View my shopping cart']");



    public AddToCartPOM(WebDriver driver) {
        super(driver);
    }

    public void hoverAndFindElement(){
        hoverElement(addToCart);

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

    public void finalCheckoutClick(){
        clickElement(finalCheckout);

    }

    public void onHoverElement(){
        hoverElement(hoveredElement);

    }


}
