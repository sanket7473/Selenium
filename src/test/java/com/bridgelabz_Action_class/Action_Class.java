package com.bridgelabz_Action_class;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Action_Class {
    WebDriver driver;
    @Test
    public void act() throws InterruptedException, AWTException {
        driver= new ChromeDriver();
        Robot r = new Robot();
        driver.get("https://www.actitime.com/");
        Actions actions=new Actions(driver);
        Thread.sleep(3000);
        WebElement login=driver.findElement(By.xpath("//*[@id='my-app']/section/header/div[2]/div/div[2]/div/div[1]/a[1]"));
        //login.click();
        Thread.sleep(8000);
        actions.contextClick(login).perform();
        r.keyPress(KeyEvent.VK_RIGHT);
        r.keyRelease(KeyEvent.VK_RIGHT);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(7000);
//        driver.quit();

    }
}
