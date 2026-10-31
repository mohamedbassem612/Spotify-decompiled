package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class hlz0 {
    public static final long a = z4p1.g(4294967295L);
    public static final /* synthetic */ int b = 0;

    public static final void a(String str, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        String str2;
        int i2;
        b0k b0kVar2;
        lee1 lee1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1414028198);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                b0kVar3.i0(-1671428350);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(b0kVar3).m;
            } else {
                b0kVar3.i0(-1671427325);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(b0kVar3).j;
            }
            b0kVar3.r(false);
            lee1 lee1Var2 = lee1Var;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            int i3 = i2;
            uwo1.e(str2, (qim0) null, lee1Var2, ((vex) zex.a.e).m, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, i2 & 14, 0, 2034);
            b0kVar2 = b0kVar3;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.r(nim0Var, 8.0f));
            dv20.l((i3 >> 6) & 14, j2iVar, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(str, z, j2iVar, i, (byte) 24);
        }
    }

    public static final void b(int i, int i2, boolean z, b0k b0kVar, int i3) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-526100717);
        int i4 = (x340Var2.e(i) ? 4 : 2) | i3 | (x340Var2.e(i2) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128);
        if (x340Var2.Y(i4 & 1, (i4 & 147) != 146)) {
            int iMax = Math.max(2, String.valueOf(i2).length());
            String strF0 = ihc1.F0(iMax, String.valueOf(i2));
            String strF1 = ihc1.F0(iMax, String.valueOf(i + 1));
            lee1 lee1VarE = e(z, x340Var2);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            gxo1.c(strF1, (qim0) null, lee1VarE, cbx.a(x340Var2).b.a, (a0e1) null, 0, false, (djc0) null, (qx8) null, 0.0f, (FontWeight) null, (iu30) null, x340Var2, 0, 0, 4082);
            gxo1.c(l1d.m("/", strF0), (qim0) null, lee1VarE, ((vex) zex.a.e).k, (a0e1) null, 0, false, (djc0) null, (qx8) null, 0.0f, (FontWeight) ((bjx) ajx.a.c).c, (iu30) null, x340Var2, 0, 0, 3058);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rpf(i, i2, i3, z);
        }
    }

    public static final void c(elz0 elz0Var, yqg yqgVar, boolean z, b0k b0kVar, int i) {
        int i2;
        Integer numValueOf;
        boolean z2;
        Long l = elz0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(546547371);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(elz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(yqgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            boolean z3 = elz0Var.g;
            Long l2 = elz0Var.e;
            boolean z4 = (l == null || l2 != null || z3) ? false : true;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.m(yqgVar.b(), x340Var);
            }
            frr0 frr0Var = (frr0) objT;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zH = ((i2 & 112) == 32) | x340Var.h(z4) | x340Var.i(frr0Var);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                hl0 hl0Var = new hl0(z4, yqgVar, frr0Var, (lnm) null, (byte) 20);
                x340Var.s0(hl0Var);
                objT2 = hl0Var;
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            if (z3 || l == null) {
                numValueOf = null;
            } else {
                long jLongValue = elz0Var.f - ((l2 != null ? l2.longValue() : frr0Var.s()) - l.longValue());
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                numValueOf = Integer.valueOf((int) ((jLongValue + 999) / 1000));
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            jw31 jw31VarA = ew31.a(new d36(cbx.b(x340Var).b.b, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            String str = elz0Var.c;
            if (str == null) {
                x340Var.i0(1352192400);
                x340Var.r(false);
            } else {
                x340Var.i0(1352192401);
                a(klz0Var.b.b.d, z, apo.r(-1145914984, new mv8(z, str, (byte) 9), x340Var), x340Var, ((i2 >> 3) & 112) | 384);
                x340Var.r(false);
            }
            int i3 = (i2 >> 3) & 112;
            a(klz0Var.b.b.c, z, apo.r(1167114152, new kf2(elz0Var, z, (byte) 19), x340Var), x340Var, i3 | 384);
            if (numValueOf == null) {
                x340Var.i0(1352849011);
                x340Var.r(false);
                z2 = true;
            } else {
                x340Var.i0(1352849012);
                int iIntValue = numValueOf.intValue();
                z2 = true;
                kk0.s(1.0f, true, x340Var);
                d(iIntValue, i3, x340Var, new i5j1(een.N0), z);
                x340Var.r(false);
            }
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(elz0Var, yqgVar, z, i, (byte) 25);
        }
    }

    public static final void d(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1237529288);
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            klz0 klz0Var = (klz0) x340Var2.k(llz0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                x340Var2.s0(objT);
            }
            o95 o95Var = (o95) objT;
            boolean z2 = (i3 & 14) == 4;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                long j = a;
                objT2 = i <= 5 ? new mmr0(new u7h(klz0Var.a.d), new u7h(j)) : new mmr0(new u7h(klz0Var.a.c), new u7h(j));
                x340Var2.s0(objT2);
            }
            mmr0 mmr0Var = (mmr0) objT2;
            long j2 = ((u7h) mmr0Var.a).a;
            long j3 = ((u7h) mmr0Var.b).a;
            lee1 lee1VarE = e(z, x340Var2);
            wat watVar = (wat) x340Var2.k(t4k.h);
            boolean zD = x340Var2.d(2.0f) | x340Var2.g(watVar);
            Object objT3 = x340Var2.T();
            if (zD || objT3 == m4cVar) {
                objT3 = new phc1(watVar.X0(2.0f), 0.0f, 0, 0, (uw4) null, 30);
                x340Var2.s0(objT3);
            }
            phc1 phc1Var = (phc1) objT3;
            Integer numValueOf = Integer.valueOf(i);
            boolean zI = x340Var2.i(o95Var);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new glz0(o95Var, null, (byte) 0);
                x340Var2.s0(objT4);
            }
            qxd0.t(numValueOf, x340Var2, (vu30) objT4);
            qim0 qim0VarY = uyn1.y(exd0.q(qim0Var, new ca5(((Number) o95Var.e()).floatValue(), j2, j3, phc1Var)), 6.0f, 4.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strF0 = ihc1.F0(2, String.valueOf(i));
            cvx cvxVar4 = cbx.b(x340Var2).b;
            gxo1.c(strF0, uyn1.z(8.0f, 0.0f, 2, nim0.a), lee1VarE, j2, (a0e1) null, 0, false, (djc0) null, (qx8) null, 0.0f, (FontWeight) null, (iu30) null, x340Var2, 0, 0, 4080);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nnv(i, z, qim0Var, i2, (byte) 1);
        }
    }

    public static final lee1 e(boolean z, b0k b0kVar) {
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        if (z) {
            x340Var.i0(-2042432518);
            uwr uwrVar = cbx.a;
            lee1Var = cbx.d(x340Var).g;
        } else {
            x340Var.i0(-2042431430);
            uwr uwrVar2 = cbx.a;
            lee1Var = cbx.d(x340Var).e;
        }
        x340Var.r(false);
        lee1 lee1Var2 = lee1Var;
        x340 x340Var2 = (x340) b0kVar;
        boolean zG = x340Var2.g(lee1Var2);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            objT = lee1.a(lee1Var2, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "lnum,tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151);
            x340Var2.s0(objT);
        }
        return (lee1) objT;
    }
}
