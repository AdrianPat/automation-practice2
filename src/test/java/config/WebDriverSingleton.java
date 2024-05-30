package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void driverQuit() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }
}