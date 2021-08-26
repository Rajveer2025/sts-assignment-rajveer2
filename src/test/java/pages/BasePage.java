package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage {
	private WebDriver driver;

	public void verifyNotificationMessage(String expectedNotificationMessage) {
		boolean hasNotificationDisplayed = driver
				.findElement(By.xpath("//*[@id='flash' and contains(.,'" + expectedNotificationMessage + "')]"))
				.isDisplayed();

		Assert.assertTrue(hasNotificationDisplayed, "verify notification message exist " + expectedNotificationMessage);

	}

	protected void scrollToElement(WebElement targetElement) {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", targetElement);

	}

	protected void selectElement(WebElement targetElement) {
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);

		javascriptExecutor.executeScript(
				"arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", targetElement);
		localSleep(2000);

	}

	protected void localSleep(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

}
