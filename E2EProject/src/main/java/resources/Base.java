package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
    public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prob = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prob.load(fis);
		String browserName = prob.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("firefox"))
		{
			// I chose to execute in Chrome so I left here empty
		}
		else if(browserName.equals("IE"))
		{
			// I chose to execute in Chrome so I left here empty
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
}
