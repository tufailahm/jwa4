package com.training.jwa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {

	public String browser ="chrome";
	public WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on google search page");
		driver.navigate().to("https://www.google.com");
	}

	@When("user enters a text in the search box")
	public void user_enters_a_text_in_the_search_box() throws InterruptedException {
		System.out.println("user enters a text in the search box");
		driver.findElement(By.name("q")).sendKeys("HPLaptop");
		//Thread.sleep(3000);
	}

	@And("hits enter or click search button")
	public void hits_enter_or_click_search_button() {
		System.out.println("hits enter or click search button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("user is navigated to search results");
		driver.getPageSource().contains("hp");
		//Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

}
