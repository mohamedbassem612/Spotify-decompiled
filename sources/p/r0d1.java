package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r0d1 implements o5s {
    public final Scheduler a;
    public final y390 b;
    public final r2a1 c;
    public final lzn0 d;
    public final dg30 e;
    public final rku f = new rku();
    public boolean g;
    public final Completable h;

    public r0d1(dg30 dg30Var, Scheduler scheduler, y390 y390Var, zr00 zr00Var, r2a1 r2a1Var, lzn0 lzn0Var) {
        this.a = scheduler;
        this.b = y390Var;
        this.c = r2a1Var;
        this.d = lzn0Var;
        this.e = dg30Var;
        dg30Var.runOnUiThread(new xfz0(this, (byte) 23));
        this.h = yoi1.i(zr00Var.a, o6x.a).take(1L).flatMapCompletable(new ep31(this, (byte) 27));
    }

    public final void onDestroy(iac0 iac0Var) {
        ((f0i) this.e).a.d(this);
        this.f.a();
    }
}
