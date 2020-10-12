package com.page_object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

    public WebDriver firefoxDriverConnection(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    public void openUrl(String url){
        driver.get(url);

    }

    public WebElement findElement(By locator){
        WebElement find = null;
        try{
            find = driver.findElement(locator);
        }
        catch (Exception e){
            System.out.print("Exception happened");
        }
        return find;

    }



}
