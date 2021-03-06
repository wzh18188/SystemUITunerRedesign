package com.zacharee1.systemuituner.misc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Utils
{
    public static boolean isPackageInstalled(@SuppressWarnings("SameParameterValue") String packagename, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packagename, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static float pxToDp(Context context, float px) {
        Resources r = context.getResources();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px, r.getDisplayMetrics());
    }

    public static float pxToSp(Context context, float px) {
        Resources r = context.getResources();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, px, r.getDisplayMetrics());
    }
}
