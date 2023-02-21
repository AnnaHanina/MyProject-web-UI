package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SearchPageTest extends AbstractTest {

    @Test
    void Search () {

        new SearchPage(getDriver())
        .toSearch("Versace Bright Crystal");
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@href = '/parfum/versacebc.html']")).getText().equals("Versace Bright Crystal"));
    }

    @Test
    void ScentByName () {

        SearchPage searchPage = new SearchPage(getDriver());
        searchPage
                .clickV()
                .clickVersace();
        Assertions.assertEquals("http://www.davka.ru/parfum/versacebc.html", getDriver().getCurrentUrl());
    }
}
