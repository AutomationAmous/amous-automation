package org.amous.automation;

import org.amous.utils.WebDriverWaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// page_url = https://amoustms.cf/dispatch/board/tel
public class LoginPage {

    public static final String DISPATCH_BOARD_PAGE = "//div[@title='Dispatch Board']";
    public static final String SING_IN = "//*[@id='app-container']/div/div/div[1]/div[1]/form/button";
    public static final String LOGIN_PAGE = "//*[@id=\"username\"]";

    //Login
    public void login(ChromeDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LOGIN_PAGE)));
        element.sendKeys("NLC");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath(SING_IN)).click();
        WebDriverWaitUtil.waitThanClick(driver, DISPATCH_BOARD_PAGE);
    }

}
