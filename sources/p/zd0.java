package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zd0 implements ote0 {
    public final lfl1 a;
    public final fe0 b;
    public final bxn0 c;
    public final d341 d;
    public final Scheduler e;
    public final CompositeDisposable f = new CompositeDisposable();

    public zd0(lfl1 lfl1Var, fe0 fe0Var, bxn0 bxn0Var, d341 d341Var, Scheduler scheduler) {
        this.a = lfl1Var;
        this.b = fe0Var;
        this.c = bxn0Var;
        this.d = d341Var;
        this.e = scheduler;
    }

    public final void a(x8c0 x8c0Var) {
        x8c0Var.a(new yd0(this, x8c0Var));
    }
}
