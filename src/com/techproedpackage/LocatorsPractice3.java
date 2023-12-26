package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        Test case 6
//        1. Go to http://zero.webappsecurity.com/
        driver.get("http://zero.webappsecurity.com/");

//        2. Click Signin button
        WebElement signinBox = driver.findElement(By.id("signin_button"));
        signinBox.click();

//        3. Enter login ( “username”)
        WebElement loginBox = driver.findElement(By.id("user_login"));
        loginBox.sendKeys("username");

//        4. Enter wrong password (“password5”)
        WebElement passwordBox = driver.findElement(By.id("user_password"));
        passwordBox.sendKeys("password5");
//        5. Click Sign in button
        WebElement signinClick = driver.findElement(By.cssSelector(".btn.btn-primary"));
        signinClick.click();
//        6. “Login and/or password are wrong.” is displayed

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
        String expectedMessage = "Login and/or password are wrong.";
        String actualMessage = errorMessage.getText();

//        if(expectedMessage.equals(actualMessage)){
//            System.out.println("Pass");
//        }else {
//            System.out.println("Fail");
//            System.out.println("expectedMessage =" + expectedMessage);
//            System.out.println("actualMessage =" + actualMessage);
//
//        }



        if(errorMessage.isDisplayed()){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");


            System.out.println("expectedMessage =" + expectedMessage);
            System.out.println("actualMessage =" + actualMessage);

            // deneme

            //deneme

        }
    }
}
