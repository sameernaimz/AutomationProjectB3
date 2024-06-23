package io.loop.test.practice;

import io.loop.test.utiilities.DoctorConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Etsy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5005);
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        Thread.sleep(5005);


        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("Wooden Spoon");
        searchBox.click();


        Thread.sleep(5005);
        String expectedTitle = "Wooden Spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title is: " + actualTitle + " Matches Expected title: " + expectedTitle + " -->>TEST PASS!");
        }else {
            System.out.println("Actual title is: " + actualTitle + " DOESNT MATCH expected Title: " + expectedTitle + " -->>TEST FAIL!");
            driver.quit();
        }
            }
        }


