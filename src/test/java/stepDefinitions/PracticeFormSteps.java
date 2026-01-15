package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Dashboard_Page;
import pages.HomePage_Page;
import pages.PracticeForm_Page;

public class PracticeFormSteps extends BaseClass {

    PracticeForm_Page practiceForm_page = new PracticeForm_Page();

    @Then("Practice Form page should open correctly")
    public void practice_form_page_should_open_correctly() {
        practiceForm_page.verify_practice_form_elements();
    }

    @And("User click on Submit button")
    public void User_click_on_Submit_button() {
        practiceForm_page.clickOnSubmitButton();
    }

    @Then("User verify Mandatory Field Validation")
    public void user_verify_mandatory_field_validation() {
        Assert.assertEquals(practiceForm_page.expectedBordarColor, practiceForm_page.bordarColor, "the color doesn't match" + "actual color is: \n" +
                "  " + practiceForm_page.bordarColor + "expectedBordarColor:   " + practiceForm_page.bordarColor);
    }

    @Then("User verify that the form has not submitted")
    public void user_verify_that_the_form_has_not_submitted() {
        practiceForm_page.verify_practice_form_elements();
    }


}
