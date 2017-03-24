package quizfullNetEdit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import quizfullNetEdit.pages.EditProfileDataPage;
import quizfullNetEdit.pages.LoginPage;
import quizfullNetEdit.pages.ProfilePageConfidentiality;
import quizfullNetEdit.pages.ProfilePageData;
import quizfullNetEdit.pages.ProfilePageNotification;
import quizfullNetEdit.pages.QuizeMain;
import quizfullNetEdit.pages.SavePersonalConfidentiality;
import quizfullNetEdit.pages.SavePersonalData;
import quizfullNetEdit.pages.SavePersonalNotification;
import quizfullNetEdit.pages.WelcomePage;

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
		QuizeMain mainPage = new QuizeMain(driver);
		mainPage.open();
		LoginPage loginPage = mainPage.authorization();
		WelcomePage welcomePage = loginPage.siginIn();
		EditProfileDataPage editProfilePage = welcomePage.profile();
		ProfilePageData profilePage = editProfilePage.editProfile();
		SavePersonalData savePersonalData = profilePage.saveData();
		ProfilePageNotification profilePageNotification = savePersonalData.savedInfo();
		SavePersonalNotification savePersonalNotification = profilePageNotification.savedNotification();
		ProfilePageConfidentiality profilePageConfidentiality = savePersonalNotification.saveNotification();
		SavePersonalConfidentiality savePersonalConfidentiality = profilePageConfidentiality.savedConfidentiality();
		savePersonalConfidentiality.open();
	}
	
	@After
	public void destroyBrowser(){
		driver.quit();
	}
}
