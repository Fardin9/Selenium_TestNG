package projectFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class projectFirst {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		chrome_launch();
		open_website();
		//small_wait();
		manager_login_valid();
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
		//driver_close();
		
	}
	 public static void chrome_launch(){
	        System.setProperty("webdriver.chrome.driver","E:\\Engineering\\JAVA\\chromedriver_win32_june\\chromedriver.exe");
	        driver=new ChromeDriver();
	    }
	 
	 public static void open_website(){
	        driver.get("https://demo.guru99.com/V4/index.php");
	    }

	//Waiting time
	 public static void small_wait() throws InterruptedException {
		 Thread.sleep(3000);
		  
	 }
	 @Test
	
    //Test case 01
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

    //Test case 02
    public static void manager_login_Invalid(){
        //  target/ Locator
        WebElement UserID= driver.findElement(By.name("uid"));
        WebElement Password= driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

        //Action Chain
        UserID.sendKeys("asdasd");
        Password.sendKeys("21133");
        LoginBtn.click();
    }

    //Test case 03
    public static void customer_login_valid(){
        //  target/ Locator
        WebElement UserID= driver.findElement(By.name("uid"));
        WebElement Password= driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

        //Action Chain
        UserID.sendKeys("mngr416907");
        Password.sendKeys("ddd");
        LoginBtn.click();
    }

    //Test case 04
    public static void customer_login_Invalid(){
        //  target/ Locator
        WebElement UserID= driver.findElement(By.name("uid"));
        WebElement Password= driver.findElement(By.name("password"));
        WebElement LoginBtn= driver.findElement(By.name("btnLogin"));

        //Action Chain
        UserID.sendKeys("");
        Password.sendKeys("");
        LoginBtn.click();
    }
    
    public static void driver_close() {
    	driver.close();
    }
}
