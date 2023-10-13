package class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

import static utils.CommonMethods.driver;
import static utils.CommonMethods.openBrowserAndLaunchApplication;

/*http://35.175.58.98/synchronization-explicit-wait.php
click to open alert and handle it
click to change text and get the chnaged text
click to get hidden button click on it
click to get tge checkbox selected and print if it is selected or not
 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //click top open alert
        WebElement alertBtn =  driver.findElement(By.cssSelector("button[id='show_alert']"));

        alertBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //click to change text and get the changed text
        WebElement changeBtn = driver.findElement(By.id("changetext_button"));
        changeBtn.click();
        WebElement newText = driver.findElement(By.xpath("//h2[text() = 'Ssyntaxtechs']"));
        wait.until(ExpectedConditions.visibilityOf(newText));
        System.out.println("The new text is: "+newText.getText());

        WebElement displayBtn = driver.findElement(By.id("enable_button"));
        displayBtn.click();
        WebElement enabledBtn = driver.findElement(By.xpath("//button[text()='Button']"));
        wait.until(ExpectedConditions.elementToBeClickable(enabledBtn));
        enabledBtn.click();

        WebElement checkBoxBtn = driver.findElement(By.id("checkbox_button"));
        checkBoxBtn.click();
        WebElement checkBox = driver.findElement(By.id("checkbox"));
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        boolean checkBoxStatus = checkBox.isSelected();
        System.out.println("Is the check box selected: "+checkBoxStatus);


    }
}