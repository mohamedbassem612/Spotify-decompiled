package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l150 implements eck1 {
    public final i050 a;
    public final c0c b;
    public final r050 c;
    public final Scheduler d;

    public l150(i050 i050Var, c0c c0cVar, r050 r050Var, Scheduler scheduler) {
        this.a = i050Var;
        this.b = c0cVar;
        this.c = r050Var;
        this.d = scheduler;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        qe41 qe41Var = (qe41) ((esn) wcn0Var).a.get(a6o1.a);
        oe41 oe41VarP = qe41Var != null ? qe41Var.p() : null;
        if (oe41VarP == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Bundle bundleA = oe41VarP.a("VM_STATE_PROVIDER");
        g150 g150Var = bundleA != null ? (g150) jhc1.t(bundleA, "VM_STATE_KEY", g150.class) : null;
        if (g150Var == null) {
            g150Var = new g150(this.a, false, c150.a, y150.a);
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new k150(this), g150Var, new t2b((byte) 12));
        oe41VarP.c("VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 3));
        return mobiusLoopViewModelT;
    }
}
