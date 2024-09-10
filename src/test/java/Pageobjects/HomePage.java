package Pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Basepage {
public HomePage(WebDriver driver) {
		super(driver);
	}
	//with Pagefactory
	
	@FindBy (xpath="//p[text()='Login Now']")
	WebElement btn_LogniNow;
	
	@FindBy (xpath="//span[text()='Enter Mobile Number']")
	WebElement txt_moblilenum;
	
	@FindBy (xpath="//button[text()='CONTINUE']")
	WebElement btn_countinue;
	
	
	public void clickloginNow() {
		btn_LogniNow.click();
	}
	public void setphnnumber() throws AWTException {
		Actions act = new Actions(driver);
		act.moveToElement(txt_moblilenum).click().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		
		r.keyPress(KeyEvent.VK_6);
		r.keyRelease(KeyEvent.VK_6);
		
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		
		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);
		
		r.keyPress(KeyEvent.VK_5);
		r.keyRelease(KeyEvent.VK_5);
		
		r.keyPress(KeyEvent.VK_6);
		r.keyRelease(KeyEvent.VK_6);
		
		r.keyPress(KeyEvent.VK_7);
		r.keyRelease(KeyEvent.VK_7);
		
		r.keyPress(KeyEvent.VK_6);
		r.keyRelease(KeyEvent.VK_6);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
	public void countinue() {
		btn_countinue.click();
	}

}