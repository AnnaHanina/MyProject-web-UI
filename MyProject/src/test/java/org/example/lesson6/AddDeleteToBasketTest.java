package org.example.lesson6;

import io.qameta.allure.Severity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddDeleteToBasketTest extends AbstractTest {

    @Test
    @DisplayName("Добавление и удаление товара из корзины")

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
