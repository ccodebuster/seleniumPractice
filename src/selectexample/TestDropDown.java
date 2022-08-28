package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.List;

public class TestDropDown extends Utility {
    String baseUrl="https://way2automation.com/way2auto_jquery/index.php";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExample(){
       WebElement dropDown =driver.findElement(By.name("country"));
        Select select=new Select(dropDown);
        //select.selectByValue("Andorra");// select by value
        //select.selectByVisibleText("Algeria");// select by visible text
        //select.selectByIndex(5);
        selectByVisibleTextFromDropDown(By.name("country"),"Algeria");

       List<WebElement>allOptions =select.getOptions();
        System.out.println(allOptions.size());

        for(WebElement name:allOptions){
           /* String n=name.getText();
            System.out.println(n);*/
            if(name.getText().equalsIgnoreCase("Australia")){
                name.click();
            }
        }


    }



    @After
    public void tearDown() {
        closeBrowser();
    }
}
