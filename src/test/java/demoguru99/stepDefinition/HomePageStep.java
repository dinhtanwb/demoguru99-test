package demoguru99.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOption.Hook;
import pageObjects.HomePageObject;

public class HomePageStep {
	WebDriver driver;
	HomePageObject homePageObject;
	static String pageUrl;

	public HomePageStep() {
		driver = Hook.openAndQuitBrowser();
		homePageObject = PageGeneratorManager.getHomePage(driver);
	}

	@Given("^I get login page url$")
	public void iGetLoginPageUrl() {
		pageUrl = homePageObject.getCurrentUrl();

	}

	@When("^Upload file$")
	public void uploadFile()  {
		homePageObject.upLoadFile();
	}
	
	@Then("^Verify upload file successful$")
	public void verifyUploadFileSuccessful()  {
		Assert.assertEquals(homePageObject.getFileNameUploaded(), "");
	}

	@When("^Click to \"([^\"]*)\" checkbox$")
	public void clickToCheckbox(String arg1)  {
		homePageObject.clickToVerifyCheckbox();
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String arg1)  {
		homePageObject.clickToSubmitButton();
	}

	@Then("^Verify \"([^\"]*)\"$")
	public void verify(String arg1)  {
		Assert.assertEquals(homePageObject.getEmailSuccessMessage(), "1 file\nhas been successfully uploaded.");
	}
}
