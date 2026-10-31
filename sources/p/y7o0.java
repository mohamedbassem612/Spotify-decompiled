package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y7o0 extends eaa {
    static {
        qs10.c("NetworkMeteredCtrlr");
    }

    public y7o0(q8o0 q8o0Var) {
        super(q8o0Var);
    }

    public final boolean b(vwl1 vwl1Var) {
        return vwl1Var.j.a == 5;
    }

    public final int d() {
        return 7;
    }

    public final boolean e(Object obj) {
        m8o0 m8o0Var = (m8o0) obj;
        boolean z = m8o0Var.e;
        boolean z2 = m8o0Var.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z2 && m8o0Var.c && !z) ? false : true;
        }
        qs10.a().getClass();
        return !z2 || z;
    }
}
