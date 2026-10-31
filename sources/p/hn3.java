package p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hn3 extends MobiusLoopViewModel {
    public final fe41 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public hn3(lu3 lu3Var, fe41 fe41Var) {
        vgp1 vgp1Var = vgp1.e;
        fn3 fn3Var = (fn3) fe41Var.b.s("FLOW_STATE");
        super(lu3Var, fn3Var == null ? fn3.e : fn3Var, vgp1Var, MainThreadWorkRunner.a());
        this.g = fe41Var;
    }
}
