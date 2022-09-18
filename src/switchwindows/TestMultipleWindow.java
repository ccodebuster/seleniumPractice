package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestMultipleWindow extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchMutipleWindows() {
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]"));
        clickOnElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]"));

        //get the parent window id
        String parentHandle = driver.getWindowHandle();

        //get all handle
        Set<String> handles = driver.getWindowHandles();
        //change set to list
        List<String> hList = new ArrayList<>(handles);
        System.out.println("------");
        System.out.println(driver.getTitle());
        System.out.println(hList);
        for(String h:hList){
            String title = driver.switchTo().window(h).getTitle();
            System.out.println(title);
        }
        if(switchToRightWindow("OrangeHRM - World's Most Popular Opensource HRIS - Home | Facebook",hList)){
            System.out.println(driver.getCurrentUrl()+ " : "+ driver.getTitle());
            //then perform action on to current window
        }
       closeAllWindows(hList,parentHandle);
        switchToParentWindow(parentHandle);
        System.out.println(driver.getCurrentUrl()+ ":"+ driver.getTitle());

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
