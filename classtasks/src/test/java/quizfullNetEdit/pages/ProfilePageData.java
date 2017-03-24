package quizfullNetEdit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProfilePageData extends Page{
	
	private static final String URL = "http://quizful.net/ProfileAction.settings";
	
	private final By personalDataElementLocator = By.xpath("//div[@id = 'profile-personal-form']//div[@class ='title']");
	private final By nameElementLocator = By.xpath("//input[@name = 'personalForm.name']");
	private final By surnameElementLocator = By.xpath("//input[@name = 'personalForm.surname']");
	private final By yearElementLocator = By.xpath("//input[@name = 'personalForm.birthyear']");
	private final By siteElementLocator = By.xpath("//input[@name = 'personalForm.site']");
	private final By companyElementLocator = By.xpath("//input[@name = 'personalForm.company']");
	private final By countryElementLocator = By.xpath("//select[@name = 'personalForm.countryId']");
	private final By cityElementLocator = By.xpath("//select[@name = 'personalForm.cityId']");
	private final By timeElementLocator = By.xpath("//select[@name = 'personalForm.zone']");
	private final By infoElementLocator = By.xpath("//textarea[@name = 'personalForm.about']");
	private final By saveDataElementLocator = By.xpath("//input[@name = 'personalForm.save']");
	
	
	public ProfilePageData(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public SavePersonalData saveData() throws InterruptedException{
		WebElement personalDataElement = getDriver().findElement(personalDataElementLocator);
		personalDataElement.click();
		Thread.sleep(2000);
		WebElement nameElement = getDriver().findElement(nameElementLocator);
		nameElement.sendKeys("Dmitry");
		Thread.sleep(2000);
		WebElement surnameElement = getDriver().findElement(surnameElementLocator);
		surnameElement.sendKeys("Ulasevich");
		Thread.sleep(2000);
		WebElement yearElement = getDriver().findElement(yearElementLocator);
		yearElement.sendKeys("1991");
		Thread.sleep(2000);
		WebElement siteElement = getDriver().findElement(siteElementLocator);
		siteElement.sendKeys("tut.by");
		Thread.sleep(2000);
		WebElement companyElement = getDriver().findElement(companyElementLocator);
		companyElement.sendKeys("Company");
		Thread.sleep(2000);
		Select countryElement = new Select(getDriver().findElement(countryElementLocator));
		countryElement.selectByVisibleText("Israel");
		Thread.sleep(2000);
		Select cityElement = new Select(getDriver().findElement(cityElementLocator));
		cityElement.selectByVisibleText("Bat-Yam");
		Thread.sleep(2000);
		Select timeElement = new Select(getDriver().findElement(timeElementLocator));
		timeElement.selectByValue("Europe/Oslo");
		Thread.sleep(2000);
		WebElement infoElement = getDriver().findElement(infoElementLocator);
		infoElement.sendKeys("I'm Dmitry!");
		Thread.sleep(2000);
		WebElement saveDataElement = getDriver().findElement(saveDataElementLocator);
		saveDataElement.click();
		Thread.sleep(2000);
		return new SavePersonalData(driver);
	}
}
