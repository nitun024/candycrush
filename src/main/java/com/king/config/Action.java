package com.king.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Action {

    private AppiumDriver<MobileElement> driver = DriverClass.getAndroidDriver();
    private TouchAction touchAction = new TouchAction(driver);

    // Pauses the execution and waits for a specific time
    public void wait(int timeInSeconds) {
        try {
            Thread.sleep(timeInSeconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Tap anywhere based on xOffset and yOffset
    public void tapByCoordinates(int xOffset, int yOffset) {
        touchAction.press(PointOption.point(xOffset, yOffset)).release().perform();
    }

    // Swipe anywhere based on xOffset and yOffset
    public void swipeByCoordinates(int startXOffset, int startYOffset, int endXOffset, int endYOffset) {
        touchAction.press(PointOption.point(startXOffset, startYOffset))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endXOffset, endYOffset))
                .release()
                .perform();
    }

    // Waits for a condition to occur on an Element located by a locator
    public void explicitWait(String locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
    }
}
