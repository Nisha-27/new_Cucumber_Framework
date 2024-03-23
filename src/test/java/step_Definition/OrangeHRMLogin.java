package step_Definition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class OrangeHRMLogin {
	
	WebDriver driver;
	
	public void Browser_init()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void EdgeBrowser_init()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Given("user launch the Orange HRM url")
	public void user_launch_the_orange_hrm_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("user enters the username in Login page")
	public void user_enters_the_username_in_login_page() {
		driver.findElement(By.name("username")).sendKeys("Admin");

	}
	@When("user enter password in login page")
	public void user_enter_password_in_login_page() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@When("user clicks login button in login page")
	public void user_clicks_login_button_in_login_page() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Then("user should be on Orange HRM page")
	public void user_should_be_on_orange_hrm_page() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "OrangeHRM");
	}
	
	@When("user enters the username {string} in Login page")
	public void user_enters_the_username_in_login_page(String uname) {
		driver.findElement(By.name("username")).sendKeys(uname);

	}
	@When("user enter password {string} in login page")
	public void user_enter_password_in_login_page(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);

	}

	public void Beforequit()
	{
		System.out.println("print this line before closing the browser...........");
		driver.manage().deleteAllCookies();
	}
	public void quit()
	{
		driver.close();
	}
}
