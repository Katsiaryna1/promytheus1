import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // # 1 Login - Verify user able to login with registered email and valid password.
    @Test
    public void verify() throws InterruptedException {
        driver.get("http://ec2-52-53-181-39.us-west-1.compute.amazonaws.com/sign-in.html");
        driver.findElement(By.xpath("/html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[1]/input")).sendKeys("rmiller8@mailinator.com");

    }
}