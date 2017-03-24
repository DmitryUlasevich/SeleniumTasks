package mailRu.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends Page{
	
	private static final String URL = "http://mail.ru";
	
	private final By emailElementLocator = By.xpath("//input[@id = 'mailbox__login']");
	private final By passElementLocator = By.xpath("//input[@id = 'mailbox__password']");
	private final By signInElementLocator = By.xpath("//input[@id = 'mailbox__auth__button']");
	
	public MainPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public WriteLetterPage signIn() throws InterruptedException{
		WebElement emailElement = getDriver().findElement(emailElementLocator);
		emailElement.sendKeys("mitiok@bk.ru");
		Thread.sleep(500);
		WebElement passElement = getDriver().findElement(passElementLocator);
		passElement.sendKeys("lvbnhbq");
		Thread.sleep(500);
		WebElement signInElement = getDriver().findElement(signInElementLocator);
		signInElement.click();
		Thread.sleep(4000);
		return new WriteLetterPage(driver);
	}
}
