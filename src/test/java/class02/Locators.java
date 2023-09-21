package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        //istance
        WebDriver driver=new ChromeDriver();
        //navigate to the website
        driver.get("http://35.175.58.98/input-form-locator.php");
        //maximize the window
        driver.manage().window().maximize();
        //locate the WebElement first name
        WebElement firstName = driver.findElement(By.id("first_name"));
        //use send keys to send the data to webelement
        firstName.sendKeys("Aman");

        //locate the WebElement last name
        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("Ahmadzai");

        // locate the WebElement email
        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("aman.ahmad@yahoo.com");

        //locate the button and click on It
        WebElement submitbtn=driver.findElement(By.tagName("button"));
        submitbtn.click();

        //locate the Webelement link
        WebElement linkBtn=driver.findElement(By.linkText("Link"));
        linkBtn.click();

        // locate the webElement click here using partial link text
        WebElement clickHere=driver.findElement(By.linkText("Here."));
        clickHere.click();
    }
}
