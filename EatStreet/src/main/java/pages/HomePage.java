package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement getSearchField(){
        return getByXpath("//*[@id=\"input-food-search\"]");
    }

}
