package com.amazon.elements.footer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterElements {
	public FooterElements(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Element to test
	@FindBy(xpath = "//div[@id='navFooter']")
	private WebElement footer;
	@FindBy(xpath = "//span[@class='navFooterBackToTopText']")
	private WebElement backTop; 			
	//CONOCENOS
	@FindBy(xpath = "//a[contains(@href, 'https://www.amazon.jobs')]")
	private WebElement amazonJobs;
	@FindBy(xpath = "//a[contains(@href,'/gp/feature.html?ie=UTF8&docId=1001359011&ref_=footer_gw_m_b_corporate')]")
	private WebElement info;
	@FindBy(xpath = "//a[contains(@href,'http://www.amazon.com.mx:80/gp/redirect.html?_encoding=UTF8&location=http%3A%2F%2Fphx.corporate-ir.net%2Fphoenix.zhtml%3Fc%3D176060%26p%3Dirol-mediaKindle%26ref_%3Dfooter_press&source=standards&token=20199D390B4B99326228BACA356577F5C6D0F278')]")
	private WebElement pressDepth;
	//GANA DINERO CON NOSOTROS
	@FindBy(xpath = "//a[contains(@href,'/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%2Fservices.amazon.com.mx%2Fservicios%2Fvender-en-amazon.html%3Fld%3DAZMXSOA-footer%26ref_%3Dfooter_sell&source=standards&token=A618BDDFC5B625AB8C672ECF85EE2C3687DBB648')]")
	private WebElement amazonSell;
	@FindBy(xpath = "//a[contains(@href,'/gp/redirect.html?_encoding=UTF8&location=https%3A%2F%2Fservices.amazon.com.mx%2Fhandmade.htm%3Fld%3DAZMXHND-footer%26ref_%3Dfooter_sell&source=standards&token=8F4EBA7C011105F66C7F490436831B0EF2D3EAEA')]")
	private WebElement amaznSellHand;
	@FindBy(xpath = "//a[contains(@href,'https://kdp.amazon.com')]")
	private WebElement kindle;
	@FindBy(xpath = "//a[contains(@href,'/gp/redirect.html?_encoding=UTF18&location=https%3A%2F%2Fafiliados.amazon.com.mx%2F%3Fref_%3Dfooter_affliate&source=standards&token=3600FADFAE88A2F5846E33608370F246B5BC2F4A')]")
	private WebElement affiliatesPro;
	@FindBy(xpath = "//a[contains(@href,'https://advertising.amazon.com.mx/?ref=footer_advtsing_mx')]")
	private WebElement productsAnnounce;
	//PODEMOS AYUDARTE
	@FindBy(xpath = "//a[contains(@href,'/gp/css/returns/homepage.html?ie=UTF8&ref_=footer_hy_f_4')]")
	private WebElement returnReplace;
	@FindBy(xpath = "//a[contains(@href,'/gp/digital/fiona/manage?ie=UTF8&ref_=footer_myk')]")
	private WebElement contentAndDevices;
	@FindBy(xpath = "//a[contains(@href,'/gp/help/customer/display.html?ie=UTF8&nodeId=508510&ref_=footer_gw_m_b_he')]")
	private WebElement help;
	@FindBy(xpath = "//a[contains(@href,'/gp/BIT/ref=footer_bit_v2_mx_0100?bitCampaignCode=MX0100')]")
	private WebElement amazonAssistant;
	//METODOS DE PAGO
	@FindBy(xpath = "//a[contains(@href,'/tc?_encoding=UTF8&ref_=footer_pay_tc')]")
	private WebElement cards;
	@FindBy(xpath = "//a[contains(@href,'/tr?_encoding=UTF8&ref_=footer_pay_gc')]")
	private WebElement giftCards;
	@FindBy(xpath = "//a[contains(@href,'/msi?_encoding=UTF8&ref_=footer_pay_ins')]")
	private WebElement msi;
	@FindBy(xpath = "//a[contains(@href,'/b?ie=UTF8&node=17277672011&ref_=footer_amazoncash')]")
	private WebElement amazonCash;
	@FindBy(xpath = "//a[contains(@href,'/recargablen?_encoding=UTF8&ref_=footer_amazonrecargable')]")
	private WebElement amazonRecharger;
	//COUNTRIES
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com.au/ref=footer_au')]")
	private WebElement australia;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.de/ref=footer_de')]")
	private WebElement deutschland;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com.br/ref=footer_br')]")
	private WebElement brasil;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.ca/ref=footer_ca')]")
	private WebElement canada;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.cn/ref=footer_cn')]")
	private WebElement china;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.es/ref=footer_es')]")
	private WebElement spain;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com/ref=footer_us')]")
	private WebElement usa;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.fr/ref=footer_fr')]")
	private WebElement france;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.in/ref=footer_in')]")
	private WebElement india;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.it/ref=footer_it')]")
	private WebElement italy;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.co.jp/ref=footer_jp')]")
	private WebElement japan;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.nl/ref=footer_nl')]")
	private WebElement netherlands;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.co.uk/ref=footer_uk')]")
	private WebElement uk;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.sg/ref=footer_sg')]")
	private WebElement singapur;
	@FindBy(xpath = "//a[contains(@href,'https://www.amazon.com.tr/ref=footer_tr')]")
	private WebElement turkey;
	//VARIOS
	@FindBy(xpath = "//a[contains(@href,'https://aws.amazon.com/es/what-is-cloud-computing/?sc_channel=EL&sc_campaign=MX_amazonfooter')]")
	private WebElement aws;
	@FindBy(xpath = "//a[contains(@href, '/gp/help/customer/display.html?ie=UTF8&nodeId=508088&ref_=footer_cou')]")
	private WebElement useConditions;
	@FindBy(xpath = "//a[contains(@href, '/gp/help/customer/display.html?ie=UTF8&nodeId=468496&ref_=footer_privacy')]")
	private WebElement privacy;
	
	public void clickElement(WebElement element, WebDriverWait wait, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void ScrollTillElement(WebElement element, JavascriptExecutor js) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public WebElement getBackTop() {
		return backTop;
	}
	
}
