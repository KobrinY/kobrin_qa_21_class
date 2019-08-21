package com.telran.celenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {
    WebDriver driver;


    @Test
    public void setUp() throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://www.google.com");
    // driver.navigate().to();  - 2 sposob open
    driver.findElement(By.name("q")).sendKeys("java");
    Thread.sleep(5000);
    driver.quit();



    }



}
