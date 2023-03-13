package org.home.category.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProduct {

	WebDriver chromedriver;

	public BuyProduct(WebDriver chromedriver) {
		this.chromedriver = chromedriver;
		PageFactory.initElements(chromedriver, this);
	}

	@FindBy(id = "nav-link-accountList")
	private WebElement signIn;

	@FindBy(id = "ap_email")
	private WebElement emailEnter;

	@FindBy(id = "continue")
	private WebElement continue1;
	
	@FindBy(id="ap_password")
	private WebElement enterPassword ;
	
	@FindBy(id="signInSubmit")
	private WebElement Submit ;

	public void clickSignIn() {
		Actions actions = new Actions(chromedriver);
		actions.moveToElement(signIn).click().build().perform();
	}

	public void fillEmail(String email) {
		emailEnter.sendKeys(email);
	}
	
	public void clickContinue() {
		continue1.click();
	}
	
	public void fillPassword(String Pass) {
		enterPassword.sendKeys(Pass);
	}
	
	public void clickSubmit() {
		Submit.click();
	}
}
