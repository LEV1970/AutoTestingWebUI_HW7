package ru.geekbrains.HomeWork3;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends BaseView{
    public AddressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[@title='Add an address']")
    public WebElement addressAdd;

    @Step("Перейти на страницу YourAddresses")
    public YourAddressesPage clickAddressAdd() {
        addressAdd.click();
        return new YourAddressesPage(driver);
    }
}
