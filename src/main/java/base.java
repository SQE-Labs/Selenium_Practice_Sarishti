import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class base {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String[] ItemsNeeded = {"Cucumber", "Brocolli","Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //Thread.sleep(3000);
        addItems(driver, ItemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.xpath("//input[@class = 'promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class = 'promoBtn']")).click();
        //Explicit Wait
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[@class = 'promoInfo']"))));
        System.out.println(driver.findElement(By.xpath("//span[@class = 'promoInfo']")).getText());


    }

    public static void addItems(WebDriver driver, String[] ItemsNeeded)
    {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i<products.size(); i++) {

            String[] name = products.get(i).getText().split("-");
            String formattedname = name[0].trim();
            //Check whether the name you extracted is present in array or not
            //Convert array into arraylist

            List ItemsNeededList = Arrays.asList(ItemsNeeded);

            if(ItemsNeededList.contains(formattedname))
            {
                j++;
                driver.findElements(By.xpath("//div[@class = 'product-action']")).get(i).click();
                if(j==ItemsNeeded.length)
                {
                    break;
                }
            }
        }

    }
}
