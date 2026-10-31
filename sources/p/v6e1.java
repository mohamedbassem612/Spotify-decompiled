package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v6e1 implements b4e1 {
    public nbe1 b;
    public final /* synthetic */ x6e1 d;
    public boolean a = true;
    public f341 c = w1x0.X;

    public v6e1(x6e1 x6e1Var) {
        this.d = x6e1Var;
    }

    @Override // p.b4e1
    public final void a() {
        f();
    }

    @Override // p.b4e1
    public final void b(long j, f341 f341Var) {
        long j2;
        z9e1 z9e1VarD;
        z9e1 z9e1VarD2;
        x6e1 x6e1Var = this.d;
        if (x6e1Var.i() && ((qr50) x6e1Var.q.getValue()) == null) {
            x6e1Var.q(qr50.c);
            x6e1Var.s = -1;
            this.a = true;
            this.c = f341Var;
            x6e1Var.m();
            r1c0 r1c0Var = x6e1Var.d;
            if (r1c0Var == null || (z9e1VarD2 = r1c0Var.d()) == null || !z9e1VarD2.c(j)) {
                j2 = j;
                r1c0 r1c0Var2 = x6e1Var.d;
                if (r1c0Var2 != null && (z9e1VarD = r1c0Var2.d()) != null) {
                    int i = x6e1Var.b.i(z9e1VarD.b(j2, true));
                    c8e1 c8e1VarB = x6e1.b(x6e1Var.l().a, e6p1.e(i, i));
                    x6e1Var.e(false);
                    sct0 sct0Var = x6e1Var.j;
                    if (sct0Var != null) {
                        sct0Var.a(0);
                    }
                    x6e1Var.c.invoke(c8e1VarB);
                    x6e1Var.v = new nbe1(c8e1VarB.b);
                }
                this.a = false;
            } else {
                if (x6e1Var.l().a.b.length() == 0) {
                    return;
                }
                x6e1Var.e(false);
                long jV = x6e1Var.v(c8e1.a(x6e1Var.l(), (af5) null, nbe1.b, 5), j, true, false, this.c, true, new vs50(0));
                j2 = j;
                x6e1Var.o = new nbe1(jV);
                this.b = new nbe1(jV);
            }
            x6e1Var.r(zr50.a);
            x6e1Var.n = j2;
            x6e1Var.p(new Offset(j2));
            x6e1Var.f167p = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    @Override // p.b4e1
    public final void e(long j) {
        z9e1 z9e1VarD;
        nbe1 nbe1Var;
        int iB;
        long jV;
        x6e1 x6e1Var = this.d;
        if (!x6e1Var.i() || x6e1Var.l().a.b.length() == 0) {
            return;
        }
        x6e1Var.f167p = Offset.g(x6e1Var.f167p, j);
        r1c0 r1c0Var = x6e1Var.d;
        if (r1c0Var != null && (z9e1VarD = r1c0Var.d()) != null) {
            x6e1Var.p(new Offset(Offset.g(x6e1Var.n, x6e1Var.f167p)));
            if (x6e1Var.o == null) {
                Offset offsetG = x6e1Var.g();
                offsetG.getClass();
                if (z9e1VarD.c(offsetG.a)) {
                    nbe1Var = x6e1Var.o;
                    if (nbe1Var != null) {
                        iB = (int) (nbe1Var.a >> 32);
                    } else {
                        iB = z9e1VarD.b(x6e1Var.n, false);
                    }
                    Offset offsetG2 = x6e1Var.g();
                    offsetG2.getClass();
                    int iB2 = z9e1VarD.b(offsetG2.a, false);
                    if (x6e1Var.o != null && iB == iB2) {
                        return;
                    }
                    c8e1 c8e1VarL = x6e1Var.l();
                    Offset offsetG3 = x6e1Var.g();
                    offsetG3.getClass();
                    jV = x6e1Var.v(c8e1VarL, offsetG3.a, false, false, this.c, true, new vs50(9));
                } else {
                    int i = x6e1Var.b.i(z9e1VarD.b(x6e1Var.n, true));
                    hyp0 hyp0Var = x6e1Var.b;
                    Offset offsetG4 = x6e1Var.g();
                    offsetG4.getClass();
                    f341 f341Var = i == hyp0Var.i(z9e1VarD.b(offsetG4.a, true)) ? w1x0.X : w1x0.Z;
                    c8e1 c8e1VarL2 = x6e1Var.l();
                    Offset offsetG5 = x6e1Var.g();
                    offsetG5.getClass();
                    jV = x6e1Var.v(c8e1VarL2, offsetG5.a, false, false, f341Var, true, new vs50(9));
                }
            } else {
                nbe1Var = x6e1Var.o;
                if (nbe1Var != null) {
                    iB = (int) (nbe1Var.a >> 32);
                } else {
                    iB = z9e1VarD.b(x6e1Var.n, false);
                }
                Offset offsetG6 = x6e1Var.g();
                offsetG6.getClass();
                int iB3 = z9e1VarD.b(offsetG6.a, false);
                if (x6e1Var.o != null) {
                }
                c8e1 c8e1VarL3 = x6e1Var.l();
                Offset offsetG7 = x6e1Var.g();
                offsetG7.getClass();
                jV = x6e1Var.v(c8e1VarL3, offsetG7.a, false, false, this.c, true, new vs50(9));
            }
            this.b = new nbe1(jV);
            if (!nbe1.b(jV, x6e1Var.o)) {
                this.a = false;
            }
        }
        x6e1Var.u(false);
    }

    public final void f() {
        x6e1 x6e1Var = this.d;
        x6e1Var.q(null);
        x6e1Var.p(null);
        this.c = w1x0.X;
        x6e1Var.u(true);
        nbe1 nbe1Var = this.b;
        boolean zD = nbe1.d(nbe1Var != null ? nbe1Var.a : x6e1Var.l().b);
        x6e1Var.r(zD ? zr50.c : zr50.b);
        r1c0 r1c0Var = x6e1Var.d;
        if (r1c0Var != null) {
            r1c0Var.m.setValue(Boolean.valueOf(!zD && a4p1.m(x6e1Var, true)));
        }
        r1c0 r1c0Var2 = x6e1Var.d;
        if (r1c0Var2 != null) {
            r1c0Var2.n.setValue(Boolean.valueOf(!zD && a4p1.m(x6e1Var, false)));
        }
        r1c0 r1c0Var3 = x6e1Var.d;
        if (r1c0Var3 != null) {
            r1c0Var3.o.setValue(Boolean.valueOf(zD && a4p1.m(x6e1Var, true)));
        }
        if (this.a) {
            x6e1Var.n(x6e1Var.o);
        }
        x6e1Var.o = null;
    }

    @Override // p.b4e1
    public final void onCancel() {
        f();
    }

    @Override // p.b4e1
    public final void c() {
    }

    @Override // p.b4e1
    public final void d() {
    }
}
