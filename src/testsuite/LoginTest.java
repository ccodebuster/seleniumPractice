package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the ‘Login’ link
        //driver.findElement(By.linkText("Log in")).click();
        WebElement loginClick = driver.findElement(By.linkText("Log in"));
        loginClick.click();
        //Verify the text ‘Welcome, Please Sign In!’
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        String actualMess = loginButton.getText();
        //System.out.println(actualMessage);
        String expectedMessage = "Log in";
        //Assert.assertEquals(expectedMessage,actualMessage);
        Assert.assertEquals(expectedMessage, actualMess);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfullyWithValidCredentials() {


    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfullyWithInValidCredentials() {
        //click on the ‘Login’ link
       /* WebElement loginClick = driver.findElement(By.linkText("Log in"));
        loginClick.click();*/
        clickOnElement(By.linkText("Log in"));
       //Enter invalid username
       /* WebElement userNameField=driver.findElement(By.xpath("//input[@class='email']"));
        userNameField.sendKeys("dhawal@gmail.com");*/
        sendTextToElement(By.xpath("//input[@class='email']"),"dhawal@gmail.com");
        // Enter invalid password
        /*WebElement passWordField=driver.findElement(By.xpath("//input[@id='Password']"));
        passWordField.sendKeys("123456");*/
        sendTextToElement(By.xpath("//input[@id='Password']"),"123456");
        //Click on Login button
      /*  WebElement loginButton=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();*/
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        // Verify the error message ‘Login was unsuccessful.
        // Please correct the errors and try again. No customer account found’
        String actualText=getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        /*WebElement verifyText=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
       String actualText= verifyText.getText();*/
       String expectedText="Login was unsuccessful. Please correct the errors and try again.\n" +
               "No customer account found";
       //validtion
        Assert.assertEquals(expectedText,actualText);

    }

    public void VerifyMessage() {

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
