package pages;

import base.BasePage;
import base.BaseTest;
import org.testng.annotations.Test;
import tests.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openUrl("https://automationexercise.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        loginPage.navigateToLoginPage();
        loginPage.login("hphuong2605@gmail.com", "12345678");
    }
}
