package io.loop.test.day_7;

import io.loop.test.base.TestBase;
import io.loop.test.utiilities.DoctorConstants;
import io.loop.test.utiilities.DocuportUtils;
import org.testng.annotations.Test;

public class T00_login_douport extends TestBase {
    @Test
    public void test_login_logout_docuport() throws InterruptedException {

        DocuportUtils.login(driver, DoctorConstants.CLIENT);
        DocuportUtils.logOut(driver);
        Thread.sleep(3000);

        DocuportUtils.login(driver, DoctorConstants.ADVISOR);
        DocuportUtils.logOut(driver);
        Thread.sleep(3000);


        DocuportUtils.login(driver, DoctorConstants.EMPLOYEE);
        DocuportUtils.logOut(driver);
        Thread.sleep(3000);

        DocuportUtils.login(driver, DoctorConstants.SUPERVISOR);
        DocuportUtils.logOut(driver);

    }
    }
