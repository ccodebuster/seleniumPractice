package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestKeyBoardEvents extends Utility {
    String baseurl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void keyBoardExample() throws InterruptedException {
        Actions actions=new Actions(driver);
        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL+"a");
        Thread.sleep(3000);
        actions.sendKeys(Keys.CONTROL+"c").keyUp(Keys.CONTROL).perform();
        clickOnElement(By.id("name"));
        actions.sendKeys(Keys.CONTROL+"v").keyUp(Keys.CONTROL).perform();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
