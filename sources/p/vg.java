package p;

import android.net.Uri;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vg implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ ch b;

    public vg(ssw0 ssw0Var, ch chVar) {
        this.a = ssw0Var;
        this.b = chVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        Uri uri = ch.c;
        this.a.l(Boolean.valueOf(this.b.a()));
    }
}
