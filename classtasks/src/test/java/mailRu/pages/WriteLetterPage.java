package mailRu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WriteLetterPage extends Page{
	
	private static final String URL = "https://e.mail.ru/messages/inbox?from=login&back=1";
	
	private final By writeLetterLocator = By.xpath("//div[@class = 'b-toolbar__item']");

	public WriteLetterPage(WebDriver driver){	
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}

	public SendLetterPage sendLetterPage() throws InterruptedException{
		WebElement writeLetter = getDriver().findElement(writeLetterLocator);
		writeLetter.click();
		Thread.sleep(2000);
		return new SendLetterPage(driver);
	}
}

