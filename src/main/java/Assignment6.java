import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> rowcount = driver.findElements(By.xpath("//table[@class = 'table-display']/tbody/tr"));
        List<WebElement> coloumncount = driver.findElements(By.xpath("//table[@class = 'table-display']/tbody/tr[2]/td"));

        System.out.println("Total no. of Rows : "+rowcount.size()+", Total no. of Columns : "+coloumncount.size());
        List<WebElement> values = driver.findElements(By.xpath("//table[@class = 'table-display']/tbody/tr[3]/td"));
        for(int i = 0; i<values.size(); i++){
            System.out.println(values.get(i).getText());
        }
    }
}
