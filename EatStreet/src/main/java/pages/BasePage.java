package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(String link) {
        driver.get(link);
    }

    public WebElement findByXpath(String path) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Используем Duration
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
    }

    public List<WebElement> findsByXpath(String path) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Используем Duration
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
    }
}