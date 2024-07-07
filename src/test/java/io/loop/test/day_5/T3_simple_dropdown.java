package io.loop.test.day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T3_simple_dropdown {

    //1. Open Chrome browse
    //2. Go to http://the-internet.herokuapp.com/dropdown
    //3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option
    WebDriver driver;
    String expected = "Please select an option";
    String actual;

    @BeforeMethod
    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dropDownTest() {
        driver.get(" http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Ceate a dropdown
        //WebElement dropDownElement =
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        actual = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected, "actual does not match expected");
        WebElement option = driver.findElement(By.xpath("//div[@class='example']/h3"));

        if (option.getText().equals("Dropdown List")) {
            System.out.println("dropdown selected" + option.getText() + "matches");
        }
    }
}
