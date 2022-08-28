package seleniumwait;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TestExplicitWait extends Utility {
    String baseurl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void explicitlyWaitExample() {
        By signLink = By.xpath("//a[@contains(text(),'Sign In')]");
        //use explicitly wait
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(signLink));
        signIn.click();*/

        //Method from Utility
        WebElement signIn = waitUnitVisibilityOfElementLocated(signLink,20);
        signIn.click();

    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
