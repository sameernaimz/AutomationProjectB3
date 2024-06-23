package io.loop.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoTask2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/forgot-password.html");
 // locate 5 elements
        WebElement forgetPassword  = driver.findElement(By.cssSelector("form[id='forgot_password']"));
        System.out.println("forgot_password:" + forgetPassword.isDisplayed());

                WebElement email  = driver.findElement(By.cssSelector("label[for = 'email']"));
                System.out.println("email:" + email.isDisplayed());

        WebElement emailInput  = driver.findElement(By.cssSelector("input[id='email']"));
        System.out.println("emailInput:" + emailInput.isDisplayed());

        WebElement retrivePassword  = driver.findElement(By.cssSelector("i[class = 'icon-2x icon-signin']"));
        System.out.println("retrivePassword:" + retrivePassword.isDisplayed());

        WebElement poweredByLoopCamp  = driver.findElement(By.cssSelector("div[class='large-4 large-centered columns']"));
        System.out.println("PoweredBYLOOPCAMP:" + poweredByLoopCamp.isDisplayed());





    }
}
