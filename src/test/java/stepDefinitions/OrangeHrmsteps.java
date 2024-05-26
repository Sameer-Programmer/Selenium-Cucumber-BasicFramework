package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHrmsteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("launch the browser")
    public void launch_the_browser() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @When("login the orangehrm")
    public void login_the_orangehrm() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Then("verify the presence of Logo on home page")
    public void verify_the_presence_of_logo_on_home_page() {
        boolean status = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='orangehrm-login-branding']//img[@alt='company-branding']")
        )).isDisplayed();
        Assert.assertTrue(status);
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
