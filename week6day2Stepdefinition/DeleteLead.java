package week6day2Stepdefinition;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DeleteLead extends BaseClass
{
	
	@When("Click on delete button")
	public void clickdelete() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	}
	@Then("MyHomePage should be displayed")
	public void verifyMyHomePage(){
	driver.findElement(By.linkText("Find Leads")).click();}
	@When ("Click on FindLeads")
	public void clickFindLeads(CharSequence leadID) 
	{
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	driver.close();
}
}

