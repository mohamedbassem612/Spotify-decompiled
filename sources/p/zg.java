package p;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zg implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ byte a;
    public final Object b;

    public zg() {
        this.a = (byte) 2;
        this.b = v8r.q(Boolean.FALSE);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ssw0) obj).l(Boolean.valueOf(z));
                break;
            case 1:
                ((y4) obj).invoke();
                break;
            case 2:
                ((hrr0) obj).setValue(Boolean.valueOf(z));
                break;
            default:
                ((hml1) obj).invoke();
                break;
        }
    }

    public /* synthetic */ zg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
