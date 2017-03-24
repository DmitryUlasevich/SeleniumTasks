package googleJava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import googleJava.pages.Page;

public class GooglePage extends Page{
	
	private static final String URL = "http://google.ru";
	
	private final By searchLocator = By.xpath("//input[@class = 'gsfi']");
	private final By searchButtonLocator = By.xpath("//button[@class = 'sbico-c']");
	
	
	public GooglePage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public SearchResultsPage search() throws InterruptedException{
		WebElement searchElement = getDriver().findElement(searchLocator);
		searchElement.sendKeys("java");
		Thread.sleep(500);
		WebElement searchButtonElement = getDriver().findElement(searchButtonLocator);
		searchButtonElement.click();
		Thread.sleep(500);
		return new SearchResultsPage(driver);
	}
}
