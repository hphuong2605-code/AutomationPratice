package tests;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By loginMenu =
            By.xpath("//a[normalize-space()='Signup / Login']");
    private final By email =
            By.xpath(" //input[@data-qa='login-email']");

    private final By password =
            By.xpath("//input[@placeholder='Password']");

    private final By loginButton =
            By.xpath("//button[normalize-space()='Login']");

    public void navigateToLoginPage() {
        click(loginMenu);
    }

    public void login(String user, String pass) {
        type(email, user);
        type(password, pass);
        click(loginButton);
    }
}
