package com.kitapyurdutest.test;

import com.kitapyurdutest.driver.BaseTest;
import com.kitapyurdutest.page.LoginPage;
import com.kitapyurdutest.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void ProductTest(){
        LoginPage loginPage=new LoginPage();
        ProductPage productPage=new ProductPage();

        loginPage.login();
        productPage.selectProduct();

    }





}
