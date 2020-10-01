package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class TableTest {


    private WebDriver driver;
    String khalifaHeight;

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

        //count how many cells has 6 row

        int col6test = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tfoot/tr")).size();
        String col6test2 = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tfoot/tr")).getText();
        System.out.print("Num of cells is tr: " + col6test + "\n");
        System.out.print("Text of cells is: : " + col6test2 + "\n");

        if (col6test == 1){
            System.out.print("It has only one row \n");
        }
        else {
            System.out.print("Nah, it have more than one row \n");
        }

        // Verify that Burj Khalifa has a height of 829m
        khalifaHeight = "829m";

        String burj = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr[1]/td[3]")).getText();
        System.out.print("Height of burj khalifa is: " + burj);
        Assert.assertEquals(burj, khalifaHeight,"Height is not match!");


    }





}
