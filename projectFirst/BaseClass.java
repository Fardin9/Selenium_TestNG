package projectFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;



    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","E:\\Engineering\\JAVA\\chromedriver_win32_june\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    
    public static void open_website(){
        driver.get("https://demo.guru99.com/V4/index.php");
    }


    

}
