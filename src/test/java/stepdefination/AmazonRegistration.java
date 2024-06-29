package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonRegistration {
	WebDriver driver= new ChromeDriver();
	@Given("The user is on the Amazon registration page.")
	public void the_user_is_on_the_amazon_registration_page() {
        driver.get("https://www.amazon.ca/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fref%3Drhf_sign_in&openid.assoc_handle=caflex");
		}
	
	@When("The users enters their yourname as {string}.")
	public void the_users_enters_their_yourname_as(String yourname) throws InterruptedException {
	    driver.findElement(By.id("ap_customer_name")).sendKeys("AmishaSarvaiya");
	    Thread.sleep(1000);
	}

	@When("The users enters their emailid as {string}.")
	public void the_users_enters_their_emailid_as(String emailid) throws InterruptedException {
	    driver.findElement(By.cssSelector("#ap_email")).sendKeys("ameeshagohel@gmail.com");
	    Thread.sleep(1000);
	}

	@When("The users enters their password as {string}.")
	public void the_users_enters_their_password_as(String password) throws InterruptedException {
	    driver.findElement(By.cssSelector("#ap_password")).sendKeys("Nikunj1995");
	    Thread.sleep(1000);
	}

	@When("The users enters their passwordagain as {string}.")
	public void the_users_enters_their_passwordagain_as(String passwordagain) throws InterruptedException {
	    driver.findElement(By.cssSelector("#ap_password_check")).sendKeys("Nikunj1995");
	    Thread.sleep(1000);
	}

	@When("the users clicks the verify emailid button.")
	public void the_users_clicks_the_verify_emailid_button() {
	    driver.findElement(By.cssSelector("#continue")).click();
	}

	@Then("The user should see the tilte {string}.")
	public void the_user_should_see_the_tilte(String title) {
	   String actualTitle= driver.getTitle();
	   Assert.assertEquals(actualTitle, title);

	}

	
}
