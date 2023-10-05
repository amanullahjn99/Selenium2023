package class06;

import class02.Task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("https://accounts.google.com/accountchooser/identifier?checkedDomains=youtube&continue=https%3A%2F%2Fmail.google.com&dsh=S-150890685%3A1696468162605755&flowEntry=AccountChooser&flowName=GlifWebSignIn&hl=en&ifkv=AYZoVhcE5ICh8QAPfy1EuyOfsEy70aEGfr8p2qr0B9nAxIDvGf9B0opd62T-s0V5KQ83AAFMLg2nzA&pstMsg=1&theme=glif");
//        maximize the window
        driver.manage().window().maximize();

        //click on help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        //click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        helpBtn.click();
        privacyBtn.click();

        //Task1
        //  get the window handle of the main page i.e gmail.com and print it out on console
        // as our webdriver i scurrently focused on gmail page
        // we can use  driver.getWondowshandle() to get the handle of the current page i.e gmail.com

        String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);

        //Task2
        //switch the focus of your webdriver to the privacy wondow

        //get all the handles and find the desired one
        Set<String> allHandles = driver.getWindowHandles();

        //loop through all the handles and find the one that is desired
        for (String handles : allHandles) {
            driver.switchTo().window(handles);
            //get the title of the wondow on which the fouse is
            String title = driver.getTitle();

            //check if the title matches ur desired title, if yes break the loop, if no repeat the process
            if (title.equalsIgnoreCase("Privacy Policy – Privacy &amp; Terms – Google")) {
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }


}
