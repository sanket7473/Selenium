package com.bridgelabz_Action_class;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public WebDriver driver;
    @Test
    public void dragandDrop() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        Thread.sleep(3000);
        String xp1="//*[@id='block-1']/h1";
        WebElement block1=driver.findElement(By.xpath(xp1));
        String xp2 = "//*[@id='block-3']/h1";
        WebElement block3=driver.findElement(By.xpath(xp2));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(block1,block3).perform();


    }
}
