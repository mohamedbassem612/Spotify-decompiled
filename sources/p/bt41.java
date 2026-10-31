package p;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bt41 extends m5v implements hpa0, t161 {
    public final g6o0 j1;
    public w9 k1;
    public y9 l1;
    public boolean m1;
    public boolean n1;
    public wnm0 o1;
    public m3g1 p1;
    public final ozr q1;
    public final du41 r1;
    public final ys41 s1;
    public final d030 t1;
    public final xtl u1;

    public bt41(p5c p5cVar, iq20 iq20Var, idn0 idn0Var, qqq0 qqq0Var, hxq0 hxq0Var, ct41 ct41Var, boolean z, boolean z2) {
        super(fae1.a, z, idn0Var, qqq0Var);
        this.j1 = new g6o0();
        ozr ozrVarV = lrn1.v();
        this.q1 = ozrVarV;
        du41 du41Var = new du41(ct41Var, hxq0Var, iq20Var == null ? ozrVarV : iq20Var, qqq0Var, z2, c2(), this, new zs41(this, (byte) 0));
        this.r1 = du41Var;
        this.s1 = new ys41(du41Var, z);
        d030 d030VarC = l6p1.c();
        H1(d030VarC);
        this.t1 = d030VarC;
        xtl xtlVar = new xtl(qqq0Var, du41Var, z2, p5cVar, new zs41(this, (byte) 1));
        H1(xtlVar);
        this.u1 = xtlVar;
        H1(new l6o0(this.s1, this.j1));
        m5c m5cVar = new m5c();
        m5cVar.O0 = xtlVar;
        H1(m5cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.m5v, p.mav0
    public final void D0(bav0 bav0Var, cav0 cav0Var, long j) {
        int i;
        List list = bav0Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Boolean) this.R0.invoke(new rav0(((hav0) list.get(i2)).i))).booleanValue()) {
                super.D0(bav0Var, cav0Var, j);
                break;
            }
        }
        if (this.S0) {
            if (this.a1 == null) {
                rj40 rj40VarX = crm0.x(this);
                H1(rj40VarX);
                this.a1 = rj40VarX;
            }
            cav0 cav0Var2 = cav0.a;
            if (cav0Var == cav0Var2 && bav0Var.f == 6) {
                if (!this.m1) {
                    this.o1 = new wnm0(this.r1, vvm1.F(this), new u98(2, this, bt41.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 16), oap1.B(this).Z0);
                    this.m1 = true;
                }
                wnm0 wnm0Var = this.o1;
                if (wnm0Var != null) {
                    wnm0Var.h(v1());
                }
            }
            wnm0 wnm0Var2 = this.o1;
            if (wnm0Var2 != null) {
                wnm0Var2.g(bav0Var, cav0Var, j);
            }
            if (cav0Var == cav0Var2 && ((i = bav0Var.f) == 10 || i == 11 || i == 12)) {
                if (!this.n1) {
                    this.p1 = new m3g1(this.r1, new u98(2, this, bt41.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 17), oap1.B(this).Z0);
                    this.n1 = true;
                }
                m3g1 m3g1Var = this.p1;
                if (m3g1Var != null) {
                    m3g1Var.f(v1());
                }
            }
            m3g1 m3g1Var2 = this.p1;
            if (m3g1Var2 != null) {
                m3g1Var2.e(bav0Var, cav0Var, j);
            }
        }
    }

    @Override // p.hpa0
    public final boolean J0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (this.S0) {
            long jR = ern1.r(keyEvent);
            int i = toa0.P;
            if ((toa0.a(jR, qqn1.O()) || toa0.a(ern1.r(keyEvent), qqn1.P())) && crn1.m(ern1.t(keyEvent), 2) && !ern1.v(keyEvent)) {
                boolean z = this.r1.d == qqq0.a;
                xtl xtlVar = this.u1;
                if (z) {
                    int iI1 = (int) (xtlVar.I1() & 4294967295L);
                    float f = toa0.a(ern1.r(keyEvent), qqn1.P()) ? iI1 : -iI1;
                    jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    iFloatToRawIntBits = Float.floatToRawIntBits(f);
                } else {
                    int iI2 = (int) (xtlVar.I1() >> 32);
                    jFloatToRawIntBits = Float.floatToRawIntBits(toa0.a(ern1.r(keyEvent), qqn1.P()) ? iI2 : -iI2);
                    iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                }
                c921.y(v1(), (o8n) null, 0, new at41(this, (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32), null), 3);
                return true;
            }
        }
        return false;
    }

    @Override // p.m5v
    public final Object L1(swn swnVar, rzu rzuVar) {
        du41 du41Var = this.r1;
        Object objG = du41Var.g(hfn0.b, new n641(swnVar, du41Var, (lnm) null, (byte) 9), rzuVar);
        return objG == d9n.a ? objG : rih1.a;
    }

    @Override // p.m5v
    public final void R1(n4v n4vVar) {
        if (this.N0) {
            c921.y(c2().d(), (o8n) null, 0, new lc41(n4vVar, this, (lnm) null, (byte) 10), 3);
        }
    }

    @Override // p.m5v
    public final boolean Z1() {
        du41 du41Var = this.r1;
        if (du41Var.a.b()) {
            return true;
        }
        hxq0 hxq0Var = du41Var.b;
        return hxq0Var != null ? hxq0Var.c() : false;
    }

    public final g6o0 c2() {
        return this.j1;
    }

    public final void d2(p5c p5cVar, iq20 iq20Var, idn0 idn0Var, qqq0 qqq0Var, hxq0 hxq0Var, ct41 ct41Var, boolean z, boolean z2) {
        boolean z3;
        if (this.S0 != z) {
            this.s1.b = z;
            this.k1 = null;
            this.l1 = null;
            nko1.C(this);
        }
        if (iq20Var == null) {
            iq20Var = this.q1;
        }
        g6o0 g6o0VarC2 = c2();
        du41 du41Var = this.r1;
        boolean z4 = true;
        if (u890.j(du41Var.a, ct41Var)) {
            z3 = false;
        } else {
            du41Var.a = ct41Var;
            z3 = true;
        }
        du41Var.b = hxq0Var;
        qqq0 qqq0Var2 = du41Var.d;
        if (qqq0Var2 != qqq0Var) {
            du41Var.d = qqq0Var;
            qqq0Var2 = qqq0Var;
            z3 = true;
        }
        if (du41Var.e != z2) {
            du41Var.e = z2;
        } else {
            z4 = z3;
        }
        du41Var.c = iq20Var;
        du41Var.f = g6o0VarC2;
        xtl xtlVar = this.u1;
        xtlVar.O0 = qqq0Var;
        xtlVar.Q0 = z2;
        xtlVar.R0 = p5cVar;
        qqq0 qqq0Var3 = qqq0.a;
        if (qqq0Var2 != qqq0Var3) {
            qqq0Var3 = qqq0.b;
        }
        b2(fae1.a, z, idn0Var, qqq0Var3, z4);
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        if (this.S0 && (this.k1 == null || this.l1 == null)) {
            this.k1 = new w9(this, (byte) 0);
            this.l1 = new y9(this, (lnm) null);
        }
        w9 w9Var = this.k1;
        if (w9Var != null) {
            mma0[] mma0VarArr = b261.a;
            e261Var.b(m161.d, new we(null, w9Var));
        }
        y9 y9Var = this.l1;
        if (y9Var != null) {
            mma0[] mma0VarArr2 = b261.a;
            e261Var.b(m161.e, y9Var);
        }
    }

    @Override // p.x4t, p.mav0
    public final void i() {
        K0();
        wnm0 wnm0Var = this.o1;
        if (wnm0Var != null) {
            wnm0Var.c = oap1.B(this).Z0;
        }
        m3g1 m3g1Var = this.p1;
        if (m3g1Var != null) {
            m3g1Var.c = oap1.B(this).Z0;
        }
        K0();
        if (this.N0) {
            wat watVar = oap1.B(this).Z0;
            ozr ozrVar = this.q1;
            ozrVar.getClass();
            ozrVar.a = dem1.A(watVar);
        }
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }

    @Override // p.hpa0
    public final boolean x0(KeyEvent keyEvent) {
        return false;
    }

    @Override // p.pim0
    public final void z1() {
        wnm0 wnm0Var = this.o1;
        if (wnm0Var != null) {
            wnm0Var.c = oap1.B(this).Z0;
        }
        m3g1 m3g1Var = this.p1;
        if (m3g1Var != null) {
            m3g1Var.c = oap1.B(this).Z0;
        }
        if (this.N0) {
            wat watVar = oap1.B(this).Z0;
            ozr ozrVar = this.q1;
            ozrVar.getClass();
            ozrVar.a = dem1.A(watVar);
        }
    }

    @Override // p.m5v
    public final void Q1(long j) {
    }
}
