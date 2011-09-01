package com.jodo;

import com.phonegap.DroidGap;
import android.os.Bundle;

public class JodoActivity extends DroidGap{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}