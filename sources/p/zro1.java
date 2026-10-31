package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zro1 {
    public static b180 a;

    public static final void a(String str, List list, String str2, String str3, String str4, long j, long j2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-167311245);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(list) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.g(str4) ? 16384 : 8192) | (x340Var.f(j) ? 131072 : 65536) | (x340Var.f(j2) ? 1048576 : 524288) | (x340Var.i(qim0Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            qim0 qim0VarR = d7e.r(1.0f, qim0Var, false);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarE = dug.e(i1p1.q(qim0VarR, er31.b(8.0f)), new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{new u7h(j), new u7h(j2)}), (List) null), null, 0.0f, 6);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarD, 16.0f);
            mbh mbhVarA = jbh.a(h36.g, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            f(str2, str3, str4, null, x340Var, (i2 >> 6) & 1022);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            m(str, list, u291.f(new wnb0(1.0f, true), 1.0f), x340Var, i2 & 126);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            e(null, x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a5(str, list, str2, str3, str4, j, j2, qim0Var, i);
        }
    }

    public static final void b(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1532417077);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strN0 = cwl1.n0(2131958475, new Object[]{str, cwl1.o0(x340Var, 2131958476)}, x340Var);
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str2, qim0Var3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new fki0(strN0, (byte) 0);
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, null, 0, null, x340Var, (i2 & 14) | 1572864, 0, 1968);
            ilx ilxVar = ilx.c;
            long j = cbx.a(x340Var).c.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ilxVar, isl.a, u291.r(qim0Var3, 16.0f), j, 0L, false, x340Var, ilx.d | 48, 48);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(kk0.j(8.0f, 2131958476, x340Var, x340Var, qim0Var3), null, cbx.d(x340Var).j, cbx.a(x340Var).c.c, null, null, 3, false, null, 0, null, x340Var, 1572864, 0, 1970);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 22);
        }
    }

    public static final void c(m3o m3oVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        String strO0;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(218775290);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(m3oVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("creator_row", u291.f(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            fra fraVar = een.N0;
            qim0 qim0VarN2 = anm1.N("creator_row_clickable", qim0Var3);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new sqm(iu30Var, m3oVar, (byte) 9);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarN2, false, null, null, null, (Function0) objT, 15);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            Uri uri = Uri.parse(m3oVar.c);
            qim0 qim0VarN3 = anm1.N("creator_image", i1p1.q(qim0Var3, er31.a));
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            zov0 zov0Var = cbx.b(x340Var2).g;
            vtx vtxVar = vtx.c;
            nux nuxVar = new nux(vtxVar, vtxVar);
            qim0Var2 = qim0Var3;
            eso1.e(uri, isl.a, qim0VarN3, new p3v(24.0f), (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var2, 1073741872, 0, 3536);
            op71.g(x340Var2, u291.v(qim0Var2, 8.0f));
            x340Var2.i0(677981434);
            ye5 ye5Var = new ye5();
            x340Var2.i0(677982155);
            int iO = ye5Var.o(new zma1(u7h.b(u7h.f, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                if (!m3oVar.e) {
                    x340Var2.i0(811930500);
                    strO0 = cwl1.o0(x340Var2, 2131954707);
                    x340Var2.r(false);
                } else if (m3oVar.a == 1) {
                    x340Var2.i0(811934981);
                    strO0 = cwl1.o0(x340Var2, 2131954708);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(811937191);
                    strO0 = cwl1.o0(x340Var2, 2131954709);
                    x340Var2.r(false);
                }
                ye5Var.g(strO0);
                ye5Var.k(iO);
                x340Var2.r(false);
                int iO2 = ye5Var.o(new zma1(cbx.a(x340Var2).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var2).k.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65502));
                try {
                    ye5Var.g(" " + m3oVar.b);
                    ye5Var.k(iO2);
                    af5 af5VarP = ye5Var.p();
                    x340Var2.r(false);
                    uwo1.f(af5VarP, anm1.N("creator_text", qim0Var2), cbx.d(x340Var2).j, null, null, null, 0, false, null, 0, null, null, x340Var2, 0, 0, 4088);
                    x340Var = x340Var2;
                    x340Var.r(true);
                    x340Var.r(true);
                } catch (Throwable th) {
                    ye5Var.k(iO2);
                    throw th;
                }
            } catch (Throwable th2) {
                ye5Var.k(iO);
                throw th2;
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((byte) 23, i, m3oVar, qim0Var2, iu30Var);
        }
    }

    public static final void d(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(196147664);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            foo1.c(new gbx(z50.c, function0), ldx.c, null, null, yla.p(x340Var), null, null, null, null, null, upj.a, x340Var, 0, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 29, i, function0, false);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1367060968);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
            qim0 qim0VarV = u291.v(qim0Var3, 59.0f);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarH = u291.h(qim0VarV, 16.0f);
            long j = u7h.f;
            zpn1.f(qim0VarH, j, x340Var, 0, 0);
            uwo1.e(cwl1.o0(x340Var, 2131958334), null, cbx.d(x340Var).m, u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final void f(String str, String str2, String str3, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str4;
        String str5;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2;
        ?? r0;
        ?? r2;
        vu30 vu30Var;
        vu30 vu30Var2;
        llj lljVar;
        Function0 function0;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-195062169);
        j06 j06Var = x340Var3.a;
        if ((i & 6) == 0) {
            i2 = (x340Var3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= x340Var3.g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= x340Var3.g(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        int i3 = i2 | 3072;
        if (x340Var3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z = x340Var3.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var3.l(function1);
            } else {
                x340Var3.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var3, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var3, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, vu30Var4);
            if (str5.length() > 0) {
                x340Var3.i0(1199547581);
                Uri uri = Uri.parse(str3);
                zov0 zov0Var = cbx.b(x340Var3).g;
                cua cuaVar = cbx.b(x340Var3).f;
                vu30Var = vu30Var3;
                lljVar = lljVar3;
                vu30Var2 = vu30Var4;
                function0 = function1;
                qim0 qim0VarO = sto1.o(qim0Var3, 8.0f, er31.b(4.0f), false, 0L, 0L, 28);
                cua cuaVar2 = cbx.b(x340Var3).f;
                r0 = 0;
                r2 = 1;
                eso1.e(uri, isl.a, i1p1.q(qim0VarO, er31.b(4.0f)), new p3v(32.0f), (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var3, 48, 6, 2992);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                r0 = 0;
                r2 = 1;
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                function0 = function1;
                x340Var2.i0(1200047487);
                x340Var2.r(false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, (boolean) r2);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, (int) r0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, wnb0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function0);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar2);
            nko1.H(xos0VarM2, x340Var2, vu30Var);
            x0d.q(iHashCode2, x340Var2, lljVar, x340Var2);
            nko1.H(qim0VarE2, x340Var2, vu30Var2);
            lee1 lee1Var = cbx.d(x340Var2).h;
            long j = u7h.f;
            x340 x340Var4 = x340Var2;
            uwo1.e(str, null, lee1Var, j, null, null, 2, false, new cjc0((int) r2), 0, null, x340Var4, i3 & 14, 0, 1714);
            x340Var = x340Var4;
            if (str4.length() > 0) {
                x340Var.i0(-2123225023);
                uwo1.e(str4, null, cbx.d(x340Var).j, u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0((int) r2), 0, null, x340Var, (i3 >> 3) & 14, 0, 1714);
                x340Var = x340Var;
                x340Var.r((boolean) r0);
            } else {
                x340Var.i0(-2122982603);
                x340Var.r((boolean) r0);
            }
            x340Var.r((boolean) r2);
            x340Var.r((boolean) r2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c5(str, str2, str3, qim0Var2, i, (byte) 0);
        }
    }

    public static final void g(String str, c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-185313906);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarZ, 16.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = fii0.Y;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            uwo1.e(str, anm1.N("member-details-allocation-row-title", qim0Var3), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, 1572912 | (i2 & 14), 0, 1696);
            x340Var.i0(78422854);
            int i3 = 0;
            for (Object obj : c380Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                b(0, (String) obj, f4i1.c(i3, "member-details-allocation-item-"), x340Var, null);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl(str, c380Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void h(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(444763750);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131963658);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var).b.c, 1, dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), ((yex) zex.a.d).b, d4o1.a));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarF2);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = kei1.c1;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarZ2, false, (iu30) objT), cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            zgo1.i(str, d7e.r(1.0f, uyn1.z(cbx.b(x340Var).b.c, 0.0f, 2, ab80.o(nim0Var, cbx.b(x340Var).b.c, x340Var, nim0Var, 1.0f)), false), 0L, 0L, izy0.c, strO0, dzy0.b, null, null, x340Var, (i2 & 14) | 1597440, 396);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0((byte) 21, i, str, false);
        }
    }

    public static final void i(int i, int i2, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i3) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1110729116);
        int i4 = i3 | (b0kVar2.e(i) ? 4 : 2) | (b0kVar2.e(i2) ? 32 : 16) | (b0kVar2.i(iu30Var) ? 256 : 128) | (b0kVar2.i(iu30Var2) ? 2048 : 1024) | (b0kVar2.i(function0) ? 16384 : 8192) | (b0kVar2.i(function1) ? 131072 : 65536) | 1572864;
        if (b0kVar2.Y(i4 & 1, (599187 & i4) != 599186)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            float f = cbx.b(b0kVar2).e.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            float f2 = cvxVar.e;
            float f3 = cvxVar.c;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, f2, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            lro1.c(cwl1.o0(b0kVar2, 2131955658), null, apo.r(-393507867, new oa5(function1, (byte) 19), b0kVar2), b0kVar2, 384, 2);
            int i5 = i4 << 6;
            b0kVar2 = b0kVar2;
            l(ydh.g(f3, 2131955655, b0kVar2, b0kVar2, qim0Var3), nox.c, i, 5, iu30Var, uyn1.z(f, 0.0f, 2, qim0Var3), b0kVar2, (i5 & 896) | (nox.d << 3) | 3072 | (i5 & 57344));
            String strG = ydh.g(f3, 2131955659, b0kVar2, b0kVar2, qim0Var3);
            mox moxVar = mox.c;
            int[] iArr = se01.a;
            int i6 = i4 << 3;
            l(strG, moxVar, i2, 4, iu30Var2, uyn1.z(f, 0.0f, 2, qim0Var3), b0kVar2, (mox.d << 3) | (i6 & 896) | (i6 & 57344));
            op71.g(b0kVar2, u291.h(qim0Var3, cvxVar.e));
            k((i4 >> 12) & 14, function0, b0kVar2, new tq60(een.Q0));
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bxy(i, i2, iu30Var, iu30Var2, function0, function1, qim0Var2, i3, (byte) 5);
        }
    }

    public static final void j(int i, int i2, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1998065418);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | (x340Var.i(function2) ? 1048576 : 524288);
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            x74.f(function2, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(451569013, new b2(i, i2, iu30Var, iu30Var2, function0, function1), x340Var), x340Var, ((i4 >> 18) & 14) | 12582912, 48, 1918);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bxy(i, i2, iu30Var, iu30Var2, function0, function1, function2, i3, (byte) 6);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        byte b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1179215404);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            cr31 cr31VarB = er31.b(16.0f);
            String strO0 = cwl1.o0(b0kVar3, 2131955656);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).k;
            cjc0 cjc0Var = new cjc0(1);
            qim0 qim0VarX = bin.x(d1u.E(1.0f, ((vex) zex.a.e).j, qim0Var, cr31VarB), false, null, null, null, function0, 15);
            float f = cbx.b(b0kVar3).b.c;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, f, 12.0f);
            b0kVar2 = b0kVar3;
            b = 18;
            uwo1.e(strO0, qim0VarY, lee1Var, 0L, null, null, 0, false, cjc0Var, 0, null, b0kVar2, 0, 0, 1784);
        } else {
            b0kVar2 = b0kVar3;
            b = 18;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, b);
        }
    }

    public static final void l(String str, hux huxVar, int i, int i2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i3) {
        String str2;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(499633983);
        j06 j06Var = x340Var.a;
        if ((i3 & 6) == 0) {
            str2 = str;
            i4 = (x340Var.g(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var.e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            uwo1.e(str2, null, cbx.d(x340Var).e, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var, i4 & 14, 0, 1786);
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            int i6 = i4;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var, 56 | ((i6 >> 3) & 14), 56);
            float f = i;
            jsg jsgVar = new jsg(0.0f, i2 - 1);
            int i7 = i2 - 2;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            boolean z2 = ((57344 & i6) == 16384) | ((i6 & 7168) == 2048);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                i5 = i2;
                objT = new xyp0(i5, iu30Var);
                x340Var.s0(objT);
            } else {
                i5 = i2;
            }
            luo1.e(f, (iu30) objT, wnb0Var, false, jsgVar, i7, null, 0L, 0L, null, 0L, 0L, 0L, x340Var, 0, 8136);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            i5 = i2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kih(str, huxVar, i, i5, iu30Var, qim0Var, i3);
        }
    }

    public static final void m(String str, List list, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1168565771);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            long j = u7h.f;
            long jB = u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).g;
            zma1 zma1Var = lee1Var.a;
            String strO0 = cwl1.o0(b0kVar3, 2131958335);
            zma1 zma1Var2 = cbx.d(b0kVar3).h.a;
            ye5 ye5VarO = kk0.o(2005254676, b0kVar3);
            int iO = ye5VarO.o(new zma1(j, zma1Var2.b, zma1Var2.c, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65528));
            try {
                ye5VarO.g(strO0);
                ye5VarO.k(iO);
                long j2 = jB;
                int iO2 = ye5VarO.o(new zma1(j2, zma1Var.b, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65532));
                try {
                    ye5VarO.g(" • ");
                    ye5VarO.k(iO2);
                    FontWeight fontWeight = zma1Var.c;
                    FontWeight fontWeight2 = zma1Var2.c;
                    boolean z2 = false;
                    String strSubstring = str;
                    while (strSubstring.length() > 0 && !z2) {
                        int iW0 = ihc1.w0(strSubstring, "**", 0, false, 6);
                        if (iW0 == -1) {
                            FontWeight fontWeight3 = fontWeight;
                            int iO3 = ye5VarO.o(new zma1(j2, 0L, fontWeight3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
                            try {
                                ye5VarO.g(strSubstring);
                                ye5VarO.k(iO3);
                                fontWeight = fontWeight3;
                            } catch (Throwable th) {
                                ye5VarO.k(iO3);
                                throw th;
                            }
                        } else {
                            FontWeight fontWeight4 = fontWeight;
                            if (iW0 > 0) {
                                int iO4 = ye5VarO.o(new zma1(j2, 0L, fontWeight4, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
                                try {
                                    ye5VarO.g(strSubstring.substring(0, iW0));
                                    ye5VarO.k(iO4);
                                } catch (Throwable th2) {
                                    ye5VarO.k(iO4);
                                    throw th2;
                                }
                            }
                            String strSubstring2 = strSubstring.substring(iW0 + 2);
                            int iW1 = ihc1.w0(strSubstring2, "**", 0, false, 6);
                            if (iW1 == -1) {
                                long j3 = j2;
                                int iO5 = ye5VarO.o(new zma1(j2, 0L, fontWeight4, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
                                try {
                                    ye5VarO.g(strSubstring.substring(iW0));
                                    ye5VarO.k(iO5);
                                    j2 = j3;
                                    fontWeight = fontWeight4;
                                } catch (Throwable th3) {
                                    ye5VarO.k(iO5);
                                    throw th3;
                                }
                            } else {
                                long j4 = j2;
                                int iO6 = ye5VarO.o(new zma1(j, 0L, fontWeight2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
                                try {
                                    ye5VarO.g(strSubstring2.substring(0, iW1));
                                    ye5VarO.k(iO6);
                                    strSubstring = strSubstring2.substring(iW1 + 2);
                                    j2 = j4;
                                    fontWeight = fontWeight4;
                                } catch (Throwable th4) {
                                    ye5VarO.k(iO6);
                                    throw th4;
                                }
                            }
                        }
                        z2 = true;
                    }
                    long j5 = j2;
                    if (list.isEmpty()) {
                        b0kVar3.i0(-905990922);
                        z = false;
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(-906195615);
                        uwr uwrVar2 = cbx.a;
                        int iO7 = ye5VarO.o(new zma1(j5, cbx.d(b0kVar3).m.a.b, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65532));
                        try {
                            ye5VarO.g(" (" + o7h.y0(list, ", ", (String) null, (String) null, (iu30) null, 62) + ")");
                            ye5VarO.k(iO7);
                            z = false;
                            b0kVar3.r(false);
                        } catch (Throwable th5) {
                            ye5VarO.k(iO7);
                            throw th5;
                        }
                    }
                    af5 af5VarP = ye5VarO.p();
                    b0kVar3.r(z);
                    b0kVar2 = b0kVar3;
                    uwo1.f(af5VarP, qim0Var, lee1Var, null, null, null, 2, false, new cjc0(14), 0, null, null, b0kVar2, (i2 >> 3) & 112, 0, 3768);
                } catch (Throwable th6) {
                    ye5VarO.k(iO2);
                    throw th6;
                }
            } catch (Throwable th7) {
                ye5VarO.k(iO);
                throw th7;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d5(str, list, qim0Var, i, (byte) 0);
        }
    }

    public static final void n(dv51 dv51Var, iu30 iu30Var, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        gw70 gw70Var2;
        qim0 qim0Var2;
        String strK;
        m4c m4cVar = fkj0.X;
        w4i1 w4i1Var = dv51Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1748663006);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(dv51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gw70Var2 = gw70Var;
            i2 |= x340Var.i(gw70Var2) ? 256 : 128;
        } else {
            gw70Var2 = gw70Var;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            List listSingletonList = Collections.singletonList(w4i1Var);
            String str = w4i1Var.b;
            Integer numR = sto1.r(dv51Var.g);
            if (numR == null) {
                x340Var.i0(-760963136);
                x340Var.r(false);
                strK = null;
            } else {
                strK = kk0.k(x340Var, -760963135, numR, x340Var, false);
            }
            gpx gpxVar = gpx.c;
            String strO0 = cwl1.o0(x340Var, 2131961603);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new pwc1(iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            boolean z2 = false;
            rgi1 rgi1Var = new rgi1(listSingletonList, str, strK, new kgi1(p7h.M(new qgi1[]{new pgi1(strO0, gpxVar, (Function0) objT), new ogi1(apo.r(-787020778, new gsc1(dv51Var, (byte) 2), x340Var))})));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("suggested_user", qim0Var3);
            if (i4 == 32) {
                z2 = true;
            }
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new pwc1(iu30Var, (byte) 1);
                x340Var.s0(objT2);
            }
            ero1.f(rgi1Var, (Function0) objT2, gw70Var2, qim0VarN, x340Var, i3 & 896, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, dv51Var, iu30Var, gw70Var, qim0Var2, (byte) 3);
        }
    }

    public static final void o(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1363646432);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            float f = zjy.j(((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.8f, new p3v(800.0f)).a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = u291.x(0.0f, f, 1, qim0Var3);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, cbx.b(x340Var).b.c);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            h(str, x340Var, i2 & 14);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.c));
            d(function0, x340Var, (i2 >> 3) & 14);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 27);
        }
    }

    public static final String p(int i) {
        if (i != 1) {
            return i != 2 ? gvg.e(i, "UNKNOWN(", ")") : "AUDIOFOCUS_GAIN_TRANSIENT";
        }
        return "AUDIOFOCUS_GAIN";
    }

    public static final String q(int i) {
        if (i == 0) {
            return "AUDIOFOCUS_REQUEST_FAILED";
        }
        if (i != 1) {
            return i != 2 ? gvg.e(i, "UNKNOWN(", ")") : "AUDIOFOCUS_REQUEST_DELAYED";
        }
        return "AUDIOFOCUS_REQUEST_GRANTED";
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Serializable r(qns0 qns0Var, String str, Set set, onm onmVar) {
        nns0 nns0Var;
        LinkedHashMap linkedHashMap;
        String str2;
        qfd qfdVar;
        j3r h3rVar;
        LinkedHashMap linkedHashMap2 = b7x.a;
        if (onmVar instanceof nns0) {
            nns0Var = (nns0) onmVar;
            int i = nns0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nns0Var.c = i - Integer.MIN_VALUE;
            } else {
                nns0Var = new nns0(onmVar);
            }
        } else {
            nns0Var = new nns0(onmVar);
        }
        Object objA = nns0Var.b;
        d9n d9nVar = d9n.a;
        int i2 = nns0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                ArrayList arrayList = new ArrayList();
                for (Object obj : set) {
                    Set set2 = ens0.a;
                    Set set3 = s4b1.f;
                    blc0 blc0Var = uic.x((String) obj).c;
                    if (ens0.a.contains(blc0Var) || (ens0.b && blc0Var == blc0.fh)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    nns0Var.a = set;
                    nns0Var.c = 1;
                    objA = qns0Var.a(str, arrayList, nns0Var, true);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                }
                Set set4 = set;
                int iS = zno1.s(q7h.U(set4, 10));
                linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj2 : set4) {
                    str2 = (String) obj2;
                    qfdVar = (qfd) linkedHashMap2.get(str2);
                    if (qfdVar != null) {
                        h3rVar = new j3r(qfdVar);
                    } else {
                        h3rVar = new h3r(new b3r(str2));
                    }
                    linkedHashMap.put(obj2, h3rVar);
                }
                return linkedHashMap;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = nns0Var.a;
            hm5.M(objA);
            Iterable iterable = (Iterable) objA;
            int iS2 = zno1.s(q7h.U(iterable, 10));
            if (iS2 < 16) {
                iS2 = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2);
            for (Object obj3 : iterable) {
                linkedHashMap3.put(((qfd) obj3).a, obj3);
            }
            linkedHashMap2 = linkedHashMap3;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        Set set5 = set;
        int iS3 = zno1.s(q7h.U(set5, 10));
        linkedHashMap = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
        while (r11.hasNext()) {
            str2 = (String) obj2;
            qfdVar = (qfd) linkedHashMap2.get(str2);
            if (qfdVar != null) {
                h3rVar = new j3r(qfdVar);
            } else {
                h3rVar = new h3r(new b3r(str2));
            }
            linkedHashMap.put(obj2, h3rVar);
        }
        return linkedHashMap;
    }

    public static void s(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        zov0 zov0Var = cbx.b(b0kVar).g;
    }

    public static final qim0 t(qim0 qim0Var, xtb0 xtb0Var) {
        return exd0.s(i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new pq50(xtb0Var, (byte) 2));
    }

    public static final boolean u(c8c0 c8c0Var) {
        return c8c0Var == c8c0.d || c8c0Var == c8c0.a || c8c0Var == c8c0.b || c8c0Var == c8c0.c || c8c0Var == c8c0.e;
    }

    public static final boolean v(c8c0 c8c0Var) {
        return c8c0Var == c8c0.a || c8c0Var == c8c0.c || c8c0Var == c8c0.b || c8c0Var == c8c0.f;
    }

    public static final any w(j810 j810Var) {
        return new any(o4p1.r(f5p1.m(j810Var.b, rc11.a.b(h810.class)), j810Var.a), (byte) 15);
    }

    public static final String x(ir61 ir61Var, Context context) {
        String quantityString;
        if (ir61Var.equals(hr61.a)) {
            quantityString = context.getString(2131952669);
        } else {
            if (!(ir61Var instanceof gr61)) {
                eg.o();
                return null;
            }
            Resources resources = context.getResources();
            int i = ((gr61) ir61Var).a;
            quantityString = resources.getQuantityString(2131820586, i, Integer.valueOf(i));
        }
        quantityString.getClass();
        return quantityString;
    }

    public static final String y(ir61 ir61Var) {
        if (ir61Var.equals(hr61.a)) {
            return "no_limit";
        }
        if (ir61Var instanceof gr61) {
            return f4i1.c(((gr61) ir61Var).a, "most_recent_");
        }
        eg.o();
        return null;
    }
}
