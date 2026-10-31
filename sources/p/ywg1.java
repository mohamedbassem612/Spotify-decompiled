package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ywg1 implements z350 {
    public final g3s0 a;
    public final Scheduler b;
    public final Scheduler c;

    public ywg1(g3s0 g3s0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = g3s0Var;
        this.b = scheduler;
        this.c = scheduler2;
    }

    public final Single a() {
        return this.a.a(f3s0.e).subscribeOn(this.c).observeOn(this.b).compose(new dn81((byte) 2)).doOnSuccess(iqa1.W0);
    }
}
