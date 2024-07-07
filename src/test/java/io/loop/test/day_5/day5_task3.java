package io.loop.test.day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.loop.test.utiilities.DoctorConstants.PASSWORD_CLIENT;
import static io.loop.test.utiilities.DoctorConstants.USERNAME_ADVISOR;

/*
task3
=============
1. login as an advisor
2. go to received document
3. click search
4. click status dropdown
5. choose in progress
 */
public class day5_task3 {
WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://beta.docuport.app/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void Test() {
        WebElement login = driver.findElement(By.xpath("//input[@id='input-14']"));
        login.sendKeys(USERNAME_ADVISOR);
        WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));
        password.sendKeys(PASSWORD_CLIENT);

        WebElement submitButton = driver.findElement(By.xpath("//div[@class='col col-12']"));
submitButton.click();

        WebElement rDoc = driver.findElement(By.xpath("//div[.='Received docs']"));
        rDoc.click();

        WebElement search = driver.findElement(By.xpath("//span[.='Search']"));
        search.click();

        WebElement statusDropdown = driver.findElement(By.xpath("//input[@id='input-111']"));
        statusDropdown.click();

        WebElement inProgress = driver.findElement(By.xpath("//div[.='In progress']"));
        inProgress.click();

    }
        }

