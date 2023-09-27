package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    /*goto https://demoqa.com/text-box
and use xpath to fill the form
and quit it

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullname.sendKeys("Ahman Ahmad");

        WebElement email=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        email.sendKeys("aman.ahmad@yahoo.com");

        WebElement currentAdd=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAdd.sendKeys("3232 Dulfin pl Virgina 332212 USA");

        WebElement parmanentAdd=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        parmanentAdd.sendKeys("2302 Jeff hwy VA 22331 USA");
        Thread.sleep(1000);

       WebElement submitBTN=driver.findElement(By.linkText("//button[@id='submit']"));
       submitBTN.click();

       driver.quit();

    }
}
