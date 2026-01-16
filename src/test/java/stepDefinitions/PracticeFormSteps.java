package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticeForm_Page;


public class PracticeFormSteps extends BaseClass {



    @Then("Practice Form page should open correctly")
    public void practice_form_page_should_open_correctly() {

        PracticeForm_Page formPage = new PracticeForm_Page();

        String actualColor = formPage.getFirstNameBorderColor();

        // DemoQA invalid field red color
        String expectedColor = "rgb(206, 212, 218)";

        Assert.assertEquals(expectedColor, expectedColor, actualColor);
    }

    @And("User click on Submit button")
    public void User_click_on_Submit_button() {
        PracticeForm_Page practiceForm_page = new PracticeForm_Page();
        practiceForm_page.clickOnSubmitButton();
    }

    @Then("User verify Mandatory Field Validation")
    public void user_verify_mandatory_field_validation() {

        PracticeForm_Page practiceFormPage = new PracticeForm_Page();

        String actualColor = practiceFormPage.getFirstNameBorderColor();

        String expectedRed = "rgb(220, 53, 69)"; // DemoQA red

        Assert.assertEquals(actualColor, expectedRed);
    }


    @Then("User verify that the form has not submitted")
    public void user_verify_that_the_form_has_not_submitted() {
        PracticeForm_Page practiceForm_page = new PracticeForm_Page();
        practiceForm_page.verify_practice_form_elements();
    }

    @When("User provide firstname as {string} and last name as {string}")
    public void user_provide_firstname_and_last_name(String firstName, String lastName) {
        PracticeForm_Page practiceForm_page = new  PracticeForm_Page();
        practiceForm_page.enterFirstName(firstName);
        practiceForm_page.enterLastName(lastName);
    }


    @When("User provide Email as {string} and provide phone number as {string}")
    public void user_provide_email_and_phonenumber(String email, String phonenumber) {
        PracticeForm_Page practiceForm_page = new  PracticeForm_Page();
        practiceForm_page.enterEmail(email);
        practiceForm_page.enterPhoneNumber(phonenumber);
    }


    @When("User Select geneder as {string}")
    public void user_select_gender(String gender) throws InterruptedException {
        PracticeForm_Page practiceForm_page = new  PracticeForm_Page();
        practiceForm_page.selectGender(gender);
        Thread.sleep(1000);
    }
    @Then("user verify that Email address is matching with the {string}")
    public void user_verify_that_email_address_is_matching_with_email_providedBefore(String email) {
        PracticeForm_Page practiceForm_page = new  PracticeForm_Page();
        practiceForm_page.validateEmailAddressInResultpage(email);
    }


}
