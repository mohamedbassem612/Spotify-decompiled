package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yq71 extends pim0 implements v06, m7v, sim0, sjp0, j4k {
    public n511 O0;
    public ne5 P0;
    public n511 Q0;
    public boolean R0;
    public ys71 S0;
    public final b091 T0;

    public yq71(ys71 ys71Var) {
        this.S0 = ys71Var;
        this.T0 = b2u.w(oqn1.n(vs71.a, ys71Var));
    }

    @Override // p.pim0
    public final void A1() {
        elb0 elb0Var = this.S0.k().b.e;
        if (elb0Var != null) {
            this.Q0 = (elb0Var.a() && this.R0) ? anm1.g(Offset.f(nho1.B(oap1.z(this)), nho1.B(elb0Var)), o0c.R(oap1.z(this).c)) : null;
        }
        J1(null);
        this.S0.x((ys71) null);
        this.S0.t((yq71) null);
        this.S0.s(false);
        this.R0 = false;
    }

    @Override // p.pim0
    public final void B1() {
        this.Q0 = null;
        J1(null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final hfh0 G0(x06 x06Var, afh0 afh0Var, long j) {
        n511 n511VarC;
        long j2;
        elb0 elb0VarI;
        long jH;
        long jB;
        if (this.S0.k().c.v().e() == null || (n511VarC = this.S0.k().c.v().c()) == null) {
            j2 = 4294967295L;
        } else {
            float f = n511VarC.b;
            float f2 = n511VarC.d;
            float f3 = n511VarC.a;
            float f4 = n511VarC.c;
            ft71 ft71VarA = this.S0.a();
            if (ft71VarA == null || !ft71VarA.m()) {
                j2 = 4294967295L;
                this.S0.v(false);
            } else if (!this.S0.e() && (elb0VarI = ft71VarA.i()) != null && elb0VarI.a() && I1().a()) {
                float fG = ft71VarA.g();
                j2 = 4294967295L;
                long jA = vs71.a(elb0VarI, I1(), ft71VarA.h());
                long jB2 = vs71.b(n511VarC.h(), jA, 0L, fG);
                yq71 yq71VarD = this.S0.d();
                boolean z = !this.S0.m() && ((yq71VarD != null ? yq71VarD.H1() : null) == ft71VarA);
                if (z) {
                    fG = 1.0f;
                }
                float f5 = fG;
                int i = (int) (jB2 >> 32);
                int i2 = (int) (jB2 & 4294967295L);
                this.O0 = new n511(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), l1d.e(f4, f3, f5, Float.intBitsToFloat(i)), l1d.e(f2, f, f5, Float.intBitsToFloat(i2)));
                if (z) {
                    this.P0 = null;
                } else {
                    ke5 ke5VarJ = ft71VarA.j();
                    float f6 = ke5VarJ != null ? ke5VarJ.a : 0.0f;
                    le5 le5VarL = ft71VarA.l();
                    float f7 = le5VarL != null ? le5VarL.a : 0.0f;
                    float f8 = le5VarL != null ? le5VarL.b : 0.0f;
                    int i3 = (int) (jA >> 32);
                    int i4 = (int) (jA & 4294967295L);
                    this.P0 = new ne5(((f3 - Float.intBitsToFloat(i3)) * f6) + f7, ((f - Float.intBitsToFloat(i4)) * f6) + f8, ((f4 - Float.intBitsToFloat(i3)) * f6) + f7, ((f2 - Float.intBitsToFloat(i4)) * f6) + f8);
                }
                this.S0.v(true);
            } else {
                j2 = 4294967295L;
            }
        }
        n511 n511VarC2 = this.O0;
        if (n511VarC2 == null && (n511VarC2 = this.S0.c().c()) == null) {
            n511VarC2 = this.S0.k().c.z();
        }
        if (n511VarC2 != null) {
            long jL = o0c.L(n511VarC2.g());
            int i5 = (int) (jL >> 32);
            int i6 = (int) (jL & j2);
            if (i5 == Integer.MAX_VALUE || i6 == Integer.MAX_VALUE) {
                bhn0.l("Error: Infinite width/height is invalid. animated bounds: ", this.S0.c().c(), ", current bounds: ", this.S0.k().c.v().c());
                return null;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            if (!((i5 >= 0) & (i6 >= 0))) {
                sf80.a("width and height must be >= 0");
            }
            jH = jjl.h(i5, i5, i6, i6);
        } else {
            jH = j;
        }
        q5t0 q5t0VarH = afh0Var.H(jH);
        if (this.S0.k().c.v().d()) {
            nv71 nv71VarJ = this.S0.j();
            jB = this.S0.k().b.a.a(oap1.z(this)).b();
            int i7 = q5t0VarH.a;
            int i8 = q5t0VarH.b;
            nv71VarJ.getClass();
        } else {
            jB = (((long) q5t0VarH.a) << 32) | (((long) q5t0VarH.b) & j2);
        }
        return x06Var.S((int) (jB >> 32), (int) (jB & j2), b7x.a, new xq71(this, q5t0VarH));
    }

    public final ft71 H1() {
        if (this.N0) {
            return (ft71) n1(c3t.a);
        }
        return null;
    }

    public final elb0 I1() {
        elb0 elb0Var = this.S0.k().b.e;
        if (elb0Var != null) {
            return elb0Var;
        }
        hhg1.n("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final void J1(be50 be50Var) {
        be50 be50VarG = this.S0.g();
        if (u890.j(be50Var, be50VarG)) {
            return;
        }
        if (be50VarG != null) {
            oap1.y(this).c(be50VarG);
        }
        this.S0.w(be50Var);
    }

    public final void K1() {
        yky0 yky0Var = vs71.a;
        ys71 ys71Var = this.S0;
        b091 b091Var = c7x.d;
        b091 b091Var2 = this.T0;
        if (b091Var2 == b091Var) {
            qf80.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!b091Var2.m(yky0Var)) {
            qf80.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + yky0Var + " was not found.");
        }
        b091Var2.Q(yky0Var, ys71Var);
        this.S0.x((ys71) n1(yky0Var));
        J1(null);
        this.R0 = false;
        this.S0.t(this);
    }

    @Override // p.sim0
    public final j2h1 U() {
        return this.T0;
    }

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new xq71(q5t0VarH, this));
    }

    @Override // p.sjp0
    public final void f0() {
        this.S0.k().f();
        p9p1.z(this, this.S0.k().i);
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        n511 n511VarC = this.S0.k().c.v().c();
        boolean zM = this.S0.m();
        ys71 ys71Var = this.S0;
        u8s0 u8s0VarA = null;
        if (!zM) {
            ys71Var.u((u8s0) null);
            J1(null);
            if (this.S0.n()) {
                lslVar.s1();
                return;
            }
            return;
        }
        if (n511VarC != null) {
            qv71 qv71VarI = ys71Var.i();
            ov71 ov71VarP = this.S0.p();
            lslVar.getLayoutDirection();
            oap1.x(this);
            qv71VarI.getClass();
            u8s0VarA = qv71.a(ov71VarP);
        }
        ys71Var.u(u8s0VarA);
        if (this.S0.g() == null) {
            J1(oap1.y(this).b());
        }
        be50 be50VarG = this.S0.g();
        if (be50VarG == null) {
            eg.m("Error: shared element does not have a layer for rendering in the overlay.");
            return;
        }
        lslVar.V(o0c.P(lslVar.j()), new snd(lslVar, n511VarC, this), be50VarG);
        if (this.S0.n()) {
            m5n1.r(lslVar, be50VarG);
        }
    }

    public final boolean y0(long j) {
        return this.S0.q() && this.S0.k().a() && this.S0.k().b.c();
    }

    @Override // p.pim0
    public final void z1() {
        p9p1.z(this, this.S0.k().i);
        K1();
        this.S0.s(true);
    }
}
