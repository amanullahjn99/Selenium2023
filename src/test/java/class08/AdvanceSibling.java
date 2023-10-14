package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AdvanceSibling extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/advanceXpath.php";
        String browser = "chromoe";
        openBrowserAndLaunchApplication(url, browser);
        WebElement follwingSibling = driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]\n"));
        follwingSibling.sendKeys("Hello");

    }
}
