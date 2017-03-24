package quizfullNetEdit.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavePersonalData extends Page{
	
	private static final String URL = "http://quizful.net/user/dmitryulasevich";
	private final By editInfoElementLocator = By.xpath("//a[@class='btn btn-default btn-xs']");
	
	
	public SavePersonalData(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public ProfilePageNotification savedInfo() throws InterruptedException{
		WebElement editInfoElement = getDriver().findElement(editInfoElementLocator);
		editInfoElement.click();
		Thread.sleep(2000);
		return new ProfilePageNotification(driver);
	}
}
