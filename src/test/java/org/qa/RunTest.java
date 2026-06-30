package org.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RunTest {
    public void main(String[] args) {
        System.out.println("Hello World");
        WebDriver driver;
        //WebDriverManager.chromedriver().setup(); //trigger chrome version

        driver = new ChromeDriver(); // initial value for browser
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
