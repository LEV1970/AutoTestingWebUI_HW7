package ru.geekbrains.HomeWork3;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends BaseView{
    public AccountPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//a[@title='Addresses']")
    public WebElement buttonMyAddresses;

    @Step("Перейти на страницу MyAddresses")
    public AddressesPage clickButtonMyAddresses(){
        buttonMyAddresses.click();
        return new AddressesPage(driver);
    }
}
