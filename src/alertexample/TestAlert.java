package alertexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestAlert extends Utility {
    String baseurl = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void alertExample(){
      clickOnElement(By.name("proceed"));
        Alert alert= driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();//alert accept
        //alert.dismiss(); // dismiss alert
        alert.sendKeys("codebuster");// send keys
    }

    @After
    public void tearDown() {
        //closeBrowser();
    }

}
