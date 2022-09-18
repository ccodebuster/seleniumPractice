package locatordemo;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorDemo5 extends BaseTest {
    //String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo5() {
        //self----select current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'Nesco Ltd.')]/self::a")).getText();
        System.out.println(text); //

        //parent----select the parent node of current node
        String text1 = driver.findElement(By.xpath("//a[contains(text(),'Nesco Ltd.')]/parent::td")).getText();
        System.out.println(text1); //

        //child---- select all the children of current nodes
        List<WebElement>childs=driver.findElements(By.xpath("//a[contains(text(),'Nesco Ltd.')]/ancestor::tr/child::td"));
        System.out.println(childs.size());// 5
        for (WebElement a:childs){
            if(a.getText().equalsIgnoreCase("606.35")){
                System.out.println("selected");
            }
        }

        //Ancestor---select all ancestors(parent and grandparent)
        String text3=driver.findElement(By.xpath("//a[contains(text(),'Nesco Ltd.')]/ancestor::tr")).getText();
        System.out.println(text3);

        //Descendant--- select all child and grandchild of current node
        List<WebElement>descendants=driver.findElements(By.xpath("//a[contains(text(),'Nesco Ltd.')]/ancestor::tr/descendant::*"));
        System.out.println("Number of descendant :"+descendants.size());//7

        //following---select everything in documents after the closing tag if the current node
        List<WebElement>following=driver.findElements(By.xpath("//a[contains(text(),'Nesco Ltd.')]/ancestor::tr/following::tr"));
        System.out.println("Number of the following :"+following.size());//285

        //following sibling---select all sibling after current node
        List<WebElement>followingSibling=driver.findElements(By.xpath("//a[contains(text(),'Nesco Ltd.')]/ancestor::tr/following-sibling::tr"));
        System.out.println("Number of the following-siblings :"+followingSibling.size());//283

        // preceding-- select all that appear before the current node in the document
        List<WebElement> preceding=driver.findElements(By.xpath("//a[contains(text(),'Nesco Ltd.')]/ancestor::tr/preceding::tr"));
        System.out.println("Number of preceding :"+preceding.size());//10

        // preceding-sibling:  select all siblings before the current node
        List<WebElement> precedingSibling=driver.findElements(By.xpath("//a[contains(text(),'Nesco Ltd.')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println("Number of preceding-siblings : " + precedingSibling.size());//9

    }
    @Test
    public void nopdemo() throws InterruptedException {
        List<WebElement>topMenu =driver.findElements(By.xpath("//ul[@class='top-menu notmobile']"));
        for(WebElement menu:topMenu){
            if(menu.getText().equalsIgnoreCase("Electronics")){
                Thread.sleep(2000);
                menu.click();
                break;
            }
        }
    }

    @After
    public void tearDown() {
        // closeBrowser();
    }
}
