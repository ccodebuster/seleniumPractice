package locatordemo;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorDemo3 extends BaseTest {
    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorTestDemo() {
        //LinkText
        WebElement signLink = driver.findElement(By.linkText("Sign in"));
        signLink.click();

        //Tag and ID---tagename#id or #id
        WebElement userNameField = driver.findElement(By.cssSelector("#email"));
        userNameField.sendKeys("bhav12@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456");

        //tagname and class----tagname.classname or .classname

        driver.findElement(By.cssSelector("#SubmitLogin")).click();
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }
}
