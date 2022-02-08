package com.king.config;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;


public class CapabilitiesClass {

    // To set up the driver capabilities for android
    public DesiredCapabilities driverCapabilitiesAndroid() {
        File app= new File("apps/CandyCrushSaga.apk");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("VERSION", "10");
        caps.setCapability("appPackage", "com.king.candycrushsaga");
        caps.setCapability("appActivity", "com.king.candycrushsaga.CandyCrushSagaActivity");
        caps.setCapability("app", app.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");

        return caps;

    }

}
