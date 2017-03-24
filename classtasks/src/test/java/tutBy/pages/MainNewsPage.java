package tutBy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import tutBy.pages.Page;

public class MainNewsPage extends Page{
	
	private static final String URL = "https://news.tut.by/economics/536488.html";
	
	private final By paragraphLocator = By.xpath("//div[@id ='article_body']/p");
	
	public MainNewsPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public void search() throws InterruptedException{
		int paragraphElement = getDriver().findElements(paragraphLocator).size();
		System.out.println("Paragraphs on the article of the page : " + paragraphElement);
		Thread.sleep(2000);
	}

}
