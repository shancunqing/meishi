package com.shancunqing.meishi;

import android.app.Activity;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import android.net.Uri;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Launch PWA in Chrome Custom Tab (full screen, no address bar)
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setShowTitle(false);
        builder.setInstantAppsEnabled(true);

        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        customTabsIntent.launchUrl(
            this,
            Uri.parse("https://shancunqing.github.io/meishi/")
        );

        finish();
    }
}
