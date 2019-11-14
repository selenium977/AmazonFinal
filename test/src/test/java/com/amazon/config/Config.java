package com.amazon.config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	
	public WebDriver getDriver() {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
	
	
	public void openURL(String url) throws Exception {
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Mensaje");
		Thread.sleep(5000);
	}
	
	
	public void quiteDriver() {
		driver.quit();
	}
	
	public JavascriptExecutor getJS() {
		
		js = (JavascriptExecutor) driver;
		
		return js;
		
	}
	
	public WebDriverWait getWait() {
		wait = new WebDriverWait(driver, 10);
		return wait;
	}
	
	
}
