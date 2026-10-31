package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xrk {
    public final o241 a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f96p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    public xrk(gm4 gm4Var, o241 o241Var) {
        this.a = o241Var;
        this.b = gm4Var.p();
        this.c = gm4Var.n();
        this.d = gm4Var.m();
        this.e = gm4Var.j();
        this.f = gm4Var.l();
        this.g = gm4Var.f();
        this.h = gm4Var.g();
        this.i = gm4Var.c();
        this.j = gm4Var.d();
        this.k = gm4Var.e();
        this.l = gm4Var.i();
        this.m = gm4Var.b();
        this.n = gm4Var.k();
        this.o = gm4Var.o();
        this.f96p = gm4Var.r();
        this.q = gm4Var.q();
        this.r = gm4Var.s();
        this.s = gm4Var.h();
    }

    public final boolean a() {
        return y7y0.q(c());
    }

    public final boolean b() {
        return y7y0.B(c());
    }

    public final Map c() {
        p811 p811Var = new p811();
        p811Var.a = b7x.a;
        this.a.a.subscribe((Consumer) new wrk(p811Var, (byte) 0)).dispose();
        return (Map) p811Var.a;
    }
}
