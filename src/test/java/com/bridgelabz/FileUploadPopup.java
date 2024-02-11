package com.bridgelabz;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FileUploadPopup {
    WebDriver driver;
    @Test
    public void popUp() throws IOException, InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://smallpdf.com/jpg-to-pdf");
        driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[2]/div/div/label/div/div[2]/form/label/div/div[2]/button[1]/span")).click();
        Runtime.getRuntime().exec("C:\\Users\\Sanket\\Downloads\\Fileupload.exe");
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void fileUploadUsingSendKeys() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cgi-lib.berkeley.edu/ex/perl5/fup.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("C:\\Users\\Sanket\\Desktop\\DogImage.jpg");
        Thread.sleep(5000);
        driver.close();
    }

    }
