package gridandlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TestGridAndList extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void TestGridAndListExample() {
        mouseHoverToElement(By.xpath("//ul[contains(@class,'notmobile')]//a[text()='Computers ']"));
        mouseHoverToElementAndClick(By.xpath("//ul[contains(@class,'notmobile')]//a[text()='Software ']"));

        WebElement grid=driver.findElement(By.xpath("//a[@title='Grid' and contains(@class, 'selected')]"));
        System.out.println(grid.isDisplayed());

        clickOnElement(By.xpath("//a[@title='List']"));
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }

}
