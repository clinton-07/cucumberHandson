/*
 * Driver setup class
 */
package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	static WebDriver driver;
	
	//To quit the driver
	public static void exitDriver(){
		driver.quit();	
	}
	
	public static WebDriver getWebDriver(String browserName ){
		//if chrome select chrome driver
    	if(browserName.equalsIgnoreCase("chrome")){
    		
			System.setProperty("webdriver.chrome.driver",".\\Resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	    	return driver;
    	}
    	//if firefox select firefox driver
    	else if(browserName.equalsIgnoreCase("firefox")){
    	   	System.setProperty("webdriver.gecko.driver",".\\Resources\\drivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
	    	return driver;
    	}
    	//....
    	else{
    		System.out.println("Please select Chrome or Firefox");
    		System.exit(0);
    		return null;
    	}
     }
	

	
}

