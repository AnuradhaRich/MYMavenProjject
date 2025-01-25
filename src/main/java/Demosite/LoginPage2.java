package Demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {
	
	WebDriver driver;
	
	
	private By username = By.xpath("//input[@id = 'user-name']");
	private By pwd = By.xpath("//input[@id = 'password']");
	private String LoginURL = "https://www.saucedemo.com/";
	private By Button = By.xpath("//input[@id = 'login-button']");
	
	public LoginPage2 (WebDriver wd) {
		this.driver = wd;
		
	}
	
	public LoginPage2 openURL () {
		driver.get(LoginURL);
		return this;
	}
	
	public LoginPage2 fillcredentials(String UN, String PW) {
		driver.findElement(username).sendKeys(UN);
		driver.findElement(pwd).sendKeys(PW);
		return this;
	}
	
	public void ClickOnButton() {
	 driver.findElement(Button).click();	
		
	}
	

}
