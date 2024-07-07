package io.loop.test.day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TB00_staleElementException {
    public static void main(String[] args) {
        //1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        // Open chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //CLICK THE ADD BUTTON
        WebElement addButton = driver.findElement(By.xpath("//button[contains(.,'Add Element')]"));
        addButton.click();

        WebElement DELETEButton = driver.findElement(By.xpath("//button[contains(.,'Delete')]"));
        if(DELETEButton.isDisplayed()) {
            System.out.println("Delete button is displayed");
        } else {
            System.out.println("Delete button is not displayed");
        }
        DELETEButton.click();
        try {
            DELETEButton.isDisplayed();
        } catch (StaleElementReferenceException e) {
            System.out.println("Exception Handled");
            System.out.println("Element is not displayed");

        }
    }
}
