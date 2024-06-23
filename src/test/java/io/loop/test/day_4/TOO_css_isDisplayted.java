package io.loop.test.day_4;

import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TOO_css_isDisplayted {
    /*
    https://the-internet.herokuapp.com/forgot_password
     */

        public static void main(String[] args) {

            WebDriver driver = WebDriverUtil.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/forgot_password");
        }

        }
