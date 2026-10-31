package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j0s implements o5s {
    public final gj5 a;
    public final k0s b;
    public final aer c;
    public final Scheduler d;
    public final zq91 e;
    public final lvc f;
    public final rku g = new rku();

    public j0s(gj5 gj5Var, k0s k0sVar, aer aerVar, Scheduler scheduler, zq91 zq91Var, lvc lvcVar) {
        this.a = gj5Var;
        this.b = k0sVar;
        this.c = aerVar;
        this.d = scheduler;
        this.e = zq91Var;
        this.f = lvcVar;
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(slc0 slc0Var) {
        k0s k0sVar = this.b;
        this.g.b(k0sVar.c.take(1L).singleOrError().doOnSubscribe(new yrh(k0sVar, (byte) 20)).doAfterTerminate(new f72(k0sVar, (byte) 12)).onErrorReturnItem(tlc0.a).observeOn(this.d).subscribe(new lgr(this, slc0Var, (byte) 1), new jld((byte) 1)));
    }

    public final void onDestroy(iac0 iac0Var) {
        this.g.a();
    }
}
