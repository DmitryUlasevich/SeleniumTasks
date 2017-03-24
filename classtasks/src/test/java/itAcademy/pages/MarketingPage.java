package itAcademy.pages;

import org.openqa.selenium.WebDriver;

import itAcademy.pages.Page;

public class MarketingPage extends Page{
	
	private static final String URL = "http://it-academy.by/catalog/159";
	
	public MarketingPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}

}
