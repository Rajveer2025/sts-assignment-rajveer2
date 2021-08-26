package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	private WebDriver driver;

	By byTxtUserName = By.cssSelector("#username");
	By byTxtUserPassword = By.cssSelector("#password");
	By byBtnLogin = By.cssSelector("button[type=submit]");

	public void enterUserName(String userName) {
		driver.findElement(byTxtUserName).sendKeys(userName);
	}

	public void enterUserPassword(String password) {
		driver.findElement(byTxtUserPassword).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(byBtnLogin).click();
	}

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
