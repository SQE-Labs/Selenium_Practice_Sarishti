import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    //implicit wait : 5 seconds time out
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.name("username")).sendKeys("guptasrishti428@gmail.com");
        driver.findElement(By.name("password")).sendKeys("sarishtimail");
        driver.findElement(By.className("c-cUYkx")).click();
        System.out.println(driver.findElement(By.cssSelector("h3.c-jiIMLs")).getText());
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@placeholder='Email or Username']")).sendKeys("guptasrisgmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Email or Username']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email or Username']")).sendKeys("guptasrishti428@gmail.com");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        //driver.findElement(By.className("c-cUYkx")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.name("username")).sendKeys("guptasrishti428@gmail.com");
        driver.findElement(By.name("password")).sendKeys("shoLAY123@1");
        driver.findElement(By.className("c-cUYkx")).click();


    }
}
