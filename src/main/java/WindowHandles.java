import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.className("blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        String extractedText = driver.findElement(By.xpath("//p [@class = 'im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        //System.out.println(extractedText[0]);
        driver.switchTo().window(parentid);
        driver.findElement(By.id("username")).sendKeys(extractedText);


    }
}
