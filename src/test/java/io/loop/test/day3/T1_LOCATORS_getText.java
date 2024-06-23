package io.loop.test.day3;

import io.loop.test.utiilities.DoctorConstants;
import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class T1_LOCATORS_getText {
    public static void main(String[] args) {
        /*
         * go to docuport
         * enter username
         * do NOT enter password
         * click on login button
         * verify error message - please enter password
         */

        // go to the url
        WebDriver driver = WebDriverUtil.getDriver("Chrome");
        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DoctorConstants.USERNAME_CLIENT);


        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
        System.out.println(errorMessage.getText());
        String actualErrorMessage = errorMessage.getText();


        if (actualErrorMessage.equals(DoctorConstants.ERROR_MESSAGE)) {
            System.out.println("Expected error message: " + DoctorConstants.ERROR_MESSAGE + ", matches actual error message: " + actualErrorMessage + " => TEST PASS");
        } else {
            System.out.println("Expected error message: " + DoctorConstants.ERROR_MESSAGE + ", DOES NOT MATCH actual error message: " + actualErrorMessage + " => TEST FAIL");
        }


    }

}