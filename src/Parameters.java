
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {

	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";

	static String PerformanceUserName = "performance_glitch_user";

	static String passWord = "secret_sauce";

	static WebDriver driver = new ChromeDriver();
	
	static void LoginFunction(String UserName, String Password) {
		
		  WebElement userNameInputField = driver.findElement(By.id("user-name"));
		  WebElement PasswordInputField = driver.findElement(By.id("password"));
			 userNameInputField.sendKeys(UserName);
		     PasswordInputField.sendKeys(passWord );
			
	       driver.findElement(By.id("login-button")).click();
	}
}
	 
