package io.loop.test.day_5;

import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class T0_radioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");
        //Selenium 3
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
        WebElement Green = driver.findElement(By.xpath("//input[@id='green']"));

        //IsSelected()

        System.out.println("Red.isSelected() BEFORE CLICKING: " + red.isSelected());
        red.click();

        System.out.println("Green.isSelected() AFTER CLICKING: " + Green.isSelected());
        Green.click();

        //IsEnabled()
        System.out.println("red" + red.isEnabled());
        System.out.println("Green" + Green.isEnabled());

    }
}
