package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmousTest {

    public static ChromeDriver driver;

    @Test
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://amoustms.cf/login");
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver);
        Assert.assertTrue(true);
        new CreateOrder().createOrder(driver);
    }

}
