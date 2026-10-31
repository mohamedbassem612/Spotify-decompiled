package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o21 implements eck1 {
    public final q41 a;
    public final oj80 b;
    public final kly0 c;
    public final feh1 d;
    public final mbo0 e;

    public o21(q41 q41Var, oj80 oj80Var, fwo fwoVar, feh1 feh1Var, mbo0 mbo0Var) {
        this.a = q41Var;
        this.b = oj80Var;
        this.c = fwoVar;
        this.d = feh1Var;
        this.e = mbo0Var;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        qe41 qe41Var = (qe41) ((esn) wcn0Var).a.get(a6o1.a);
        oe41 oe41VarP = qe41Var != null ? qe41Var.p() : null;
        if (oe41VarP == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Bundle bundleA = oe41VarP.a("ADAPTIVE_AUTH_VM_STATE_PROVIDER");
        q41 q41Var = bundleA != null ? (q41) jhc1.t(bundleA, "ADAPTIVE_AUTH_VM_STATE_KEY", q41.class) : null;
        if (q41Var == null) {
            q41Var = this.a;
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new n21(this), q41Var, vf61.d);
        oe41VarP.c("ADAPTIVE_AUTH_VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 0));
        return mobiusLoopViewModelT;
    }
}
