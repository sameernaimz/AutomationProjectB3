package io.loop.test.day_8;

import io.loop.test.utiilities.ConfigurationReader;
import io.loop.test.utiilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_upload {
        /*
    1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
    */

   @Test
    public void upload_file() throws InterruptedException {
       Driver.getDriver().get(ConfigurationReader.getProperties("guru.url"));
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input [@type='file']"));
       String path = "C://Users/naimz/Desktop";
        chooseFile.sendKeys(path);

        WebElement sumbitButton = Driver.getDriver().findElement(By.xpath("//button[@type='button']"));
        sumbitButton.click();

        Thread.sleep(3000);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//h3[@id = 'res']"));

        String expected = "1 file\n has been successfully uploaded";
        assertEquals(expected, successMessage.getText());


   }
}
