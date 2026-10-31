package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n9g implements eck1 {
    public final s6g a;
    public final Scheduler b;
    public final Scheduler c;

    public n9g(s6g s6gVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = s6gVar;
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
        t8g t8gVar = bundleA != null ? (t8g) jhc1.t(bundleA, "VM_STATE_KEY", t8g.class) : null;
        if (t8gVar == null) {
            t8gVar = new t8g(a8g.a);
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new m9g(this), t8gVar, new uic((byte) 1));
        oe41VarP.c("VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 2));
        return mobiusLoopViewModelT;
    }
}
