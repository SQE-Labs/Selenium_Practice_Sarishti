import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) {
        //initialization of chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.name("username")).sendKeys("guptasrishti428@gmail.com");
        driver.findElement(By.name("password")).sendKeys("shoLAY123@1");
        driver.findElement(By.className("c-cUYkx")).click();
        driver.findElement(By.className("ui-icon-chevron-down")).click();
        driver.findElement(By.xpath("//li[@class='profile-nav-item'][9]")).click();
        driver.close();
    }
}
