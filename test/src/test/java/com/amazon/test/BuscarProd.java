package com.amazon.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.amazon.config.Config;
import com.amazon.elements.footer.FooterElements;
import com.amazon.elements.header.HeaderElements;

public class BuscarProd {

	static String url = "https://www.amazon.com.mx/";
	
	@Test
	public void exampleTest() throws Exception {
		
		//Configuración 
		Config config = new Config();
		WebDriver driver = config.getDriver();
		WebDriverWait wait = config.getWait();
		JavascriptExecutor js = config.getJS();
		
		//Header Elements
		HeaderElements header = new HeaderElements ();
		
		config.openURL(url);
		
		//Iniciar Sesión 
		//Buscar Producto 
		//Seleccionar Producto 
		//copiar descripción y mostrar en consola
		
	}
}
