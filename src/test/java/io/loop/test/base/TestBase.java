package io.loop.test.base;

import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

    }
   // @AfterMethod
    public void tearDown() {
        // driver.close();

    }
}
