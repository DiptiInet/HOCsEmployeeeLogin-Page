package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.core.cli.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
	static WebDriver driver;
	   
	@Given("User is on Hocs login page")
	public void user_is_on_hocs_login_page() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://hocs.pickoo.net/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"theme-navbar\"]/div/a[1]")).click();
	}
	@When("User Enter Employee Email address")
	public void user_enter_employee_email_address() {
		driver.findElement(By.name("email")).sendKeys("chennu03@gmail.com");	   
	}

	@And("User Enter Employee Password")
	public void user_enter_employee_password() {
		driver.findElement(By.name("password")).sendKeys("admin@admin.com");    
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("submit-login")).click();
	    
	}

	@Then("Use should be navigate to Dashboard Page")
	public void use_should_be_navigate_to_dashboard_page() {
		Assert.assertTrue(driver.findElements(By.xpath("//h1[@class='text-dark f-24 d-none d-sm-block']")).size()>0,"Use should be navigate to Dashboard Page");
		//driver.findElement(By.linkText("Dashboard")).isDisplayed();	    
	}

	@And("Click on Sign out button")
	public void click_on_sign_out_button() {
		driver.findElement(By.xpath("//*[@id=\"fullscreen\"]/section/div/div/div[3]/ul/li[5]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"fullscreen\"]/section/div/div/div[3]/ul/li[5]/div/ul/li[6]/a")).click();
		driver.quit();
	    
	}


}
