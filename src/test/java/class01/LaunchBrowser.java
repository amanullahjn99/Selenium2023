package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //use the river.get() method
        driver.get("https://www.google.com");

        //maximize ur window
        driver.manage().window().maximize();

        //get the url of the Website
        String currentUrl=driver.getCurrentUrl();
        System.out.println("the current url is :"+currentUrl);

        //get the title
       String tile= driver.getTitle();
        System.out.println("the title of the page is :"+tile);

        //added a wait for 2 seconds to slow the closing of window
           // delete the sleep after you're done with the script
        Thread.sleep(2000);

        //close the browser
        driver.close();

        //
    }
}
