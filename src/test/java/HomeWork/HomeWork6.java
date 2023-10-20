package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork6 {
    public static void main(String[] args) {
        //http://35.175.58.98/no-select-tag-dropdown-demo.php
        //select your dream destination from this calender

        //Creating an object of the class
        WebDriver driver = new ChromeDriver();
        //get to the website
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");

        //Clicking on dreamDestination
        WebElement dreamDestination = driver.findElement(By.xpath("//div[contains(text(),'Dream')]"));
        dreamDestination.click();

        WebElement country = driver.findElement(By.xpath("//a[contains(text(),'Greece')]"));
        country.click();
    }
}
