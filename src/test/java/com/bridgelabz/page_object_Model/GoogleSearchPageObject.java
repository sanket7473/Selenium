package com.bridgelabz.page_object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
    WebDriver driver=null;
public GoogleSearchPageObject(WebDriver driver)
{
this.driver=driver;
}
By text_search=By.name("q");
By button_search=By.name("btnK");
public void setTextInSearchBox(String text)
{
    driver.findElement(text_search).sendKeys(text);
}

public void setButton_search()
    {
        driver.findElement(text_search).sendKeys(Keys.RETURN);

    }

}
