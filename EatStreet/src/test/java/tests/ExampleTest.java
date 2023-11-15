package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ExampleTest extends TestInit{


    @Test
    public void testHomePage(){

        HomePage page = new HomePage(getDriver());
        page.navigate("https://eatstreet.com/");

        Assert.assertTrue(page.getSearchField().isDisplayed());


    }
    @Test
    public void  fineByAddress() throws InterruptedException {
        HomePage page = new HomePage(getDriver());
        page.navigate("https://eatstreet.com/");
        page.inputInSerchField();

    }

}
