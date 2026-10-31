package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m3b1 implements eck1 {
    public final f3b1 a;
    public final kmw b;
    public final Scheduler c;
    public final Scheduler d;

    public m3b1(f3b1 f3b1Var, kmw kmwVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = f3b1Var;
        this.b = kmwVar;
        this.c = scheduler;
        this.d = scheduler2;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        qe41 qe41Var = (qe41) ((esn) wcn0Var).a.get(a6o1.a);
        oe41 oe41VarP = qe41Var != null ? qe41Var.p() : null;
        if (oe41VarP == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Bundle bundleA = oe41VarP.a("VM_STATE_PROVIDER");
        nhm0 nhm0Var = bundleA != null ? (nhm0) jhc1.t(bundleA, "VM_STATE_KEY", nhm0.class) : null;
        if (nhm0Var == null) {
            nhm0Var = tgm0.a;
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new l3b1(this), nhm0Var, new up41(this, (byte) 20));
        oe41VarP.c("VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 5));
        return mobiusLoopViewModelT;
    }
}
