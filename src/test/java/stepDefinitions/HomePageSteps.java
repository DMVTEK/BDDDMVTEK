package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.*;
import pages.HomePage_Page;

import static utils.UtilityClass.verifyTitle;

public class HomePageSteps extends BaseClass {

    HomePage_Page  homePage = new HomePage_Page();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        System.out.println("User is on homepage");
    }
    @Then("User verify DemoQA website logo")
    public void user_verify_demo_qa_website_logo() {

        homePage.verify_demo_qa_website_logo();

    }

    @Then("User verify page title as {string}")
    public void user_verify_page_title_as(String string) {

        verifyTitle("DEMOQA");

    }
}
