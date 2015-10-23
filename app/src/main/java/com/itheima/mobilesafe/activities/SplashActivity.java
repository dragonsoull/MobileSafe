package com.itheima.mobilesafe.activities;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/10/22.
 */
public class SplashActivity extends Activity {

    TextView tvSplashVersion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tvSplashVersion = (TextView) findViewById(R.id.tv_splash_version);
        PackageManager pm = getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo(getPackageName(),0);

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        tvSplashVersion.setText(tvSplashVersion.getText());
    }


}
