package com.bridgelabz_iframe;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Demo {
    WebDriver driver;
    @Test
    public void iframe() throws InterruptedException {
    driver=new ChromeDriver();
    driver.get("file:///C:/Users/Sanket/Documents/Page2.html");
    //Using a index of the frame
    driver.switchTo().frame(0);
    driver.findElement(By.id("t1")).sendKeys("hello");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t2")).sendKeys("page2" );
    Thread.sleep(2000);
    driver.close();
    Thread.sleep(3000);

    //Using a id of the frame
    driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("hello");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("page2" );
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(3000);
    //using a name attribute of the frame string
    driver.switchTo().frame("n1");
        driver.findElement(By.id("t1")).sendKeys("hello");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("page2" );
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(3000);
        //using address of the frame -webelement
        WebElement f=driver.findElement(By.className("c1"));
        driver.switchTo().frame(f);
        driver.findElement(By.id("t1")).sendKeys("hello");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("page2" );
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(3000);


}}

