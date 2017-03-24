package tutBy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tutBy.pages.Page;

public class TutByPage extends Page{
	
	private static final String URL = "https://tut.by";
	
	private final By headerLocator = By.xpath("//a[@class = 'header_link']");
		
	public TutByPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public MainNewsPage search() throws InterruptedException{
		WebElement headerElement = getDriver().findElement(headerLocator);
		System.out.println(headerElement.getText());
		Thread.sleep(10000);
		headerElement.click();
		Thread.sleep(10000);
		return new MainNewsPage(driver);
	}

}
