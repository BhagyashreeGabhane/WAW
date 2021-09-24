import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WAW01 {
    WebDriver driver = new ChromeDriver();


        @Given("Search box and search button is given")
        public void searchBoxAndSearchButtonIsGiven () {
        driver.get("https://weather-app-02.netlify.app/");
        }

        @When("we enter any city name")
        public void weEnterAnyCityName () {
            driver.findElement(By.className("form-control")).sendKeys("Amravati");
        }

        @Then("search box should accept city name")
        public void searchBoxShouldAcceptCityName () {
            driver.findElement(By.className("btn btn-secondary")).click();
        }

    @Given("Weather application should be open")
    public void weatherApplicationShouldBeOpen() {
            driver.get("https://weather-app-02.netlify.app/");
            System.out.println("another scenario");
    }

    @When("user enter invalid user name like {string}")
    public void userEnterInvalidUserNameLike(String arg0) {
            driver.findElement(By.className("form-control")).sendKeys("ABC");
    }

    @And("click on search button")
    public void clickOnSearchButton() {
            driver.findElement(By.className("btn btn-secondary")).click();
    }

    @Then("user should see error message like {string}")
    public void userShouldSeeErrorMessageLike(String arg0) {
           String actualerror =driver.findElement(By.className("alert-heading h4")).getText();
           String expectederror =arg0;
           if(expectederror.equals(actualerror)){
               System.out.println("PASS");
           }else {
               System.out.println("FAIL");
           }
    }
}
