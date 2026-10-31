package p;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a9d0 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final hrr0 a;
    public final hrr0 b;

    public a9d0(b9d0 b9d0Var) {
        Boolean bool = Boolean.FALSE;
        this.a = v8r.q(bool);
        this.b = v8r.q(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(b9d0.c(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(b9d0.d(accessibilityManager)));
    }
}
