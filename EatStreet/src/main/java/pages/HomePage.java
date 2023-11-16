package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement findSearchField(){
        return findByXpath("//*[@id=\"input-food-search\"]");

    }

    public WebElement btnGetFed() {
        return getByXpath("//a[@id='find-restaurants']");
    }

    public void inputInSerchField() throws InterruptedException {
        getSearchField().sendKeys("Медісон, Вісконсин, Сполучені Штати Америки");
        btnGetFed().click();
        Thread.sleep(5000);

    }
}
