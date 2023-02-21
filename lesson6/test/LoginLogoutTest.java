package org.example.lesson6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginLogoutTest extends AbstractTest {

    @Test
    void LoginIn() {

        new LoginLogoutPage(getDriver())
                .LoginIn("annutiki", "leodo602");
        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@href = '#']")).getText().equals("Добро пожаловать"));
    }

    @AfterEach
    void logOut () {

        new LoginLogoutPage(getDriver()).logOut();

        Assertions.assertTrue(getDriver().findElement(By.xpath(".//*[@href = '#']")).getText().equals("Для пользователей"));
    }
}
