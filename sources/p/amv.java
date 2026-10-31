package p;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class amv extends hm5 {
    public void K(qdd1 qdd1Var, qdd1 qdd1Var2, Window window, View view, boolean z, boolean z2) {
        nsl1 lsl1Var;
        d55.i(window, false);
        window.setStatusBarColor(z ? qdd1Var.b : qdd1Var.a);
        window.setNavigationBarColor(qdd1Var2.b);
        up41 up41Var = new up41(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            lsl1Var = new nsl1(window, up41Var);
        } else if (i >= 30) {
            lsl1Var = new msl1(window, up41Var);
        } else {
            lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
        }
        lsl1Var.J(!z);
    }
}
