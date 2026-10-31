package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lrv0 implements eck1 {
    public final wqv0 a;
    public final Scheduler b;
    public final Scheduler c;

    public lrv0(wqv0 wqv0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = wqv0Var;
        this.b = scheduler;
        this.c = scheduler2;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        qe41 qe41Var = (qe41) ((esn) wcn0Var).a.get(a6o1.a);
        oe41 oe41VarP = qe41Var != null ? qe41Var.p() : null;
        if (oe41VarP == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Bundle bundleA = oe41VarP.a("VM_STATE_PROVIDER");
        grv0 grv0Var = bundleA != null ? (grv0) jhc1.t(bundleA, "VM_STATE_KEY", grv0.class) : null;
        if (grv0Var == null) {
            grv0Var = new grv0(orv0.a);
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new krv0(this), grv0Var, new hfb((byte) 20));
        oe41VarP.c("VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 4));
        return mobiusLoopViewModelT;
    }
}
