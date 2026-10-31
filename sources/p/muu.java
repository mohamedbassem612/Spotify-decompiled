package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class muu implements o5s {
    public final x1v a;
    public final suu b;
    public final Scheduler c;
    public final rku d = new rku();

    public muu(x1v x1vVar, suu suuVar, Scheduler scheduler, iac0 iac0Var) {
        this.a = x1vVar;
        this.b = suuVar;
        this.c = scheduler;
        iac0Var.getLifecycle().a(this);
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.d.a();
        this.b.f.a();
    }
}
