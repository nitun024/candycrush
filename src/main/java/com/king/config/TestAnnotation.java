package com.king.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterSuite;

public class TestAnnotation {

    public static AppiumDriver<MobileElement> driver = DriverClass.getAndroidDriver();
    public static Action action = new Action();

    @AfterSuite
    public void teardown() {
        driver.closeApp();
    }


}
