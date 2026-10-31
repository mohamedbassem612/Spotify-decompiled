package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kzs {
    public final g0l a;
    public final ark1 b;
    public final ark1 c;
    public final Scheduler d;

    public kzs(g0l g0lVar, ark1 ark1Var, ark1 ark1Var2, Scheduler scheduler) {
        this.a = g0lVar;
        this.b = ark1Var;
        this.c = ark1Var2;
        this.d = scheduler;
    }

    public final boolean a() {
        l0l l0lVarC = this.a.c();
        return l0lVarC == null || l0lVarC.l();
    }
}
