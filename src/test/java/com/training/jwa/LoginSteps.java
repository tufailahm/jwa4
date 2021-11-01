package com.training.jwa;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.pages.LoginPage;

//import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	public String browser = "chrome";
	public WebDriver driver;
	private LoginPage loginPage;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("###user is on login page is called");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("###user enters username and password is called");
		driver.manage().window().maximize();
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);

	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("###clicks on login button is called");
		loginPage.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("###user is navigated to the home page is called");
		assertEquals(true, loginPage.checkLogoutDisplayed());
		driver.close();
		driver.quit();
	}
}
