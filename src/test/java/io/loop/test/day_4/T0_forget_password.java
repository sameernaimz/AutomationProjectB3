package io.loop.test.day_4;

import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T0_forget_password {
    /*
    verify forgot password
    identify reset password heading using css and go from parent to child
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();

        // goto the url
        driver.get("https://beta.docuport.app");

        // forget password link
        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgetPasswordLink.click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println("forgetPasswordHeading.getText() = " + forgetPasswordHeading.getText());

}
}