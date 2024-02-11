package com.bridgelabz;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
    WebDriver driver;

    @Test
    public void popUp()
    {
        driver=new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement s1= driver.findElement(By.xpath("//*[@id='jDate']/span/input"));
        s1.click();
        WebElement s2=driver.findElement(By.xpath("//*[@id='jDate']/span/div/div/div[2]/table/tbody/tr[2]/td[7]/a"));
        s2.click();
    }
}
