package com.king.config;

import com.king.pages.Gamepage;
import com.king.pages.Homepage;
import com.king.pages.Termspage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    public static AppiumDriver<MobileElement> driver = DriverClass.getAndroidDriver();
    public static Action action = new Action();
    public static Homepage homepage = new Homepage();
    public static Gamepage gamepage = new Gamepage();
    public static Termspage termspage = new Termspage();

    @AfterSuite
    public void teardown() {
        driver.closeApp();
    }


}
