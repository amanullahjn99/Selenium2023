package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/*HW2:
goto gmail.com
click on help
click on privacy
click on terms
switch the focus on terms page and get the title and print on screeen
then switch the focus back to the gmail page
and print the title of the main page on screen
 */
public class HomeWork2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/createaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp&theme=glif");
        driver.manage().window().maximize();
        //click on help
        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
        help.click();

        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        WebElement term = driver.findElement(By.xpath("////a[text()='Terms']"));
        term.click();

        Set<String> allHandles = driver.getWindowHandles();

        for (String handles1 : allHandles) {
            driver.switchTo().window(handles1);

            String title = driver.getTitle();

            if (title.equalsIgnoreCase("Terms of Service")) {
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}