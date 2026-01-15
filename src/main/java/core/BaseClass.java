package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    protected static WebDriver driver;
    protected static Properties properties;

    static {
        try {
            FileInputStream fis =
                    new FileInputStream("src/test/resources/property.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load property file", e);
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }

    public static void initDriver() {

        String browser = getBrowser();

        if (browser == null) {
            throw new RuntimeException("Browser value is NULL in property file");
        }

        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                throw new RuntimeException("Invalid browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    public static void openBrowser() {
        driver.get(getUrl());
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
