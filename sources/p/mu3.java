package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mu3 extends v9 {
    public final om3 c;
    public final Scheduler d;
    public final Scheduler e;

    public mu3(om3 om3Var, Scheduler scheduler, Scheduler scheduler2, qe41 qe41Var) {
        super(qe41Var);
        this.c = om3Var;
        this.d = scheduler;
        this.e = scheduler2;
    }

    public final xbk1 e(fe41 fe41Var) {
        return new hn3(new lu3(this), fe41Var);
    }
}
