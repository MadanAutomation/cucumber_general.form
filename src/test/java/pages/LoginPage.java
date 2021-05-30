package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	 WebDriver driver;

	
	 By Firstname = By.xpath("//input[@placeholder='Your Name']");
	 By Middle_Name = By.xpath("//input[@placeholder='Your Middle Name']");
	 By Lastname = By.xpath("//input[@placeholder='Your Last Name']");
	 By Phone_number = By.xpath("//input[@placeholder='Phone Number']");
	 By Address_One = By.xpath("//input[@placeholder='Your Address']");
	 By Address_Two = By.xpath("//input[@placeholder='Your Address Two']");
	 By Pin_code = By.xpath("//input[@placeholder='Your Pin Code']");
	 By Continent = By.xpath("//input[@placeholder='Asia']");

	 
	 public LoginPage(WebDriver driver) {
		 this.driver = driver;
	}

		//Parameterizing the void functions
		
	 public void Firstname(String first_name)
		 
		 {
		 
			 driver.findElement(Firstname).sendKeys(first_name);
			 
		    }
		
		public void Middle_Name(String middle_Name)  
		 
		 {
			driver.findElement(Middle_Name).sendKeys(middle_Name);
			 

			 
		    }
		
	public void Lastname(String last_Name)
	{
		
		driver.findElement(Lastname).sendKeys(last_Name);
	}
	
	public  void Phone_number(String phone_number) {
		
		driver.findElement(Phone_number).sendKeys(phone_number);
		}
	
	
	public  void Address_One(String address_One) {
		
		driver.findElement(Address_One).sendKeys(address_One);
		}
	
	public  void Address_Two(String address_Two) {
		
		driver.findElement(Address_Two).sendKeys(address_Two);
			}
	
public  void Pin_code(String pin_code) {
		
	driver.findElement(Pin_code).sendKeys(pin_code);
			}

public  void Continent(String continent) {
	
	driver.findElement(Continent).sendKeys(continent);

}


}
