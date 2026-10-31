package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ns10 {
    public final Flowable a;
    public final Scheduler b;
    public final id31 c;
    public final vku d = new vku();

    public ns10(Flowable flowable, Scheduler scheduler, id31 id31Var) {
        this.a = flowable;
        this.b = scheduler;
        this.c = id31Var;
    }

    public final void a() {
        this.d.a(this.a.L(this.b).subscribe(new cfs(this, (byte) 28)));
    }
}
