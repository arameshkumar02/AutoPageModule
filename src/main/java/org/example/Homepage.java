package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Homepage extends Util {
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _welcomeTitleText = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    String expectedTitleOfThePage = "Welcome to our store";
    private By _searchButton = By.xpath("//input[@value=\"Search\"]");
    private By _searchFacebook = By.xpath("//a[text()=\"Facebook\"]");



    public void verifyUserIsOnHomepage(){
        getTextFromElement(_welcomeTitleText);
        Assert.assertEquals(getTextFromElement(_welcomeTitleText),expectedTitleOfThePage, "user in on home page");
    }

    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);

    }

    public void clickOnSearchButton(){
        clickOnElement(_searchButton);
    }

    public void FacebookPageButton()
    {
        clickOnElement(_searchFacebook);
    }
}