package com.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	String browserName = "edge";

	WebDriver driver;

	@BeforeEach
	public void setUp() {
		if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	@Test
	public void searchAmazon() throws InterruptedException {
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		// We are selecting the search box by using XPath
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus");

		// we need to click on the search button
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

		Thread.sleep(3000);
		System.out.println("Now closing the browser ....");
		Thread.sleep(3000);
		driver.close();
	}
}
