package com.itheima.mobilesafe.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by Administrator on 2015/10/23.
 */
public class AppInfoUtils {
    /*

    获取应用程序的版本名称
     */
    public static String getAppName(Context context)
    {
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(),0);
            pm.getPackageInfo()
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
