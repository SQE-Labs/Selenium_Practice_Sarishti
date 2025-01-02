import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=668803176719&utm_campaign=Search-Brand-APAC-Navigational&utm_campaigncode=Core+1007801&utm_term=e+browserstack&gad_source=1&gclid=Cj0KCQiAj9m7BhD1ARIsANsIIvA5MCfzb3zCitLfQo9pi5RIoiYrmC77lImicrbL83vyvkTgogrhXWcaAq_kEALw_wcB");
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//button[@class = 'bstack-mm-btn bstack-mm-btn-developers']"));
        a.moveToElement(move).build().perform();
        //driver.findElement(By.xpath("//div[@class = 'bstack-mm ']/button[3]")).click();
        //How to write in CAPITAL LETTERS
        a.click(driver.findElement(By.xpath("//div[@class = 'bstack-mm ']/button[3]"))).keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        a.doubleClick(driver.findElement(By.xpath("//input[@type = 'search']"))).build().perform();
        a.moveToElement(move).contextClick().build().perform();

    }
}
