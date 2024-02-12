package com.bridgelabz.page_object_Model;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearchPageObject {
   private static WebDriver driver;
    @Test
    public static void googleSearchPage() throws InterruptedException {
driver=new ChromeDriver();
GoogleSearchPageObject search= new GoogleSearchPageObject(driver);
driver.get("https://google.com");
search.setTextInSearchBox("A B C D");
Thread.sleep(2000);
search.setButton_search();
driver.close();
    }
}
