package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Init {
    public WebDriver driver;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver(); // initial value for browser
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }
    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
