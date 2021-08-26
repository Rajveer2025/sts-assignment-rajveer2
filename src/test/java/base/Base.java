package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	protected WebDriver driver;
	public static final String URL_BASE = "http://the-internet.herokuapp.com/";
	public static final String URL_LOGIN = "login";
	public static final String URL_LARGE = "large";
	private String projectPath;

	public Base() {

		setProjectPath(System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver",
				getProjectPath()+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		//D:\\OneDrive - Scan-IT Pte. Ltd\\scan-it\\ats\\selenium-cucumber-bdd-ws\\selenium-cucumber-bdd-ws
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	/**
	 * @return the projectPath
	 */
	public String getProjectPath() {
		return projectPath;
	}

	/**
	 * @param projectPath
	 *            the projectPath to set
	 */
	private void setProjectPath(String projectPath) {
		System.out.println("projectPath: "+projectPath);
		this.projectPath = projectPath;
	}

}
