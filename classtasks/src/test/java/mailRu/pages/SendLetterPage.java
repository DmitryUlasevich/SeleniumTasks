package mailRu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendLetterPage extends Page{
	
	private static final String URL = "https://e.mail.ru/compose/?1490202476051";
	
	private final By recipientLocator = By.xpath("//textarea[@class ='js-input compose__labels__input']");
	private final By subjectLocator = By.xpath("//input[@class ='b-input']");
	private final By textLocator = By.xpath("//iframe[contains(@id,'composeEditor_ifr')]");
	private final By textbodyLocator = By.xpath("//body");
	private final By sendLetterLocator = By.xpath("//div[@class='b-toolbar__item b-toolbar__item_ b-toolbar__item_false']");
	
	public SendLetterPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public void LetterPage() throws InterruptedException{
		WebElement recipient = getDriver().findElement(recipientLocator);
		recipient.sendKeys("mitiok@bk.ru");
		Thread.sleep(500);
		WebElement subject = getDriver().findElement(subjectLocator);
		subject.sendKeys("Sent by Dmitry Ulasevich with Selenium");
		Thread.sleep(2000);
		WebElement text = getDriver().findElement(textLocator);
		driver.switchTo().frame(text);
		Thread.sleep(2000);
		WebElement textbody = getDriver().findElement(textbodyLocator);
		textbody.sendKeys("Sent while classwork with pages package");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement sendLetter = getDriver().findElement(sendLetterLocator);
		sendLetter.click();
	}
}

