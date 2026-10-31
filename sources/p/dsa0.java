package p;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dsa0 implements lsa0 {
    public static b180 a;
    public static b180 b;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1404484838);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            as80 as80Var = mif1.P0;
            Uri uri = Uri.EMPTY;
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0Var, cbx.a(x340Var).a.d, d4o1.a);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(4.0f));
            cbx.a.getClass();
            eso1.e(uri, isl.a, cwl1.l0(anm1.N("media", hno1.f(qim0VarQ, uwr.a())), 0L, (hw61) null, 15), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 48, 0, 3512);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 3);
        }
    }

    public static final void b(final qim0 qim0Var, final long j, final float f, b0k b0kVar, final int i) {
        int i2;
        float fH;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1249392198);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            if (p3v.c(f, 0.0f)) {
                x340Var.i0(-455979798);
                fH = 1.0f / ((wat) x340Var.k(t4k.h)).h();
                x340Var.r(false);
            } else {
                x340Var.i0(-455913241);
                x340Var.r(false);
                fH = f;
            }
            t1c.a(dug.f(u291.h(u291.f(qim0Var.then(nim0.a), 1.0f), fH), j, d4o1.a), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.kmu
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dsa0.b(qim0Var, j, f, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(vhx0 vhx0Var, zob1 zob1Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        vu30 vu30Var2;
        llj lljVar;
        qim0 qim0Var3;
        boolean z;
        Function0 function0;
        vu30 vu30Var3;
        boolean z2;
        float f;
        Function0 function1;
        llj lljVar2;
        vu30 vu30Var4;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1801998152);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(vhx0Var) ? 4 : 2) | (x340Var2.i(zob1Var) ? 32 : 16) | 384;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarH = rwq.h(zob1Var, x340Var2, (i2 >> 3) & 14);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            Function0 function2 = hmb0.t1;
            if (z3) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            llj lljVar3 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar3);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM, x340Var2, vu30Var5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar4);
            nko1.F(x340Var2);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var6);
            if (((Boolean) ven0VarH.getValue()).booleanValue()) {
                x340Var2.i0(294142213);
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function2);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar3);
                nko1.H(xos0VarM2, x340Var2, vu30Var5);
                x0d.q(iHashCode2, x340Var2, lljVar4, x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var6);
                String str = vhx0Var.a;
                lee1 lee1Var = cbx.d(x340Var2).h;
                long j = ((vex) zex.a.e).n;
                cjc0 cjc0Var = new cjc0(2);
                qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                function0 = function2;
                vu30Var2 = vu30Var6;
                lljVar = lljVar4;
                f = 1.0f;
                qim0Var3 = qim0Var4;
                vu30Var3 = vu30Var5;
                uwo1.e(str, uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, j, null, null, 0, false, cjc0Var, 0, null, x340Var2, 0, 0, 1776);
                uwo1.e(vhx0Var.b, u291.f(qim0Var3, 1.0f), new lee1(0L, fc11.G(13), FontWeight.t, FontFamily.d, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777177), cbx.a(x340Var2).b.b, new a0e1(4), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                x340Var = x340Var2;
                z2 = true;
                x340Var.r(true);
                z = false;
                x340Var.r(false);
            } else {
                vu30Var2 = vu30Var6;
                lljVar = lljVar4;
                qim0Var3 = qim0Var4;
                z = false;
                function0 = function2;
                vu30Var3 = vu30Var5;
                z2 = true;
                x340Var = x340Var2;
                f = 1.0f;
                x340Var.i0(295202196);
                x340Var.r(false);
            }
            if (vu30Var == null) {
                x340Var.i0(295247363);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var).b;
                x0d.s(qim0Var3, 16.0f, x340Var, z);
                lljVar2 = lljVar;
                vu30Var4 = vu30Var2;
                function1 = function0;
            } else {
                x340Var.i0(295335682);
                qim0 qim0VarF3 = u291.f(qim0Var3, f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar6 = cbx.b(x340Var).b;
                qim0 qim0VarJ = u291.j(16.0f, 0.0f, 2, qim0VarF3);
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarJ);
                x340Var.m0();
                if (x340Var.S) {
                    function1 = function0;
                    x340Var.l(function1);
                } else {
                    function1 = function0;
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, vu30Var3);
                lljVar2 = lljVar;
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                vu30Var4 = vu30Var2;
                nko1.H(qim0VarE3, x340Var, vu30Var4);
                us71.k(6, vu30Var, x340Var, z2, false);
            }
            qim0 qim0VarD2 = u291.d(qim0Var3, f);
            cvx cvxVar7 = cbx.b(x340Var).b;
            cvx cvxVar8 = cbx.b(x340Var).b;
            cvx cvxVar9 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarD2, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            cvx cvxVar10 = cbx.b(x340Var).b;
            mbh mbhVarA3 = jbh.a(new d36(8.0f, z2, new um5(false)), eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar3);
            nko1.H(xos0VarM4, x340Var, vu30Var3);
            x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE4, x340Var, vu30Var4);
            x340Var.i0(2125907192);
            for (int i3 = 0; i3 < 5; i3++) {
                d(0, x340Var, null, ((Boolean) ven0VarH.getValue()).booleanValue());
            }
            us71.m(x340Var, false, z2, z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, vhx0Var, zob1Var, qim0Var2, vu30Var, (byte) 21);
        }
    }

    public static final void d(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1325844269);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.h(z) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("row", u291.z(qim0Var2, (fra) null, 3));
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            qim0 qim0VarF = u291.f(u291.z(qim0Var2, (fra) null, 3), 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (1.5f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarC = u291.c(new wnb0(1.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.5f, true), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            a(uyn1.B(qim0VarC, 0.0f, 0.0f, 8.0f, 0.0f, 11), x340Var, 0);
            if (8.5f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarZ = u291.z(new wnb0(8.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 8.5f, true), (fra) null, 3);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var).b;
            g(0.6f, 16.0f, null, x340Var, 6);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = ywx0.k(qim0Var2, 4.0f, x340Var, x340Var).b;
            g(0.5f, 12.0f, null, x340Var, 6);
            x340Var.r(true);
            x340Var.r(true);
            if (z) {
                x340Var.i0(76704163);
                f(x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(76742603);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var2, i, (byte) 16);
        }
    }

    public static final void e(u7h u7hVar, x8a1 x8a1Var, lik1 lik1Var, hw2 hw2Var, w6a1 w6a1Var, cm0 cm0Var, rea1 rea1Var, String str, boolean z, boolean z2, ngs0 ngs0Var, na9 na9Var, b0k b0kVar, int i) {
        int i2;
        x8a1 x8a1Var2;
        hw2 hw2Var2;
        w6a1 w6a1Var2;
        rea1 rea1Var2;
        String str2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1093383263);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(u7hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            x8a1Var2 = x8a1Var;
            i2 |= b0kVar3.g(x8a1Var2) ? 32 : 16;
        } else {
            x8a1Var2 = x8a1Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(lik1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            hw2Var2 = hw2Var;
            i2 |= b0kVar3.i(hw2Var2) ? 2048 : 1024;
        } else {
            hw2Var2 = hw2Var;
        }
        if ((i & 24576) == 0) {
            w6a1Var2 = w6a1Var;
            i2 |= b0kVar3.i(w6a1Var2) ? 16384 : 8192;
        } else {
            w6a1Var2 = w6a1Var;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? b0kVar3.g(cm0Var) : b0kVar3.i(cm0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            rea1Var2 = rea1Var;
            i2 |= b0kVar3.i(rea1Var2) ? 1048576 : 524288;
        } else {
            rea1Var2 = rea1Var;
        }
        if ((i & 12582912) == 0) {
            str2 = str;
            i2 |= b0kVar3.g(str2) ? 8388608 : 4194304;
        } else {
            str2 = str;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.h(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.h(z2) ? 536870912 : 268435456;
        }
        int i3 = i2;
        int i4 = (b0kVar3.i(ngs0Var) ? 4 : 2) | 72 | (b0kVar3.i(na9Var) ? 32 : 16);
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            int i5 = i3 >> 24;
            int i6 = i4 << 9;
            b0kVar2 = b0kVar3;
            h(z, z2, rea1Var2, ngs0Var, na9Var, str, null, apo.r(-1069666639, new pih(u7hVar, hw2Var2, str2, lik1Var, x8a1Var2, cm0Var, w6a1Var2, (byte) 7), b0kVar3), b0kVar2, (i5 & 112) | (i5 & 14) | 12582912 | ((i3 >> 12) & 896) | 4096 | (i6 & 7168) | 32768 | (i6 & 57344) | (458752 & (i3 >> 6)));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b9a1(u7hVar, x8a1Var, lik1Var, hw2Var, w6a1Var, cm0Var, rea1Var, str, z, z2, ngs0Var, na9Var, i);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1606668726);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("recsplanation", nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = ywx0.k(nim0Var, 12.0f, x340Var, x340Var).b;
            g(1.0f, 12.0f, null, x340Var, 6);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = ywx0.k(nim0Var, 4.0f, x340Var, x340Var).b;
            g(0.85f, 12.0f, null, x340Var, 6);
            cvx cvxVar5 = cbx.b(x340Var).b;
            cvx cvxVar6 = ywx0.k(nim0Var, 4.0f, x340Var, x340Var).b;
            g(0.9f, 12.0f, null, x340Var, 6);
            cvx cvxVar7 = cbx.b(x340Var).b;
            cvx cvxVar8 = ywx0.k(nim0Var, 4.0f, x340Var, x340Var).b;
            g(0.75f, 12.0f, null, x340Var, 6);
            cvx cvxVar9 = cbx.b(x340Var).b;
            x0d.s(nim0Var, 12.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 10);
        }
    }

    public static final void g(float f, float f2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(997216045);
        int i2 = (x340Var.d(f2) ? 32 : 16) | i | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var, f), f2);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.d;
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarH, j, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k82(f, f2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void h(boolean z, boolean z2, rea1 rea1Var, ngs0 ngs0Var, na9 na9Var, String str, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(27711906);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(rea1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? b0kVar3.g(ngs0Var) : b0kVar3.i(ngs0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(na9Var) : b0kVar3.i(na9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.g(str) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= b0kVar3.i(j2iVar) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (b0kVar3.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                xh71 xh71Var = ((ab71) ((lbq) ((frq) ((jly0) rea1Var.a.c).get()).a.b).b).a;
                c8o.l(xh71Var);
                ngs0 ngs0Var2 = new ngs0(xh71Var);
                b0kVar3.s0(ngs0Var2);
                objT = ngs0Var2;
            }
            b0kVar2 = b0kVar3;
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, apo.r(335268239, new c9a1(z, z2, ngs0Var, str, (maa) objT, na9Var), b0kVar3), null, null, apo.r(2065323017, new rv71(j2iVar, (byte) 28), b0kVar3), b0kVar2, ((i4 >> 18) & 14) | 24624, 12);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rf6(z, z2, rea1Var, ngs0Var, na9Var, str, qim0Var2, j2iVar, i);
        }
    }

    public static final void i(String str, boolean z, lik1 lik1Var, mml1 mml1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        lik1 lik1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-505913367);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            lik1Var2 = lik1Var;
            i2 |= x340Var.g(lik1Var2) ? 256 : 128;
        } else {
            lik1Var2 = lik1Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(mml1Var) : x340Var.i(mml1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            irn1.u(null, apo.r(-1481855332, new gml1(mml1Var, iu30Var), x340Var), null, null, apo.r(1440683362, new kj21(z2, str, mml1Var, lik1Var2, iu30Var), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(str, z, lik1Var, mml1Var, iu30Var, i, (byte) 17);
        }
    }

    public static final void j(mml1 mml1Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1046514327);
        int i2 = (x340Var.g(mml1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            j2i j2iVar = esj.b;
            j2i j2iVarR = apo.r(352360281, new sgi1(mml1Var, iu30Var, (byte) 14), x340Var);
            long j = u7h.j;
            ti5.a(j2iVar, (qim0) null, (vu30) null, j2iVarR, 0.0f, (erl1) null, kkn.C(j, j, 0L, 0L, u7h.f, x340Var, 44), x340Var, 3078, 182);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gml1(mml1Var, iu30Var, i);
        }
    }

    public static final void k(u7h u7hVar, d0r d0rVar, hvp0 hvp0Var, lik1 lik1Var, zob1 zob1Var, xyf1 xyf1Var, wks wksVar, iac0 iac0Var, kkw0 kkw0Var, hw2 hw2Var, w6a1 w6a1Var, cm0 cm0Var, rea1 rea1Var, njm njmVar, String str, boolean z, boolean z2, ngs0 ngs0Var, na9 na9Var, b9u0 b9u0Var, r6h1 r6h1Var, b0k b0kVar, int i) {
        gr81 gr81Var = gr81.R0;
        gr81 gr81Var2 = gr81.Q0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1907302923);
        int i2 = i | (x340Var.g(u7hVar) ? 4 : 2) | (x340Var.i(d0rVar) ? 32 : 16) | (x340Var.i(hvp0Var) ? 256 : 128) | (x340Var.g(lik1Var) ? 2048 : 1024) | (x340Var.i(zob1Var) ? 16384 : 8192) | (x340Var.g(xyf1Var) ? 131072 : 65536) | (x340Var.i(wksVar) ? 1048576 : 524288) | (x340Var.i(iac0Var) ? 8388608 : 4194304) | (x340Var.i(hw2Var) ? 536870912 : 268435456);
        int i3 = 150995008 | (x340Var.i(w6a1Var) ? 4 : 2) | (x340Var.i(cm0Var) ? 32 : 16) | (x340Var.i(rea1Var) ? 256 : 128) | (x340Var.i(njmVar) ? 2048 : 1024) | (x340Var.g(str) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536) | (x340Var.h(z2) ? 1048576 : 524288) | (x340Var.i(ngs0Var) ? 8388608 : 4194304) | (x340Var.i(na9Var) ? 67108864 : 33554432) | (x340Var.g(b9u0Var) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 306783379) == 306783378 && ((((x340Var.i(r6h1Var) ? (char) 4 : (char) 2) | (x340Var.i(gr81Var) ? ' ' : (char) 16)) | (x340Var.i(gr81Var2) ? 256 : 128)) & 147) == 146) ? false : true)) {
            int i4 = i3 >> 15;
            int i5 = i3 >> 12;
            h(z, z2, rea1Var, ngs0Var, na9Var, str, null, apo.r(-2109410333, new a260(u7hVar, hw2Var, str, lik1Var, hvp0Var, xyf1Var, d0rVar, iac0Var, kkw0Var, njmVar, r6h1Var, wksVar, zob1Var, w6a1Var, cm0Var, b9u0Var), x340Var), x340Var, (i4 & 112) | (i4 & 14) | 12582912 | (i3 & 896) | 4096 | (i5 & 7168) | 32768 | (i5 & 57344) | ((i3 << 3) & 458752));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9a1(u7hVar, d0rVar, hvp0Var, lik1Var, zob1Var, xyf1Var, wksVar, iac0Var, kkw0Var, hw2Var, w6a1Var, cm0Var, rea1Var, njmVar, str, z, z2, ngs0Var, na9Var, b9u0Var, r6h1Var, i);
        }
    }

    public static final Set l(vuk vukVar) {
        return f46.S0(new Object[]{vukVar.j(), vukVar.k(), vukVar.f()});
    }

    public static final float m(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        return ((Resources) x340Var.k(AndroidCompositionLocals_androidKt.c)).getDimension(i) / ((wat) x340Var.k(t4k.h)).h();
    }

    public static final boolean n(String str, String str2) {
        return u890.j(str, str2);
    }

    public static final int o(boolean z, boolean z2) {
        if (z2) {
            return 2;
        }
        return z ? 1 : 3;
    }

    public static int p(String str) {
        return str.hashCode();
    }

    public static final boolean q(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final int r(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 2;
        }
        if (iC == 1) {
            return 4;
        }
        if (iC == 2) {
            return 1;
        }
        if (iC == 3) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public static final lee1 s(chf0 chf0Var, lee1 lee1Var, b0k b0kVar) {
        x340 x340Var;
        lee1 lee1VarA;
        zma1 zma1Var = lee1Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-998849097);
        if (Build.VERSION.SDK_INT < 29) {
            x340Var2.r(false);
            return lee1Var;
        }
        uwr uwrVar = cbx.a;
        yfu yfuVar = ajx.a;
        boolean zE = x340Var2.e(chf0Var.ordinal()) | x340Var2.g(lee1Var) | x340Var2.g(yfuVar);
        Object objT = x340Var2.T();
        if (zE || objT == fkj0.X) {
            int iOrdinal = chf0Var.ordinal();
            if (iOrdinal == 0) {
                x340Var = x340Var2;
                lee1VarA = lee1Var;
            } else if (iOrdinal == 1) {
                Object obj = yfuVar.b;
                i930 i930VarV = v(150.0f, ((FontWeight) ((bjx) yfuVar.c).b).a, FontWeight.t);
                long j = zma1Var.b;
                fc11.o(j);
                long jY = fc11.Y(TextUnit.c(j) * (-0.02f), j & 1095216660480L);
                x340Var = x340Var2;
                lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, i930VarV, (String) null, jY, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777055);
            } else if (iOrdinal == 2) {
                x340Var = x340Var2;
                Object obj2 = yfuVar.b;
                lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, v(50.0f, ((FontWeight) ((bjx) yfuVar.c).d).a, FontWeight.t), (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777183);
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                Object obj3 = yfuVar.b;
                i930 i930VarV2 = v(150.0f, ((FontWeight) ((bjx) yfuVar.c).e).a, FontWeight.t);
                long j2 = zma1Var.b;
                fc11.o(j2);
                long jY2 = fc11.Y(TextUnit.c(j2) * (-0.02f), 1095216660480L & j2);
                x340Var = x340Var2;
                lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, i930VarV2, (String) null, jY2, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777047);
            }
            x340Var.s0(lee1VarA);
            objT = lee1VarA;
        } else {
            x340Var = x340Var2;
        }
        lee1 lee1Var2 = (lee1) objT;
        x340Var.r(false);
        return lee1Var2;
    }

    public static final FontFamily t(chf0 chf0Var, boolean z, b0k b0kVar) {
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1849882175);
        if (Build.VERSION.SDK_INT < 29) {
            x340Var.r(false);
            return null;
        }
        uwr uwrVar = cbx.a;
        yfu yfuVar = ajx.a;
        boolean zE = x340Var.e(chf0Var.ordinal()) | x340Var.g(yfuVar);
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            int iOrdinal = chf0Var.ordinal();
            if (iOrdinal == 0) {
                Object obj = yfuVar.b;
                f = 96.0f;
            } else if (iOrdinal == 1) {
                Object obj2 = yfuVar.b;
                f = 150.0f;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                Object obj3 = yfuVar.b;
                f = 150.0f;
            } else {
                Object obj4 = yfuVar.b;
                f = 50.0f;
            }
            FontWeight fontWeight = z ? (FontWeight) ((bjx) yfuVar.c).b : (FontWeight) ((bjx) yfuVar.c).d;
            objT = v(f, fontWeight.a, fontWeight);
            x340Var.s0(objT);
        }
        FontFamily fontFamily = (FontFamily) objT;
        x340Var.r(false);
        return fontFamily;
    }

    public static final void u(vhc vhcVar, g24 g24Var) {
        boolean zG = mif1.g();
        if (zG) {
            try {
                vhc.b("ReschedulingWork");
            } finally {
                if (zG) {
                    Trace.endSection();
                }
            }
        }
        g24Var.invoke();
    }

    public static final i930 v(float f, int i, FontWeight fontWeight) {
        return hm5.d(new a930[]{o0c.a(12, fontWeight, new ja30(new ga30[]{u890.I(f), u890.H(i)}))});
    }

    public static lhg1 w(lhg1 lhg1Var, g4k0 g4k0Var) {
        ruq0 ruq0Var = lhg1Var.b;
        String str = g4k0Var.c;
        if (str == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String str2 = g4k0Var.d;
        if (str2 != null) {
            return lhg1.a(lhg1Var, (q6w0) null, ruq0.a(ruq0Var, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, str2, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524157), false, false, 13);
        }
        hhg1.n("Required value was null.");
        return null;
    }
}
