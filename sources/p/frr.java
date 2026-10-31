package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class frr implements o5s {
    public final muz a;
    public final ruz b;
    public final Scheduler c;
    public final ybq d;
    public final vku e = new vku();

    public frr(iac0 iac0Var, muz muzVar, ruz ruzVar, Scheduler scheduler, ybq ybqVar) {
        this.a = muzVar;
        this.b = ruzVar;
        this.c = scheduler;
        this.d = ybqVar;
        iac0Var.getLifecycle().a(this);
    }

    public final void onDestroy(iac0 iac0Var) {
        this.e.c();
    }
}
