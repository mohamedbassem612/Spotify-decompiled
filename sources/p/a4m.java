package p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a4m extends MobiusLoopViewModel {
    public final fe41 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public a4m(e4m e4mVar, fe41 fe41Var) {
        e4y e4yVar = e4y.T0;
        ro41 ro41Var = (ro41) fe41Var.b.s("VIEW_STATE");
        super(e4mVar, ro41Var == null ? ro41.O0 : ro41Var, e4yVar, MainThreadWorkRunner.a());
        this.g = fe41Var;
    }
}
