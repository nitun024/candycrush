package com.king.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class Action {

    AppiumDriver driver = DriverClass.getAndroidDriver();
    TouchAction action = new TouchAction(driver);

    // Pauses the execution and waits for a specific time
    public void wait(int timeInSeconds) {
        try {
            Thread.sleep(timeInSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void tapByCoordinates(int xOffset, int yOffset) {
        action.press(PointOption.point(xOffset, yOffset)).release().perform();
    }

    public void swipeByCoordinates(int startXOffset, int startYOffset, int endXOffset, int endYOffset) {
        action.press(PointOption.point(431, 1234))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(542, 1231))
                .release()
                .perform();
    }

}
