import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Registration {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    //#1 Verify that user able to create an account by filling out the required fields.
    @Test
    public void verify() throws InterruptedException {
        driver.get("http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/sign-in.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='btn btn-block btn-default']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='signUpFirstName']")).sendKeys("Robert1");
        driver.findElement(By.xpath("//input[@id='signUpLastName']")).sendKeys("Miller2");
        driver.findElement(By.xpath("//input[@id='signUpRegisterEmail']")).sendKeys("rmiller9@mailinator.com");
        driver.findElement(By.xpath("//input[@id='signUpPhone']")).sendKeys("3323334444");
        driver.findElement(By.xpath("//input[@id='signUpRegisterPassword']")).sendKeys("121212");
        driver.findElement(By.xpath("//input[@id='signUpRegisterRePassword']")).sendKeys("121212");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@ng-hide='$select.isEmpty()']")).click();
//        Select sDlist = new Select(driver.findElement(By.xpath("//span[@ng-hide='$select.isEmpty()']")));
//        List<WebElement> optionList =  sDlist.getOptions();
//        for(WebElement w: optionList) {
//            System.out.println("Options: " + w.getText());
//        }
//        sDlist.selectByVisibleText("USA");

//        Select select = new Select(driver.findElement(By.xpath("//i[@class='caret pull-right']")));
//        select.selectByVisibleText("Aruba");
       // driver.findElement(By.xpath("//input[@type='search']")).sendKeys("USA");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='signUpAddress']")).sendKeys("12 Fog st");
        driver.findElement(By.xpath("//input[@id='signUpCity']")).sendKeys("Austin");
        driver.findElement(By.xpath("//input[@id='signUpState']")).sendKeys("Texas");
        driver.findElement(By.xpath("//input[@id='signUpZip']")).sendKeys("43522");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='col-sm-12 text-center line-top p-v']//label[@class='checkbox-inline c-checkbox']//span[@class='fa fa-check']")).click();
        driver.findElement(By.xpath("//button[@id='createAccount']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='confirm']")).click();


    }
//#2 Verify that user able to log into the account after activating the account.


    @Test
    public void verify1() throws InterruptedException {
//        String parenthandle;
//        driver.get("https://www.mailinator.com/");
//        Thread.sleep(3000);
//        parenthandle = driver.getWindowHandle();
//        driver.findElement(By.xpath("//input[@id='inboxfield']")).sendKeys("rmiller8");
//        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[@class='all_message-min_text all_message-min_text-3']")).click();
//      //  driver.findElement(By.linkText("Please click here")).click();
//        //i could not click on link to verify email probably need to get in frame
//        int size = driver.findElements(By.xpath("/html/body/a")).size();
//        System.out.println(size);
//        ((JavascriptExecutor)driver).executeScript("window.open();");
//        ArrayList<String> tabs = new ArrayList <String>(driver.getWindowHandles());
//        System.out.println(tabs.size());
//        driver.switchTo().window(tabs.get(1));
        driver.get ("http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/sign-in.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='form-control ng-valid-maxlength ng-dirty ng-valid-parse ng-touched ng-empty ng-invalid ng-invalid-required']")).sendKeys("rmiller8@mailinator.com");
        driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")).sendKeys("121212");
        driver.findElement(By.xpath("//button[@id='login']")).click();

    }

}
