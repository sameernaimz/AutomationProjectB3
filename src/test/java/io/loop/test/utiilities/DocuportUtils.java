package io.loop.test.utiilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class DocuportUtils {
    /**
     * logins to the docuport application
     * @param driver; which initialized in the test base
     * @param role, comes from docuport constants
     *              author NADIR
     */
    public static void login(WebDriver driver, String role) throws InterruptedException {
        driver.get("https://beta.docuport.app/");
        WebElement username = driver.findElement(By.xpath("//label[.= 'Username or email']/following-sibling::input"));
        WebElement password = driver.findElement(By.xpath("//input[@type ='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        switch(role.toLowerCase()) {
            case "client":
                username.sendKeys(DoctorConstants.USERNAME_CLIENT);
                password.sendKeys(DoctorConstants.PASSWORD_CLIENT);
                break;
            case "supervisor":
                username.sendKeys(DoctorConstants.USERNAME_SUPERVISOR);
                password.sendKeys(DoctorConstants.PASSWORD_CLIENT);
                break;
            case "advisor":
                username.sendKeys(DoctorConstants.USERNAME_ADVISOR);
                password.sendKeys(DoctorConstants.PASSWORD_CLIENT);
                break;
            case "employee":
                username.sendKeys(DoctorConstants.USERNAME_EMPLOYEE);
                password.sendKeys(DoctorConstants.PASSWORD_CLIENT);
                break;
            default: throw new InterruptedException("there is not such a role" + role);


        }
        loginButton.click();
        if(role.toLowerCase().equals("client")) {
            Thread.sleep(3000);
            WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));
            cont.click();
            Thread.sleep(3000);
        }
    }

    public static void logOut(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement userIcon = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement logOut = driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
