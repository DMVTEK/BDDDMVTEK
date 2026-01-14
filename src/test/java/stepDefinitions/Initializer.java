package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Initializer extends BaseClass {

 @Before
    public void beforeHooks(Scenario  scenario) {
     initDriver();
     openBrowser();
 }
 @After
    public void afterHooks(Scenario scenario) {
     tearDown();
 }


}
