package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.util.List;
/*HW1:
goto http://35.175.58.98/table-pagination-demo.php
print all the rows with remarks pass
remember to print rows from all pages of tables
 */
public class HomeWork1 extends CommonMethods {
    public static void main(String[] args) {

    String url="http://35.175.58.98/table-pagination-demo.php";
    String browser="chrome";
    openBrowserAndLaunchApplication(url,browser);

    List<WebElement> tableRemarks=driver.findElements(By.xpath("//section[@class='content']/tbody/tr/dt[i]"));

        for (int i = 0; i < tableRemarks.size(); i++) {
            String remarks=tableRemarks.get(i).getText();

            if(remarks.equalsIgnoreCase("pass")){
                WebElement clickNext= driver.findElement(By.xpath("//a[@class='next_link']"));
                clickNext.click();
                System.out.println(tableRemarks);
            }

        }



  }
}