package com.amazon.header.sidebar;
	
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class SideBarMenu {
		
		//Menu
		@FindBy(xpath="//a[@id='nav-hamburger-menu']") 
		public WebElement menu;
		
		//Categorias
		@FindBy(xpath="//a[@data-menu-id") 
		public List<WebElement> categoria;
		
		//Subcategorias
		//**Dentro de estos xpath se encuentra tambien "Todas las categorias", "Ayuda" y "Mi Cuenta". 
		@FindBy(xpath="//*[@id=\\\"hmenu-content\\\"]") 
		public List<WebElement> subCategorias;
		
		public SideBarMenu ()
		{
			
		}
		
		
	}
