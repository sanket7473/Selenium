package com.bridgelabz_Action_class;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
WebDriver driver;
@Test
    public void droDownMenu() throws InterruptedException {
    driver=new ChromeDriver();
    driver.get("https://www.actimind.com/");
    Thread.sleep(2000);
    String xp="/html/body/header/div[1]/img";
    WebElement menu=driver.findElement(By.xpath(xp));
    menu.click();
    Actions actions=new Actions(driver);
    actions.moveToElement(menu).perform();
    Thread.sleep(2000);
    WebElement submenu=driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div[2]/a"));
    submenu.click();

}
}
