package io.loop.test.practice;

import io.loop.test.utiilities.DoctorConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//=============
//1. navigate to docuport application
//2. validate placeholders for user name and password
//3. without sending username and password click login button
//4. validate username and password error messages
public class autoTask3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement login = driver.findElement(By.xpath("//div[@class='col col-12']"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//div[.= 'Please enter your username or email address'] "));
        String errorUsername = username.getText();

        WebElement password = driver.findElement(By.xpath("//div[.= 'Please enter your password'] "));
        String errorPassword = password.getText();

        if (DoctorConstants.ERROR_USERNAME.equals(errorUsername)) {

            System.out.println("Expected error message for Username please enter Username");
            System.out.println("Test passed");

        } else {
            System.out.println("Expected error message does not match actual username");
            System.out.println("TEST FAIL");

            System.out.println("--------------------------------------");
        }
            if (DoctorConstants.ERROR_MESSAGE.equals(errorPassword)) {

                System.out.println("Expected error message For password please enter Password");
                System.out.println("Test passed");

            } else {
                System.out.println("Expected error message does not match actual");
                System.out.println("TEST FAIL");


            }
    }
}
