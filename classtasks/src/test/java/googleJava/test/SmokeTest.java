package googleJava.test;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import googleJava.pages.GooglePage;
import googleJava.pages.SearchResultsPage;


	@RunWith(JUnit4.class)
	public class SmokeTest {
		
		private WebDriver driver;
		
		@Before
		public void initBrowser()
		{	
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		@Test()
		public void findElementName() throws InterruptedException{
			GooglePage googlePage = new GooglePage(driver);
			googlePage.open();
			SearchResultsPage searchResultsPage = googlePage.search();
			searchResultsPage.title();
			String title = searchResultsPage.title();
			assertThat(title, CoreMatchers.containsString("java"));
		}
		
		@After
		public void destroyBrowser()
		{
			driver.quit();
		}
	}		