package io.loop.test.day3;

import io.loop.test.utiilities.DoctorConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_css {

    /*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"


    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */
    public static void main(String[] args) throws InterruptedException {
        // go to url
        WebDriver driver = new ChromeDriver();
        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();


        // Identify the logo with the css
        //   WebElement logo= driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        //  String docuport = logo.getAttribute("alt");
        //    System.out.println("Docuport = " + docuport);

        // if(DoctorConstants.ERROR_MESSAGE.equals(docuport)) {
        //  System.out.println("Expected error message");
        //    System.out.println("Test passed");
        //   } else {
        //    System.out.println("Expected error message does not match actual");
        //  System.out.println("TEST FAIL");
      /*task 2
                =============
        1. login to docuport application
        2. logout from docuport application
        3. Validate successful login
        4. Validate successful logout */

            WebElement username = driver.findElement(By.cssSelector("[id='input-14']"));
            username.sendKeys(DoctorConstants.USERNAME_CLIENT);

            WebElement password = driver.findElement(By.cssSelector("[id='input-15']"));
            password.sendKeys(DoctorConstants.PASSWORD_CLIENT);

            WebElement login = driver.findElement(By.xpath("//div[@class='col col-12']"));
        Thread.sleep(3000);
        login.click();
        if(login.isDisplayed()) {
            System.out.println("VALIDATE Login message");
            System.out.println("Test PASSED");
        } else {
            System.out.println("VALIDATE Login message does not match actual");
            System.out.println("TEST FAIL");
        }
            Thread.sleep(3000);
            WebElement Continue = driver.findElement(By.xpath("//button [@type='submit']"));

            Continue.click();
                Thread.sleep(2000);
            WebElement next = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
            next.click();

            WebElement logOut = driver.findElement(By.xpath("//span[.='Log out']"));
            logOut.click();
            if(logOut.isDisplayed()) {
                System.out.println("validate Log0ut message");
                System.out.println("TEST PASSED");
            }else {
                System.out.println("validate LogOut message does not match actual");
                System.out.println("TEST FAIL");
            }



        }
    }

