package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rlk1 implements eck1 {
    public final xas0 a;
    public final Scheduler b;
    public final Scheduler c;

    public rlk1(xas0 xas0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = xas0Var;
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
        kzc kzcVar = bundleA != null ? (kzc) jhc1.t(bundleA, "VM_STATE_KEY", kzc.class) : null;
        if (kzcVar == null) {
            kzcVar = jzc.a;
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new plk1(this), kzcVar, new fjb((byte) 29));
        oe41VarP.c("VM_STATE_PROVIDER", new ej5(mobiusLoopViewModelT, (byte) 2));
        Object objCast = cls.cast(mobiusLoopViewModelT);
        objCast.getClass();
        return (xbk1) objCast;
    }
}
