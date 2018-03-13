//package pages;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import sun.jvm.hotspot.debugger.Page;
//
//public class RegistrationPage {
//
//    private WebDriver driver;
//
//    @FindBy(name ="firstName")
//    WebElement firstname;
//
//    @FindBy(name ="lastName" )
//    WebElement lastName;
//
//    @FindBy(name = "email")
//    WebElement email;
//
//    @FindBy(name = "phone")
//    WebElement phone;
//
//    @FindBy(name = "password")
//    WebElement password;
//
//    @FindBy(name ="confirmPassword")
//    WebElement confirmpswd;
//
//   @FindBy(xpath = "//*[@id=\"signUpCountry\"]/span/span[2]")
//    WebElement countryClick;
//
//   @FindBy(xpath = "//*[@id=\"registerForm\"]/div[2]/div[1]/div[2]/div[1]/div/div/input[1]")
//   WebElement countrySendKs;
//
//    @FindBy(name ="address")
//    WebElement address;
//
//    @FindBy (name = "city")
//    WebElement city;
//
//    @FindBy(name = "state")
//    WebElement state;
//
//    @FindBy(name = "zip")
//    WebElement zip;
//
//    //I have read and agree checkbox
//    @FindBy(xpath = "//div[@class='col-sm-12 text-center line-top p-v']//label[@class='checkbox-inline c-checkbox']//span[@class='fa fa-check']")
//    WebElement checkbox;
//
//    //submit
//    @FindBy(xpath = "//button[@id='createAccount']")
//    WebElement createbutton;
//
//
//
//    public RegistrationPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//
//    }
//
//    //enter fname
//    public void enterName(String s) {
//        firstname.sendKeys(s);
//    }
//
//    //enter lastName
//    public void enterLastName(String s) {
//        lastName.sendKeys(s);
//
//    }
//
//    //enter email
//    public  void enterEmail(String s) {
//        email.sendKeys(s);
//    }
//
//    //enter phone
//    public void enterPhone(String s) {
//        phone.sendKeys(s);
//    }
//
//    //enter password
//    public void enterPassword(String s) {
//        password.sendKeys(s);
//    }
//
//    //retype password
//    public void retypePassword(String s) {
//        confirmpswd.sendKeys(s);
//    }
//    //click country field to enter keys
//   public void CountryClick() {
//       countryClick.click();
//    }
//    //enter country name
//    public void CountrySendKeys(String s){
//        countrySendKs.sendKeys(s);
//        countrySendKs.submit();
//    }
//
//    //enter address
//    public void enterAddress(String s) {
//        address.sendKeys(s);
//    }
//
//    //enter city
//    public void enterCity(String s) {
//        city.sendKeys(s);
//    }
//
//    //enter state
//    public void enterState(String s) {
//        state.sendKeys(s);
//    }
//    //enter zip code
//    public void enterZip(String s) {
//        zip.sendKeys(s);
//    }
//    //I have read and agree checkbox
//    public void setCheckbox() {
//        checkbox.click();
//    }
//    //submit
//    public void submitbtn() {
//        createbutton.click();
//
//    }
//}
