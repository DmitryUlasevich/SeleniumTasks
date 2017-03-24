package quizfulNet.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import quizfulNet.pages.QuizMainPage;
import quizfulNet.pages.RegistrationPage;
import quizfulNet.pages.SuccessRegPage;

@RunWith(JUnit4.class)
public class SmokeTest {
	
	private WebDriver driver;
	
	@Before
	public void initBrowser()
	{	
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void registerQuiz() throws InterruptedException
	{
		QuizMainPage mainPage = new QuizMainPage(driver);
		mainPage.open();
		RegistrationPage registrationPage = mainPage.register();
		SuccessRegPage successRegPage = registrationPage.registerUser();
		successRegPage.open();
	}
	
	@After
	public void destroyBrowser()
	{
		driver.quit();
	}
}