package p;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f8o0 implements nhl {
    public final ConnectivityManager a;

    public f8o0(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // p.nhl
    public final boolean a(vwl1 vwl1Var) {
        if (!b(vwl1Var)) {
            return false;
        }
        eg.m("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // p.nhl
    public final boolean b(vwl1 vwl1Var) {
        return (vwl1Var.j.a() == null && vwl1Var.j.a == 1) ? false : true;
    }

    @Override // p.nhl
    public final ezc c(gjl gjlVar) {
        return h4p1.f(new wkk0(gjlVar, this, (lnm) null, (byte) 18));
    }
}
