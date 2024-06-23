package io.loop.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class GoogleTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // maximize screen
        driver.manage().window().maximize();
        // get to google
        driver.get("https://www.google.com");
        // find element by text
        WebElement GmailLinkWithText = driver.findElement(By.linkText("Gmail"));
        // get text and click
        System.out.println(GmailLinkWithText.getText());
        GmailLinkWithText.click();

        // expected Title
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        Thread.sleep(500);
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual Title is " + actualTitle + " Expected: " + expectedTitle + " -->>TEST PASS!");
        }else {
            System.out.println("Actual Title is " + actualTitle + " Expected: " + expectedTitle + " -->>TEST FAIL!");
        }
        Thread.sleep(500);

        driver.navigate().back();
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Actual Title is " + actualTitle2 + " Expected: " + expectedTitle2 + " -->>TEST PASS!");
        } else {
            System.out.println("Actual Title is" + actualTitle2 + " Expected: " + expectedTitle2 + " -->>TEST FAIL!");
        }
    }
}
