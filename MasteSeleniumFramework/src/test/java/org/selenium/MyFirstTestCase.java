package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.HomePage;
import org.selenium.pom.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestCase extends BaseTest {

    @Test
    public void sheinOrderTest() throws InterruptedException {
        driver.get("https://www.shein.com/");

        HomePage homePage = new HomePage(driver);//object that instance the page where gonna test
        StorePage storePage = homePage.clickStoreMenuLink();
        storePage.closeCouponsClick();
        storePage.clickMensBtn();
        storePage.clickTopsBtn();
        storePage.clickTShirt();
        storePage.selectSizeAndAddToCart();
        storePage.clickBagIconBtn();
        Assert.assertEquals(storePage.getPayTittle(), "Resumen Del Pedido");
        storePage.clickPayBtn();


        driver.findElement(By.cssSelector(".svgicon.svgicon-close")).click();
        driver.findElement(By.cssSelector("a[title='HOMBRE'] span[class='c-header2__cate']")).click();
        driver.findElement(By.cssSelector("a[aria-label='Tops']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".S-product-item__img-submain.image-fade-out[src='//img.ltwebstatic.com/images3_pi/2021/04/13/1618276646c26a001b1e2c807f1f8834a01938f8fa_thumbnail_405x552.webp']")).click();
        driver.findElement(By.cssSelector("div[aria-label='M'] span[class='inner']")).click();
        driver.findElement(By.cssSelector("div[class='product-intro__add-btn'] button[class='she-btn-black she-btn-xl']")).click();
        driver.findElement(By.cssSelector(".iconfont-critical.icon-gouwudai")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1) > div:nth-child(1)")).click();
        Assert.assertEquals(
                driver.findElement(By.cssSelector("div[class='check-title she-clearfix'] h4")).getText(),
                "Resumen Del Pedido"
        );

    }
    @Test
    public void keepShoppingSheinOrderTest() throws InterruptedException {
        /*This is the driver executable path but i commented it because you can put it in Systems Variable instead of hard conding it.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brayan Reyes\\Documents\\selenium\\chromedriver.exe");*/

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shein.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".svgicon.svgicon-close")).click();
        driver.findElement(By.cssSelector("a[title='HOMBRE'] span[class='c-header2__cate']")).click();
        driver.findElement(By.cssSelector("a[aria-label='Tops']")).click();
        Thread.sleep(5000);//wait until 5s to run
        driver.findElement(By.cssSelector(".S-product-item__img-submain.image-fade-out[src='//img.ltwebstatic.com/images3_pi/2021/04/13/1618276646c26a001b1e2c807f1f8834a01938f8fa_thumbnail_405x552.webp']")).click();
        driver.findElement(By.cssSelector("div[aria-label='M'] span[class='inner']")).click();
        driver.findElement(By.cssSelector("div[class='product-intro__add-btn'] button[class='she-btn-black she-btn-xl']")).click();
        driver.findElement(By.cssSelector(".iconfont-critical.icon-gouwudai")).click();
        //driver.findElement(By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1) > div:nth-child(1)")).click();
        Assert.assertEquals(
                driver.findElement(By.cssSelector("div[class='check-title she-clearfix'] h4")).getText(),
                "Resumen Del Pedido"
        );
        Thread.sleep(5000);//wait until 5s to run
        //driver.findElement(By.cssSelector("S-dialog__closebtn iconfont-s icons-Close_12px")).click();
        driver.findElement(By.cssSelector(".right-link.j-continue-shopping")).click();
        Thread.sleep(10000);//wait until 10s to run
        //now where going to the log in page even though im not gonna enter.
        driver.findElement(By.cssSelector(".iconfont-critical.icon-yonghuicon-")).click();//clic on icon to log in
        driver.findElement(By.cssSelector("div[class='sign-in j-sign-in'] input[name='email']")).sendKeys("user@gmail.com");
        driver.findElement(By.cssSelector("div[class='sign-in j-sign-in'] input[name='password']")).sendKeys("user123");
        driver.findElement(By.cssSelector("div[class='j-login-con col-xs-3 col-xs-offset-2'] button:nth-child(1)")).click();
        driver.quit();
    }
}
