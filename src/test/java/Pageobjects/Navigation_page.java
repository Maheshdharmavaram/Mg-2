package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Navigation_page extends Basepage {

	public Navigation_page(WebDriver driver) {
		super(driver);
}
	
@FindBy(xpath = "//p[text()='Electrical Tools & Equipment']")
WebElement navigation;
@FindBy(xpath = "//p[text()='Water Pumps']")
WebElement navigation2;
@FindBy(xpath = "//p[text()='Submersible Pumps']")
WebElement navigation3;

public void navigation() {
	navigation.click();
}

public void secondnavigation() {
	Actions act = new Actions(driver);
	act.moveToElement(navigation).build().perform();
	act.moveToElement(navigation);
}
public void navigation2() {
	Actions act =  new Actions(driver);
	act.moveToElement(navigation2).build().perform();
	act.moveToElement(navigation2);
}
public void navigation3() {
	Actions act = new Actions(driver);
	act.moveToElement(navigation3).build().perform();
	act.moveToElement(navigation3);
}
}

	