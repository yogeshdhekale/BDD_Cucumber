package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefination {
    WebDriver driver;

    @Given("^user is already on login screen$")
    public void user_is_already_on_login_screen()  {
        String chromePath = "/Users/yogeshdhekale/Downloads/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/index.html");
    }

    @When("^title of webpage is E-banking$")
    public void title_of_webpage_is_E_banking()  {
        String titel = driver.getTitle();
        System.out.println(titel);
        Assert.assertEquals("Free CRM  - CRM software for customer relationship management, sales, and support.", titel);
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("siliconyoga");
        driver.findElement(By.name("password")).sendKeys("@Sept2021");
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
    }

    @Then("^user is on homepage$")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        }
}