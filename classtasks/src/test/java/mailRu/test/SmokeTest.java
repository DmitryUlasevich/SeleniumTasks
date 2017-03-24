package mailRu.test;

import mailRu.pages.MainPage;
import mailRu.pages.SendLetterPage;
import mailRu.pages.WriteLetterPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		public void oneCanSelectPhonesPageInCatalog() throws InterruptedException
		{
			MainPage mainPage = new MainPage(driver);
			mainPage.open();
			WriteLetterPage writeLetterPage = mainPage.signIn();
			SendLetterPage sendLetterPage = writeLetterPage.sendLetterPage();
			sendLetterPage.LetterPage();
		}
		
		@After
		public void destroyBrowser()
		{
			driver.quit();
		}
		
}