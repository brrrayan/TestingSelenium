package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class StorePage extends BasePage {//here i define the objects that contain the actions and clicks on pages
    private final By closeCoupons = By.cssSelector(".svgicon.svgicon-close");
    private final By mensMenuBtn = By.cssSelector("a[title='HOMBRE'] span[class='c-header2__cate']");
    private final By topsCathegory = By.cssSelector("a[aria-label='Tops']");
    private final By tShirtClick = By.cssSelector(".S-product-item__img-submain.image-fade-out[src='//img.ltwebstatic.com/images3_pi/2021/04/13/1618276646c26a001b1e2c807f1f8834a01938f8fa_thumbnail_405x552.webp']");
    private final By sizeSelection = By.cssSelector("div[aria-label='M'] span[class='inner']");
    private final By addToBagBtn = By.cssSelector("div[class='product-intro__add-btn'] button[class='she-btn-black she-btn-xl']");
    private final By bagIconBtn = By.cssSelector(".iconfont-critical.icon-gouwudai");
    private final By payBtn = By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1) > div:nth-child(1)");
    private final By payTittle = By.cssSelector("div[class='check-title she-clearfix'] h4");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    //now i have to create every method thats gonna do an action on the page using the objects that are in the beggining of this class
    public void closeCouponsClick (){
        driver.findElement(closeCoupons).click();
    }
    public void clickMensBtn (){
        driver.findElement(mensMenuBtn).click();
    }
    public void clickTopsBtn (){
        driver.findElement(topsCathegory).click();
    }
    public void clickTShirt (){
        driver.findElement(tShirtClick).click();
    }
    public StorePage selectSizeAndAddToCart(){
        //this is a way to combine 2 methods of actions that are made in the same page
        clickSizeBtn().clickAddToCartBtn();
        return this;
    }
    public StorePage clickSizeBtn(){
        driver.findElement(sizeSelection).click();
        return this;
    }
    public StorePage clickAddToCartBtn(){
        driver.findElement(addToBagBtn).click();
        return this;
    }
    public void clickBagIconBtn(){
        driver.findElement(bagIconBtn).click();
    }
    public void clickPayBtn(){
        driver.findElement(payBtn).click();
    }
    public String getPayTittle(){//this method is to get the text of the 'Order Summary' on checkout
       return driver.findElement(payTittle).getText();//needs a return because is waiting for a string
    }


}
