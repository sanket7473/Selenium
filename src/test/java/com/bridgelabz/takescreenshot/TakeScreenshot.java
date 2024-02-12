package com.bridgelabz.takescreenshot;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

        WebDriver driver;
//    private DocFile FileUtils;

        @Test
        public void takeSceenshot() throws  InterruptedException, IOException {
            driver = new ChromeDriver();
            driver.get("https://smallpdf.com/pdf-converter");
            driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[2]/div/div/label/div/div[2]/form/label/div/div[2]/button[1]/span")).click();
            Thread.sleep(3000);
            TakesScreenshot ts = (TakesScreenshot) driver;
            File file1 = ts.getScreenshotAs(OutputType.FILE);
            File file2 = new File("C:\\Users\\Sanket\\Selenium_Webdriver\\screenshot\\img1.jpg");
            FileHandler.copy(file1,file2);

            driver.navigate().refresh();

        }
    }
