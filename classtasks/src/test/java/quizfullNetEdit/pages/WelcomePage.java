package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage extends Page{
	
	private static final String URL = "http://quizful.net/test";
	
	private final By profileElementLocator = By.xpath("//a[@href = ' /user/dmitryulasevich ']");

	
	public WelcomePage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public EditProfileDataPage profile() throws InterruptedException{
		WebElement profileElement = getDriver().findElement(profileElementLocator);
		profileElement.click();
		Thread.sleep(2000);
		return new EditProfileDataPage(driver);
	}

}
