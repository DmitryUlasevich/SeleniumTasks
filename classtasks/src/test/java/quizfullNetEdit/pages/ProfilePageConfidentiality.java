package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePageConfidentiality extends Page{
	
	private static final String URL = "http://quizful.net/ProfileAction.settings";

	private final By personalConfidentialityElementLocator = By.xpath("//div[@id = 'profile-privacy-form']//div[@class ='title']");
	private final By confidentialityConditionElementLocator = By.xpath("//input[@value= 'closed']");
	private final By saveCgangesElementLocator = By.xpath("//input[@name = 'privacyForm.save']");
	
	public ProfilePageConfidentiality(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public SavePersonalConfidentiality savedConfidentiality() throws InterruptedException{
		WebElement personalConfidentialityElement = getDriver().findElement(personalConfidentialityElementLocator);
		personalConfidentialityElement.click();
		Thread.sleep(2000);
		WebElement confidentialityConditionElement = getDriver().findElement(confidentialityConditionElementLocator);
		confidentialityConditionElement.click();
		Thread.sleep(2000);
		WebElement saveCgangesElement = getDriver().findElement(saveCgangesElementLocator);
		saveCgangesElement.click();
		Thread.sleep(2000);
		return new SavePersonalConfidentiality(driver);
	}
}
