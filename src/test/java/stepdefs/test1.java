package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test1 {
    public static WebDriver driver;
    Class<? extends WebDriver> driverClass = null;

    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
        WebDriverManager.config().setTargetPath("drivers");
//        WebDriverManager.config().setDriverVersion("Win32_3.14.0");

        driverClass = ChromeDriver.class;
        WebDriverManager.getInstance(driverClass).setup();
        driver = driverClass.newInstance();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
        driver.findElement(By.name("email")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String actual = driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.quit();
    }
}
