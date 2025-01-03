import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Give me the count of links on this page
        System.out.println(driver.findElements(By.tagName("a")).size());

        //Get me the count of Links on Footer Section
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        //Get me the count of Links on Footer Section for only first coloumn
        WebElement ColumnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(ColumnDriver.findElements(By.tagName("a")).size());

        //Click on each link and check if the pages are opening
        for(int i=1;i<ColumnDriver.findElements(By.tagName("a")).size() ; i++)
        {
            String ClickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
            ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLink);
            Thread.sleep(5000);

        }
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();

        while (it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}
