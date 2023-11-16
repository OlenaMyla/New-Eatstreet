package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ExampleTest extends TestInit{


    @Test
    public void testHomePage(){

        HomePage HomePage = new HomePage(getDriver());
        HomePage.findByXpath("//*[@id=\"partners\"]/div/div/div[2]/a");

        Assert.assertTrue(HomePage.findSearchField().isDisplayed());


    }

}
