package com.example.homekey;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

import java.util.Set;

/**
 * Created by YUSH on 2016-10-11.
 */

public class HomeKeyActivity extends Activity {

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Set<String> categories = intent.getCategories();

        if (Intent.ACTION_MAIN.equals(intent.getAction()) &&
                categories != null &&
                categories.contains(Intent.CATEGORY_HOME)) {
            KeyEvent home = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_HOME);
            getWindow().getCallback().dispatchKeyEvent(home);
            home = new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_HOME);
            getWindow().getCallback().dispatchKeyEvent(home);
        }
    }
}
