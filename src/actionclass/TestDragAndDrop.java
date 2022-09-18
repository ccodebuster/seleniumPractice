package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestDragAndDrop extends Utility {

    String baseurl = "https://jqueryui.com/resources/demos/droppable/default.html";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void dragAndDropExample() {
        Actions actions = new Actions(driver);
     WebElement draggable =driver.findElement(By.id("draggable"));
     WebElement droppable=driver.findElement(By.id("droppable"));
     actions.dragAndDrop(draggable,droppable).build().perform();
        System.out.println("Divya");

    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
