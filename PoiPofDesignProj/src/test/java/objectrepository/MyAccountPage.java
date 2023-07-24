package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class MyAccountPage {

	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	

	
private By accountBreadcrum = By.xpath("//a[normalize-space()='Account']");



public WebElement accountBreadcrum() {
	return driver.findElement(accountBreadcrum);
}
}

