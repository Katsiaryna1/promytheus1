package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalentsPage {

    private WebDriver cd;

    @FindBy(xpath = "//h3[contains(text(),'Talents')]" )
    WebElement headerTalents;

    //verify header
    @FindBy(xpath = "/html/body/div[2]/h2")
    WebElement headerPopup;

    //select radio button
    @FindBy(xpath = "/html/body/div[2]/p/label[1]/span")
    WebElement selectBtn;

//    @FindBy


    public TalentsPage(WebDriver driver) {
        this.cd = driver;
        PageFactory.initElements(driver, this);
    }
    public String getHeaderText(){
        return headerTalents.getText();

    }

}

