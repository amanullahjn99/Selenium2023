package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        //max the page
        driver.manage().window().maximize();

        //find the email address
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("Amanullahjn@yahoo.com");

        WebElement password=driver.findElement((By.name("pass")));
        password.sendKeys("aslfkjaflj");

        WebElement loginBtn=driver.findElement((By.name("login")));
        loginBtn.click();
    }
}
