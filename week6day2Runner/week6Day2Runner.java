package week6day2Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/week6day2Feature"}, 
				 glue = "week6day2Stepdefinition",
				 monochrome = true,
				 publish = true,
				 tags = "not @regression" 
				 )
public class week6Day2Runner extends week6day2Stepdefinition.BaseClass{

}
