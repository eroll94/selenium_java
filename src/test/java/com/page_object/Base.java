package com.page_object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public void clickElement(WebElement element){ element.click(); }

    public boolean isClickable(By locator, int timeOutSeconds){
        boolean result;
        try{
            WebDriverWait waitForLocator = new WebDriverWait(driver, timeOutSeconds);
            waitForLocator.until(ExpectedConditions.elementToBeClickable(locator));
            result = driver.findElement(locator).isDisplayed();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            result = false;
        }
        return result;
    }

    public void isDisplayed(By locator){
        try {
            WebDriverWait waitForLocator = new WebDriverWait(driver, 10);
            waitForLocator.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Exception waiting for a locator to be visible.");
        }
    }

    public void sendKeys(By locator, String keysToSend){
        driver.findElement(locator).sendKeys(keysToSend);
    }

    public Select getDropDownElement(String dropDownName){
        return new Select(driver.findElement(By.name(dropDownName)));
    }

    public void hoverElement(By locator){

        Actions hover = new Actions(driver);

        driver.findElements(locator);

        hover.build();

        hover.perform();

    }

}
