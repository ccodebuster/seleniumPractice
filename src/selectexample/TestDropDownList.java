package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TestDropDownList extends Utility {

    String baseUrl = "https://www.hdfcbank.com/?__cf_chl_jschl_tk__=QsTJG3tVzXOmxUH0XTFJk9Z_pmLgE1W9q0A0CovpMhg-1637417525-0-gaNycGzNDRE";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownListExample() {
        List<WebElement> productList = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        for (WebElement product : productList) {
            if (product.getText().equalsIgnoreCase("FASTag")) {
                product.click();
            }
        }
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
