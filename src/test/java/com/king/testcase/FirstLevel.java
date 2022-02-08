package com.king.testcase;

import com.king.config.TestAnnotation;
import org.testng.annotations.Test;

public class FirstLevel extends TestAnnotation {

    @Test(enabled = true, priority = 1, description = "To make the first move in first Level")
    public void makeFirstMoveInLevel1() {

        /**
         *  Since I wasn't able to access webview inside the android.widget.FrameLayout, I ended up using swipe and taps based on
         *  xOffset and yOffset. This approach isn't effective as this script won't pass on devices of different sizes and resolutions.
         *  Since the assigment mentioned the following:
         *  "The script should start the game then start the first level, where it should perform one move."
         */

        // Accept the Terms page
        action.wait(3);
        action.tapByCoordinates(545, 1575);

        // Tap on 'Play'
        action.wait(2);
        action.tapByCoordinates(532, 1148);

        // Tap anywhere to Continue
        action.wait(3);
        action.tapByCoordinates(532, 1148);

        // Swipe to make the first move
        action.wait(3);
        action.swipeByCoordinates(431, 1234, 542, 1231);
    }


}