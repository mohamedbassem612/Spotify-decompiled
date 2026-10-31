package p;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ih implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ y4 a;

    public ih(y4 y4Var) {
        this.a = y4Var;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.a.invoke();
    }
}
