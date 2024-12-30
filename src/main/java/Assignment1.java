import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//div[@class = 'form-group']/input[@name = 'name']")).sendKeys("Sarishti");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sarishti@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sarishti123");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(1);
        //System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("23-10-2001");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class = 'alert alert-success alert-dismissible']")).getText());



    }
}
