package com.bridgelabz;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup {
    WebDriver driver;

    @Test
    public void popUp() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        WebElement cl=driver.findElement(By.xpath("//*[@id='alertButton']"));
        cl.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
    }

    @Test
    public void promptPopUp() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        JavascriptExecutor j1=(JavascriptExecutor) driver;
        j1.executeScript("window.scrollBy(0,200)");
        WebElement cl=driver.findElement(By.xpath("//*[@id='promtButton']"));
        cl.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("sanket");
        alert.accept();
        Thread.sleep(2000);

    }
}
