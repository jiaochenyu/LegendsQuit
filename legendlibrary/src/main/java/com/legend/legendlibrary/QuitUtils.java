package com.legend.legendlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by JCY on 2017/12/27.
 * 说明：
 */

public class QuitUtils {
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
