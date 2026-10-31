package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o3e {
    public String a;
    public final ArrayList b = new ArrayList();
    public ckb0 c = new ckb0();
    public boolean d = true;
    public pfo1 e = kfo1.a;
    public boolean f = true;
    public boolean g = false;
    public final ArrayList h = new ArrayList();
    public boolean i = true;
    public boolean j = false;

    public final p3e a() {
        h3e h3eVar = (h3e) this.e.a(p3e.U0);
        bmo1 bmo1Var = p3e.S0;
        uso1 uso1Var = p3e.T0;
        return new p3e(this.a, this.b, false, this.c, this.d, h3eVar, this.f, 0.05000000074505806d, false, false, this.g, this.h, this.i, false, bmo1Var, uso1Var, false, this.j);
    }

    public final void b(h3e h3eVar) {
        this.e = new wfo1(h3eVar);
    }

    public final void c(boolean z) {
        this.f = z;
    }

    public final void d(ckb0 ckb0Var) {
        this.c = ckb0Var;
    }

    public final void e() {
        this.j = true;
    }

    public final void f(String str) {
        this.a = str;
    }

    public final void g(boolean z) {
        this.g = z;
    }

    public final void h(boolean z) {
        this.d = z;
    }

    public final void i(boolean z) {
        this.i = z;
    }
}
