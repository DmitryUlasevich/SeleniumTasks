package itAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import itAcademy.pages.Page;

public class AcademyMainPage extends Page{
	
	private static final String URL = "http://www.it-academy.by/";
	
	private final By studiesLocator = By.xpath("//a[@href = '/study']");
	private final By beginStudyLocator = By.xpath("//a[@href = '/study/proforientaciya']");
	private final By careerStudyLocator = By.xpath("//a[@href = '/study/career']");
	private final By javaDeveloperStudyLocator = By.xpath("//a[@href = '/study/career/java-programmer']");
	private final By analystStudyLocator = By.xpath("//a[@href = '/study/career/bussines-analytic']");
	private final By developerStudyLocator = By.xpath("//a[@href = '/study/career/programmer']");
	private final By testerStudyLocator = By.xpath("//a[@href = '/study/career/tester']");
	private final By catalogLocator = By.xpath("//a[@href = '/catalog']");
	private final By catalogMarketingLocator = By.xpath("//a[@href = '/catalog/159']");
	
	public AcademyMainPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public MarketingPage marketing() throws InterruptedException{		
		Actions hoverStudies = new Actions(getDriver());
		hoverStudies.moveToElement(getDriver().findElement(studiesLocator)).perform();
		Thread.sleep(2000);		
		hoverStudies.moveToElement(getDriver().findElement(beginStudyLocator)).perform();
		Thread.sleep(2000);
		hoverStudies.moveToElement(getDriver().findElement(careerStudyLocator)).perform();
		Thread.sleep(2000);
		hoverStudies.moveToElement(getDriver().findElement(javaDeveloperStudyLocator)).perform();
		Thread.sleep(2000);
		hoverStudies.moveToElement(getDriver().findElement(analystStudyLocator)).perform();
		Thread.sleep(2000);
		hoverStudies.moveToElement(getDriver().findElement(developerStudyLocator)).perform();
		Thread.sleep(2000);
		hoverStudies.moveToElement(getDriver().findElement(testerStudyLocator)).perform();
		Thread.sleep(2000);
		
		WebElement studies = getDriver().findElement(studiesLocator);
		System.out.println(studies.getText());
		WebElement beginStudy = getDriver().findElement(beginStudyLocator);
		System.out.println(beginStudy.getText());
		WebElement careerStudy = getDriver().findElement(careerStudyLocator);
		System.out.println(careerStudy.getText());
		WebElement javaDeveloperStudy = getDriver().findElement(javaDeveloperStudyLocator);
		System.out.println(javaDeveloperStudy.getText());
		WebElement analystStudy = getDriver().findElement(analystStudyLocator);
		System.out.println(analystStudy.getText());
		WebElement developerStudy = getDriver().findElement(developerStudyLocator);
		System.out.println(developerStudy.getText());
		WebElement testerStudy = getDriver().findElement(testerStudyLocator);
		System.out.println(testerStudy.getText());
		
		Actions hoverCatalog = new Actions(getDriver());
		hoverCatalog.moveToElement(getDriver().findElement(catalogLocator)).perform();
		Thread.sleep(2000);
		hoverCatalog.moveToElement(getDriver().findElement(catalogMarketingLocator)).perform();
		Thread.sleep(2000);
		hoverCatalog.click().perform();
		return new MarketingPage(driver);
	}
}
