package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDom extends BasePage {
	private WebDriver driver;

	public void selectRowByText(String rowText) {

		System.out.println("rowText: " + rowText);

		WebElement targetElement = driver.findElement(
				By.xpath("//div[@id='siblings']//*[text()='" + rowText + "'] | //h4[text()='" + rowText + "']"));

		scrollToElement(targetElement);

		selectElement(targetElement);

	}

	public LargeAndDeepDom(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
