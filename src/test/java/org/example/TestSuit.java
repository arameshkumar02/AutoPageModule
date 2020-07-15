package org.example;

import org.junit.Test;

public class TestSuit extends BaseTest{

    Homepage homepage = new Homepage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();


    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully(){

        homepage.verifyUserIsOnHomepage();
        homepage.clickOnRegisterButton();
        registerPage.userEntersRegistrationDetails();
        registerSuccessPage.UserRegisterSuccessfullyText();
    }

}
