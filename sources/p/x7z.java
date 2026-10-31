package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x7z implements o5s {
    public final da a;
    public final ef90 b;
    public final dn81 c;
    public final zr00 d;
    public final Scheduler e;
    public final vku f = new vku();

    public x7z(iac0 iac0Var, da daVar, ef90 ef90Var, dn81 dn81Var, zr00 zr00Var, Scheduler scheduler) {
        this.a = daVar;
        this.b = ef90Var;
        this.c = dn81Var;
        this.d = zr00Var;
        this.e = scheduler;
        iac0Var.getLifecycle().a(this);
    }

    public final void a(Observable observable, iu30 iu30Var) {
        this.f.a(observable.observeOn(this.e).subscribe(new a74(iu30Var, (byte) 2), dxu.X));
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.f.c();
    }
}
