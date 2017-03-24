package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import quizfullNetEdit.pages.Page;
import quizfullNetEdit.pages.LoginPage;

public class QuizeMain extends Page{
	
	private static final String URL = "http://quizful.net";
	
	private final By regElementLocator = By.xpath("//a[@href = '/LoginAction.loginForm']");

	
	public QuizeMain(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public LoginPage authorization() throws InterruptedException{
		WebElement regElement = getDriver().findElement(regElementLocator);
		regElement.click();
		Thread.sleep(2000);
		return new LoginPage(driver);
	}
}
