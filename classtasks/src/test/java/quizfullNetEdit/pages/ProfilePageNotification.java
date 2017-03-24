package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePageNotification extends Page{
	
	private static final String URL = "http://quizful.net/ProfileAction.settings";
	
	private final By personalNatificationElementLocator = By.xpath("//div[@id = 'profile-notifications-form']//div[@class ='title']");
	private final By turnOffNatificationElementLocator = By.xpath("//input[@name = 'notificationsForm.notificationsEnabled']");
	private final By turnOffEmailElementLocator = By.xpath("//input[@name = 'notificationsForm.deliveryEnabled']");
	private final By saveEmailElementLocator = By.xpath("//input[@name = 'notificationsForm.save']");
	
	public ProfilePageNotification(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public SavePersonalNotification savedNotification() throws InterruptedException{
	WebElement personalNatificationElement = getDriver().findElement(personalNatificationElementLocator);
	personalNatificationElement.click();
	Thread.sleep(2000);
	WebElement turnOffNatificationElement = getDriver().findElement(turnOffNatificationElementLocator);
	turnOffNatificationElement.click();
	Thread.sleep(2000);
	WebElement turnOffEmailElement = getDriver().findElement(turnOffEmailElementLocator);
	turnOffEmailElement.click();
	Thread.sleep(2000);
	WebElement saveEmailElement = getDriver().findElement(saveEmailElementLocator);
	saveEmailElement.click();
	Thread.sleep(2000);
	return new SavePersonalNotification(driver);
	}
}
