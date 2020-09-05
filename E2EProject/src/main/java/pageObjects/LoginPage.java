package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(id="//a[@title='Giriş Yap']")
	WebElement signIn_button;
	
	@FindBy(id="email")
	WebElement emailAdress_text;
	
	@FindBy(id="password")
	WebElement password_text;
	
	@FindBy(id="loginButton")
	WebElement login_button;
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);     
	}

	public LoginPage login(String emailAdress, String passwordInfo)
	{
		emailAdress_text.sendKeys(emailAdress);
		password_text.sendKeys(passwordInfo);
		return this;
	}

	public LandingPage ClickLogin()
	{
		LandingPage lap = new LandingPage(driver);
		//login_button.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", login_button);
		return lap;
	}

}
