package org.selenium.pom.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {//this class initialize the driver and save it on the method WebDriver()

    public WebDriver initializeDriver(){ //this method initializer the driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return  driver;
    }
}
