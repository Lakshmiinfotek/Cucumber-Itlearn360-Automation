package learnpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class websitesteps {
	WebDriver driver;
	@Given("I am on the website {string}")
	public void i_am_on_the_website(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	}

	@Then("I search for {string}")
	public void i_search_for(String string) {
		driver.findElement(By.name("search_course")).sendKeys(string);
	}
	@Then("I click on Free courses")
	public void i_click_on_Free_courses() {
		driver.findElement(By.id("menu-item-13318")).click();
	}
	@Then("I click on Loginbutton")
	public void i_click_on_Loginbutton() {
		driver.findElement(By.id("loginlabel")).click();
	}
	@When("I type username = {string} and password = {string}")
	public void i_type_username_and_password(String string, String string2) {
		driver.findElement(By.id("user_login")).sendKeys(string);//username
		driver.findElement(By.id("user_pass")).sendKeys(string2);//password
	}
	@Then("I click on login")
	public void i_click_on_login() {
		driver.findElement(By.id("wp-submit")).click();//submit
	}
	@Then("I will click on Allcourses")//checking allcourses
	public void i_will_click_on_Allcourses() {
		// performing clicking on all courses
				driver.findElement(By.linkText("All Courses")).click();
	}
	@Then("I will click on f")
	public void i_will_click_on_f() throws InterruptedException {
		// Locate Face book icons using className locator and perform click
				driver.findElement(By.className("fa-facebook")).click();//pass element and click
				Thread.sleep(1000);//sleep time
				driver.navigate().back();//navigate back to homepage
}
@Then("I will click on Free courses")//click on freecourses
public void i_will_click_on_Free_courses() throws InterruptedException {
	driver.findElement(By.id("menu-item-13318")).click();//locate element and click
	Thread.sleep(1000);
	driver.navigate().back();//back to home page
}
@Then("I will click on Online Classes")
public void i_will_click_on_Online_Classes() throws InterruptedException {
	driver.findElement(By.linkText("Online Classes")).click();
	Thread.sleep(1000);
	driver.navigate().back();

}
@Then("I will click on Blog")
public void i_will_click_on_Blog() {
	driver.findElement(By.linkText("Blog")).click();
//	Thread.sleep(1000);
	driver.navigate().back();
}

@Then("I will click on Jobs")
public void i_will_click_on_Jobs() throws InterruptedException {
	driver.findElement(By.linkText("Jobs")).click();
	 Thread.sleep(1000);
	 driver.navigate().back();
}
@Then("I will click on  ITlearn360")
public void i_will_click_on_ITlearn360() throws InterruptedException {
	driver.findElement(By.id("logo")).click();
	 Thread.sleep(1000);
	
}
@Then("I will click on in")
public void i_will_click_on_in() {
	//Locate linkedIn icons using className locator and perform click
	driver.findElement(By.className("fa-linkedin")).click();
	 driver.navigate().back();
	
}
@Then("I will click on Youtube")
public void i_will_click_on_Youtube() {
	// Locate you tube icons using className locator and perform click
			driver.findElement(By.className("fa-youtube")).click();
			// Navigate back on main page  navigate and back method
			driver.navigate().back();//Back to homepage
			
			
}
	
}
	
	


	
	




