package p;

import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vvq0 implements yun0 {
    public final czn0 a;
    public final awq0 b;
    public final bvn0 c;

    public vvq0(czn0 czn0Var, awq0 awq0Var, bvn0 bvn0Var) {
        this.a = czn0Var;
        this.b = awq0Var;
        this.c = bvn0Var;
    }

    public final void a() {
        this.c.a();
    }

    public final void b(xun0 xun0Var) {
        this.c.d = xun0Var;
    }

    public final xxn0 c() {
        return this.c.c();
    }

    public final void d(o2q0 o2q0Var) {
        this.c.d(o2q0Var);
    }

    public final int e() {
        awq0 awq0Var = this.b;
        int size = awq0Var.b() ? ((c380) awq0Var.a().c.getValue()).size() : 0;
        bvn0 bvn0Var = this.c;
        return bvn0Var.c.size() + size + (bvn0Var.e != null ? 1 : 0);
    }

    public final void f(nu9 nu9Var, e6w0 e6w0Var, th30 th30Var, akr akrVar) {
        e6w0 e6w0Var2;
        xg30 xg30VarA;
        zf30 zf30VarB;
        awq0 awq0Var = this.b;
        qwq0 qwq0Var = awq0Var.b() ? (qwq0) o7h.C0((List) awq0Var.a().c.getValue()) : null;
        boolean z = qwq0Var instanceof pwq0;
        bvn0 bvn0Var = this.c;
        if (z) {
            e6w0Var2 = ((pwq0) qwq0Var).c.d;
        } else if (qwq0Var instanceof owq0) {
            e6w0Var2 = ((owq0) qwq0Var).c.d;
        } else if (qwq0Var != null) {
            eg.o();
            return;
        } else {
            xun0 xun0Var = bvn0Var.d;
            e6w0Var2 = (xun0Var == null || (xg30VarA = xun0Var.a()) == null) ? null : xg30VarA.d;
        }
        this.a.getClass();
        if (uvq0.a[l1d.C(czn0.b(e6w0Var, e6w0Var2))] != 1) {
            bvn0Var.f(nu9Var, e6w0Var, th30Var, akrVar);
            return;
        }
        bvn0Var.d = null;
        xun0 xun0Var2 = bvn0Var.e;
        if (xun0Var2 != null && (zf30VarB = xun0Var2.b()) != null && zf30VarB.q0()) {
            bvn0.p(xun0Var2, bvn0Var.c, th30Var);
            zf30 zf30VarB2 = xun0Var2.b();
            zf30VarB2.getClass();
            nu9Var.m(zf30VarB2);
            bvn0Var.e = null;
        }
        lwq0.b(awq0Var.a().e);
    }

    public final void g(o2q0 o2q0Var) {
        this.c.g(o2q0Var);
    }

    public final xun0 h() {
        return this.c.d;
    }

    public final ArrayDeque i() {
        return this.c.c;
    }

    public final void j(nu9 nu9Var, boolean z, akr akrVar, th30 th30Var) {
        this.c.j(nu9Var, z, akrVar, th30Var);
    }

    public final void k() {
        this.c.k();
    }

    public final ArrayDeque l() {
        return this.c.b;
    }

    public final xun0 m() {
        return this.c.e;
    }

    public final void n() {
        this.c.n();
    }

    public final void o(xun0 xun0Var) {
        this.c.e = xun0Var;
    }
}
