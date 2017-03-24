package itAcademy.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import itAcademy.pages.AcademyMainPage;
import itAcademy.pages.MarketingPage;

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
			AcademyMainPage academyMainPage = new AcademyMainPage(driver);
			academyMainPage.open();
			MarketingPage marketingPage = academyMainPage.marketing();
			marketingPage.open();
		}
		
		@After
		public void destroyBrowser()
		{
			driver.quit();
		}
	}		
	
