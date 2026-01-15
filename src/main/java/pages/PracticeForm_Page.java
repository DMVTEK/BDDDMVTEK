package pages;

import core.BaseClass;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.UtilityClass.isElementDisplayed;
import static utils.UtilityClass.scrollToEleWithJS;


public class PracticeForm_Page extends BaseClass {


    public PracticeForm_Page() {
        PageFactory.initElements(driver, this);
    }

    // PracticeForms locators
    @FindBy(xpath = "//h1[text()='Practice Form']")
    private WebElement practiceFormTitle;
    @FindBy(id = "firstName")
    private WebElement firstNameTextField;
    @FindBy(id = "subjectsContainer")
    private WebElement subjectsTextField;
    @FindBy(xpath = "//div[@id='city']")
    private WebElement cityDropDown;
    @FindBy(id = "lastName")
    private WebElement lastNameTextField;
    @FindBy(xpath = "//label[@class='custom-control-label' and @for ='gender-radio-1']")
    private WebElement maleLabel;
    @FindBy(xpath = "//label[@for ='gender-radio-2']")
    private WebElement femaleLabel;
    @FindBy(xpath = "//label[@for ='gender-radio-3']")
    private WebElement otherLabel;
    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement mobileTextField;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public String bordarColor = firstNameTextField.getCssValue("border-color");
    public String expectedBordarColor = "#dc3545";

    // methods
    public void verify_practice_form_elements() {
        isElementDisplayed(practiceFormTitle);
        isElementDisplayed(firstNameTextField);
        isElementDisplayed(subjectsTextField);
        isElementDisplayed(cityDropDown);

    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }




}

