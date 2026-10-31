package p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class dmv extends cmv {
    @Override // p.bmv, p.hm5
    public void K(qdd1 qdd1Var, qdd1 qdd1Var2, Window window, View view, boolean z, boolean z2) {
        int i;
        int i2;
        byte b = qdd1Var2.c;
        d55.i(window, false);
        if (qdd1Var.c == 0) {
            i = 0;
        } else {
            i = z ? qdd1Var.b : qdd1Var.a;
        }
        window.setStatusBarColor(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = z2 ? qdd1Var2.b : qdd1Var2.a;
        }
        window.setNavigationBarColor(i2);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(b == 0);
        csj1 csj1Var = new csj1(window, view);
        csj1Var.g(!z);
        csj1Var.f(true ^ z2);
    }
}
