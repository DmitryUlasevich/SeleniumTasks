package quizfulNet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import quizfulNet.pages.Page;

public class RegistrationPage extends Page{
	
	private static final String URL = "http://quizful.net/LoginAction.registration";
	
	private final By loginElementLocator = By.xpath("//input[@id = 'login']");
	private final By passwordElementLocator = By.xpath("//input[@name = 'registrationForm.password']");
	private final By repeatPasswordElementLocator = By.xpath("//input[@name = 'registrationForm.repassword']");
	private final By emailElementLocator = By.xpath("//input[@name = 'registrationForm.email']");
	private final By corporateElementLocator = By.xpath("//input[@id = 'corporate']");
	private final By endRegElementLocator = By.xpath("//input[@type = 'submit']");
	
	public RegistrationPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public SuccessRegPage registerUser() throws InterruptedException{
		WebElement loginElement = getDriver().findElement(loginElementLocator);
		loginElement.sendKeys("dmitryulasevich");
		Thread.sleep(2000);
		WebElement passwordElement = getDriver().findElement(passwordElementLocator);
		passwordElement.sendKeys("mitrofan1");
		Thread.sleep(2000);
		WebElement repeatPasswordElement = getDriver().findElement(repeatPasswordElementLocator);
		repeatPasswordElement.sendKeys("mitrofan1");
		Thread.sleep(2000);
		WebElement emailElement = getDriver().findElement(emailElementLocator);
		emailElement.sendKeys("mitiok@bk.ru");
		Thread.sleep(2000);
		WebElement corporateEmailElement = getDriver().findElement(corporateElementLocator);
		corporateEmailElement.click();
		Thread.sleep(20000);
		WebElement endRegElement = getDriver().findElement(endRegElementLocator);
		endRegElement.click();
		Thread.sleep(2000);
		return new SuccessRegPage(driver);
	}

}
