package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.rmi.CORBA.Util;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp()
    {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown()
    {
        closeBrowser();
    }

}
