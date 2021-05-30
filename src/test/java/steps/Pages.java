package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Pages  
{
	WebDriver driver;
	
	@Given("First start page")
	
	public void i_am_on_start_page() throws InterruptedException {
	     
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://testzenlabs.ie/general-information-form/");
		
		
	}

	@Given("I enter the name a first_name {string}")
	public void i_enter_the_name_a_first_name(String first_name) throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Firstname(first_name);
		
		//WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Name']"));

		//Assert.assertEquals(element1.getAttribute("value"), "madan");
		///validating the text is correct or not		
	}

	@Given("I enter the name a Middle_Name {string}")
	public void i_enter_the_name_a_Middle_Name(String middle_Name) throws InterruptedException{
		LoginPage login = new LoginPage(driver);
		login.Middle_Name(middle_Name);

	}

	@Given("I enter the name a Last_Name {string}")
	public void i_enter_the_name_a_Last_Name(String last_Name)throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Lastname(last_Name);
		
	}

	@When("I enter the name a phone_number {string}")
	public void i_enter_the_name_a_phone_number(String phone_number) throws Throwable  {
		LoginPage login = new LoginPage(driver);
		login.Phone_number(phone_number);	

	}

	@When("I enter the name a Address_One {string}")
	public void i_enter_the_name_a_Address_One(String address_One)  throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Address_One(address_One);
	}

	@When("I enter the Address_Two {string}")
	public void i_enter_the_Address_Two(String address_Two) throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.Address_Two(address_Two);	
		
				
	}	
	@When("I enter the pin_code {string}")
	public void i_enter_the_pin_code(String pin_code) throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Pin_code(pin_code);		 

	}

	@When("I enter the continent {string}")
	public void i_enter_the_continent(String continent) throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Continent(continent);		
	
	}

	@When("browser quit")
	public void browser() throws InterruptedException {
		
		driver.quit();
	
	}


}
