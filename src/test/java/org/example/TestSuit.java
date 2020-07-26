package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest{

    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

    @Test
    public void verifyAlertBox ()
    {
        homepage.clickOnSearchButton();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

    @Test
    public void FacebookPage ()
    {
        homepage.FacebookPageButton();

    }


    @Test
    public void verifyProductNames()
    {
        List<WebElement> productList = driver.findElements(By.xpath("//div[contains(@class,'product')]/div[2]/div/div[1]/div[2]/h2/a"));

        for (WebElement product:productList)
        {
            System.out.println(product.getText());
        }
    }
    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully(){

        homepage.verifyUserIsOnHomepage();
        homepage.clickOnRegisterButton();
        registerPage.userEntersRegistrationDetails();
        registerSuccessPage.UserRegisterSuccessfullyText();
    }

}
