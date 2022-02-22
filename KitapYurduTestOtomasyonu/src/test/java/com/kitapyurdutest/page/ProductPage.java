package com.kitapyurdutest.page;

import com.kitapyurdutest.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        //methods.scrollWithAction(By.xpath("//*[@id=\"product-595747\"]"));
        List<WebElement> products = methods.findElements(By.cssSelector(".product-details"));
        WebElement el = products.get(7);
        methods.scrollWithAction(el);
        methods.addFavorites();
        methods.scrollWithAction(By.cssSelector(".js-ajaxCt.js-bookCt"));
        //String sonuc1 = methods.findElement(By.cssSelector(".limit")).getText();
        //Assert.assertTrue(sonuc1.contains("Göster"));
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".limit")));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".logo-text"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='mainNav']/div[1]/div/div[2]/a"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.cssSelector("#point-carousel-tab-title-952"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector("#content>div>div>div.product-filter>div>div.sort>select"),
                "Yüksek Oylama");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']"));
        methods.waitBySeconds(2);
        methods.clickRandomProduct();
        methods.waitBySeconds(2);
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".heading"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#js-cart"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.cssSelector("input[name=quantity]"),"0");
        methods.waitBySeconds(10);
        methods.click(By.cssSelector(".button.red"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-firstname-companyname"), "oğuz");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-lastname-title"), "eroglu");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-zone-id"), "İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-county-id"), "ÜMRANİYE");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-address-text"), "Esenevler Mahallesi");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-telephone"), "5397024158");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-mobile-telephone"), "5397024158");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.cssSelector("#credit-card-owner"),"Oğuzhan Eroğlu");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_1"), "4444");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_2"), "4444");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_3"), "4444");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_4"), "4444");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("credit-card-expire-date-month"), "03");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"credit-card-expire-date-year\"]"), "2030");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-security-code"), "444");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#logo>a>img"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#header-top>div>div.welcome.fl>div.menu.top.login>ul>li>a"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#header-top> div>div.welcome.fl>div.menu." +
                "top.login>ul>li>div>ul>li:nth-child(4)>a"));











    }


}
