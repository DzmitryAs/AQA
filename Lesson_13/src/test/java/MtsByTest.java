/*
Необходимо написать автотесты для сайта mts.by. Суть тестов заключается в проверке блока «Онлайн пополнение без комиссии»:
Проверить название указанного блока;Проверить наличие логотипов платёжных систем;Проверить работу ссылки «Подробнее о
сервисе»;Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MtsByTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void onlineRechargeTest() {
        driver.get("https://www.mts.by");
        WebElement rechargeBlock = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        String blockTitle = rechargeBlock.getText();
        Assert.assertTrue(blockTitle.contains("Онлайн пополнение\n" +
                "без комиссии"));
    }

    @Test(dependsOnMethods = {"onlineRechargeTest"})
    public void logosIsDisplayedTest() {
        WebElement logos = driver.findElement(By.className("pay__partners"));
        Assert.assertTrue(logos.isDisplayed());
    }

    @Test(dependsOnMethods = {"onlineRechargeTest"})
    public void linkTest() {
        String firstTitle = driver.getTitle();

        WebElement link = driver.findElement(By.linkText ("Подробнее о сервисе"));
        wait.until(ExpectedConditions.elementToBeClickable(link));
        link.click();

        String secondTitle = driver.getTitle();
        Assert.assertNotEquals(firstTitle,secondTitle);
        driver.navigate().back();
    }

    @Test(dependsOnMethods = {"logosIsDisplayedTest","linkTest"})
    public void fillDataAndClickContinueButtonTest() {
        WebElement phoneNumberTextBox = driver.findElement(By.id("connection-phone"));
        phoneNumberTextBox.click();
        phoneNumberTextBox.sendKeys("(29)777-77-77");

        WebElement priceTextBox = driver.findElement(By.id("connection-sum"));
        priceTextBox.click();
        priceTextBox.sendKeys("10");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        button.click();
    }

    @AfterClass
    public void finish() {
        driver.quit();
    }
}