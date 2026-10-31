package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bte1 implements eck1 {
    public final xse1 a;

    public bte1(xse1 xse1Var) {
        this.a = xse1Var;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        qe41 qe41Var = (qe41) ((esn) wcn0Var).a.get(a6o1.a);
        oe41 oe41VarP = qe41Var != null ? qe41Var.p() : null;
        if (oe41VarP == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Bundle bundleA = oe41VarP.a("TIMELINE_VM_STATE_PROVIDER");
        rqe1 rqe1Var = bundleA != null ? (rqe1) jhc1.t(bundleA, "TIMELINE_VM_STATE_KEY", rqe1.class) : null;
        if (rqe1Var == null) {
            rqe1Var = new rqe1(2131963214, iqe1.a, ert0.a, "listeningstats");
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new ate1(this), rqe1Var, new m4c((byte) 27));
        oe41VarP.c("TIMELINE_VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 6));
        return mobiusLoopViewModelT;
    }
}
