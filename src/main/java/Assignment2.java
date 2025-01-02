import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//input[@value = 'user']//following::span[@class = 'checkmark']")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("okayBtn")).click();
        Thread.sleep(3000);

        WebElement staticDropdown = driver.findElement(By.cssSelector("select[class=form-control]"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        List<WebElement> products = driver.findElements(By.xpath("//button[@class ='btn btn-info']"));
        //System.out.println(products.size());
        for(int i=0; i< products.size(); i++)
        {
            driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        }

        driver.findElement(By.partialLinkText("Checkout")).click();

    }
}
