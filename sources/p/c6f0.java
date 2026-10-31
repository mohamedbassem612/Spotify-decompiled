package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c6f0 extends q5t0 implements afh0, bm3, fnm0 {
    public hjl N0;
    public iu30 P0;
    public be50 Q0;
    public boolean V0;
    public boolean X;
    public boolean Y;
    public Object Y0;
    public boolean Z;
    public boolean c1;
    public final lmb0 f;
    public boolean g;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int t = 3;
    public long O0 = 0;
    public int R0 = 3;
    public final t5f0 S0 = new t5f0(this);
    public final bfn0 T0 = new bfn0(0, new c6f0[16]);
    public boolean U0 = true;
    public final b6f0 W0 = new b6f0(this, (byte) 0);
    public boolean X0 = true;
    public long Z0 = jjl.b(0, 0, 0, 0, 15);
    public final b6f0 a1 = new b6f0(this, (byte) 1);
    public final b6f0 b1 = new b6f0(this, (byte) 2);

    public c6f0(lmb0 lmb0Var) {
        this.f = lmb0Var;
        this.Y0 = lmb0Var.f68p.R0;
    }

    @Override // p.bm3
    public final int A() {
        return this.i;
    }

    @Override // p.afh0
    public final int C(int i) {
        t0();
        z5f0 z5f0VarC1 = this.f.a().c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.C(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // p.afh0
    public final q5t0 H(long j) {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        hmb0 hmb0VarV = hmb0Var.v();
        int i = 2;
        if ((hmb0VarV != null ? hmb0VarV.f1.d : 0) == 2) {
            lmb0Var.b = false;
        } else {
            hmb0 hmb0VarV2 = hmb0Var2.v();
            if ((hmb0VarV2 != null ? hmb0VarV2.f1.d : 0) == 4) {
                lmb0Var.b = false;
            }
        }
        hmb0 hmb0VarV3 = hmb0Var2.v();
        if (hmb0VarV3 != null) {
            lmb0 lmb0Var2 = hmb0VarV3.f1;
            if (this.t != 3 && !hmb0Var2.d1) {
                qf80.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iC = l1d.C(lmb0Var2.d);
            if (iC == 0 || iC == 1) {
                i = 1;
            } else if (iC != 2 && iC != 3) {
                eg.m("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(kaa0.p(lmb0Var2.d)));
                return null;
            }
            this.t = i;
        } else {
            this.t = 3;
        }
        if (hmb0Var2.q1 == 3) {
            hmb0Var2.f();
        }
        z0(j);
        return this;
    }

    @Override // p.bm3
    public final void T() {
        hmb0.U(this.f.a, false, 7);
    }

    @Override // p.q5t0
    public final int U(ul3 ul3Var) {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0VarV = lmb0Var.a.v();
        int i = hmb0VarV != null ? hmb0VarV.f1.d : 0;
        t5f0 t5f0Var = this.S0;
        if (i == 2) {
            t5f0Var.r(true);
        } else {
            hmb0 hmb0VarV2 = lmb0Var.a.v();
            if ((hmb0VarV2 != null ? hmb0VarV2.f1.d : 0) == 4) {
                t5f0Var.q(true);
            }
        }
        this.X = true;
        z5f0 z5f0VarC1 = lmb0Var.a().c1();
        z5f0VarC1.getClass();
        int iU = z5f0VarC1.U(ul3Var);
        this.X = false;
        return iU;
    }

    @Override // p.q5t0
    public final int X() {
        z5f0 z5f0VarC1 = this.f.a().c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.X();
    }

    @Override // p.q5t0
    public final int Y() {
        z5f0 z5f0VarC1 = this.f.a().c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.Y();
    }

    @Override // p.bm3
    public final am3 c() {
        return this.S0;
    }

    @Override // p.afh0
    public final int d(int i) {
        t0();
        z5f0 z5f0VarC1 = this.f.a().c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.d(i);
    }

    @Override // p.bm3
    public final bm3 e() {
        lmb0 lmb0Var;
        hmb0 hmb0VarV = this.f.a.v();
        if (hmb0VarV == null || (lmb0Var = hmb0VarV.f1) == null) {
            return null;
        }
        return lmb0Var.q;
    }

    @Override // p.q5t0
    public final void e0(long j, float f, iu30 iu30Var) throws Throwable {
        y0(j, iu30Var, null);
    }

    @Override // p.q5t0
    public final void f0(long j, float f, be50 be50Var) throws Throwable {
        y0(j, null, be50Var);
    }

    @Override // p.q5t0, p.afh0
    public final Object g() {
        return this.Y0;
    }

    @Override // p.fnm0
    public final void i(boolean z) {
        z5f0 z5f0VarC1;
        lmb0 lmb0Var = this.f;
        z5f0 z5f0VarC2 = lmb0Var.a().c1();
        if (Boolean.valueOf(z).equals(z5f0VarC2 != null ? Boolean.valueOf(z5f0VarC2.Y) : null) || (z5f0VarC1 = lmb0Var.a().c1()) == null) {
            return;
        }
        z5f0VarC1.Y = z;
    }

    @Override // p.bm3
    public final void k() {
        this.V0 = true;
        t5f0 t5f0Var = this.S0;
        t5f0Var.l();
        lmb0 lmb0Var = this.f;
        boolean z = lmb0Var.f;
        hmb0 hmb0Var = lmb0Var.a;
        if (z) {
            bfn0 bfn0VarA = hmb0Var.A();
            Object[] objArr = bfn0VarA.a;
            int i = bfn0VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                hmb0 hmb0Var2 = (hmb0) objArr[i2];
                lmb0 lmb0Var2 = hmb0Var2.f1;
                if (lmb0Var2.e && hmb0Var2.t() == 1) {
                    c6f0 c6f0Var = lmb0Var2.q;
                    c6f0Var.getClass();
                    c6f0 c6f0Var2 = lmb0Var2.q;
                    hjl hjlVar = c6f0Var2 != null ? c6f0Var2.N0 : null;
                    hjlVar.getClass();
                    if (c6f0Var.z0(hjlVar.a)) {
                        hmb0.U(hmb0Var, false, 7);
                    }
                }
            }
        }
        rh80 rh80Var = r().F1;
        rh80Var.getClass();
        if (lmb0Var.g || (!this.X && !rh80Var.O0 && lmb0Var.f)) {
            lmb0Var.f = false;
            int i3 = lmb0Var.d;
            lmb0Var.d = 4;
            lmb0Var.i(false);
            uxq0 snapshotObserver = ((ha4) kmb0.a(hmb0Var)).getSnapshotObserver();
            snapshotObserver.a.d(hmb0Var, snapshotObserver.h, this.W0);
            lmb0Var.d = i3;
            if (lmb0Var.m && rh80Var.O0) {
                requestLayout();
            }
            lmb0Var.g = false;
        }
        if (t5f0Var.i()) {
            t5f0Var.n(true);
        }
        if (t5f0Var.d() && t5f0Var.h()) {
            t5f0Var.k();
        }
        this.V0 = false;
    }

    public final boolean l0() {
        lmb0 lmb0Var = this.f;
        return gio1.y(lmb0Var.a) || lmb0Var.c;
    }

    @Override // p.afh0
    public final int n(int i) {
        t0();
        z5f0 z5f0VarC1 = this.f.a().c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.n(i);
    }

    public final void o0(boolean z) {
        if (z && l0()) {
            return;
        }
        if (z || l0()) {
            this.R0 = 3;
            bfn0 bfn0VarA = this.f.a.A();
            Object[] objArr = bfn0VarA.a;
            int i = bfn0VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                c6f0 c6f0Var = ((hmb0) objArr[i2]).f1.q;
                c6f0Var.getClass();
                c6f0Var.o0(true);
            }
        }
    }

    @Override // p.bm3
    public final sh80 r() {
        return (sh80) this.f.a.e1.d;
    }

    public final void r0() {
        int i = this.R0;
        lmb0 lmb0Var = this.f;
        boolean z = lmb0Var.c;
        hmb0 hmb0Var = lmb0Var.a;
        if (z) {
            this.R0 = 2;
        } else {
            this.R0 = 1;
        }
        if (i != 1 && lmb0Var.e) {
            hmb0.U(hmb0Var, true, 6);
        }
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i2 = bfn0VarA.c;
        for (int i3 = 0; i3 < i2; i3++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i3];
            c6f0 c6f0Var = hmb0Var2.f1.q;
            if (c6f0Var == null) {
                hhg1.n("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c6f0Var.i != Integer.MAX_VALUE) {
                c6f0Var.r0();
                hmb0.X(hmb0Var2);
            }
        }
    }

    @Override // p.bm3
    public final void requestLayout() {
        this.f.a.T(false);
    }

    public final void s0() {
        lmb0 lmb0Var = this.f;
        if (lmb0Var.o > 0) {
            bfn0 bfn0VarA = lmb0Var.a.A();
            Object[] objArr = bfn0VarA.a;
            int i = bfn0VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                hmb0 hmb0Var = (hmb0) objArr[i2];
                lmb0 lmb0Var2 = hmb0Var.f1;
                if ((lmb0Var2.m || lmb0Var2.n) && !lmb0Var2.f) {
                    hmb0Var.T(false);
                }
                c6f0 c6f0Var = lmb0Var2.q;
                if (c6f0Var != null) {
                    c6f0Var.s0();
                }
            }
        }
    }

    public final void t0() {
        int i;
        lmb0 lmb0Var = this.f;
        hmb0.U(lmb0Var.a, false, 7);
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0VarV = hmb0Var.v();
        if (hmb0VarV == null || hmb0Var.q1 != 3) {
            return;
        }
        int iC = l1d.C(hmb0VarV.f1.d);
        if (iC != 0) {
            i = 2;
            if (iC != 2) {
                i = hmb0VarV.q1;
            }
        } else {
            i = 1;
        }
        hmb0Var.q1 = i;
    }

    @Override // p.afh0
    public final int w(int i) {
        t0();
        z5f0 z5f0VarC1 = this.f.a().c1();
        z5f0VarC1.getClass();
        return z5f0VarC1.w(i);
    }

    @Override // p.bm3
    public final void x(j6 j6Var) {
        bfn0 bfn0VarA = this.f.a.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            c6f0 c6f0Var = ((hmb0) objArr[i2]).f1.q;
            c6f0Var.getClass();
            j6Var.invoke(c6f0Var);
        }
    }

    public final void x0() {
        int i;
        this.c1 = true;
        lmb0 lmb0Var = this.f;
        hmb0 hmb0VarV = lmb0Var.a.v();
        int i2 = this.R0;
        if ((i2 != 1 && !lmb0Var.c) || (i2 != 2 && lmb0Var.c)) {
            r0();
            if (this.g && hmb0VarV != null) {
                hmb0VarV.T(false);
            }
        }
        if (hmb0VarV != null) {
            lmb0 lmb0Var2 = hmb0VarV.f1;
            if (!this.g && ((i = lmb0Var2.d) == 3 || i == 4)) {
                if (this.i != Integer.MAX_VALUE) {
                    qf80.c("Place was called on a node which was placed already");
                }
                int i3 = lmb0Var2.h;
                this.i = i3;
                lmb0Var2.h = i3 + 1;
            }
        } else {
            this.i = 0;
        }
        k();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0006, B:5:0x000d, B:9:0x0016, B:12:0x001b, B:14:0x001f, B:15:0x0024, B:17:0x0033, B:19:0x0037, B:22:0x003d, B:21:0x003b, B:23:0x0040, B:25:0x004a, B:30:0x0053, B:32:0x007c, B:31:0x0065), top: B:36:0x0006 }] */
    public final void y0(long j, iu30 iu30Var, be50 be50Var) throws Throwable {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        try {
            hmb0 hmb0VarV = hmb0Var.v();
            if ((hmb0VarV != null ? hmb0VarV.f1.d : 0) == 4) {
                lmb0Var.c = false;
            }
            if (hmb0Var2.p1) {
                qf80.a("place is called on a deactivated node");
            }
            lmb0Var.d = 4;
            boolean z = true;
            this.Y = true;
            this.c1 = false;
            if (!qr80.b(j, this.O0)) {
                if (lmb0Var.n || lmb0Var.m) {
                    lmb0Var.f = true;
                }
                s0();
            }
            oxq0 oxq0VarA = kmb0.a(hmb0Var2);
            this.O0 = j;
            if (lmb0Var.f) {
                lmb0Var.h(false);
                this.S0.o(false);
                uxq0 snapshotObserver = ((ha4) oxq0VarA).getSnapshotObserver();
                snapshotObserver.a.d(hmb0Var2, snapshotObserver.g, this.b1);
            } else {
                if (this.R0 == 3) {
                    z = false;
                }
                if (z) {
                    z5f0 z5f0VarC1 = lmb0Var.a().c1();
                    z5f0VarC1.getClass();
                    z5f0VarC1.Z0(j);
                    x0();
                } else {
                    lmb0Var.h(false);
                    this.S0.o(false);
                    uxq0 snapshotObserver2 = ((ha4) oxq0VarA).getSnapshotObserver();
                    snapshotObserver2.a.d(hmb0Var2, snapshotObserver2.g, this.b1);
                }
            }
            this.P0 = iu30Var;
            this.Q0 = be50Var;
            lmb0Var.d = 5;
        } catch (Throwable th) {
            hmb0Var.Z(th);
            throw null;
        }
    }

    public final boolean z0(long j) throws Throwable {
        lmb0 lmb0Var = this.f;
        hmb0 hmb0Var = lmb0Var.a;
        hmb0 hmb0Var2 = lmb0Var.a;
        try {
            if (hmb0Var.p1) {
                qf80.a("measure is called on a deactivated node");
            }
            hmb0 hmb0VarV = hmb0Var2.v();
            hmb0Var2.d1 = hmb0Var2.d1 || (hmb0VarV != null && hmb0VarV.d1);
            if (!hmb0Var2.f1.e) {
                hjl hjlVar = this.N0;
                if (hjlVar == null ? false : hjl.c(hjlVar.a, j)) {
                    oxq0 oxq0Var = hmb0Var2.O0;
                    if (oxq0Var != null) {
                        ((ha4) oxq0Var).h(hmb0Var2, true);
                    }
                    hmb0Var2.Y();
                    return false;
                }
            }
            this.N0 = new hjl(j);
            k0(j);
            this.S0.p(false);
            bfn0 bfn0VarA = hmb0Var2.A();
            Object[] objArr = bfn0VarA.a;
            int i = bfn0VarA.c;
            for (int i2 = 0; i2 < i; i2++) {
                c6f0 c6f0Var = ((hmb0) objArr[i2]).f1.q;
                c6f0Var.getClass();
                c6f0Var.S0.r(false);
            }
            long j2 = this.Z ? this.c : -9223372034707292160L;
            this.Z = true;
            z5f0 z5f0VarC1 = lmb0Var.a().c1();
            if (z5f0VarC1 == null) {
                qf80.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            lmb0Var.c(j);
            h0((((long) z5f0VarC1.a) << 32) | (((long) z5f0VarC1.b) & 4294967295L));
            return (((int) (j2 >> 32)) == z5f0VarC1.a && ((int) (j2 & 4294967295L)) == z5f0VarC1.b) ? false : true;
        } catch (Throwable th) {
            hmb0Var.Z(th);
            throw null;
        }
    }
}
