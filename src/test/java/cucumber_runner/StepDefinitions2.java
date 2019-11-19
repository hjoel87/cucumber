package cucumber_runner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions2 {

    ChromeDriver driver=new ChromeDriver();

    @When("user bereit")
    public void user_bereit() {

    }

    @Then("seite laden")
    public void seite_laden() {

        driver.get("http://demo.guru99.com/");
    }

    @Then("email eingeben")
    public void email_eingeben(){
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }

    @When("user bereit amazon")
    public void user_bereit_amazon() {

    }


    @Then("seite laden amazon")
    public void seite_laden_amazon() {
        driver.get("https://www.amazon.com/ref=nav_logo");
    }

    @Then("suche eingeben gladiator")
    public void suche_eingeben_gladiator() {

        WebElement searchTermField = driver.findElement(By.id("twotabsearchtextbox"));
        String str_search = "gladiator blu ray";
        searchTermField.sendKeys(str_search);

        //test

        WebElement execSearch=driver.findElement(By.name("site-search"));
        execSearch.submit();

    }

    @Then("ergebnisse ausgeben")
    public void ergebnisse_ausgeben() {

    }

}
