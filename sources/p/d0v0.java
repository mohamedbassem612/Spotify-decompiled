package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.CompletableSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d0v0 implements odx0 {
    public final rfq a;
    public final xmu0 b;
    public final aru0 c;
    public final Context d;
    public final Scheduler e;
    public final Scheduler f;
    public final h1q g;
    public final CompletableSubject h = CompletableSubject.z();
    public final CompositeDisposable i = new CompositeDisposable();
    public zqh j;

    public d0v0(rfq rfqVar, xmu0 xmu0Var, aru0 aru0Var, Context context, Scheduler scheduler, Scheduler scheduler2, h1q h1qVar) {
        this.a = rfqVar;
        this.b = xmu0Var;
        this.c = aru0Var;
        this.d = context;
        this.e = scheduler;
        this.f = scheduler2;
        this.g = h1qVar;
    }

    @Override // p.odx0
    public final String a() {
        return "playlists";
    }

    @Override // p.odx0
    public final z511 b() {
        zqh zqhVar = this.j;
        if (zqhVar != null) {
            return zqhVar;
        }
        u890.C("commonAdapter");
        throw null;
    }

    @Override // p.odx0
    public final boolean c(boolean z) {
        return !z;
    }

    @Override // p.odx0
    public final void d(udx0 udx0Var) {
        boolean zU = r4o1.U(udx0Var);
        String strV = r4o1.V(udx0Var);
        if (this.j == null) {
            this.j = rfq.a(this.a, "playlists", udx0Var.a, this.g.a(udx0Var.d), new pcp0(this, udx0Var, strV, (byte) 28), new c0v0(this, udx0Var, (byte) 0), new hws0(this, udx0Var, (byte) 18), (kpw0) null, new c0v0(this, udx0Var, (byte) 1), 64);
        }
        this.c.h(strV, zU).subscribeOn(this.e).observeOn(this.f).subscribe(new z0u0(udx0Var, this, (byte) 1), new ixp0(this, (byte) 22), ps4.U0, this.i);
    }

    @Override // p.odx0
    public final CompletableSubject e() {
        return this.h;
    }

    @Override // p.odx0
    public final void stop() {
        this.i.g();
    }
}
