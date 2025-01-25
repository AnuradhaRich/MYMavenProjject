package Demosite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import DataDriven.ExcelManager;


public class TestDemo {
	
	WebDriver wd;
	ChromeOptions cd;
	
	
	@BeforeMethod
	public void beforeMethodforDemoEver() throws MalformedURLException {
		
		cd = new ChromeOptions();
		wd = new RemoteWebDriver(new URL("http://192.168.31.224:4444"),cd);
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] generateData() throws IOException{
		return ExcelManager.getData();
	}
	
	@Test
	public void CallingMethods() throws InterruptedException {
	LoginPageModel lom = new LoginPageModel(wd);
		HomePageModel hom = new HomePageModel(wd);
		ItemPageModelClass ipm = new ItemPageModelClass(wd);
		//lom.OpeningURL()
		//.fillcretential("akhiljda@gmail.com","Password")
		//.ClickOnSubmitButton();
		//hom.Clickitem("Nike zoom fly", "XL");
		//Assert.assertEquals(ipm.getItemName(), "Nike zoom fly");
		//ipm.getItemSize("XL")
		  // .getItemColor("Green")
		   //.fillQuantity("5")
		   //.addToCart();
		
		LoginPage4 lo = new LoginPage4(wd);
		lo.openURL()
		.fillcredentials("standard_user","secret_sauce")
		.ClickOnButton();
		    
	}	
	
//	@Test
//	public void CallingMethods() throws InterruptedException {
//		//LoginPageModel lom = new LoginPageModel(wd);
//		LoginPage2 lo = new LoginPage2(wd);
//		lo.openURL()
//		.fillcredentials("standard_user","secret_sauce")
//		.ClickOnButton();
//
//		    
//	}
	
//	@Test(dataProvider = "LoginData")
//	public void CallingMethods(String UN, String PW) throws InterruptedException {
//		LoginPageModel lom = new LoginPageModel(wd);
//		//HomePageModel hom = new HomePageModel(wd);
//		lom.OpeningURL()
//		.fillcretential(UN,PW)
//		.ClickOnSubmitButton();
//		//hom.Clickitem("Nike zoom fly", "XL");
//	}
}
