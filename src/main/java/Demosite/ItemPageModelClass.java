package Demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPageModelClass {
	
	private WebDriver driver;
	
	private By itemNameText = By.xpath("//span[text()='Nike zoom fly']");
	
	private String itemSizeXpathLocator = "//a[text()='%S']";
	private String itemColorXpathLocator ="//a[text()='%color']";
	
	private By quantityTextBox = By.xpath("//input[@name='qty']");
	
	private By addToCart = By.xpath("//span[text()='ADD TO CART']");
	
	
	//Initiallizing the webdriver
	public ItemPageModelClass (WebDriver wd) {
		this.driver = wd;
		
	}
	
	//Calling the method chaning
	
	public String getItemName() {
		return driver.findElement(itemNameText).getText();
		
	}
	
	public ItemPageModelClass getItemSize(String size) {
		String ItemSize = itemSizeXpathLocator.replace("%S", size);
		By newItemSize = By.xpath(ItemSize);
		driver.findElement(newItemSize).click();
		return this;
		
	}
	
	public ItemPageModelClass getItemColor(String color) {
		String ItemColor = itemColorXpathLocator.replace("%color",color );
		By newItemColor = By.xpath(ItemColor);
		driver.findElement(newItemColor).click();
		return this;
	}
	
	public ItemPageModelClass fillQuantity(String quantity) {
		driver.findElement(quantityTextBox).click();
		driver.findElement(quantityTextBox).sendKeys(quantity);
		return this;
	}
	
	public ItemPageModelClass addToCart() {
		driver.findElement(addToCart).click();
		return this;
		
	}
	
}
