package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*HW1:
goto  http://35.175.58.98/handle-iframe.php
click the checkbox
then select the  babycat
then enter topic name
all of this must be done in the same order
 */
public class HomeWork1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().defaultContent();

        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(frame1);

        WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(animal);
        sel.selectByVisibleText("Baby Cat");
    }

}
