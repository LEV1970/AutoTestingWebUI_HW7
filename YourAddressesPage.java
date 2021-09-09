package ru.geekbrains.HomeWork3;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class YourAddressesPage extends BaseView{
    public YourAddressesPage(WebDriver driver) {
        super(driver);
    }

   /* @FindBy(id = "firstname")
    public WebElement inputFirstName;

    public YourAddressesPage fillInputFirstName(String firstName) {
       inputFirstName.sendKeys(firstName);
     return this;
    }

    @FindBy(id = "lastname")
    public WebElement inputLastName;

    public YourAddressesPage fillInputLastName(String lastName) {
        inputLastName.sendKeys(lastName);
        return this;
    }*/

    @FindBy(id = "address1")
    public WebElement inputAddress1;

    @Step("Заполнить поле address1")
    public YourAddressesPage fillInputAddress1(String address1) {
        inputAddress1.sendKeys(address1);
        return this;
    }

    @FindBy(id = "city")
    public WebElement inputCity;

    @Step("Заполнить поле City")
    public YourAddressesPage fillInputCity(String city) {
        inputCity.sendKeys(city);
        return this;
    }

    @FindBy(id = "id_state")
    public WebElement selectState;

    @Step("Выбрать State")
    public YourAddressesPage selectState(String state) {
        new Select(selectState).selectByVisibleText(state);
        return this;
    }

    @FindBy(id = "postcode")
    public WebElement inputPostCode;

    @Step("Заполнить поле Postcode")
    public YourAddressesPage fillInputPostCode(String postCode) {
        inputPostCode.sendKeys(postCode);
        return this;
    }

    @FindBy(id = "phone")
    public WebElement inputPhone;

    @Step("Заполнить поле Phone")
    public YourAddressesPage fillInputPhone(String phone) {
        inputPhone.sendKeys(phone);
        return this;
    }

    @FindBy(id = "phone_mobile")
    public WebElement inputPhoneMobile;

    @Step("Заполнить поле Phone_mobile")
    public YourAddressesPage fillInputPhoneMobile(String phoneMobile) {
        inputPhoneMobile.sendKeys(phoneMobile);
        return this;
    }

   /* @FindBy(id = "alias")
    public WebElement inputAliasAddress;

    public YourAddressesPage fillInputAliasAddress(String aliasAddress) {
        inputAliasAddress.sendKeys(aliasAddress);
        return this;
    }*/

    @FindBy(id = "submitAddress")
    public WebElement buttonSubmitAddress;

    @Step("Кликнуть на кнопку SubmitAddress")
    public AddressesPage clickButtonSubmitAddress() {
        buttonSubmitAddress.click();
        return new AddressesPage(driver);
    }

    @FindBy(xpath = "//li[contains(text(), 'The alias \"My address\" has already been used. Please select another one.')]")
    public WebElement errorDuplicateAliasAddress;


}
