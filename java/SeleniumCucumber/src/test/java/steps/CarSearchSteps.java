package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CarSearchSteps {

    private static WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/development/test_automation/cucumber/java/SeleniumCucumber/resources/chromedriver");
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {

        driver.quit();

    }

    @After
    public void teatDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

        if (driver != null) {
            driver.quit();
        }

    }

    @Given("I am on the home page http:\\/\\/www.carsguide.com.au for carsguide website")
    public void i_am_on_the_home_page_http_www_carsguide_com_au_for_carsguide_website() {

        driver.get("http://www.carsguide.com.au");

    }

    @When("I move to buy + sell")
    public void i_move_to_buy_sell() {

        WebElement menu = driver.findElement(By.xpath("//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/a"));
        new Actions(driver).moveToElement(menu).perform();
    }

    @When("I click on Search Cars")
    public void i_click_on_Search_Cars() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"u_H\"]/div/div[1]/ul/li[1]/div/div/div[1]/ul/li[1]/a")).click();
        Thread.sleep(1000);

    }

    @When("I select Any Make as {string}")
    public void i_select_Any_Make_as(String make) {

       new Select(driver.findElement(By.xpath("//*[@id=\"makes\"]"))).selectByVisibleText(make);

    }

    @When("I select Any Model as {string}")
    public void i_select_Any_Model_as(String model) {

        new Select(driver.findElement(By.xpath("//*[@id=\"models\"]"))).selectByVisibleText(model);

    }

    @When("I select Any Location as {string}")
    public void i_select_Any_Location_as(String location) {

        new Select(driver.findElement(By.xpath("//*[@id=\"locations\"]"))).selectByVisibleText(location);

    }

    @When("I select price\\(max) as {string}")
    public void i_select_price_max_as(String price) {

        new Select(driver.findElement(By.xpath("//*[@id=\"priceTo\"]"))).selectByVisibleText(price);

    }

    @When("I click on Find My Next Car button")
    public void i_click_on_Find_My_Next_Car_button() {

        driver.findElement(By.xpath("//*[@id=\"search-submit\"]")).click();

    }

    @Then("I should see list of searched cars")
    public void i_should_see_list_of_searched_cars() {

    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expected) throws InterruptedException {

        Assert.assertEquals(expected, driver.getTitle());

    }

}
