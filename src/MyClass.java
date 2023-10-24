import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass extends Parameters{

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
		LoginFunction(StandardUserName,passWord);
		Thread.sleep(3000);

       


	}
	
	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		LoginFunction(ProblemUserName,passWord);
        Thread.sleep(3000);

       


//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(ProblemUserName);
	}
	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		LoginFunction(PerformanceUserName,passWord);
		 Thread.sleep(3000);
	    

//		WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys(PerformanceUserName);
//	

	}
//    private void performLogin(String username) {
//        WebElement userNameInputField = driver.findElement(By.id("user-name"));
//		WebElement PasswordInputField = driver.findElement(By.id("password"));
//        WebElement loginButton = driver.findElement(By.id("login-button"));
//        userNameInputField.sendKeys(username);
//        PasswordInputField.sendKeys(passWord );
//        loginButton.click();
//      
//
//        
//  
//
//    }
    
   
    
    
	@AfterTest
	public void myPostTesting() {
	}
}
