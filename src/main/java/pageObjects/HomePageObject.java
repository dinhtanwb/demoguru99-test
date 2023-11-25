package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.GlobalConstance;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getCurrentUrl() {
		return getcurrentURL(driver);
	}

	public void upLoadFile() {
		sendKeyToElement(driver, HomePageUI.UPLOAD_FILE_BUTTON, GlobalConstance.IMAGE);
	}

	public void clickToVerifyCheckbox() {
		waitForClickable(driver, HomePageUI.VERIFY_CHECKBOX);
		clickToElement(driver, HomePageUI.VERIFY_CHECKBOX);
		
	}

	public void clickToSubmitButton() {
		waitForClickable(driver, HomePageUI.SUBMIT_BUTTON);
		clickToElement(driver, HomePageUI.SUBMIT_BUTTON);
		
	}

	public String getEmailSuccessMessage() {
		waitForElementVisible(driver, HomePageUI.UPLOAD_FILE_SUCCESSFUL_MESSAGE);
		return getElementText(driver, HomePageUI.UPLOAD_FILE_SUCCESSFUL_MESSAGE);
	}

	public String getFileNameUploaded() {
		waitForElementVisible(driver, HomePageUI.UPLOAD_FILE_BUTTON);
		return getElementText(driver, HomePageUI.UPLOAD_FILE_BUTTON);
	}

}
