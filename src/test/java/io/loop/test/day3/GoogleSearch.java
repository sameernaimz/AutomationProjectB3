package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
public class GoogleSearch {
    public static void main(String[] args) {
        // IN SELINIUM 3 WE HAD TO SET UP THE DRIVER, FOR THAT WE NEED WEBDRIVERMANGER
        //WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();
        //navigate to google
        driver.navigate().to("https://www.google.com");
        //maximize
        driver.manage().window().maximize();

    String expectedTitle = "Google";
    String actualTitle = driver.getTitle();

    if(actualTitle.contains(expectedTitle)) {
        System.out.println("Actual title is: " + actualTitle + " Matches Expected title: " + expectedTitle + " -->>TEST PASS!");
    }else {
            System.out.println("Actual title is: " + actualTitle + " DOESNT MATCH expected Title: " + expectedTitle + " -->>TEST FAIL!");
    }
       // System.out.println(driver.getCurrentUrl());
        String expectedURL = "https://www.google.com";
    String actualURL = driver.getCurrentUrl();
    if(actualURL.contains(expectedURL)) {
        System.out.println("Actual url: " + actualURL + " Matches Expected url: " + expectedURL + " -->>TEST PASS!");
    } else {
        System.err.println("Actual url: " + actualURL + "DOES NOT Matches Expected url: " + expectedURL + " -->>TEST PASS!");
    }
    driver.quit();
    }
}
