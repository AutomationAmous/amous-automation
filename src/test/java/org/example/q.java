package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://amoustms.cf/dispatch/board/tel
public class q {
    @FindBy(xpath = "//div[@title='New Order']")
    public WebElement cssNavitemCouPDiv;

    // No page elements added

    public q(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}