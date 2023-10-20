package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import static utils.CommonMethods.openBrowserAndLaunchApplication;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/upload-image.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//        find the uplaod element
        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='image-file']"));

//        make sure to change the path because its located in my computer
        fileUpload.sendKeys("C:\\Users\\ahmad\\OneDrive\\Desktop.jpg");


    }
}