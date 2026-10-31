package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x7y implements h0r0 {
    public final a8e0 a;
    public final Scheduler b;
    public final z7y c;
    public final g1w d;
    public final cbr0 e;

    public x7y(a8e0 a8e0Var, Scheduler scheduler, z7y z7yVar, g1w g1wVar, lik1 lik1Var, p6r0 p6r0Var) {
        this.a = a8e0Var;
        this.b = scheduler;
        this.c = z7yVar;
        this.d = g1wVar;
        this.e = new cbr0(new dbr0[]{new yxe1(new ehc1("")), new bn70(p6r0Var, lik1Var, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(p8p1.n(Observable.just(this.c).observeOn(this.b)), new i5w(this, (byte) 21), new u7r0(a4p1.n(), (g4h1) null, (iu30) null, false, false, 126));
    }
}
