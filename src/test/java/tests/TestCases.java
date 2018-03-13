package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
//import pages.RegistrationPage;
import pages.TalentsPage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestCases {

    private WebDriver cd;

    @BeforeClass

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
        cd = new ChromeDriver();
        cd.manage().window().maximize();
        cd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterClass
    public void cleanUp() throws InterruptedException {
//        Thread.sleep(30000);
//        cd.quit();
    }

    @Test(description = "Login - Verify user able to login with registered email and valid password.")
    public void TestLgn(){
        LoginPage lPage = new LoginPage(cd);
        lPage.enterUserName("tupe@mailtrix.net");
        lPage.enterPassword("123456");
        TalentsPage tPage = lPage.submitDetails();
        //get header text
        String hText = tPage.getHeaderText();
        //validate the text
     //   Assert.assertTrue(hText.contains("Talents"),"Not on Talent page");

    }

    @Test(description = "Verify that after first log into the account the user is shown a pop up window indicating.")
    public void Popup() throws InterruptedException {
        TalentsPage tPage = new TalentsPage(cd);


//        cd.switchTo().frame(cd.findElement(By.className("sweet-overlay")));

//        Thread.sleep(3000);
//        Boolean boo = cd.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible")).isEnabled();
//
//        Assert.assertTrue(boo);


    }

//    @Test(description = "Verify that user able to create an account by filling out the required fields.")
//    public void testRegister() throws InterruptedException {
//        LoginPage lPage = new LoginPage(cd);
//        //click on register now
//        RegistrationPage rPage = lPage.clickOnRegisterNow();
//        //enter first name
//        rPage.enterName("Robert");
//        //enter lastname
//        Thread.sleep(3000);
//        rPage.enterLastName("terrl");
//        //enter email
//        rPage.enterEmail("rmiller16@mailinator.com");
//        //enter phone
//        rPage.enterPhone("1233334444");
//        //enter password
//        rPage.enterPassword("121212");
//        //enter confirmpaswd
//        rPage.retypePassword("121212");
//        //click country
//        rPage.CountryClick();
//        //enter country
//        rPage.CountrySendKeys("USA");
//      //  rPage.CountrySendKeys();
//       //enter address
//        rPage.enterAddress("12 Main st");
//        //enter city
//        rPage.enterCity("Miami");
//        //enter state
//        rPage.enterState("Florida");
//        //enter zip
//        rPage.enterZip("34254");
//        //checkbox
//        rPage.setCheckbox();
//        //submit
//        rPage.submitbtn();
//    }
//



}
