package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClickPage extends AbstractPage{

@FindBy (xpath = ".//*[text()='Духи']")
private WebElement perfume;

@FindBy (xpath = ".//*[text()='новинки']")
private WebElement novelties;

@FindBy (xpath = ".//*[text()='для свиданий']")
private WebElement forDates;

@FindBy (xpath = ".//*[@href= 'http://www.davka.ru/']")
private WebElement davka;



    public ClickPage(WebDriver driver) {
        super(driver);
    }

    public ClickPage clickPerfume () {
    perfume.click();
    return this;
    }

    public ClickPage clickNovelties () {
        novelties.click();
        return this;
    }

    public ClickPage clickForDates () {
        forDates.click();
        return this;
    }

    public ClickPage clickDavka () {
        davka.click();
        return  this;
    }

}
