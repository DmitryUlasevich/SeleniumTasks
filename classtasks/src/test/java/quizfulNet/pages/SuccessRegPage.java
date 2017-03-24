package quizfulNet.pages;

import org.openqa.selenium.WebDriver;

public class SuccessRegPage extends Page{

	private static final String URL = "http://http://www.quizful.net/LoginAction.loginForm?registered=";
	
	public SuccessRegPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
}
