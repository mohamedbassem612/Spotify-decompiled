package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class na91 implements qyo0 {
    public final Flowable a;
    public final x181 b;
    public final mzr0 c;
    public final Scheduler d;
    public final vku e = new vku();

    public na91(Flowable flowable, x181 x181Var, mzr0 mzr0Var, Scheduler scheduler) {
        this.a = flowable;
        this.b = x181Var;
        this.c = mzr0Var;
        this.d = scheduler;
    }

    @Override // p.qyo0
    public final void c() {
        this.e.a(this.a.j(this.b).x(pdx0.N0).L(this.d).subscribe(new tr41(this, (byte) 25)));
    }

    @Override // p.qyo0
    public final void d() {
        this.e.c();
    }
}
