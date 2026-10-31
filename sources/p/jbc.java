package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.DisplayMetrics;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jbc {
    public static String a(Context context) {
        return context.getAttributionTag();
    }

    public static void b(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static final void c(Dialog dialog, float f) {
        int iWidth;
        Window window = dialog.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                iWidth = window.getWindowManager().getCurrentWindowMetrics().getBounds().width();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                iWidth = displayMetrics.widthPixels;
            }
            window.setLayout((int) (iWidth * f), -2);
        }
    }
}
