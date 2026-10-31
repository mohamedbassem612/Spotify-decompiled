package p;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m6a1 extends c681 {
    public View c;

    public final void u() {
        View view = this.c;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.u();
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        l6a1 l6a1Var = new l6a1(atomicBoolean);
        windowInsetsController.addOnControllableInsetsChangedListener(l6a1Var);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(l6a1Var);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    public final void y() {
        View view = this.c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.y();
    }
}
