package gpack;
import objectrepository.MyAccountPage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;


public class LoginTest {
	WebDriver driver;
    @Test
    
	public void login() {
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailfield().sendKeys("radhekrishna@gmail.com");
        loginPage.passwordfield().sendKeys("radheradhe");
        loginPage.loginButton().click();
        
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.accountBreadcrum().isDisplayed())  ;
      
    }  
    @AfterMethod
     public void Closure() {
    	 
    	 driver.close();
    	 
     }
     
    
    
    
}
