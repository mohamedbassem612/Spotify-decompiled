package p;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mmg1 {
    public static final void a(ScrollView scrollView, Activity activity, View view) {
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        int iH = d4o1.h(activity);
        if (Build.VERSION.SDK_INT >= 28 && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            iH = displayCutout.getSafeInsetTop();
        }
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new cni0(scrollView, view, iH, (byte) 1));
    }

    public static Typeface b(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Bitmap c(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static int d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static void e(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void f(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static boolean g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
