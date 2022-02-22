package com.kitapyurdutest.test;


import com.kitapyurdutest.driver.BaseTest;
import com.kitapyurdutest.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
    }


}
