package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Homepage extends Util {
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _welcomeTitleText = By.xpath("//div[@class=\"topic-block-title\"]/h2");
    String expectedTitleOfThePage = "Welcome to our store";

    public void verifyUserIsOnHomepage(){
        getTextFromElement(_welcomeTitleText);
        Assert.assertEquals(getTextFromElement(_welcomeTitleText),expectedTitleOfThePage, "user in on home page");
    }

    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);

    }
}