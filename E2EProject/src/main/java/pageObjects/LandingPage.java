package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class LandingPage {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Giriş Yap']")
	WebElement signIn_button;
	
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);     
	}

	public LoginPage SingIn()
	{
		LoginPage lop = new LoginPage(driver);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Giriş Yap']"))).click().build().perform();
		signIn_button.click();
		return lop;
	}

}
