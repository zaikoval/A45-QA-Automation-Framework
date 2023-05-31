package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }
    @FindBy(css="input[type='email']")
    private WebElement emailField;
    @FindBy(css="input[type='password']")
    private WebElement passwordField;
    @FindBy(css="button[type='submit']")
    private WebElement submitBtn;
    public LoginPage provideEmail(String email) {
      emailField.sendKeys(email);
      return this;
    }
    public LoginPage providePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
    public LoginPage clickSubmit() {
        submitBtn.click();
        return this;
    }
    public void login(){
        provideEmail("demo@class.com")
                .providePassword("te$t$tudent")
                .clickSubmit();
    }
}


