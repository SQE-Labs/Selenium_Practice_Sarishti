import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_rbtnl_Trip_1']")).click();

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("It's Enabled");
        }
        else
        {
            System.out.println("It's Disabled");
        }


        driver.findElement(By.id("divpaxinfo")).click();
        //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Thread.sleep(2000);
        int i = 1;
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }
}
