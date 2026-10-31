package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ftk1 implements a4l {
    public final g0l a;
    public final d6b1 b;
    public final u7p c;
    public final euk1 d;
    public final Scheduler e;
    public final g3e f;
    public final vku g = new vku();
    public etk1 h = wdx0.W0;

    public ftk1(g0l g0lVar, d6b1 d6b1Var, u7p u7pVar, euk1 euk1Var, Scheduler scheduler, g3e g3eVar) {
        this.a = g0lVar;
        this.b = d6b1Var;
        this.c = u7pVar;
        this.d = euk1Var;
        this.e = scheduler;
        this.f = g3eVar;
    }

    @Override // p.a4l
    public final void a() {
        if (((iuq0) this.f).b()) {
            return;
        }
        etk1 etk1Var = this.h;
        wdx0 wdx0Var = wdx0.W0;
        if (!etk1Var.equals(wdx0Var)) {
            this.b.a().d();
            this.h = wdx0Var;
        }
        this.g.c();
        this.d.c.a();
    }

    @Override // p.a4l
    public final void b() {
        if (((iuq0) this.f).b()) {
            return;
        }
        this.g.a(((inr) this.a).d().distinctUntilChanged(avw0.t).observeOn(this.e).subscribe(new rdj1(this, (byte) 7)));
    }
}
