package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class TestInit {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver.set(new FirefoxDriver());
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod
    public void closeBrowser(){
        getDriver().quit();
    }
}
