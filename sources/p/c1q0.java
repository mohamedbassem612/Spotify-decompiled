package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class c1q0 {
    public static final long a = z4p1.g(4280211296L);
    public static final float b = 8.0f;
    public static final float c = 2.0f;
    public static final float d = 3.0f;

    public static final void a(e0q0 e0q0Var, Function0 function0, String str, float f, boolean z, int i, gdx gdxVar, j82 j82Var, boolean z2, Function0 function1, b0k b0kVar, int i2, int i3) {
        int i4;
        boolean z3;
        long jB;
        int i5;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1255557904);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? b0kVar2.g(e0q0Var) : b0kVar2.i(e0q0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar2.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar2.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar2.d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= b0kVar2.e(l1d.C(i)) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= b0kVar2.i(gdxVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= b0kVar2.i(j82Var) ? 8388608 : 4194304;
        }
        int i6 = i3 & 256;
        if (i6 != 0) {
            i4 |= 100663296;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i2 & 100663296) == 0) {
                i4 |= b0kVar2.h(z3) ? 67108864 : 33554432;
            }
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar2.i(function1) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if (b0kVar2.Y(i7 & 1, (i7 & 306783379) != 306783378)) {
            boolean z4 = i6 != 0 ? true : z3;
            boolean z5 = e0q0Var instanceof b0q0;
            boolean z6 = e0q0Var instanceof a0q0;
            ss50 ss50Var = (ss50) b0kVar2.k(t4k.l);
            boolean z7 = z4;
            boolean zH = b0kVar2.h(z5) | b0kVar2.i(ss50Var) | b0kVar2.h(z6) | ((i7 & 1879048192) == 536870912);
            Object objT = b0kVar2.T();
            if (zH || objT == m4cVar) {
                objT = new rj6(z5, ss50Var, z6, function1);
                b0kVar2.s0(objT);
            }
            ven0 ven0VarS = v8r.s(objT, b0kVar2);
            moj0 moj0Var = new moj0(gdxVar.c);
            if (z) {
                jB = u7h.b(a, f * 0.3f, 0.0f, 0.0f, 0.0f, 14);
            } else {
                jB = u7h.j;
            }
            ceo ceoVar = klv.c;
            tob1 tob1VarA = w191.a(jB, irn1.o0(600, 0, ceoVar, 2), "GlowColor", b0kVar2, 384, 8);
            qim0 qim0Var = nim0.a;
            qim0 qim0VarK = z7 ? d9y0.k(qim0Var, f) : qim0Var;
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarK);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z8 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z8) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            b0kVar2.i0(909055637);
            qim0 qim0VarD = i541.D(sto1.k(s161.b(anm1.N("omni_play_button_header", z7 ? uyn1.x(qim0Var, 10.0f) : qim0Var), false, new hii0(function0, (byte) 4)), er31.a, new bw61(b, ((u7h) tob1VarA.getValue()).a, c, 0L, 0.0f, 56, 0)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1044479);
            if (z) {
                boolean zG = b0kVar2.g(moj0Var);
                Object objT2 = b0kVar2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new cnp0(moj0Var, (byte) 16);
                    b0kVar2.s0(objT2);
                }
                qim0VarD = qim0VarD.then(exd0.q(qim0Var, (iu30) objT2));
            }
            b0kVar2.r(false);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarD);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            z3 = z7;
            b0kVar2 = b0kVar2;
            eth.a(Boolean.valueOf(z), (qim0) null, irn1.o0(600, 0, ceoVar, 2), "MetalCrossfade", apo.r(1211939557, new a1q0(str, i, z7, f, gdxVar, ven0VarS, e0q0Var, j82Var), b0kVar2), b0kVar2, ((i7 >> 12) & 14) | 27648, 2);
            h2c h2cVar = h2c.a;
            if (z5) {
                b0kVar2.i0(-1790820106);
                b0kVar2.i0(-1581786272);
                qim0 qim0VarA = h2cVar.a(qim0Var, een.Y);
                if (u890.j(j82Var, l0q0.d)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    qim0VarA = qim0VarA.then(eqr0.C(qim0Var, 2.0f, 2.0f));
                }
                i5 = 0;
                b0kVar2.r(false);
                b(qim0VarA, b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                i5 = 0;
                b0kVar2.i0(-1790535650);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            t1c.a(bin.x(h2cVar.b(qim0Var), false, str, new pm31(i5), (idn0) null, (Function0) ven0VarS.getValue(), 9), b0kVar2, i5);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b1q0(e0q0Var, function0, str, f, z, i, gdxVar, j82Var, z3, function1, i2, i3);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1085834727);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.g(8, apo.r(-822514796, new one0(qim0Var), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 16);
        }
    }

    public static final void c(hux huxVar, float f, b0k b0kVar, int i) {
        hux huxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2120194996);
        int i2 = (x340Var.i(huxVar) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            huxVar2 = huxVar;
            w0h1.a(huxVar2, isl.a, u291.r(nim0.a, f), 0L, 0L, true, x340Var, 196664 | (i2 & 14), 24);
        } else {
            huxVar2 = huxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rz2(huxVar2, f, i, (byte) 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(e0q0 e0q0Var, Function0 function0, String str, Function0 function1, j82 j82Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-15616321);
        int i2 = i | (x340Var.g(e0q0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(j82Var) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            String str2 = str == null ? "" : str;
            if (e0q0Var instanceof a0q0) {
                x340Var.i0(1687040703);
                strN0 = cwl1.n0(2131959377, new Object[]{str2}, x340Var);
                x340Var.r(false);
            } else if (e0q0Var instanceof b0q0) {
                x340Var.i0(1687044641);
                strN0 = cwl1.n0(2131959375, new Object[]{str2}, x340Var);
                x340Var.r(false);
            } else if (e0q0Var instanceof c0q0) {
                x340Var.i0(1687048608);
                strN0 = cwl1.n0(2131959376, new Object[]{str2}, x340Var);
                x340Var.r(false);
            } else {
                if (!(e0q0Var instanceof d0q0)) {
                    throw p3d1.k(x340Var, 1687038813, false);
                }
                x340Var.i0(1687052511);
                strN0 = cwl1.n0(2131959377, new Object[]{str2}, x340Var);
                x340Var.r(false);
            }
            float f = e0q0Var.a() ? 0.3f : 1.0f;
            if (j82Var.equals(l0q0.d)) {
                x340Var.i0(-2122368740);
                a(e0q0Var, function0, strN0, f, z, 4, yla.r(x340Var), j82Var, false, function1, x340Var, i3 | 196608 | (i2 & 112) | (i4 & 57344) | ((i2 << 9) & 29360128) | ((i2 << 18) & 1879048192), 256);
                x340Var.r(false);
            } else {
                String str3 = strN0;
                float f2 = f;
                if (j82Var.equals(j0q0.d)) {
                    x340Var.i0(-2122355234);
                    a(e0q0Var, function0, str3, f2, z, 4, yla.p(x340Var), j82Var, false, function1, x340Var, i3 | 100859904 | (i2 & 112) | (i4 & 57344) | ((i2 << 9) & 29360128) | ((i2 << 18) & 1879048192), 0);
                    x340Var.r(false);
                } else if (j82Var.equals(k0q0.d)) {
                    x340Var.i0(-2122340768);
                    a(e0q0Var, function0, str3, f2, z, 8, yla.r(x340Var), j82Var, false, function1, x340Var, i3 | 100859904 | (i2 & 112) | (i4 & 57344) | ((i2 << 9) & 29360128) | ((i2 << 18) & 1879048192), 0);
                    x340Var.r(false);
                } else {
                    if (!j82Var.equals(m0q0.d)) {
                        throw p3d1.k(x340Var, -2122369012, false);
                    }
                    x340Var.i0(-2122326639);
                    e(e0q0Var, function0, str3, f2, yla.s(x340Var), function1, x340Var, i3 | 24576 | (i2 & 112) | ((i2 << 9) & 3670016));
                    x340Var.r(false);
                }
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(e0q0Var, function0, str, function1, j82Var, z, i, (byte) 17);
        }
    }

    public static final void e(e0q0 e0q0Var, Function0 function0, String str, float f, gdx gdxVar, Function0 function1, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1811591610);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(e0q0Var) : b0kVar3.i(e0q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.e(l1d.C(8)) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(gdxVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(function1) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            boolean z = e0q0Var instanceof a0q0;
            ss50 ss50Var = (ss50) b0kVar3.k(t4k.l);
            boolean zI = ((i2 & 3670016) == 1048576) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && b0kVar3.i(e0q0Var))) | b0kVar3.i(ss50Var) | b0kVar3.h(z);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new zg6(e0q0Var, ss50Var, z, function1);
                b0kVar3.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            qim0 qim0VarB = s161.b(anm1.N("omni_play_button_row", d9y0.k(nim0.a, f)), false, new hii0(function0, (byte) 4));
            if (ihc1.y0(str)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                wro1.h(new gbx(new y50(str), function2), new idx(8), qim0VarB, (max) null, gdxVar, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1686966609, new nso0(e0q0Var, (byte) 13), b0kVar3), b0kVar2, i2 & 458752, 6, 984);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h2u(e0q0Var, function0, str, f, gdxVar, function1, i);
        }
    }

    public static final void f(DrawScope drawScope, moj0 moj0Var) {
        float fMin = Math.min(drawScope.X0(moj0Var.f) / 2.0f, drawScope.X0(moj0Var.c));
        float fX0 = drawScope.X0(0.75f);
        DrawScope.b0(drawScope, z4p1.g(4279374354L), fMin, drawScope.g1(), 0.0f, (DrawStyle) null, 120);
        float f = fMin + (fX0 / 2.0f);
        DrawScope.b0(drawScope, z4p1.g(4280427042L), f, drawScope.g1(), 0.0f, new phc1(fX0, 0.0f, 0, 0, (uw4) null, 30), 104);
        DrawScope.o(drawScope, loj0.a, f, drawScope.g1(), 0.6f, new phc1(fX0, 0.0f, 0, 0, (uw4) null, 30), 96);
    }

    public static final void g(DrawScope drawScope, moj0 moj0Var) throws Throwable {
        long j;
        float fX0 = drawScope.X0(moj0Var.a);
        float fX1 = drawScope.X0(moj0Var.b);
        float fX2 = drawScope.X0(0.5f);
        float fX3 = drawScope.X0(moj0Var.h);
        DrawScope.o(drawScope, loj0.f, (fX1 / 2.0f) + fX0, drawScope.g1(), 0.0f, new phc1(fX1, 0.0f, 0, 0, (uw4) null, 30), 104);
        long jG1 = drawScope.g1();
        cab cabVarA1 = drawScope.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).s(60.0f, jG1);
            try {
                try {
                    j = jU;
                    try {
                        DrawScope.o(drawScope, loj0.g, (fX1 + fX0) - (fX2 / 2.0f), drawScope.g1(), 0.0f, new phc1(fX2, 0.0f, 0, 0, (uw4) null, 30), 104);
                        cabVarA1.p().i();
                        cabVarA1.D(j);
                        long jG2 = drawScope.g1();
                        cab cabVarA2 = drawScope.a1();
                        long jU2 = cabVarA2.u();
                        cabVarA2.p().q();
                        try {
                            ((dg8) cabVarA2.b).s(45.0f, jG2);
                            DrawScope.o(drawScope, loj0.h, (fX3 / 2.0f) + fX0, drawScope.g1(), 0.0f, new phc1(fX3, 0.0f, 0, 0, (uw4) null, 30), 104);
                        } finally {
                            i3a.n(cabVarA2, jU2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        i3a.n(cabVarA1, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jU;
                }
            } catch (Throwable th3) {
                th = th3;
                j = jU;
            }
        } catch (Throwable th4) {
            th = th4;
            j = jU;
        }
    }

    public static final void h(DrawScope drawScope, moj0 moj0Var) {
        float f = hrt.f(drawScope, 2.0f);
        DrawScope.o(drawScope, loj0.b, f, drawScope.g1(), 0.0f, (phc1) null, 120);
        DrawScope.o(drawScope, loj0.c, f, drawScope.g1(), 0.2f, (phc1) null, 112);
        DrawScope.o(drawScope, loj0.d, f, drawScope.g1(), 0.05f, (phc1) null, 112);
        float fX0 = drawScope.X0(moj0Var.g);
        float fE = Size.e(drawScope.j());
        cab cabVarA1 = drawScope.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).t(fE, fE, 0L);
            DrawScope.o(drawScope, loj0.e, (f - (fX0 / 2.0f)) / fE, (Float.floatToRawIntBits(0.5f) << 32) | (4294967295L & Float.floatToRawIntBits(0.5f)), 0.0f, new phc1(fX0 / fE, 0.0f, 0, 0, (uw4) null, 30), 104);
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }

    public static final hux i(e0q0 e0q0Var, j82 j82Var) {
        if (e0q0Var instanceof a0q0) {
            return null;
        }
        if (e0q0Var instanceof c0q0) {
            return spx.c;
        }
        if (e0q0Var instanceof d0q0) {
            return xpx.c;
        }
        if (!(e0q0Var instanceof b0q0)) {
            eg.o();
            return null;
        }
        if (u890.j(j82Var, l0q0.d) || u890.j(j82Var, j0q0.d) || u890.j(j82Var, k0q0.d)) {
            return xpx.c;
        }
        if (u890.j(j82Var, m0q0.d)) {
            return pox.c;
        }
        eg.o();
        return null;
    }
}
