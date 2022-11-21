package projectFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class projectFirstTestNg {
  
  public static WebDriver driver;
  		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  		
		chrome_launch();
		open_website();
		//small_wait();
		//manager_login_valid();
		//small_wait();
		//driver_close();
		//chrome_launch();
		//open_website();
		//small_wait();
		//manager_login_Invalid();
		//small_wait();
		//driver_close();
		//chrome_launch();
		//open_website();
		//small_wait();
		//customer_login_valid();
		//chrome_launch();
		//open_website();
		//small_wait();
		//customer_login_Invalid();
		driver_close();
		
	}
  	@BeforeMethod
	 public static void chrome_launch(){
	        System.setProperty("webdriver.chrome.driver", "E:\\Engineering\\JAVA\\chomedriver_21Nov_2022\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
	    }
  	
	 public static void open_website(){
	        driver.get("https://www.daraz.com.bd/");
	    }
	 
	//Waiting time
	 public static void small_wait() throws InterruptedException {
		 Thread.sleep(3000);
		  
	 }
	//Test case 01
	 @Test(priority=1)	 
	 public static void manager_login_valid(){
     //  target/ Locator
      WebElement UserID= driver.findElement(By.name("uid"));
      WebElement Password= driver.findElement(By.name("password"));
      WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

      //Action Chain
      UserID.sendKeys("mngr416907");
      Password.sendKeys("qerAgen");
      LoginBtn.click();
      
      

	 }
	 @AfterMethod
	 public static void driver_close() {
	    	driver.close();
	    }
}
