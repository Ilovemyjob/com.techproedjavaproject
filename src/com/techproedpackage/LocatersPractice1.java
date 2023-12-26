package com.techproedpackage;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersPractice1 {
    public static void main(String[] args) {
//        Test case 2
//        1. Go to ebay

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
// driver object
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
//        2. enter search any text “lg g6” term
        WebElement search = driver.findElement(By.id("gh-ac"));
        search.sendKeys("lg g6");

//        3. click on search button
        WebElement enter = driver.findElement(By.id("gh-btn"));
        enter.click();
//        4. print number of results
        WebElement print = driver.findElement(By.className("srp-controls__count-heading"));

        String print1 =print.getText();
        String print2= print1.substring(0,4);
        System.out.println(print2);


    }
}
