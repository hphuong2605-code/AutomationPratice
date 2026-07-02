package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class ConfigReader {
    private static final Properties prop = new Properties();

    static {
        try(InputStream in = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if(in == null) {
                throw new RuntimeException("config.properties file not found");
            }
            prop.load(in);
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String get(String key){
        return prop.getProperty(key);
    }
}
