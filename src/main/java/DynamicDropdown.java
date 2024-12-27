import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        //(//a[@value = 'MAA'])[1]


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value = 'BLR'])")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();

    }
}
