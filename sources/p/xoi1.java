package p;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class xoi1 {
    public static final WeakHashMap a = new WeakHashMap();

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static synchronized boolean b(Context context) {
        Boolean boolValueOf;
        try {
            Configuration configuration = context.getResources().getConfiguration();
            WeakHashMap weakHashMap = a;
            boolValueOf = (Boolean) weakHashMap.get(configuration);
            if (boolValueOf == null) {
                int i = configuration.smallestScreenWidthDp;
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                boolValueOf = Boolean.valueOf(((int) (((float) i) / (((float) DisplayMetrics.DENSITY_DEVICE_STABLE) / ((float) displayMetrics.densityDpi)))) >= 600);
                weakHashMap.put(configuration, boolValueOf);
            }
        } catch (Throwable th) {
            throw th;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean c(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }
}
