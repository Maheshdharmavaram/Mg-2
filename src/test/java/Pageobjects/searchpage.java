package Pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage extends Basepage {
	public searchpage(WebDriver driver) {
		super(driver);
		
	}

	// Locators
    @FindBy(xpath = "//input[@id='search-input']")
    WebElement searchbox;

    @FindBy(xpath = "//div[@type='submit']")
    WebElement submitButton;

    // Methods to perform actions
    public void enterSearchTerm(String searchTerm) {
        searchbox.sendKeys(searchTerm);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
