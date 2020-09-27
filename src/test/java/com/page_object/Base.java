package com.page_object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    private WebDriver driver;


    public Base (WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;

    }

}
