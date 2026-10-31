package p;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xf90 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nsw0 b;

    public /* synthetic */ xf90(nsw0 nsw0Var, byte b) {
        this.a = b;
        this.b = nsw0Var;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        byte b = this.a;
        psw0 psw0Var = this.b;
        switch (b) {
            case 0:
                psw0Var.setValue(Boolean.valueOf(z));
                break;
            default:
                psw0Var.setValue(Boolean.valueOf(z));
                break;
        }
    }
}
