package pages;

import core.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.UtilityClass.isElementDisplayed;

public class HomePage_Page extends BaseClass {

    public HomePage_Page(){
        PageFactory.initElements(driver,this);
    }
// home page locators
    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    private WebElement QADemo_logo;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsButton;



// methods

    public void verify_demo_qa_website_logo()
    {
        isElementDisplayed(QADemo_logo);
    }
    public void clickOnElement(){
        formsButton.click();
    }

}

