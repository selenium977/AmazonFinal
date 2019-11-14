package com.amazon.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.amazon.config.Config;
import com.amazon.elements.footer.FooterElements;

public class Test01 {
	
	static String url = "https://www.amazon.com.mx/";
	
	@Test
	public void exampleTest() throws Exception {
		
		//Instancia de Config
		Config config = new Config();
		WebDriver driver = config.getDriver();
		WebDriverWait wait = config.getWait();
		JavascriptExecutor js = config.getJS();
		
		//Instancia FooterElements
		FooterElements footer = new FooterElements(driver, wait, js);
		
		config.openURL(url);
		footer.ScrollTillElement(footer.getBackTop(), js);
		footer.clickElement(footer.getBackTop(), wait, driver);
		System.out.println("Ya jaló y el Tellez se la come");

	}
	
}
