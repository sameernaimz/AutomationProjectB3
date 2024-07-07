package io.loop.test.practice;

import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.sql.Driver;
import java.time.Duration;
import static org.testng.Assert.*;
/*

1. go to http://the-internet.herokuapp.com/dropdown
2. validate "Please select an option" is selected by default
3. Choose option 1 and validate that it is selected
4. Choose option 2 and validate that it is selected
5. Validate dropdown name is "Dropdown List"

 */
public class day5_task1 {

    WebDriver driver;
    String expected= "Please select an option";
    String actual;

            @BeforeMethod
        public void setUp() {
                driver = WebDriverUtil.getDriver("chrome");
                driver.manage().window().maximize();
                driver.navigate().to("http://the-internet.herokuapp.com/dropdown");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            }

@Test
        public void dropDownTest() {


    Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
    actual = dropdown.getFirstSelectedOption().getText();
    Assert.assertEquals(actual, expected,  "Not matching expected");

    dropdown.selectByValue("1");

    assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1");
   System.out.println(dropdown.getFirstSelectedOption().getText());

    dropdown.selectByVisibleText("Option 2");
    assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2");
   System.out.println(dropdown.getFirstSelectedOption().getText());

   //WebElement dropdownHeader = (driver.findElement(By.xpath("//div[@class='example']/h3")));
    WebElement dropdownHeader = driver.findElement(By.tagName("h3"));
 expected = "Dropdown List";
 actual = dropdownHeader.getText();
 Assert.assertEquals(actual, expected,  "Not matching expected");






}





    }

