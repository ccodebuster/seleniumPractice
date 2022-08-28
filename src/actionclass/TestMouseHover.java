package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestMouseHover extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void mouseHoverExample(){
        Actions actions=new Actions(driver);
        WebElement computer=driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a"));
        WebElement software= driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a"));
        actions.moveToElement(computer).build().perform();
        actions.moveToElement(software).click().build().perform();
        //actions.moveToElement(computer).moveToElement(software).click().build().perform();

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
