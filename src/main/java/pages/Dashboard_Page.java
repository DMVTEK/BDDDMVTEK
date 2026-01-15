package pages;

import core.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UtilityClass;

import static utils.UtilityClass.isElementDisplayed;
import static utils.UtilityClass.scrollToEleWithJS;


public class Dashboard_Page extends BaseClass {


    public Dashboard_Page() {
        PageFactory.initElements(driver, this);
    }

    // Dashboard locators
    @FindBy(xpath = "//div[@class='header-text' and normalize-space()='Forms']")
    private WebElement formsButton;
    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceFormButton;


    // methods
    public void ScrolToFormButton() {
        scrollToEleWithJS(formsButton);
    }

    public void clickOnFormButton() {
        formsButton.click();
    }
    public void verifyPracticeFormButton() {
        isElementDisplayed(practiceFormButton);
    }
    public void clickOnPracticeFormButton() {
        practiceFormButton.click();
    }


}

