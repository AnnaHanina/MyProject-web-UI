package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddDeleteToBasketTest extends AbstractTest {

    @Test
    void AddDeleteToBasket() {
        AddDeleteToBasketPage addDeleteToBasketPage = new AddDeleteToBasketPage(getDriver());
        addDeleteToBasketPage
                .clickVersace()
                .clickInbasket()
                .windowOk()
                .clickCheckout()
                .clickClear();
        Assertions.assertEquals("http://www.davka.ru/index.php",getDriver().getCurrentUrl());
    }
}
