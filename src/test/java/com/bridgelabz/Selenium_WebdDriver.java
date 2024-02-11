package com.bridgelabz;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_WebdDriver {
   public WebDriver driver = new ChromeDriver();

@Test
    public void login() throws InterruptedException {
    //enter a url
    driver.get("https://www.facebook.com/");
    //Get the title of the page
    String title=driver.getTitle();
    System.out.println(title);
    //get the source code
    String pageSource=driver.getPageSource();
    System.out.println(pageSource);

    //halt the programme for the 2 seconds
    Thread.sleep(2000);
    driver.close();
}

}

