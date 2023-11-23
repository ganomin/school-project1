package org.selenium.academybugs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.ChromeDriverSingleton;
import org.testng.annotations.Test;

import java.util.List;

public class BasicTests {
    String page = "https://academybugs.com/";

    @Test(enabled = false)
    public void openShop() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get(page);
    }

    @Test
    public void getItems() {
        WebDriver chrome = ChromeDriverSingleton.getChromeDriver();
        chrome.get(page);

        List<WebElement> pagination = chrome.findElements(By.xpath("//a[@class='what-we-offer-pagination-link']"));

        for (WebElement e : pagination) {
            e.click();
        }
    }
}
