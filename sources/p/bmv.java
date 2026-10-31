package p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class bmv extends hm5 {
    @Override // p.hm5
    public void K(qdd1 qdd1Var, qdd1 qdd1Var2, Window window, View view, boolean z, boolean z2) {
        d55.i(window, false);
        window.setStatusBarColor(z ? qdd1Var.b : qdd1Var.a);
        window.setNavigationBarColor(z2 ? qdd1Var2.b : qdd1Var2.a);
        csj1 csj1Var = new csj1(window, view);
        csj1Var.g(!z);
        csj1Var.f(!z2);
    }
}
