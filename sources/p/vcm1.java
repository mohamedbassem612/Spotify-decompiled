package p;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vcm1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ pe b;
    public final /* synthetic */ tjs0 c;

    public vcm1(ssw0 ssw0Var, pe peVar, tjs0 tjs0Var) {
        this.a = ssw0Var;
        this.b = peVar;
        this.c = tjs0Var;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.l(Boolean.valueOf(pwo1.v(this.b, this.c)));
    }
}
