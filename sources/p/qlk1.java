package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;
import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qlk1 implements eck1 {
    public final lbs0 a;
    public final Scheduler b;
    public final Scheduler c;

    public qlk1(lbs0 lbs0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = lbs0Var;
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
        ecs0 dcs0Var = bundleA != null ? (ecs0) jhc1.t(bundleA, "VM_STATE_KEY", ecs0.class) : null;
        if (dcs0Var == null) {
            dcs0Var = new dcs0("", "", fg91.b, null, null, null);
        }
        olk1 olk1Var = new olk1(this);
        Duration duration = ove0.a;
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(olk1Var, dcs0Var, new ejb((byte) 29));
        oe41VarP.c("VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 7));
        Object objCast = cls.cast(mobiusLoopViewModelT);
        objCast.getClass();
        return (xbk1) objCast;
    }
}
