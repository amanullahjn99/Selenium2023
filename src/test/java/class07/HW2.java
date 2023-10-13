package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import static utils.CommonMethods.*;

/*
Hw2:
http://35.175.58.98/synchronization-waits.php
click on click me button and get the text and print on screen
 */
public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-waits.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement clickMeBtn1= driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        clickMeBtn1.click();
        WebElement text1 = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        String text=text1.getText();
        System.out.println(text);
        closeBrowser();

    }
}