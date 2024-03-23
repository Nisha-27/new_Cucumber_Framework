package step_Definition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginPage_Step {

	WebDriver driver;
	@Given("user launches the url")
	public void launchfacebook() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com");
		
	}

	@When("user clicks the password reset link")
	public void ClickpasswordReset() {
	   
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	}

	@Then("user should be on password reset page")
	public void ValidatepageTitle() {
	    String title = driver.getTitle();
		Assert.assertEquals(title, "Forgotten Password | Can't Log In | Facebook");
	}

	@Then("user able to see the text box to enter the email address")
	public void validatetextBox() {
	   
		boolean displayed = driver.findElement(By.name("email")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
	@Given("user need to launch the given url")
	public void launchDemoUrl() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("user enters the username")
	public void EnterUserName() {
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("user enter password")
	public void EnterPassword() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("user clicks login button")
	public void ClickLogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should be on Home page")
	public void ValidateHomepageTitle() {
	    
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "OrangeHRM");
	}

}
