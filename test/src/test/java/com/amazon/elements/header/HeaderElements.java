package com.amazon.elements.header;

import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class HeaderElements {
		
		@FindBy(xpath="//a[@aria-label='Amazon.com.mx']")
		private WebElement AmazonLogo;
		
		@FindBy(xpath="//a[@id='nav-hamburger-menu']")
		public WebElement Menu;
		
		@FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']")
		private WebElement AllDepartments;
		
		@FindBy(xpath="//input[@id='twotabsearchtextbox']")
		private WebElement SearchBar;		
		
		@FindBy(xpath="//input[@value='Ir']")
		private WebElement SearchButton;			
		
		@FindBy(xpath="//a[@data-nav-ref='nav_ya_signin']")
		private WebElement SignInYourAccount;		
		
		@FindBy(xpath="//a[@id='nav-link-prime']")
		private WebElement AmazonPrime;				
		
		@FindBy(xpath="//a[@id='nav-cart']")
		private WebElement GoToCart;					
		
		@FindBy(xpath="//a[@tabindex='35']")
		private WebElement ChooseAddress;			
		
		@FindBy(xpath="//a[@tabindex='47']")
		private WebElement Promotions;				
		
		@FindBy(xpath="//a[@tabindex='48']")
		private WebElement Outlet;					
		
		@FindBy(xpath="//a[@tabindex='49']")
		private WebElement AmazonBasics;			
		
		@FindBy(xpath="//a[@tabindex='50']")
		private WebElement BestSellers;				
		
		@FindBy(xpath="//a[@tabindex='51']")
		private WebElement BestGifts;				
		
		@FindBy(xpath="//a[@tabindex='52']")
		private WebElement News;                 	
		
		@FindBy(xpath="//div[@id='nav-swmslot']")
		private WebElement TopDynamicSlogan;			
		
		@FindBy(xpath="(//span[text()='Identificarse'])[0]")
		private WebElement IdentifyYourself;			
		
		@FindBy(xpath="(//a[@class='nav-a'])[0]")
		private WebElement StartHere;				
		
		@FindBy(xpath="//div[text()='Listas']")
		private WebElement Lists;					
		
		@FindBy(xpath="//span[text()='Crear una Wish List']")
		private WebElement CreateWishList;			
		
		@FindBy(xpath="//span[text()='Crear una Mesa de Regalos de Bebé']")
		private WebElement CreateBabyGiftTable;		
		
		@FindBy(xpath="//span[text()='Crear una Mesa de Regalos de Boda']")
		private WebElement CreateWeddingGiftTable;	
		
		@FindBy(xpath="//div[text()='Mi cuenta']")
		private WebElement MyAccountTop;				
		
		@FindBy(xpath="//span[text()='Mi cuenta']")
		private WebElement MyAccount;				
		
		@FindBy(xpath="//span[text()='Mis pedidos']")
		private WebElement MyOrders;					
		
		@FindBy(xpath="//span[text()='Mis recomendaciones']")
		private WebElement MyRecommendations;
		
		@FindBy(xpath="//span[text()='Mi membresía Prime']")
		private WebElement MyPrimeMembership;		
		
		@FindBy(xpath="//span[text()='Mi Planea y Ahorra']")
		private WebElement MyPlanAndSave;			
		
		@FindBy(xpath="//span[text()='Membresías y suscripciones']")
		private WebElement MembershipsAndSubs;		
		
		@FindBy(xpath="//span[text()='Mis mascotas']")
		private WebElement MyPets;					
		
		@FindBy(xpath="//span[text()='Mi contenido Kindle']")
		private WebElement KindleContent;			
		
		@FindBy(xpath="//span[text()='Mi Amazon Music']")
		private WebElement AmazonMusic;				
		
		@FindBy(xpath="//span[text()='Mi Prime Video']")
		private WebElement PrimeVideo;					

		@FindBy(xpath="//a[text()='Envíos ilimitados']")
		private WebElement UnlimitedDelivery;		
		
		@FindBy(xpath="//a[text()='Envíos sin mínimo de compra ']")
		private WebElement NoMinimunPurchase;		
		
		@FindBy(xpath="//a[text()='Prime Video']")
		private WebElement PrimeVideoBottom;			
		
		@FindBy(xpath="(//input[@type='submit'])[1]")
		private WebElement TryAmazonPrime;			
		
		@FindBy(xpath="//div[@class='nav-npm-prime-logo']")
		private WebElement AmazonPrimelogo;

	}


