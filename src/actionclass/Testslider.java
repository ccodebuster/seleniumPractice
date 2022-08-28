package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Utility;

public class Testslider extends Utility {
    String baseurl = "https://www.amazon.co.uk/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void testSliderExample() throws InterruptedException {
        driver.findElement(By.id("sp-cc-accept")).click();
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,1500)");
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }

}
