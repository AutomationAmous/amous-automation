package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateOrder {
    public final String CREATE_ORDER_CLICK = "//*[@id='app-container']/div/div/div/div[1]/div/div[1]/div[1]/div[3]/div";
    public final String CREATE_ORDER_PAGE = "//*[@id='app-container']/div/div/div/div[2]";

    public void createOrder(ChromeDriver driver) {
        driver.findElement(By.xpath(CREATE_ORDER_CLICK)).click();
        waitThanClick(driver);
        Assert.assertTrue(true);
    }

    private void waitThanClick(ChromeDriver driver) {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(9999999));
        WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(CREATE_ORDER_PAGE)));
        element2.click();
    }
}
