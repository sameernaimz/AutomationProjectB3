package io.loop.test.day_7;

import io.loop.test.base.TestBase;
import io.loop.test.utiilities.DoctorConstants;
import io.loop.test.utiilities.DocuportUtils;
import io.loop.test.utiilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T3_webTables extends TestBase {

 /*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */
 @Test
 public void test_webTables() throws InterruptedException {
     DocuportUtils.login(driver, DoctorConstants.ADVISOR);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     WebElement user = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
     user.click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     String expectedFullName = "Alex De Souza";
     String actualFullName = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Full name");
     assertEquals(actualFullName, expectedFullName, "Actual does not match the expected");

     System.out.println("actualFullName = " + actualFullName);

     String expectedUserName = "alexdesouze";
     String actualUserName  = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "username");
     assertEquals(actualUserName, expectedUserName, "Actual does not match the expected");

     String expectedPhoneNumber = "+994512060042";
     String actualPhoneNumber = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "phone number");
     assertEquals(actualPhoneNumber, expectedPhoneNumber, "Actual does not match the expected");

     String expectedRole = "Client";
     String actualRole =  DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "role");
     assertEquals(actualRole, expectedRole, "Actual does not match the expected");

     String expectedAdvisor = "Batch1 Group1";
     String actualAdvisor = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "advisor");
     assertEquals(actualAdvisor, expectedAdvisor, "Actual does not match the expected");


}
}
