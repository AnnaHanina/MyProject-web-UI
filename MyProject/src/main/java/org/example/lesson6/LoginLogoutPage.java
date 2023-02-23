package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginLogoutPage extends AbstractPage {

@FindBy (name = "user_login_c")
private WebElement login;

@FindBy (name = "user_passwd_c")
private WebElement password;

@FindBy (name = "enter")
private WebElement submit;

@FindBy (xpath = ".//*[text()='Выход']")
private WebElement exit;



    public LoginLogoutPage(WebDriver driver) {
        super(driver);
    }


    public void LoginIn (String login, String password){

        Actions LoginIn = new Actions(getDriver());
        LoginIn
                .sendKeys(this.login, "annutiki")
                .click(this.password)
                .sendKeys("leodo602")
                .click(this.submit)
                .build()
                .perform();
    }

    public void logOut () {

        this.exit.click();
    }
}
