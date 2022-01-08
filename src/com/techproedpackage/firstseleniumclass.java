package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        Test Case  1
//        2. Go to website https://google.com
         driver.get("https://google.com");
//
//        3. Save the title in a string variable
            String expectedGoogleTile=driver.getTitle();
//        4. Navigate to https://etsy.com
            driver.get("https://etsy.com");
//        5. Save the title in a string variable
            String expectedEtsyTitle= driver.getTitle();
//        6. Navigate back to previous page
            driver.navigate().back();
//        7. Verify that title is same is in step 3
            String actualGoogleTitle = driver.getTitle();
            if (expectedGoogleTile.equals(actualGoogleTitle)){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
                System.out.println("expectedGoogleTile="+ expectedGoogleTile);
                System.out.println("actualGoogleTitle="+ actualGoogleTitle);
            }


//        8. Navigate forward to previous page
        driver.navigate().forward();
//        9. Verify that title is same is in step 5
            String actualEtsyTitle = driver.getTitle() ;
        if (expectedEtsyTitle.equals(actualEtsyTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedEtsyTile="+ expectedEtsyTitle);
            System.out.println("actualEtsyTitle="+ actualEtsyTitle);
        }


//        10. quite from the browser
        driver.close();


    }
}
