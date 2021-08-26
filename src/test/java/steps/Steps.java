package steps;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LargeAndDeepDom;
import pages.LoginPage;

public class Steps extends Base {

	@Before
	public void setUp() {
		System.out.println("before annotations");
		String actualTitle = driver.getTitle();
		System.out.println("Application title: " + actualTitle);
	}

	@Given("^Open Browser with URL$")
	public void open_Browser_with_URL() throws Throwable {

		System.out.println("Launch browser and navigate to url");
	}

	@When("^I enter user name$")
	public void i_enter_user_name() throws Throwable {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("tomsmith");

	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {

		LoginPage loginPage = new LoginPage(driver);
		System.out.println("enter user passsword");
		loginPage.enterUserPassword("SuperSecretPassword!");
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {

		System.out.println("click on login button");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLoginButton();
	}

	@Then("^Should display message$")
	public void should_display_message() throws Throwable {

		System.out.println("verify message");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.verifyNotificationMessage("You logged into a secure area!");

	}

	@When("^I enter user with ([^\"]*)$")
	public void i_enter_user_with(String userName) throws Throwable {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName(userName);
	}

	@When("^I enter password with ([^\"]*)$")
	public void i_enter_password_with_SuperSecretPassword(String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		System.out.println("enter user passsword");
		loginPage.enterUserPassword(password);
	}

	@Then("^Should display notification ([^\"]*)$")
	public void should_display_notification(String notificationMessage) throws Throwable {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.verifyNotificationMessage(notificationMessage);
	}

	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {

		driver.get(URL_BASE + URL_LOGIN);
	}

	@Given("^I navigate to the large page$")
	public void i_navigate_to_the_large_page() throws Throwable {

		driver.get(URL_BASE + URL_LARGE);
	}

	@When("^select and highlight row ([^\"]*)$")
	public void select_and_highlight_row_Sibling(String rowText) throws Throwable {
		LargeAndDeepDom largeAndDeepDom = new LargeAndDeepDom(driver);
		largeAndDeepDom.selectRowByText(rowText);
	}

	@After
	public void tearDown() {
		System.out.println("tear down method");
		driver.quit();
	}

}
