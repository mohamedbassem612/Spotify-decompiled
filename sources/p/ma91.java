package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ma91 implements byf0, o5s {
    public final mzr0 a;
    public final Flowable b;
    public final x181 c;
    public final Scheduler d;
    public final tac0 e;
    public final vku f = new vku();

    public ma91(mzr0 mzr0Var, Flowable flowable, x181 x181Var, dg30 dg30Var, Scheduler scheduler) {
        this.a = mzr0Var;
        this.b = flowable;
        this.c = x181Var;
        this.d = scheduler;
        this.e = ((f0i) dg30Var).a;
    }

    @Override // p.byf0
    public final void c() {
        this.e.a(this);
    }

    @Override // p.byf0
    public final void d() {
        this.e.d(this);
        this.f.c();
    }

    public final void onPause(iac0 iac0Var) {
        this.f.c();
    }

    public final void onResume(iac0 iac0Var) {
        this.f.a(this.b.j(this.c).x(kcx0.N0).L(this.d).subscribe((Consumer) new tr41(this, (byte) 24)));
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
    }
}
