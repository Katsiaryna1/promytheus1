package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    String url = "http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/sign-in.html";

    @FindBy (name = "email")
    WebElement email;

    @FindBy (name = "password")
    WebElement password;

    @FindBy (xpath = "//button[@id='login']")
    WebElement login;

    @FindBy (partialLinkText = "Register Now")
    WebElement registernow;

    @FindBy (partialLinkText = "Forgot your password?")
    WebElement forgotyourpassword;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    //enter Username
    public void enterUserName(String s){
        email.sendKeys(s);
    }

    //enter password
    public void enterPassword(String s){
        password.sendKeys(s);
    }

    //submit
    public TalentsPage submitDetails(){
        password.submit();
        TalentsPage t = new TalentsPage (driver);
        return t;
    }

//    //click on register now
//    public RegistrationPage clickOnRegisterNow(){
//        registernow.sendKeys(Keys.ENTER);
//        RegistrationPage regPage = new RegistrationPage(driver);
//        return regPage;
//    }
//
//
//
}
