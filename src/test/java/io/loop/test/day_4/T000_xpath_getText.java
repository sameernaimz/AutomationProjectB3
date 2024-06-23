package io.loop.test.day_4;

import io.loop.test.utiilities.DoctorConstants;
import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T000_xpath_getText {

     /*
    1. open chrome
    2. go to docuport
    3. click on forgot password
    4. validate url contains: reset-password
    5. validate - Enter the email address associated with your account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate send button is displayed
    8. validate cancel button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */

    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        //3 click on forgot password
        WebElement forgotPassword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPassword.click();
        // 4. validate url contains: reset password
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(DoctorConstants.RESET_PASSWORD)){
            System.out.println("Acutual url matches expected one");
        } else {
            System.err.println("Actual url DOES NOT match expected one");
        }
        //5. validate - Enter the email address associated with yor account
WebElement validateMessage = driver.findElement(By.xpath(""));

    }
}
