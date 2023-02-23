package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddDeleteToBasketPage extends AbstractPage{

@FindBy (xpath = ".//*[@href = 'http://www.davka.ru/trade_house/versace.html']")
private WebElement versace;

@FindBy (xpath = ".//*[@href = '/index.php?cnt=266&cart_act=add&item_id=7558']")
private WebElement inbasket;

@FindBy (xpath = ".//*[text()='Оформить заказ']")
private WebElement checkout;

@FindBy (xpath = ".//input[@value ='очистить корзину']")
private WebElement clear;


    public AddDeleteToBasketPage(WebDriver driver) {
        super(driver);
    }

    public AddDeleteToBasketPage clickVersace () {
        versace.click();
        return this;
    }

    public AddDeleteToBasketPage clickInbasket () {
        inbasket.click();
        return this;
    }

    public AddDeleteToBasketPage windowOk () {

        getDriver().switchTo().alert().accept();
        return this;
    }

    public AddDeleteToBasketPage clickCheckout () {
        checkout.click();
        return this;
    }

    public AddDeleteToBasketPage clickClear () {
        clear.click();
        return this;
    }
}
