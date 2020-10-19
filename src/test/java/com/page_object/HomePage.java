package com.page_object;

import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

        public static final String URL = "https://phptravels.com/demo/";

        public HomePage(WebDriver driver){
            super(driver);
        }
}
