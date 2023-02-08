package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://davka.ru/");

        WebElement webElement1 = driver.findElement(By.name("user_login_c"));
        webElement1.click();
        webElement1.sendKeys("annutiki");

        WebElement webElement2 = driver.findElement(By.name("user_passwd_c"));
        webElement2.click();
        webElement2.sendKeys("leodo602");

        WebElement webElement3 = driver.findElement(By.name("enter"));
        webElement3.click();


        WebElement webElement4 = driver.findElement(By.xpath(".//input[@name='search_subject']"));
        webElement4.click();
        webElement4.sendKeys("Versace");
        WebElement webElement5 = driver.findElement(By.xpath(".//input[@value ='Ok']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath(".//*[@href= 'http://www.davka.ru/']"));
        webElement6.click();


        WebElement webElement7 = driver.findElement(By.xpath(".//*[text()='Духи']"));
        webElement7.click();
        WebElement webElement8 = driver.findElement(By.xpath(".//*[text()='новинки']"));
        webElement8.click();
        WebElement webElement9 = driver.findElement(By.xpath(".//*[text()='для свиданий']"));
        webElement9.click();
        WebElement webElement10 = driver.findElement(By.xpath(".//*[@href= 'http://www.davka.ru/']"));
        webElement10.click();


        WebElement webElement11 = driver.findElement(By.xpath(".//*[@href = 'http://www.davka.ru/trade_house/versace.html']"));
        webElement11.click();
        WebElement webElement12 = driver.findElement(By.xpath(".//*[@href = '/index.php?cnt=266&cart_act=add&item_id=7558']"));
        webElement12.click();
        WebElement webElement13 = driver.findElement(By.xpath(".//*[@href = '/index.php?cnt=266']"));
        webElement13.click();






    }
}
