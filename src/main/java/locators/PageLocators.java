package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.BaseClass;

public class PageLocators extends BaseClass {
	public PageLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='dropdown open']/a[contains(text(),'Input')]")
	public WebElement Input;

	@FindBy(xpath = "//li[@class='dropdown open']/ul/li/a[contains(text(),'Simple Form Demo')]")
	public WebElement SimpleForm;
}
