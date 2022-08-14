package locatordemo;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorDemo1 extends BaseTest {
    String baseUrl="http://automationpractice.com/index.php";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void locatorTestDemo(){
        //ID and Name Locators
        WebElement searchBox=driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("T-shirt");

        WebElement searchButton=driver.findElement(By.name("submit_search"));
        searchButton.click();

        //partial Link Text
        driver.findElement(By.partialLinkText("Faded Short")).click();

    }


    @After
    public void tearDown(){
        //closeBrowser();
    }
}
