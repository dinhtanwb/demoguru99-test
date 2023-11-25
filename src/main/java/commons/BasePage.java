package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static BasePage getBasePageObject() {
		return new BasePage();
	}
	
	public void openPageURL(WebDriver driver, String pageURL) {
		driver.get(pageURL);
	}
	
	public WebElement getWebElement(WebDriver driver, String locatorType) {
		return driver.findElement(By.xpath(locatorType));
	}
	
	public void clickToElement(WebDriver driver, String xpathLocator) {
		getWebElement(driver, xpathLocator).click();
	}
	
	public void sendKeyToElement(WebDriver driver, String xpathLocator, String textValue) {
		WebElement element = getWebElement(driver, xpathLocator);
		element.clear();
		element.sendKeys(textValue);
	}
	
	public void checkToDefaultCheckboxRadio(WebDriver driver, String xpathLocator) {
		WebElement element = getWebElement(driver, xpathLocator);
		if (!element.isSelected()) {
			element.click();
		}
	}
	
	public void waitForClickable(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, GlobalConstance.LONG_TIME_OUT);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorType)));
	}
	
	public void waitForElementVisible(WebDriver driver, String locatorType) {
		WebDriverWait explicitWait = new WebDriverWait(driver, GlobalConstance.LONG_TIME_OUT);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorType)));
	}
	public String getcurrentURL(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	public String getElementText(WebDriver driver, String xpathLocator) {
		return getWebElement(driver, xpathLocator).getText();
	}
	public String getElementAttribute(WebDriver driver, String xpathLocator, String textValue) {
		return getWebElement(driver, xpathLocator).getAttribute(textValue);
	}

	
	
}
