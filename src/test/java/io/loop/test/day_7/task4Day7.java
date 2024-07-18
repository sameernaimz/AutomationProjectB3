package io.loop.test.day_7;

import io.loop.test.base.TestBase;
import io.loop.test.utiilities.loopWebTableUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
go to https://loopcamp.vercel.app/web-tables.html

create a method to test given field for a given name
test type
test amount
test date
test street
test city
test state
test zip
test card
test card number
test exp

extra task
 */
public class task4Day7 extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedType = "Cheese";
        String actualType = loopWebTableUtils.returnAnyField(driver, "Bart Fisher", "type");
        assertEquals(expectedType, actualType, "Actual Does Not Match Expected --> TEST FAILED");
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedAmount = "3";
        String actualAmount = loopWebTableUtils.returnAnyField(driver, "Bart Fisher", "amount");
        assertEquals(expectedAmount, actualAmount, "Actual Does Not Match Expected --> TEST FAILED");
    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedDate = "01/16/2021";
        String actualDate = loopWebTableUtils.returnAnyField(driver, "Bart Fisher", "date");
        assertEquals(expectedDate, actualDate, "Actual Does Not Match Expected --> TEST FAILED");
    }
    @Test
    public void test4() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedStreet = "35, Rock st.";
        String actualStreet = loopWebTableUtils.returnAnyField(driver, "Bart Fisher", "Street");
        assertEquals(expectedStreet, actualStreet, "Actual Does Not Match Expected --> TEST FAILED");

    }
    @Test
    public void test5() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedCity = "Newcastle";
        String actualCity = loopWebTableUtils.returnAnyField(driver, "Ned Stark", "city");
        assertEquals(expectedCity, actualCity, "Actual Does Not Match Expected --> TEST FAILED");

    }
    @Test
    public void test6() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedState = "Italy";
        String actualState = loopWebTableUtils.returnAnyField(driver, "Ned Stark", "state");
        assertEquals(expectedState, actualState, "Actual Does Not Match Expected --> TEST FAILED");

    }
    @Test
    public void test7() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedZip = "748";
        String actualZip = loopWebTableUtils.returnAnyField(driver, "Alexandra Gray", "zip");
        assertEquals(expectedZip, actualZip, "Actual Does Not Match Expected --> TEST FAILED");

    }
    @Test
    public void test8() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedCard = "VISA";
        String actualCard = loopWebTableUtils.returnAnyField(driver, "Alexandra Gray", "card");
        assertEquals(expectedCard, actualCard, "Actual Does Not Match Expected --> TEST FAILED");

    }
    @Test
    public void test9() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedCardNumber = "980077987700";
        String actualCardNumber = loopWebTableUtils.returnAnyField(driver, "John Doe", "card number");
        assertEquals(expectedCardNumber, actualCardNumber, "Actual Does Not Match Expected --> TEST FAILED");

    }
    @Test
    public void test10() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String expectedCardExp = "03/25";
        String actualCardExp = loopWebTableUtils.returnAnyField(driver, "Samuel Jackson", "exp");
        assertEquals(expectedCardExp,actualCardExp, "Actual Does Not Match Expected --> TEST FAILED");

    }

}

