package ru.geekbrains.HomeWork3;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AuthPage extends BaseView {
    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    public WebElement loginSignIn;

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "passwd")
    public WebElement inputPasswd;


    @FindBy(id = "SubmitLogin")
    public WebElement loginButton;

    @Step("Кликнуть в верхнем меню SignIn")
    public AuthPage clickLoginSignIn(){
        loginSignIn.click();
        return this;
    }

    @Step("Ввести email")
    public AuthPage fillInputEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }

    @Step("Ввести пароль")
    public AuthPage fillInputPasswd(String passwd) {
        inputPasswd.sendKeys(passwd);
        return this;
    }

    @Step("Кликнуть на кнопку SignIn")
    public AccountPage clickLoginButton() {
        loginButton.click();
        return new AccountPage(driver);
    }

    public AuthPage(WebDriver driver) {
        super(driver);
    }
}

