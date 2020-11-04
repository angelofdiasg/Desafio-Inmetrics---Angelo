package br.com.inmetrics.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {}
	
	public static WebDriver getDriver(){
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
			switch (Propriedades.browser) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;
			}
			
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriverWait getDriverwait(Integer sec){

		WebDriverWait wait = new WebDriverWait(getDriver(), sec);
		return wait;
	}

	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
