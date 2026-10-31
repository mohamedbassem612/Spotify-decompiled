package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class u7k1 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static void c(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }
}
