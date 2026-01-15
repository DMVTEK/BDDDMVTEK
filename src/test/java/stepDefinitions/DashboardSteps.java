package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Dashboard_Page;
import pages.HomePage_Page;

import static utils.UtilityClass.verifyTitle;

public class DashboardSteps extends BaseClass {

    HomePage_Page  homePage = new HomePage_Page();
    Dashboard_Page   dashboardPage = new Dashboard_Page();

    @Then("User Scroll down to locate “Forms” card")
    public void user_scroll_down_to_locate_forms_card() {
        dashboardPage.ScrolToFormButton();
    }

    @Then("Click on Forms")
    public void click_on_forms() {
        dashboardPage.clickOnFormButton();
    }

    @Then("User Verify left panel menu is displayed")
    public void user_verify_left_panel_menu_is_displayed() {
        dashboardPage.verifyPracticeFormButton();
    }

    @Then("Click on Practice Form")
    public void click_on_practice_form() {
        dashboardPage.clickOnPracticeFormButton();
    }

}
