package com.king.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverClass {

    private static AndroidDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> getAndroidDriver() {
        CapabilitiesClass cap = new CapabilitiesClass();

        if (driver != null) {
            return driver;
        } else {
            try {
                driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap.driverCapabilitiesAndroid());
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }
}
