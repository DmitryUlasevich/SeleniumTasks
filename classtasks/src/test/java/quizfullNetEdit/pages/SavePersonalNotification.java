package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavePersonalNotification extends Page{
	
	private static final String URL = "http://quizful.net/user/dmitryulasevich";
	private final By ediprofileElementLocator = By.xpath("//a[@class='btn btn-default btn-xs']");
	
	
	public SavePersonalNotification(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public ProfilePageConfidentiality saveNotification() throws InterruptedException{
		WebElement ediprofileElement = getDriver().findElement(ediprofileElementLocator);
		ediprofileElement.click();
		Thread.sleep(2000);
		return new ProfilePageConfidentiality(driver);
	}

}
