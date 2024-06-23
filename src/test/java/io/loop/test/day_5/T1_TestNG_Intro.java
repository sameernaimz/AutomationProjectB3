package io.loop.test.day_5;

import org.testng.Assert;
import org.testng.annotations.*;

public class T1_TestNG_Intro {
    @Test(priority = 2)
    public void test() {
        System.out.println("Test 2 is running");

    }
    @Test(priority = 1)
    public void test2() {
        System.out.println("Test 2 is running");
        String actual = "Feyruz";
        String expected = "Feyruz";
        Assert.assertEquals(actual,expected, "Message from actual will show if test failed");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");

    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @AfterClass
    public void tearDown() {
        System.out.println("After Class");
    }

}
