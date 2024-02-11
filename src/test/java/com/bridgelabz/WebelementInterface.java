package com.bridgelabz;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementInterface {
    WebDriver driver = new ChromeDriver();
    @Test
    public void webElementMethod()
    {
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//*[@id='small-searchterms']"));

    }
}
