package io.loop.test.day_7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class task3Day7 extends TestBase {
    /*
    go to https://loopcamp.vercel.app/
click "Multiple Windows" link
Validate "Powered by Loopcamp" is displayed
Validate title is "Windows"
Click - click here
Switch to new window and validate title

     */
    @Test
    public void test() {
        driver.get("https://loopcamp.vercel.app/");
        WebElement Mw = driver.findElement(By.xpath("//a[.='Multiple Windows']"));
        Mw.click();

        WebElement poweredByLoop = driver.findElement(By.xpath("//div [contains(text(),'Powered by')]"));
        String expectedIsDisplayed = "Powered by LOOPCAMP";
        String actualIsDisplayed = poweredByLoop.getText();
        assertEquals(actualIsDisplayed,expectedIsDisplayed, "Actual does not match expected");

        WebElement titleWindows = driver.findElement(By.xpath("//title[contains(text(), 'Windows')]"));
        expectedIsDisplayed = "";
        actualIsDisplayed = titleWindows.getText();
        assertEquals(actualIsDisplayed,expectedIsDisplayed, "Actual does not match expected");

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        clickHere.click();

        System.out.println("driver.getTitle"+  driver.getTitle());
        String firstWindow = driver.getWindowHandle();



            driver.switchTo().window(firstWindow);
            expectedIsDisplayed =  "Windows";
            actualIsDisplayed = driver.getTitle();
            assertEquals( expectedIsDisplayed , actualIsDisplayed, "Actual does not match the expected");


        }

    }

