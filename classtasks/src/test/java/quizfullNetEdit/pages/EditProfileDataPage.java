package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfileDataPage extends Page{
	
	private static final String URL = "http://quizful.net/user/dmitryulasevich";
	
	private final By editInfoElementLocator = By.xpath("//a[@href ='/ProfileAction.settings']");
	
	public EditProfileDataPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public ProfilePageData editProfile() throws InterruptedException{
		WebElement editInfoElement = getDriver().findElement(editInfoElementLocator);
		editInfoElement.click();
		Thread.sleep(2000);
		return new ProfilePageData(driver);
	}
}
