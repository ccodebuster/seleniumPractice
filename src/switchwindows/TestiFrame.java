package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestiFrame extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchIframe() {
        //switch to iframe
        driver.switchTo().frame("courses-iframe");
        //find element and send keys
        sendTextToElement(By.xpath("//input[@id='search']"),"codebuster");
        //switch back to default context
        driver.switchTo().defaultContent();
        //send keys to filed
        driver.findElement(By.id("name")).sendKeys("bahvesh");

    }

    @After
    public void tearDown() {
       // closeBrowser();
    }

}
