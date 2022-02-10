package com.king.config;

import com.king.pages.Gamepage;
import com.king.pages.Homepage;
import com.king.pages.Termspage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    private AppiumDriver<MobileElement> driver = DriverClass.getAndroidDriver();
    public Action action = new Action();
    public Homepage homepage = new Homepage();
    public Gamepage gamepage = new Gamepage();
    public Termspage termspage = new Termspage();

    @AfterSuite
    public void teardown() {
        driver.closeApp();
    }


}
