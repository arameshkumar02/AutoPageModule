package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Util {
    private By _selectGender = By.xpath("//label[@for=\"gender-male\"]");
    private  By _firstName = By.xpath("//input[@id=\"FirstName\"]");
    private  By _surname = By.xpath("//input[@id=\"LastName\"]");
    private By _dayOfBirth = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _MonthOfBirth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _yearOfBirth = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _emailField = By.xpath("//input[@id=\"Email\"]");
    private By _companyName = By.id("Company");
    private By _newsLetter = By.id("Newsletter");
    private By _password =By.id("Password");
    private By _confirmPassword =By.id("ConfirmPassword");
    private By _registerSubmitButton = By.id("register-button");


    public void userEntersRegistrationDetails(){
      clickOnElement(_selectGender);
      typeText(_firstName,"Avi");
      typeText(_surname,"R");
      selectFromDropDownByVisibleText(_dayOfBirth,"2");
      selectFromDropDownByValue(_MonthOfBirth,"3");
      selectFromDropDownByValue(_yearOfBirth,"1998");
      typeText(_emailField,"arameshkumar02+23@gmail.com");
      typeText(_companyName,"xyz");
      clickOnElement(_newsLetter);
      typeText(_password,"Test143");
      typeText(_confirmPassword,"Test143");
      clickOnElement(_registerSubmitButton);
    }

}
