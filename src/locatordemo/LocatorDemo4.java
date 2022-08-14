package locatordemo;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorDemo4 extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorTestDemo() {
        //xpath---//tagname[@attribute='Value']
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");
        //Xpath with or
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("Mobile");
        // xpath with and
        driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("Mobile");
        //xpath with contains()----//tagname[contains(@attribute,'value')]
        driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("Mobile");
        //xpath with text()-----//tagname[text()='value']
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        //Chained Xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();


    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
