package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {//this class is to create the homepage
    private final By storeMenuLink = By.cssSelector("a[title='HOMBRE'] span[class='c-header2__cate']");//this object define wich element of the page will let us access to it


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public StorePage clickStoreMenuLink(){//this method gets the page based un the element we had clicked, in this case a menu element
        driver.findElement(storeMenuLink).click();//when the value allocated on the storeMenuLink is clicked, then the page gets loaded (Homepage)
        return  new StorePage(driver);//this return the page and is used only if were going to stay in the same page and not to any other but we can keep defining the page object hardcoded instead.
    }
}
