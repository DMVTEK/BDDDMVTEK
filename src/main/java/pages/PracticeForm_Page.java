package pages;

import core.BaseClass;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.UtilityClass.*;
import static utils.UtilityClass.clickElementWithJS;


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
    @FindBy(xpath = "//h5[text()='Student Registration Form']")
    private WebElement practiceFormHeader;
    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement emailTextField;
    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement phoneNumberTextField;
    @FindBy(id = "gender-radio-1")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//input[@value='Female']")
    private WebElement femaleRadioButton;
    @FindBy(xpath = "//input[@value='Other']")
    private WebElement otherRadioButton;
    @FindBy(xpath = "(//tbody//tr//td[2])[2]")
    private WebElement emailValueResultPage;



//    private String bordarColor = firstNameTextField.getCssValue("border-color");
//    private final String expectedBorderColor = "#dc3545";

    // methods
    public void verify_practice_form_elements() {
        isElementDisplayed(practiceFormTitle);
        isElementDisplayed(firstNameTextField);
        isElementDisplayed(subjectsTextField);
        isElementDisplayed(cityDropDown);

    }

    public void clickOnSubmitButton() {
        clickElementWithJS(submitButton);
    }
    public String getFirstNameBorderColor() {
        return firstNameTextField.getCssValue("border-color");
    }

//    public String getExpectedBorderColor() {
//        return expectedBorderColor;
//    }
    public boolean isPracticeFormDisplayed() {
        return practiceFormHeader.isDisplayed();
    }
    public void enterFirstName(String firstName) {
        firstNameTextField.clear();
        firstNameTextField.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lastNameTextField.clear();
        lastNameTextField.sendKeys(lastName);
    }
    public void enterEmail(String email) {
        emailTextField.clear();
        emailTextField.sendKeys(email);
    }
    public void enterPhoneNumber(String phoneN) {
        phoneNumberTextField.clear();
        phoneNumberTextField.sendKeys(phoneN);
    }

    public void selectGender(String gender) {

        switch (gender) {
            case "Male":
                clickElementWithJS(maleRadioButton);
                break;
            case "Female":
                clickElementWithJS(femaleRadioButton);
                break;
            case "Other":
                clickElementWithJS(otherRadioButton);
                break;
            default:
                throw new IllegalArgumentException("Invalid gender");
        }

    }
    public boolean validateEmailAddressInResultpage(String expectedEmail){
        boolean isEmailValid = expectedEmail.equals(emailValueResultPage.getText());
        return isEmailValid;
    }




}

