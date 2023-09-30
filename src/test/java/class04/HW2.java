package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.
 */
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");

        //locate the female Radio btn
        WebElement femaleRadiobtn= driver.findElement(By.xpath("//input[@value='gender-female' and @name='gender-identity']"));
        boolean femaleStatus = femaleRadiobtn.isDisplayed();
        System.out.println("Display Status :"+femaleStatus);
        //if its displayed then click on show button
        WebElement btnShow=driver.findElement(By.xpath("//button[@id='toggleRadioButtons']"));
        if(femaleStatus){
            btnShow.click();
        }
        //check again female radio btn is displayed or not
        boolean checkAgain=femaleRadiobtn.isDisplayed();
        System.out.println("Checking the status again :"+ checkAgain);

    }
}
