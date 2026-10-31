package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class bof0 {
    public static final long a = fc11.D(0.625d);
    public static final zma1 b = new zma1(0, fc11.D(0.25d), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65533);
    public static final long c = fc11.G(72);
    public static final long d = fc11.G(18);

    public static final void a(String str, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        ue0 ue0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1939709527);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (str == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ue0Var = new ue0((byte) 11, i, str, false);
                }
            } else {
                Uri uri = Uri.parse(str);
                as80 as80Var = mif1.P0;
                qim0 qim0VarB = h2cVar.b(nim0.a);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = klf0.i;
                    x340Var.s0(objT);
                }
                eso1.e(uri, isl.a, exd0.s(qim0VarB, (iu30) objT), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 224304, 6, 2944);
            }
            h311VarV.d = ue0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ue0Var = new ue0((byte) 12, i, str, false);
            h311VarV.d = ue0Var;
        }
    }

    public static final void b(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2026479830);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Uri uri = Uri.parse(str);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            cua cuaVar = cbx.b(x340Var).f;
            eso1.e(uri, isl.a, i1p1.q(nim0.a, er31.b(6.0f)), new p3v(32.0f), (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 48, 6, 2992);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y5d0(str, i, (byte) 14);
        }
    }

    public static final void c(vef0 vef0Var, kw9 kw9Var, String str, qim0 qim0Var, String str2, xu30 xu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(416215136);
        int i2 = (x340Var.i(vef0Var) ? 4 : 2) | i | (x340Var.i(kw9Var) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            int i3 = i2 >> 3;
            d(kw9Var, h2cVar.b(nim0Var), str2, x340Var, (i3 & 14) | ((i2 >> 6) & 896));
            xu30Var.invoke(h2cVar, x340Var, 54);
            e(vef0Var, str, h2cVar.b(nim0Var), x340Var, (i2 & 14) | (i3 & 112));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(vef0Var, kw9Var, str, qim0Var, str2, xu30Var, i);
        }
    }

    public static final void d(kw9 kw9Var, qim0 qim0Var, String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1352196371);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kw9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarI = zr7.i(qim0Var, gce0.a1);
            List listM = p7h.M(new Integer[]{Integer.valueOf(kw9Var.a), Integer.valueOf(kw9Var.b)});
            ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                arrayList.add(new u7h(z4p1.e(((Number) it.next()).intValue())));
            }
            qim0 qim0VarE = dug.e(qim0VarI, new mic0(0, 0L, 9187343241974906880L, arrayList, (List) null), (hw61) null, 0.0f, 6);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            a(str, x340Var, ((i2 >> 3) & 112) | 6);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(kw9Var, str, qim0Var, i, (byte) 8);
        }
    }

    public static final void e(vef0 vef0Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1181858503);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vef0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarI = zr7.i(qim0Var, gce0.a1);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarI);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            b(vef0Var.a, x340Var, 0);
            int i4 = i2 & 14;
            g(vef0Var, str, x340Var, i2 & 126);
            x340Var.r(true);
            boolean zIsEmpty = vef0Var.Y.isEmpty();
            pbh pbhVar = pbh.a;
            if (zIsEmpty) {
                i3 = 0;
                x340Var.i0(-349182020);
                f(vef0Var, pbhVar.a(1.0f, nim0Var, true), x340Var, i4);
                x340Var.r(false);
            } else {
                x340Var.i0(-349335501);
                i(vef0Var, pbhVar.a(1.0f, nim0Var, true), x340Var, i4);
                i3 = 0;
                x340Var.r(false);
            }
            h(vef0Var.e, i3, x340Var, pbhVar.c(eraVar, nim0Var));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(vef0Var, str, qim0Var, i, (byte) 9);
        }
    }

    public static final void f(vef0 vef0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1343976215);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vef0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            p280 p280VarD = vef0Var.d.d();
            int i4 = vef0Var.e;
            chf0 chf0Var = vef0Var.t;
            boolean z = vef0Var.X;
            int iC = l1d.C(vef0Var.i);
            if (iC == 0) {
                i3 = 1;
            } else if (iC == 1) {
                i3 = 3;
            } else if (iC != 2) {
                eg.o();
                return;
            }
            boolean zG = x340Var.g(p280VarD) | x340Var.h(z);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                String strY0 = o7h.y0(p280VarD, "\n", (String) null, (String) null, (iu30) null, 62);
                objT = z ? strY0.toUpperCase(Locale.ROOT) : strY0;
                x340Var.s0(objT);
            }
            long jG = fc11.G(11);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("LyricsShareCard.Lyrics", uyn1.z(0.0f, cbx.b(x340Var).b.b, 1, qim0Var));
            long jE = z4p1.e(i4);
            lee1 lee1VarS = dsa0.s(chf0Var, cbx.d(x340Var).d, x340Var);
            int i5 = mhc0.c;
            long j = c;
            uwo1.e((String) objT, qim0VarN, lee1.a(lee1VarS, 0L, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i5, 14680061), jE, new a0e1(i3), (iu30) null, 2, false, (djc0) null, 0, new px8(jG, j, fc11.G(1), (mx8) null, 8), x340Var, 0, 8, 928);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new aof0(vef0Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void g(vef0 vef0Var, String str, b0k b0kVar, int i) {
        int i2;
        byte b2;
        x340 x340Var;
        String str2 = str;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1062973708);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.i(vef0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            String str3 = vef0Var.c;
            int i4 = vef0Var.e;
            uwo1.e(str3, qim0VarF2, cbx.d(x340Var2).n, z4p1.e(i4), new a0e1(1), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1696);
            str2 = str;
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).m, z4p1.e(i4), new a0e1(1), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, (i3 >> 3) & 14, 0, 1696);
            x340Var = x340Var2;
            b2 = 1;
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(vef0Var, str2, i, b2);
        }
    }

    public static final void h(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1693416560);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            nl70.c(byo1.s(cyo1.x(x340Var, 2131233947), x340Var), (String) null, u291.s(qim0Var, 58.0f, 18.0f), z4p1.e(i), x340Var, 56, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 19, i, i2, qim0Var);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0176 */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(p.vef0 r63, p.qim0 r64, p.b0k r65, int r66) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bof0.i(p.vef0, p.qim0, p.b0k, int):void");
    }
}
