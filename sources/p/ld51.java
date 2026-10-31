package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ld51 implements eck1 {
    public final ffe1 a;
    public final g931 b;
    public final Scheduler c;
    public final Scheduler d;

    public ld51(ffe1 ffe1Var, g931 g931Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = ffe1Var;
        this.b = g931Var;
        this.c = scheduler;
        this.d = scheduler2;
    }

    public final xbk1 b(Class cls) {
        return new kd51(this.a, this.b, this.c, this.d);
    }
}
