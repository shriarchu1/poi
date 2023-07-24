package objectrepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
WebDriver driver;

public LoginPage(WebDriver driver) {
	
	this.driver = driver;
	
	
}

private By emailfield = By.id("input-email");
private By passwaordfield=By.id("input-password");
private By loginButton=By.xpath("//input[@value='Login']");

public WebElement emailfield() {
	
	return driver.findElement(emailfield);
}

public WebElement passwordfield() {
	
	return driver.findElement(passwaordfield);
			
}
public WebElement loginButton() {
	
	return driver.findElement(loginButton);
	
}


















}
