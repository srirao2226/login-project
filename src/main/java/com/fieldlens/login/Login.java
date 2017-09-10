package com.fieldlens.login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    public static void main(String[] args) {
        // Creating a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //  Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Navigate to URL
        driver.get("https://app.fieldlens.com/account/login");
        // Maximize the window.
        driver.manage().window().maximize();
        // Enter UserName
        driver.findElement(By.id("login-email")).sendKeys("srirao2226@gmail.com");
        // Enter Password
        driver.findElement(By.id("password")).sendKeys("123456");
        //Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        // Click on login button
        driver.findElement(By.xpath("//button[contains(@class, 'generic-button')]")).click();
        //Close the browser.
//        driver.close();
    }
}
