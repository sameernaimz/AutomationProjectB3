package io.loop.test.day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
/*
task2
=============
go to https://demoqa.com/nestedframes
Validate "Child Iframe" text
Validate "Parent Iframe" text
Validate the "Sample Nested Iframe page. There are nested iframes in this page. Us
e browser inspecter or firebug to check out the HTML source.
In total you can switch between the parent frame and the nested child frame."
 */
public class day6_2hw {
    WebDriver driver;

    @Test
    public void test() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");

// parent Iframe
         driver.switchTo().frame("frame1");
        WebElement parentFrameBody = driver.findElement(By.tagName("body"));
       String actual =  parentFrameBody.getText();
       String expected = "Parent frame";
       assertEquals(actual,expected, "actual does not match expected");

       //Child Iframe

       driver.switchTo().frame(0);
       WebElement childFrameBody = driver.findElement(By.tagName("p"));
        actual = childFrameBody.getText();
        expected = "Child Iframe";
        assertEquals(actual,expected, "actual does not match expected");
        // validate  the "Sample Nested Iframe page
        driver.switchTo().defaultContent();
        WebElement sample = driver.findElement(By.xpath("//div[@id = 'framesWrapper']"));
        actual = sample.getText();
        expected = "Nested Frames\n" +
                "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.";
        assertEquals(actual,expected, "actual does not match expected");

    }

}
