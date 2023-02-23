package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClickPageTest extends AbstractTest{

    @Test
    @DisplayName("Клик тест")

    void Click () {
        ClickPage  clickPage = new ClickPage(getDriver());
        clickPage
                .clickPerfume()
                        .clickNovelties()
                                .clickForDates()
                                        .clickDavka();
        Assertions.assertEquals("http://www.davka.ru/", getDriver().getCurrentUrl());
    }
}
