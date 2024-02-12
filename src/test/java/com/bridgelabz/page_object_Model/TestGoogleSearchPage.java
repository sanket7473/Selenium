package com.bridgelabz.page_object_Model;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearchPage {
    static WebDriver driver=null;
    public static void main(String [] args) throws InterruptedException {
        googleSearch();

    }

    public static void googleSearch() throws InterruptedException {
        driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        GoogleSearchPage.textbox_serach(driver).sendKeys("flowers");
        Thread.sleep(2000);
        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.close();
        System.out.println("Test Completed Successfully");

    }

}
