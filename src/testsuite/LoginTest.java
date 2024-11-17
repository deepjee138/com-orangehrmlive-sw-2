package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on the ‘Login’ button
        driver.findElement(By.className("oxd-button")).click();
        //Verify the ‘Dashboard’ text is displayed
        String expectedResult="Dashboard";
        WebElement text=driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
        String actualResult=text.getText();
        Assert.assertEquals("Dashboard’ text is not displayed",expectedResult,actualResult);

    }
    @After
    public void tearDown(){
         closeBrowser();
    }

}