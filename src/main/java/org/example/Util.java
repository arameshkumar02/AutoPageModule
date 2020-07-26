package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BasePage {

    public static void waitUntilElementIsClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void sleep1(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Reusable method to click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Reusable method to type the text
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Reusable method to get Text From Element
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    //Reusable method to select from drop down by visible text
    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Reusable method to select from drop down by Index
    public static void selectFromDropDownByIndex(By by, int n) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(n);
    }
    //Reusable method to select from drop down by value
    public static void selectFromDropDownByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

  //  Alert alert = driver.switchTo().alert();

 //   public static void getTextfromAlertbox (By by)
   // {
    //   driver.switchTo().alert().getText();
    //}

}
