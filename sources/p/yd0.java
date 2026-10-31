package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yd0 implements o5s {
    public final /* synthetic */ zd0 a;
    public final /* synthetic */ x8c0 b;

    public yd0(zd0 zd0Var, x8c0 x8c0Var) {
        this.a = zd0Var;
        this.b = x8c0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.b.d(this);
    }

    public final void onResume(iac0 iac0Var) {
        bxn0 bxn0Var = this.a.c;
        i1s0 i1s0Var = bxn0Var.c;
        bxn0Var.c = i1s0Var != null ? i1s0.a(i1s0Var, 0L, bxn0Var.b.b(), 0L, 191) : null;
    }

    public final void onStart(iac0 iac0Var) {
        zd0 zd0Var = this.a;
        fe0 fe0Var = zd0Var.b;
        vi11 vi11Var = fe0Var.d;
        vi11Var.f = new ae0(fe0Var, (byte) 0);
        vi11Var.e = ((d341) vi11Var.b).a.map(hcx0.Y0).distinctUntilChanged().observeOn((Scheduler) vi11Var.c).subscribe(new mfl1(vi11Var, (byte) 0), new mfl1(vi11Var, (byte) 1));
        lfl1 lfl1Var = zd0Var.a;
        lfl1Var.h.f(new Disposable[]{lfl1Var.a.a.subscribe(new rdj1(lfl1Var, (byte) 14), vrk1.g)});
        CompositeDisposable compositeDisposable = zd0Var.f;
        if (compositeDisposable.i() > 0) {
            n57.s("Lifecycle mismatch detected: onStart called without matching onStop");
            compositeDisposable.g();
        }
        compositeDisposable.b(zd0Var.d.a.filter(cq41.b).distinctUntilChanged().filter(uml1.b).observeOn(zd0Var.e).subscribe(new tg(zd0Var, (byte) 6)));
    }

    public final void onStop(iac0 iac0Var) {
        zd0 zd0Var = this.a;
        bxn0 bxn0Var = zd0Var.c;
        i1s0 i1s0Var = bxn0Var.c;
        bxn0Var.c = i1s0Var != null ? i1s0.a(i1s0Var, 0L, 0L, bxn0Var.a(), 127) : null;
        zd0Var.f.g();
        fe0 fe0Var = zd0Var.b;
        fe0Var.f.a();
        ((Disposable) fe0Var.d.e).dispose();
        zd0Var.a.h.g();
    }
}
