
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        String Textsaved = driver.findElement(By.xpath("//label[@for = 'benz']")).getText();
        WebElement dropdownstatic = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(dropdownstatic);
        dropdown.selectByVisibleText(Textsaved);
        driver.findElement(By.xpath("//fieldset[@class = 'pull-right']/input[@id = 'name']")).sendKeys(Textsaved);
        driver.findElement(By.xpath("//fieldset[@class = 'pull-right']/input[@id = 'alertbtn']")).click();
        String alertmessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        String[] extracted = alertmessage.split(",");
        String[] ExtractedString =  extracted[0].split(" ");
        Assert.assertEquals(ExtractedString[1],Textsaved);


    }
}
