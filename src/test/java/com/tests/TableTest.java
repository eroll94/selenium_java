package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


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

        //Number of rows
        WebElement tbl = driver.findElement(By.className("tsc_table_s13"));
        List<WebElement> tr = tbl.findElements(By.tagName("tr"));
        List<WebElement> th = tbl.findElements(By.tagName("th"));
        tr.size();
        th.size();
        System.out.println("Number of tr is: " + tr.size());
        System.out.println("Number of th is: " + th.size());




    }





}
