package com.king.testcase;

import com.king.config.BaseTest;
import org.testng.annotations.Test;

public class FirstLevel extends BaseTest {

    @Test(description = "To make the first move in first Level")
    public void makeFirstMoveInLevel1() {

        /**
         *  Since I wasn't able to access webview inside the android.widget.FrameLayout, I ended up using swipe and taps based on
         *  xOffset and yOffset. This approach isn't effective as this script won't pass on devices of different sizes and resolutions.
         *  Since the assigment mentioned the following:
         *  "The script should start the game then start the first level, where it should perform one move."
         */


        /**
         *  Ideally Explicit Wait should be used when switching pages. But it doesn't work in this case as the Framelayout element
         *  loads instantly and doesn't let the rest of the content load.
         */

        // Accept the Terms page
        action.wait(3);
        action.tapByCoordinates(termspage.xOffset, termspage.yOffset);

        // Tap on 'Play'
        action.wait(2);
        action.tapByCoordinates(homepage.xOffset, homepage.yOffset);

        // Tap anywhere to Continue
        action.wait(3);
        action.tapByCoordinates(gamepage.xOffset, gamepage.yOffset);

        // Swipe to make the first move
        action.wait(3);
        action.swipeByCoordinates(gamepage.startXOffset, gamepage.startYOffset, gamepage.endXOffset, gamepage.endYOffset);
    }


}