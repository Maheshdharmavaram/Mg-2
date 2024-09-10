package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Navigation1 extends Basepage {

	public Navigation1(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "(//p[text()='Office Stationery & Supplies'])[1]")
	WebElement navigation1;
	@FindBy(xpath = "//p[text()=\"Printers\"]")
	WebElement navigation2;
	@FindBy(xpath = "//p[text()='Ink Tank Printer']")
	WebElement navigation3;	
	
	public void navigation() {
		navigation1.click();
	}

	public void navigation1() {
		Actions act = new Actions(driver);
		act.moveToElement(navigation1).build().perform();
		act.moveToElement(navigation1);
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
	
