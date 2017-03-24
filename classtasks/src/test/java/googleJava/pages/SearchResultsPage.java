package googleJava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import googleJava.pages.Page;

public class SearchResultsPage extends Page{
	
	private static final String URL = "https://www.google.by/#q=java&*";
	
	private final By searchTitleLocator = By.xpath("//head/title");
	
	public SearchResultsPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public String title() throws InterruptedException{
		WebElement searchTitle = getDriver().findElement(searchTitleLocator);
		String titlename = searchTitle.getText();
		return titlename;
	}
}
