package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {

    public static void main(String[] args) {

        // create driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to loopcamp practice page
        https://loopcamp.vercel.app
        driver.get("https://loopcamp.vercel.app/registration_form.html");

      //  WebElement firstName = driver.findElement(By.name("firstname"));
        // firstName.sendKeys("loop");

        WebElement withClassName = driver.findElement(By.className("firstname"));
        withClassName.sendKeys("loop");

        WebElement lastnameWithClass = driver.findElement(By.className("form-control"));
        lastnameWithClass.sendKeys("Academy");

        WebElement lastName = driver.findElement(By.name("form-control"));
        lastName.sendKeys("Academy");

        WebElement LastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Academy");

        WebElement  female = driver.findElement(By.name("gender"));
        female.click();

    }
}
