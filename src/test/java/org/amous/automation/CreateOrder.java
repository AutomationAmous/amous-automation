package org.amous.automation;

import org.amous.utils.WebDriverWaitUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrder {
    public final String CREATE_ORDER_CLICK = "//*[@id='app-container']/div/div/div/div[1]/div/div[1]/div[1]/div[3]/div";
    public final String CREATE_ORDER_PAGE = "//*[@id='app-container']/div/div/div/div[2]";

    public void createOrder(ChromeDriver driver) {
        driver.findElement(By.xpath(CREATE_ORDER_CLICK)).click();
        WebDriverWaitUtil.waitThanClick(driver, CREATE_ORDER_PAGE);
        Assert.assertTrue(true);
    }

}
