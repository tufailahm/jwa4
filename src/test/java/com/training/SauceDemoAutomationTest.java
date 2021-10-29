package com.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoAutomationTest {
	String browserName = "chrome";

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
	public void loginTest() throws InterruptedException {
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//driver.close();
		
	}
}
