package p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r1e extends MobiusLoopViewModel {
    public final fe41 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public r1e(v1e v1eVar, fe41 fe41Var) {
        s9w s9wVar = s9w.P0;
        po41 po41Var = (po41) fe41Var.b.s("VIEW_STATE");
        super(v1eVar, po41Var == null ? po41.d : po41Var, s9wVar, MainThreadWorkRunner.a());
        this.g = fe41Var;
    }
}
