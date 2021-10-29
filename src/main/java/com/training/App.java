package com.training;

import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tufai\\Downloads\\chrome_driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Now closing the browser ....");
        driver.close();
    }
}
