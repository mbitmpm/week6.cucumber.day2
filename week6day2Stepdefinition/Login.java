package week6day2Stepdefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import io.cucumber.java.en.But;
public class Login extends BaseClass
{
	

	@Given("Enter the username as {string}") 
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);

	}
	
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);

	}
	
	@But("Error message should be displayed")
	public void verifyErroeMessage() {
		boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed(); // true / false
		Assert.assertTrue(displayed);
	}
	
		

}