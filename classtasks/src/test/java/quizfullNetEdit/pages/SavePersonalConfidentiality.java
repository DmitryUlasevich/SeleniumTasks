package quizfullNetEdit.pages;

import org.openqa.selenium.WebDriver;

public class SavePersonalConfidentiality extends Page{
	
	private static final String URL = "http://quizful.net/user/dmitryulasevich";
	public SavePersonalConfidentiality(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
}
