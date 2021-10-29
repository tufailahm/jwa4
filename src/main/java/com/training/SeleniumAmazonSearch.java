package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Use case : We want to whether amazon search functionality is working or not
 * @author tufail
 *
 */
public class SeleniumAmazonSearch 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tufai\\Downloads\\chrome_driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
        
        //We are selecting the search box by using XPath 
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus");
        
        //we need to click on the search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        
        Thread.sleep(3000);
        System.out.println("Now closing the browser ....");
        Thread.sleep(3000);
        driver.close();
    }
}
