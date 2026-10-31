package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hbm {
    public static final hbm a = new hbm();

    public static Rect a(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }

    public static atl1 c(ContextWrapper contextWrapper) {
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        return new atl1(windowManager.getCurrentWindowMetrics().getBounds(), hsl1.g(null, windowManager.getCurrentWindowMetrics().getWindowInsets()));
    }

    public final hsl1 b(Context context) {
        return hsl1.g(null, ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets());
    }
}
