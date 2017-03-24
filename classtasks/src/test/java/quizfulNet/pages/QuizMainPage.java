package quizfulNet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import quizfulNet.pages.Page;

public class QuizMainPage extends Page{
	
	private static final String URL = "http://quizful.net";
	
	private final By regElementLocator = By.xpath("//a[@href = '/LoginAction.registration']");

	
	public QuizMainPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public RegistrationPage register() throws InterruptedException{
		WebElement regElement = getDriver().findElement(regElementLocator);
		regElement.click();
		Thread.sleep(2000);
		return new RegistrationPage(driver);
	}
}
