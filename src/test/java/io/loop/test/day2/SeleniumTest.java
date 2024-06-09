package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {


        // setting up the web driver
        //WebDriverManager.chromedriver().setup(); but we do not need it with selenium 4.212
        //
        WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //navigate to the web page
        driver.get("https://www.loopcamp.io");
        driver.navigate().to("https://etsy.com");

        //navigate back
        driver.navigate().back();

        //forward
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();
        //quit close
        // driver.close();
        driver.quit();



    }
}
