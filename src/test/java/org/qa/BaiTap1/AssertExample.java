package org.qa.BaiTap1;

import Initial.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertExample extends Init {
    @Test
    public void UpdateProfile() {
        driver.navigate().to("https://automationexercise.com/login");
        driver.findElement(By.xpath(" //input[@data-qa='login-email']")).sendKeys("hphuong2605@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[1]")).click();
        //WebElement info = driver.findElement(By.xpath("(//h4[normalize-space()='Added!'])[1]"));
        //Assert.assertEquals(info.getText(), "Added!");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement info = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h4[normalize-space()='Added!']")
                )
        );
        System.out.println("Text = '" + info.getText() + "'");
        Assert.assertEquals(info.getText(), "Added!");
    }
}
