package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.factory.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {// this class is the base of the test, where the Driver gets set and so on
    protected WebDriver driver;//Protected to let that only those classes who inherit can use it.

    @BeforeMethod //this is a class for when the Test Start
    public void startDriver(){
        driver = new DriverManager().initializeDriver();
    }

    @AfterMethod //this is a class for when the Test finish so it can close de browser
    public void quitDriverDriver(){
        driver.quit();
    }

}
