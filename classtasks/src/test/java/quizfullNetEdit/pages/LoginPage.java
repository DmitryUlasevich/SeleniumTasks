package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page{
	
	private static final String URL = "http://quizful.net/LoginAction.loginForm";
	
	private final By signInElementLocator = By.xpath("//input[@id = 'login']");
	private final By passlementLocator = By.xpath("//input[@name = 'loginForm.password']");
	private final By enterElementLocator = By.xpath("//input[@class = 'btn btn-primary']");
	
	public LoginPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public WelcomePage siginIn() throws InterruptedException{
		WebElement signInElement = getDriver().findElement(signInElementLocator);
		signInElement.sendKeys("dmitryulasevich");
		Thread.sleep(2000);
		WebElement passlement = getDriver().findElement(passlementLocator);
		passlement.sendKeys("mitrofan1");
		Thread.sleep(2000);
		WebElement enterElement = getDriver().findElement(enterElementLocator);
		enterElement.click();
		Thread.sleep(2000);
		return new WelcomePage(driver);
	}
}
