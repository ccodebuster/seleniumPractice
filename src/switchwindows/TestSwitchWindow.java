package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Set;

public class TestSwitchWindow extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchWindows() {
        String parentWindow=driver.getWindowHandle();
        System.out.println("Parent window : "+parentWindow);
        // click on element
        clickOnElement(By.id("openwindow"));
       Set<String> handles =driver.getWindowHandles();
        System.out.println("list of handle :"+handles);

        for(String handle:handles){
            if(!handle.equals(parentWindow)){
                driver.switchTo().window(handle);
                clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));
                driver.close();
                break;
            }
        }

        // switch back to parent window
        driver.switchTo().window(parentWindow);
        //perform action
        sendKeysToElement(By.id("name"),"codebuster");

    }

    @After
    public void tearDown() {
         //closeBrowser();
    }
}
