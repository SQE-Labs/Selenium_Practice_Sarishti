import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CalendarTest {
    public static void main(String[] args) {
        String month = "6";
        String date = "15";
        String year = "2027";
        String[] ExpectedList = {month, date, year};
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.className("react-date-picker__inputGroup__year")).click();
        driver.findElement(By.className("react-calendar__navigation__label__labelText--from")).click();
        driver.findElement(By.className("react-calendar__navigation__label__labelText--from")).click();
        driver.findElement(By.xpath("//button[text() = "+year+"]")).click();
        driver.findElement(By.xpath("//button[@class = 'react-calendar__tile react-calendar__year-view__months__month']["+month+"]")).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

        List<WebElement> ActualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for (int i = 0; i < ActualList.size(); i++) {
            System.out.println(ActualList.get(i).getAttribute("value"));
            Assert.assertEquals(ActualList.get(i).getAttribute("value"), ExpectedList[i]);
        }

    }
}
