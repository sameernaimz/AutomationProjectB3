package io.loop.test.day_4;

import io.loop.test.utiilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T1_FindElements {
    /*
        1- Open a chrome browser
        2- Go to: https://www.nba.com
        3- Locate all the links in the page.
         */
    public static void main(String[] args) {


        WebDriver driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.nba.com");


        List<WebElement> nbaLinks = driver.findElements(By.tagName("a"));
        System.out.println("nbaLinks.size()" + nbaLinks.size());
        List <WebElement> nbaLinksxPATH = driver.findElements(By.xpath("//a"));
        System.out.println("NbaLinksxpath.size()" + nbaLinksxPATH.size());

        for(WebElement nbaLink : nbaLinks) {
            if (!nbaLink.getText().equals("")) {
                System.out.println("nbaLink.getText())" + nbaLink.getText());
                nbaLink.getAttribute("href" + nbaLink.getAttribute("href"));
            }
    }
        for (int i = 0; i < nbaLinks.size(); i++) {
            if(nbaLinks.get(i).getText().equals("")) {
              System.out.println("nbaLinks.get(i)"  + nbaLinks.get(i).getText());
                System.out.println(nbaLinks.get(i).getAttribute("href") + nbaLinks.get(i).getAttribute("href"));
            }

        }
    }
}
