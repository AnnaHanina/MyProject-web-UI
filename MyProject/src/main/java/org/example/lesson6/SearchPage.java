package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage{

    @FindBy (xpath = ".//input[@name='search_subject']")
    private WebElement input;

    @FindBy (xpath = ".//input[@value ='Ok']")
    private WebElement ok;

    @FindBy (xpath = ".//*[@href = 'http://www.davka.ru/index.php?cnt=276&symb=V']")
    private WebElement V;

    @FindBy (xpath = ".//*[@href = 'parfum/versacebc.html']")
    private WebElement versace;


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void toSearch (String value) {
        Actions ToSearch = new Actions(getDriver());
        ToSearch
                .sendKeys(this.input, "Versace Bright Crystal")
                .click(this.ok)
                .build()
                .perform();
    }

    public SearchPage clickV () {
        V.click();
        return this;
    }

    public SearchPage clickVersace () {
        versace.click();
        return this;
    }
}
