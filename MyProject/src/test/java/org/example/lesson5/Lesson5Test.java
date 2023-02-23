package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Lesson5Test extends AbstractTest {

    @Test
    void logInTest() {


        WebElement webElement1 = getDriver().findElement(By.name("user_login_c"));
        webElement1.click();
        webElement1.sendKeys("annutiki");

        WebElement webElement2 = getDriver().findElement(By.name("user_passwd_c"));
        webElement2.click();
        webElement2.sendKeys("leodo602");

        WebElement webElement3 = getDriver().findElement(By.name("enter"));
        webElement3.click();

        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@href = '#']")).getText().equals("Добро пожаловать"));
    }

    @Test
    void searchTest() {

        WebElement webElement4 = getDriver().findElement(By.xpath(".//input[@name='search_subject']"));
        webElement4.click();
        webElement4.sendKeys("Versace Bright Crystal");
        WebElement webElement5 = getDriver().findElement(By.xpath(".//input[@value ='Ok']"));
        webElement5.click();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@href = '/parfum/versacebc.html']")).getText().equals("Versace Bright Crystal"));
    }

    @Test
    void clickTest() {

        WebElement webElement7 = getDriver().findElement(By.xpath(".//*[text()='Духи']"));
        webElement7.click();
        WebElement webElement8 = getDriver().findElement(By.xpath(".//*[text()='новинки']"));
        webElement8.click();
        WebElement webElement9 = getDriver().findElement(By.xpath(".//*[text()='для свиданий']"));
        webElement9.click();
        WebElement webElement10 = getDriver().findElement(By.xpath(".//*[@href= 'http://www.davka.ru/']"));
        webElement10.click();
        Assertions.assertEquals("http://www.davka.ru/", getDriver().getCurrentUrl());

    }

    @Test
    void addDeleteToBasketTest() {

        WebElement webElement11 = getDriver().findElement(By.xpath(".//*[@href = 'http://www.davka.ru/trade_house/versace.html']"));
        webElement11.click();
        WebElement webElement12 = getDriver().findElement(By.xpath(".//*[@href = '/index.php?cnt=266&cart_act=add&item_id=7558']"));
        webElement12.click();
        getDriver().switchTo().alert().accept();
        WebElement webElement13 = getDriver().findElement(By.xpath(".//*[text()='Оформить заказ']"));
        webElement13.click();
        WebElement webElement14 = getDriver().findElement(By.xpath(".//input[@value ='очистить корзину']"));
        Assertions.assertEquals("http://www.davka.ru/index.php?cnt=266", getDriver().getCurrentUrl());

    }

    @Test
    void scentByNameTest () {

        WebElement webElement15 = getDriver().findElement(By.xpath(".//*[@href = 'http://www.davka.ru/index.php?cnt=276&symb=V']"));
        webElement15.click();
        WebElement webElement16 = getDriver().findElement(By.xpath(".//*[@href = 'parfum/versacebc.html']"));
        webElement16.click();
        Assertions.assertEquals("http://www.davka.ru/parfum/versacebc.html", getDriver().getCurrentUrl());
    }

    @Test
    void logOutTest () {

        WebElement webElement1 = getDriver().findElement(By.name("user_login_c"));
        webElement1.click();
        webElement1.sendKeys("annutiki");

        WebElement webElement2 = getDriver().findElement(By.name("user_passwd_c"));
        webElement2.click();
        webElement2.sendKeys("leodo602");

        WebElement webElement3 = getDriver().findElement(By.name("enter"));
        webElement3.click();

        WebElement webElement17 = getDriver().findElement(By.xpath(".//*[text()='Выход']"));
        webElement17.click();
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@href = '#']")).getText().equals("Для пользователей"));
    }

}

