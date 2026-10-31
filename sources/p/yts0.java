package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yts0 implements o5s {
    public m0d X;
    public final wts0 a;
    public final Scheduler b;
    public final Scheduler c;
    public final aus0 d;
    public final i8h1 e;
    public final mwn0 f;
    public final CompositeDisposable g = new CompositeDisposable();
    public final h4l0 h;
    public boolean i;
    public boolean t;

    public yts0(wts0 wts0Var, Scheduler scheduler, Scheduler scheduler2, aus0 aus0Var, x8c0 x8c0Var, i8h1 i8h1Var, mwn0 mwn0Var) {
        this.a = wts0Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = aus0Var;
        this.e = i8h1Var;
        this.f = mwn0Var;
        r6h1 r6h1Var = r6h1.c;
        this.h = new h4l0((byte) 15);
        x8c0Var.a(this);
    }

    public static int a(String str) {
        return u890.j(str, "BR") ? 2131956574 : 2131956573;
    }

    public final void b() {
        h4l0 h4l0Var = this.h;
        h4l0Var.getClass();
        x6h1 x6h1VarC = h4l0Var.b.c();
        x6h1VarC.i.add(new a7h1("choose_country", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        w6b1 w6b1VarA = f7b1.a(blc0.sa);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str == null) {
            str = "";
        }
        nyn1.Q(this.f, new lsn0((String) null, this.e.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
    }

    public final void onStart(iac0 iac0Var) {
        this.g.b(this.d.c.subscribeOn(this.b).observeOn(this.c).subscribe(new ixp0(this, (byte) 16)));
    }

    public final void onStop(iac0 iac0Var) {
        this.g.g();
        this.i = false;
        this.t = false;
    }
}
