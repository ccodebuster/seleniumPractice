package seleniumwait;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class FluentWaitExample extends Utility {

    String baseurl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void fluentWait(){
        By signLink = By.xpath("//a[@contains(text(),'Sign In')]");
        //waiting for 30 seconds for an element to be present on the page
        //for its presence once every 5 seconds
        /*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement signIn = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(signLink);
            }
        });*/

        WebElement signIn =waitForElementWithFluentWait(signLink,30,5);
        signIn.click();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
