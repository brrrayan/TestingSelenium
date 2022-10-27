package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;

public class BasePage {//this class is created to load the page to be tested
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
}
