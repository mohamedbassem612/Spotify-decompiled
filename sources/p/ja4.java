package p;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ja4 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa4 b;

    public /* synthetic */ ja4(pa4 pa4Var, byte b) {
        this.a = b;
        this.b = pa4Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pa4 pa4Var = this.b;
        switch (b) {
            case 0:
                View view = pa4Var.a;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                yr41 yr41Var = (yr41) obj;
                if (yr41Var.B0()) {
                    uxq0 snapshotObserver = pa4Var.a.getSnapshotObserver();
                    snapshotObserver.a.d(yr41Var, pa4Var.j1, new og(yr41Var, pa4Var, (byte) 3));
                }
                return rih1.a;
        }
    }
}
