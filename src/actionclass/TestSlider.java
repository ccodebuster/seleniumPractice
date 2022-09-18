package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Utility;

public class TestSlider extends Utility {
    String baseurl = "https://www.amazon.co.uk/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void testSliderExample() throws InterruptedException {
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,1500)");
       // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

    }

    @After
    public void tearDown() {
        //closeBrowser();
    }

}
