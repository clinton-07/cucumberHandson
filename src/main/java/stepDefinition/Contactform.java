package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.DriverSetup;

public class Contactform {
	WebDriver driver;
	public List <List<String>> input;


	@Before
	public void invokeBrowser() {
		driver = DriverSetup.getWebDriver("chrome");	
	}


	
	@Given("^user is on the Application page title is \"([^\"]*)\"$")
	public void user_is_on_the_Application_page_title_is(String expectedTitle) {
		driver.get("https://www.mycontactform.com/samples/basiccontact.php");
		driver.manage().window().maximize();
		Assert.assertEquals(expectedTitle, driver.getTitle());
	   
	}
	
	
	@Then("^Enter the name and Email ID$")
	public void enter_the_name_and_Email_ID(DataTable Data)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		input = Data.raw();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/font[1]/input[1]")).sendKeys(input.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(input.get(0).get(1));
		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/font[1]/textarea[1]")).sendKeys("This is for testing purpose and good for that.!!!!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^submit the form$")
	public void submit_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@Then("^validate the message \"([^\"]*)\"$")
	public void validate_the_message(String message) {
	
		Assert.assertEquals(message, driver.findElement(By.xpath("//h4[contains(text(),'Thank You')]")).getText());

	}
	
	
	@After
	public void quit_the_driver()  {
	    // Write code here that turns the phrase above into concrete actions
	   DriverSetup.exitDriver();
	}


}
