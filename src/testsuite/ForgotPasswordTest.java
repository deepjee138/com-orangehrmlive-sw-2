package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    @Test
    //userShouldNavigateToForgotPasswordPage
    //Successfully()
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //* click on the ‘Forgot your password’ link
        driver.findElement(By.className("orangehrm-login-forgot-header")).click();
        //Verify the text ‘Reset Password’
        String expectedResult="Reset Password";
        WebElement title= driver.findElement(By.xpath("//h6"));
        String actualResult=title.getText();
        Assert.assertEquals("Not display password", expectedResult, actualResult);

    }


@After
    public void tearDown() {
        closeBrowser();
    }
}

