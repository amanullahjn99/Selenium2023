package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionClass2 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action=new Actions(driver);
        action.moveToElement(hover).perform();
    }
}