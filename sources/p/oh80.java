package p;

import android.graphics.Color;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class oh80 {
    public static final cr31 a = er31.b(12.0f);
    public static final float b = 120.0f;

    public static final void a(nh80 nh80Var, iu30 iu30Var, qim0 qim0Var, long j, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        long j2;
        int i3;
        qim0 qim0Var3;
        long jA;
        long j3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2046455180);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(nh80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            x340Var.d0();
            int i5 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i5 == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                i3 = i4 & (-7169);
                qim0Var3 = qim0Var4;
                jA = cbx.a(x340Var).a.a.a();
            } else {
                x340Var.b0();
                jA = j;
                i3 = i4 & (-7169);
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            if (nh80Var instanceof kh80) {
                x340Var.i0(1114747404);
                x340Var.r(false);
                j3 = jA;
            } else {
                boolean z2 = nh80Var instanceof mh80;
                if (!z2 && !(nh80Var instanceof lh80)) {
                    throw p3d1.k(x340Var, 451601542, false);
                }
                x340Var.i0(1114893786);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int i6 = i3;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z3 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarH = u291.h(qim0VarF2, cbx.b(x340Var).b.d);
                long j4 = jA;
                t1c.a(dug.e(qim0VarH, v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(jA, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j4)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
                qim0 qim0VarF3 = dug.f(u291.f(qim0Var4, 1.0f), j4, d4o1.a);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0Var4, 16.0f);
                boolean z4 = nh80Var instanceof lh80;
                j3 = j4;
                x340Var = x340Var;
                tob1 tob1VarB = z95.b(z4 ? 0.0f : 1.0f, irn1.o0(300, 0, (dlv) null, 6), "upsell_loading_alpha", (iu30) null, x340Var, 3072, 20);
                tob1 tob1VarB2 = z95.b(z4 ? 1.0f : 0.0f, irn1.o0(600, 270, (dlv) null, 4), "upsell_content_alpha", (iu30) null, x340Var, 3072, 20);
                if (z2 || ((Number) tob1VarB2.getValue()).floatValue() < 1.0f) {
                    x340Var.i0(2001126702);
                    c(((Number) tob1VarB.getValue()).floatValue(), 0, x340Var, qim0VarX);
                    x340Var.r(false);
                } else {
                    x340Var.i0(2001207426);
                    x340Var.r(false);
                }
                if (z4) {
                    x340Var.i0(2001260002);
                    b((lh80) nh80Var, iu30Var, d9y0.k(qim0VarX, ((Number) tob1VarB2.getValue()).floatValue()), x340Var, i6 & 126);
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(2001352258);
                    x340Var.r(false);
                }
                us71.m(x340Var, true, true, z);
            }
            qim0Var2 = qim0Var3;
            j2 = j3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            j2 = j;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q18(nh80Var, iu30Var, qim0Var2, j2, i);
        }
    }

    public static final void b(lh80 lh80Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1541474322);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lh80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarQ = i1p1.q(u291.f(qim0Var, 1.0f), a);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var).d.b, d4o1.a);
            boolean zI = ((i2 & 112) == 32) | x340Var.i(lh80Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new x680(iu30Var, lh80Var, (byte) 2);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            azh1 azh1Var = lh80Var.c;
            if (azh1Var == null) {
                x340Var.i0(-874744380);
                x340Var.r(false);
            } else {
                x340Var.i0(-874744379);
                d(azh1Var.a, azh1Var.b, azh1Var.c, x340Var, 0);
                x340Var.r(false);
            }
            uwo1.e(lh80Var.a, (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            uwo1.e(lh80Var.b, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            w0h1.a(plx.c, isl.a, (qim0) null, cbx.a(x340Var).b.a, 0L, false, x340Var, plx.d | 48, 52);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((byte) 6, i, lh80Var, qim0Var, iu30Var);
        }
    }

    public static final void c(float f, int i, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2029041791);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarQ = i1p1.q(u291.b(0.0f, b, 1, u291.f(qim0Var, 1.0f)), a);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarQ, cbx.a(x340Var).d.b, d4o1.a), cbx.b(x340Var).b.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(d9y0.k(nim0.a, f), 3, cbx.a(x340Var).b.a, 0L, x340Var, 48, 8);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(qim0Var, f, i, (byte) 5);
        }
    }

    public static final void d(String str, String str2, String str3, b0k b0kVar, int i) {
        long jE;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2073871787);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (ihc1.y0(str2)) {
                x340Var.i0(-390039832);
                uwr uwrVar = cbx.a;
                jE = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                x340Var.i0(-389983722);
                try {
                    jE = z4p1.e(Color.parseColor(str2));
                } catch (IllegalArgumentException unused) {
                    uwr uwrVar2 = cbx.a;
                    jE = cbx.a(x340Var).b.c;
                }
                x340Var.r(false);
            }
            wsx wsxVar = str3 != null ? wsx.c : null;
            fra fraVar = een.N0;
            uwr uwrVar3 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (wsxVar != null) {
                x340Var.i0(-310246537);
                zov0 zov0Var = cbx.b(x340Var).g;
                j = jE;
                w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var, wsx.d | 48, 48);
                x340Var.r(false);
            } else {
                j = jE;
                x340Var.i0(-310029165);
                x340Var.r(false);
            }
            uwo1.e(str, (qim0) null, cbx.d(x340Var).k, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sb9(str, str2, i, str3);
        }
    }
}
