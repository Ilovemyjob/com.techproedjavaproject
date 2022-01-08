package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspractice2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//        Test case 5
//        1. Go to http://zero.webappsecurity.com/
        driver.get("http://zero.webappsecurity.com/");
//        2. Click Signin button
        WebElement Signin = driver.findElement(By.id("signin_button"));
        Signin.click();
//        3. Enter login ( “username”)
        WebElement Login = driver.findElement(By.id("user_login"));
        Login.sendKeys("username");
//        4. Enter password (“password”)
        WebElement Password = driver.findElement(By.id("user_password"));
        Password.sendKeys("password");

// there was a plank i class value i tryed but didnot work we must
        //delete blank and put .
//        5. Click Sign in button
        WebElement SigninBox = driver.findElement(By.xpath("//input[@type='submit']"));
        SigninBox.click();
//        6. Verify the title is “Zero – Account Summary”
        String expectedTitle="Zero – Account Summary";
        String actualTitle =driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedTitle="+expectedTitle);
            System.out.println("actualTitle="+actualTitle);
        }
//        Or
//        7. Print the message is “Your connection is not fully secure”



    }
}
