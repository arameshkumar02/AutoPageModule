package org.example;

import org.openqa.selenium.By;

public class RegisterSuccessPage extends Util {

    private By RegisterSuccessful = By.xpath("//div[@class=\"result\"]");

    public void UserRegisterSuccessfullyText() {

        getTextFromElement(RegisterSuccessful);
    }

}
