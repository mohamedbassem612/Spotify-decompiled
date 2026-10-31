package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class x7k1 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
