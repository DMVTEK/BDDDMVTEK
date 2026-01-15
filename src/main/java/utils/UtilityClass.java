package utils;

import core.BaseClass;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class UtilityClass extends BaseClass {

    // Screenshot name
    public static String screenShotName() {
        Date date = new Date();
        String screenshot = date.toString().replace(":", "_").replace(" ", "_");
        return screenshot;
    }

    // this method will be called to take screenshot
    public static void takeScreenShot() {

        String location = System.getProperty("user.dir") + "\\output\\screenshots\\";
        String screenshotName = screenShotName() + ".png";

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File(location, screenshotName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // handling Static dropdown using Select class

    public static void selectByVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public static void closeAlert() {
        driver.switchTo().alert().dismiss();
    }

    public static void sendKeysToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public static void clickElementWithJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void sendKeysToElementWithJS(WebElement element, String text) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsById('" + element + "'.value='" + text + "'");
    }

    public static void scrollToEleWithJS(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String getText(WebElement element) {

        String elementText = element.getText();
        return elementText;
    }

    public static void dragAndDrop(WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
    }

    public static boolean isElementDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verifyTitle(String Expected) {

        boolean result = false;
        if (Expected.equals(driver.getTitle())) {
            result = true;
        }else {
            return  false;
        }
        return result;
    }

}
