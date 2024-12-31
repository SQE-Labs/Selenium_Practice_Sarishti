import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class base {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String[] ItemsNeeded = {"Cucumber", "Brocolli","Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver, ItemsNeeded);

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
