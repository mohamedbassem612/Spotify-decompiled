package p;

import android.view.KeyEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ipa0 extends pim0 implements hpa0 {
    public iu30 O0;
    public iu30 P0;

    @Override // p.hpa0
    public final boolean J0(KeyEvent keyEvent) {
        iu30 iu30Var = this.O0;
        if (iu30Var != null) {
            return ((Boolean) iu30Var.invoke(cpa0.a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p.hpa0
    public final boolean x0(KeyEvent keyEvent) {
        iu30 iu30Var = this.P0;
        if (iu30Var != null) {
            return ((Boolean) iu30Var.invoke(cpa0.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
