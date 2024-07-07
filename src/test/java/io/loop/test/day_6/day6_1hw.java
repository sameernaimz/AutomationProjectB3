package io.loop.test.day_6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.time.Duration;

/*
task1
=============
go to https://demoqa.com/alerts
click - click button to see alert
handle alert
click - On button click, alert will appear after 5 seconds
handle alert
click - On button click, confirm box will appear
click ok and validate - You selected Ok
after that do it again this time cancel and validate - You selected Cancel
click - On button click, prompt box will appear
enter "Loop Academy" and validate You entered Loop Academy
 */
public class day6_1hw {
WebDriver driver;

@Test
    public void day6() throws InterruptedException {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/alerts");
// click button to see alert

    WebElement Alert1 = driver.findElement(By.xpath("//button [@id = 'alertButton']"));
    Alert1.click();

    //handle alert
    Alert alert = driver.switchTo().alert();
    alert.accept();

// 5 second alert
    WebElement clickOnButton = driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
    clickOnButton.click();

Thread.sleep(5000);
    alert.accept();
//click - On button click, confirm box will appear
//click ok and validate - You selected Ok

    WebElement OnButtonClick = driver.findElement(By.xpath("//button [@id ='confirmButton']"));
OnButtonClick.click();

driver.switchTo().alert().accept();
String expected = "Click me";
String actual = OnButtonClick.getText();
assertEquals(actual,expected , "Actual Does not match expected value'");

WebElement pressOK = driver.findElement(By.xpath("//*[@id='confirmResult']"));

expected = "You selected Ok";
    actual = pressOK.getText();
    assertEquals(actual,expected , "Actual Does not match expected value'");

    //Cancel
    WebElement OnButtonClick2 = driver.findElement(By.xpath("//button [@id ='confirmButton']"));
    OnButtonClick2.click();
    driver.switchTo().alert().dismiss();
    WebElement pressCancel = driver.findElement(By.xpath("//*[@id='confirmResult']"));

    expected = "You selected Cancel";
    actual = pressCancel.getText();
    assertEquals(actual,expected , "Actual Does not match expected value'");

    //click - On button click, prompt box will appear
    //enter "Loop Academy" and validate You entered Loop Academy

WebElement prompt = driver.findElement(By.xpath("//*[@id='promtButton']"));
prompt.click();

String text = "Loop Academy";

alert.sendKeys(text);
alert.accept();
WebElement successPrompt = driver.findElement(By.xpath("//*[@id='promptResult']"));
actual =  successPrompt.getText();
expected = "You entered Loop Academy";
assertEquals(actual,expected , "Actual Does not match expected value'");

}
}
