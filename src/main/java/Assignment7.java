import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class Assignment7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.className("ui-autocomplete-input")).sendKeys("uni");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class = 'ui-menu-item']/div"));
        for (WebElement option : options)
        {
            if(option.getText().equalsIgnoreCase("United Kingdom (UK)"))
            {
                option.click();
                break;
            }
        }
    }
}
