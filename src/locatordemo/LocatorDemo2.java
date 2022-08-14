package locatordemo;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo2 extends BaseTest {

    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorTestDemo() {
        //classname Locator
        List<WebElement>listIcon=driver.findElements(By.className("product_list grid row homefeatured tab-pane active"));
        int numbersOfItems=listIcon.size();
        System.out.println(numbersOfItems);

       //tagename locator
       List<WebElement>links=driver.findElements(By.tagName("li"));
       int noOfLink=links.size();
        System.out.println(noOfLink);

    }
    @After
    public void tearDown(){
        //closeBrowser();
    }
}