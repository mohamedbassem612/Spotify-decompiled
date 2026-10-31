package p;

import androidx.car.app.model.Alert;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n4e1 extends l5t implements zlb0, m7v, j4k, mv40, t161 {
    public boolean Q0;
    public boolean R0;
    public aae1 S0;
    public ggg1 T0;
    public r7e1 U0;
    public Brush V0;
    public boolean W0;
    public es41 X0;
    public qqq0 Y0;
    public k3f1 Z0;
    public hdt0 a1;
    public qoo b1;
    public xab1 c1;
    public nbe1 d1;
    public n511 e1 = new n511(-1.0f, -1.0f, -1.0f, -1.0f);
    public int f1;
    public int g1;
    public final g6e1 h1;
    public final u3e1 i1;

    public n4e1(boolean z, boolean z2, boolean z3, aae1 aae1Var, ggg1 ggg1Var, r7e1 r7e1Var, Brush brush, boolean z4, es41 es41Var, qqq0 qqq0Var, k3f1 k3f1Var, hdt0 hdt0Var) {
        this.Q0 = z;
        this.R0 = z2;
        this.S0 = aae1Var;
        this.T0 = ggg1Var;
        this.U0 = r7e1Var;
        this.V0 = brush;
        this.W0 = z4;
        this.X0 = es41Var;
        this.Y0 = qqq0Var;
        this.Z0 = k3f1Var;
        this.a1 = hdt0Var;
        x4t j6e1Var = rxf0.a() ? new j6e1(ggg1Var, r7e1Var, aae1Var, z || z2 || z3) : new h45();
        H1(j6e1Var);
        this.h1 = j6e1Var;
        u3e1 u3e1Var = new u3e1(this.Z0, new rv3(this, (lnm) null, (byte) 1), new ro8(this, (lnm) null, (byte) 26), new w7d1((Object) this, (byte) 5));
        H1(u3e1Var);
        this.i1 = u3e1Var;
    }

    public final void E(elb0 elb0Var) {
        this.S0.e.setValue(elb0Var);
        this.h1.E(elb0Var);
    }

    public final boolean K1() {
        if (!this.W0) {
            return false;
        }
        if (!this.Q0 && !this.R0) {
            return false;
        }
        n6a1 n6a1Var = this.V0;
        return ((n6a1Var instanceof n6a1) && n6a1Var.a == 16) ? false : true;
    }

    public final void L1() {
        if (this.b1 == null) {
            this.b1 = new qoo(((Boolean) lcc.z(this, t4k.y)).booleanValue());
            ha71.x(this);
        }
        this.c1 = fn31.T(v1(), null, 0, new xba1(this, (lnm) null, (byte) 23), 3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    public final void M1(p5t0 p5t0Var, int i, int i2, long j, flb0 flb0Var) {
        int i3;
        y9e1 y9e1VarC;
        float f;
        this.X0.b.t(i);
        this.X0.h(i2 - i);
        nbe1 nbe1Var = this.d1;
        if (nbe1Var != null) {
            int i4 = nbe1.c;
            int i5 = (int) (j & 4294967295L);
            long j2 = nbe1Var.a;
            if (i5 == ((int) (j2 & 4294967295L))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.f1 && i == this.g1) {
                    i3 = -1;
                }
            } else {
                int i6 = nbe1.c;
                i3 = (int) (4294967295L & j);
            }
        } else {
            int i7 = nbe1.c;
            i3 = (int) (4294967295L & j);
        }
        if (i3 < 0 || !K1() || (y9e1VarC = this.S0.c()) == null) {
            return;
        }
        n511 n511VarC = y9e1VarC.c(yoi1.q(i3, new tr80(0, y9e1VarC.a.a.b.length(), 1)));
        float f2 = n511VarC.a;
        float f3 = n511VarC.c;
        boolean z = flb0Var == flb0.b;
        int iI0 = p5t0Var.i0(2.0f);
        float f4 = z ? i2 - f3 : f2;
        if (z) {
            f2 = i2 - f3;
        }
        float f5 = f2 + iI0;
        float f6 = i2;
        if (f5 > f6) {
            f5 = f6;
        }
        n511 n511VarB = n511.b(n511VarC, f4, 0.0f, f5, 10);
        float f7 = n511VarB.b;
        float f8 = n511VarB.a;
        n511 n511Var = this.e1;
        boolean z2 = (f8 == n511Var.a && f7 == n511Var.b && i2 == this.f1) ? false : true;
        if (z2 || i != this.g1) {
            boolean z3 = this.Y0 == qqq0.a;
            if (!z3) {
                f7 = f8;
            }
            float f9 = z3 ? n511VarB.d : n511VarB.c;
            int iS = this.X0.a.s();
            float f10 = iS + i;
            if (f9 > f10) {
                f = f9 - f10;
            } else {
                float f11 = iS;
                if (f7 >= f11 || f9 - f7 <= i) {
                    f = (f7 >= f11 || f9 - f7 > ((float) i)) ? 0.0f : f7 - f11;
                } else {
                    f = f9 - f10;
                }
            }
            this.d1 = new nbe1(j);
            this.e1 = n511VarB;
            this.g1 = i;
            this.f1 = i2;
            fn31.T(v1(), null, 4, new m4e1(f, this, z2, j, n511VarC, null), 1);
        }
    }

    public final hfh0 d(final ifh0 ifh0Var, afh0 afh0Var, long j) {
        qqq0 qqq0Var = this.Y0;
        qqq0 qqq0Var2 = qqq0.a;
        b7x b7xVar = b7x.a;
        if (qqq0Var == qqq0Var2) {
            final q5t0 q5t0VarH = afh0Var.H(hjl.b(j, 0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 7));
            final int iMin = Math.min(q5t0VarH.b, hjl.h(j));
            final byte b = 1;
            return ifh0Var.S(q5t0VarH.a, iMin, b7xVar, new iu30(this) { // from class: p.l4e1
                public final /* synthetic */ n4e1 b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj) {
                    byte b2 = b;
                    rih1 rih1Var = rih1.a;
                    ifh0 ifh0Var2 = ifh0Var;
                    q5t0 q5t0Var = q5t0VarH;
                    switch (b2) {
                        case 0:
                            p5t0 p5t0Var = (p5t0) obj;
                            int i = q5t0Var.a;
                            n4e1 n4e1Var = this.b;
                            n4e1Var.M1(p5t0Var, iMin, i, n4e1Var.T0.h().e, ifh0Var2.getLayoutDirection());
                            p5t0.l(-n4e1Var.X0.a.s(), 0, p5t0Var, q5t0Var);
                            break;
                        default:
                            p5t0 p5t0Var2 = (p5t0) obj;
                            int i2 = q5t0Var.b;
                            n4e1 n4e1Var2 = this.b;
                            n4e1Var2.M1(p5t0Var2, iMin, i2, n4e1Var2.T0.h().e, ifh0Var2.getLayoutDirection());
                            p5t0.l(0, -n4e1Var2.X0.a.s(), p5t0Var2, q5t0Var);
                            break;
                    }
                    return rih1Var;
                }
            });
        }
        final q5t0 q5t0VarH2 = afh0Var.H(hjl.b(j, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13));
        final int iMin2 = Math.min(q5t0VarH2.a, hjl.i(j));
        final byte b2 = 0;
        return ifh0Var.S(iMin2, q5t0VarH2.b, b7xVar, new iu30(this) { // from class: p.l4e1
            public final /* synthetic */ n4e1 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                rih1 rih1Var = rih1.a;
                ifh0 ifh0Var2 = ifh0Var;
                q5t0 q5t0Var = q5t0VarH2;
                switch (b3) {
                    case 0:
                        p5t0 p5t0Var = (p5t0) obj;
                        int i = q5t0Var.a;
                        n4e1 n4e1Var = this.b;
                        n4e1Var.M1(p5t0Var, iMin2, i, n4e1Var.T0.h().e, ifh0Var2.getLayoutDirection());
                        p5t0.l(-n4e1Var.X0.a.s(), 0, p5t0Var, q5t0Var);
                        break;
                    default:
                        p5t0 p5t0Var2 = (p5t0) obj;
                        int i2 = q5t0Var.b;
                        n4e1 n4e1Var2 = this.b;
                        n4e1Var2.M1(p5t0Var2, iMin2, i2, n4e1Var2.T0.h().e, ifh0Var2.getLayoutDirection());
                        p5t0.l(0, -n4e1Var2.X0.a.s(), p5t0Var2, q5t0Var);
                        break;
                }
                return rih1Var;
            }
        });
    }

    public final void g(e261 e261Var) {
        this.h1.g(e261Var);
    }

    public final void t0(lsl lslVar) {
        int iG;
        int iF;
        lslVar.s1();
        i4e1 i4e1VarH = this.T0.h();
        y9e1 y9e1VarC = this.S0.c();
        if (y9e1VarC == null) {
            return;
        }
        mmr0 mmr0Var = i4e1VarH.g;
        mmr0 mmr0Var2 = i4e1VarH.g;
        long j = i4e1VarH.e;
        if (mmr0Var != null) {
            boolean z = ((s8e1) mmr0Var.a).a;
            long j2 = ((nbe1) mmr0Var.b).a;
            if (!nbe1.d(j2)) {
                tw4 tw4VarK = y9e1VarC.k(nbe1.g(j2), nbe1.f(j2));
                lee1 lee1Var = y9e1VarC.a.b;
                if (z) {
                    Brush brushB = lee1Var.b();
                    if (brushB != null) {
                        DrawScope.j1(lslVar, tw4VarK, brushB, 0.2f, (DrawStyle) null, 56);
                    } else {
                        long jC = lee1Var.c();
                        if (jC == 16) {
                            jC = u7h.b;
                        }
                        long j3 = jC;
                        DrawScope.w0(lslVar, tw4VarK, u7h.b(j3, u7h.c(j3) * 0.2f, 0.0f, 0.0f, 0.0f, 14), (DrawStyle) null, 60);
                    }
                } else {
                    DrawScope.w0(lslVar, tw4VarK, ((rce1) lcc.z(this, sce1.a)).b, (DrawStyle) null, 60);
                }
            }
        }
        if (nbe1.d(j)) {
            t5p1.p(lslVar.a1().p(), y9e1VarC);
            if (mmr0Var2 == null) {
                Brush brush = this.V0;
                boolean zK1 = K1();
                qoo qooVar = this.b1;
                r7e1 r7e1Var = this.U0;
                float fS = qooVar != null ? qooVar.c.s() : 0.0f;
                if (fS != 0.0f && zK1) {
                    n511 n511VarK = r7e1Var.k();
                    float f = n511VarK.c;
                    float f2 = n511VarK.a;
                    float f3 = f - f2;
                    DrawScope.z(lslVar, brush, (((long) Float.floatToRawIntBits((f3 / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(n511VarK.b)) & 4294967295L), n511VarK.c(), f3, fS, 432);
                }
            }
        } else {
            if (mmr0Var2 == null && (iG = nbe1.g(j)) != (iF = nbe1.f(j))) {
                DrawScope.w0(lslVar, y9e1VarC.k(iG, iF), ((rce1) lcc.z(this, sce1.a)).b, (DrawStyle) null, 60);
            }
            t5p1.p(lslVar.a1().p(), y9e1VarC);
        }
        this.h1.t0(lslVar);
    }

    public final void z1() {
        r7e1 r7e1Var = this.U0;
        boolean z = this.Q0;
        r7e1Var.h = z;
        if (z && K1()) {
            L1();
        }
    }
}
