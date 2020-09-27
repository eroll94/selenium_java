package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TableTest {


    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void cleanUp(){
        driver.quit();
    }

    @Test
    public void tableTest() throws InterruptedException{

        //Get to wanted web Addresse and manage to fullscreen
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //get all data from table
        String tabela =  driver.findElement(By.className("tsc_table_s13")).getText();
        System.out.println("Read all data from table: \n" + tabela);




    }





}
