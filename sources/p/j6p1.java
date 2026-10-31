package p;

import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class j6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(p10 p10Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        String str = p10Var.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1665114291);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(p10Var) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128);
        if (!x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else if (str.length() > 0) {
            x340Var2.i0(-1452220335);
            fra fraVar = een.N0;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var, cbx.a(x340Var2).a.a.a(), er31.b(8.0f)), 1.0f), 16.0f);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new y1(function0, (byte) 8);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX2 = bin.x(qim0VarX, false, null, null, null, (Function0) objT, 15);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 44.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarR);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            long j = cbx.a(x340Var2).b.f;
            long jG = z4p1.g(4281611316L);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = p4.a1;
                x340Var2.s0(objT2);
            }
            rhx0.b((Function0) objT2, qim0VarD, j, 3.0f, jG, 0, 0.0f, x340Var2, 6);
            w0h1.a(xxq0.d(p10Var.a), isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var2).b.f, 0L, false, x340Var2, 56, 48);
            x340Var2.r(true);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            uwo1.e(str, null, cbx.d(x340Var2).g, 0L, new a0e1(5), null, 0, false, null, 0, null, x340Var2, 0, 0, 2026);
            uwo1.e(p10Var.d, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
            x340Var = x340Var2;
            us71.m(x340Var, true, true, false);
        } else {
            x340Var = x340Var2;
            x340Var.i0(-1450711441);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) p10Var, (Object) qim0Var, (Object) function0, i, (byte) 15);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-43140547);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var, 4.0f);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarH = u291.h(qim0VarV, 64.0f);
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            op71.g(x340Var, dug.f(qim0VarH, jC, er31.b(4.0f)));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 4);
        }
    }

    public static final void c(gd80 gd80Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-105922353);
        int i2 = (x340Var.g(gd80Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            otw.c(gd80Var.a, gd80Var.b, (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jb50(gd80Var, i, (byte) 21);
        }
    }

    public static final void d(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(113022781);
        int i4 = i3 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.e(i2) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i4 & 1, (i4 & 147) != 146)) {
            String strN0 = cwl1.n0(2131959039, new Object[]{ihc1.F0(2, String.valueOf(i))}, b0kVar3);
            ye5 ye5VarO = kk0.o(1240719572, b0kVar3);
            uwr uwrVar = cbx.a;
            int iO = ye5VarO.o(new zma1(cbx.a(b0kVar3).b.a, 0L, cbx.d(b0kVar3).k.a.c, cbx.d(b0kVar3).e.a.d, (FontSynthesis) null, cbx.d(b0kVar3).e.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490));
            try {
                ye5VarO.g(strN0);
                ye5VarO.k(iO);
                int iO2 = ye5VarO.o(new zma1(((vex) zex.a.e).k, 0L, cbx.d(b0kVar3).k.a.c, cbx.d(b0kVar3).k.a.d, (FontSynthesis) null, cbx.d(b0kVar3).e.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490));
                try {
                    ye5VarO.g(" /" + ihc1.F0(2, String.valueOf(i2)));
                    ye5VarO.k(iO2);
                    af5 af5VarP = ye5VarO.p();
                    b0kVar3.r(false);
                    b0kVar2 = b0kVar3;
                    uwo1.f(af5VarP, uyn1.x(qim0Var, cbx.b(b0kVar3).e.b), cbx.d(b0kVar3).e, null, new a0e1(5), null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4072);
                } catch (Throwable th) {
                    ye5VarO.k(iO2);
                    throw th;
                }
            } catch (Throwable th2) {
                ye5VarO.k(iO);
                throw th2;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e((byte) 7, i, i2, i3, qim0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public static final void e(hvu0 hvu0Var, String str, b0k b0kVar, int i) {
        u7h u7hVar;
        long jA;
        xu30 xu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-430461451);
        int i2 = i | (x340Var.i(hvu0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xb10 xb10VarO = x4p1.o(x340Var);
            smr0 smr0VarA = xb10VarO.a();
            xu30 xu30VarR = null;
            if (smr0VarA == null) {
                u7hVar = null;
            } else {
                rmr0 rmr0VarB = smr0VarA.b(grd1.h);
                if (rmr0VarB == null) {
                    rmr0VarB = smr0VarA.b(grd1.e);
                }
                if (rmr0VarB != null) {
                    u7hVar = new u7h(u7h.b(z4p1.e(rmr0VarB.d), 0.6f, 0.0f, 0.0f, 0.0f, 14));
                } else {
                    u7hVar = null;
                }
            }
            if (u7hVar == null) {
                x340Var.i0(-1356582791);
                uwr uwrVar = cbx.a;
                jA = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            } else {
                x340Var.i0(-1356588960);
                x340Var.r(false);
                jA = u7hVar.a;
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar2 = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(16.0f));
            if (hvu0Var == null) {
                x340Var.i0(895823348);
                jto1.b(qim0VarF2, null, null, false, null, null, null, null, null, w8j.a, w8j.b, w8j.c, null, null, null, w8j.d, x340Var, 805306368, 196662, 29182);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(896189582);
                String str2 = hvu0Var.c;
                if (str2 == null) {
                    x340Var.i0(896231400);
                    x340Var.r(false);
                    xu30Var = null;
                } else {
                    x340Var.i0(896231401);
                    xu30 xu30VarR2 = apo.r(-1331405024, new p27(str2, xb10VarO, (byte) 1), x340Var);
                    x340Var.r(false);
                    xu30Var = xu30VarR2;
                }
                if (str == null) {
                    x340Var.i0(897579931);
                    x340Var.r(false);
                } else {
                    x340Var.i0(897579932);
                    xu30VarR = apo.r(-290193371, new qdg0(str, (byte) 27), x340Var);
                    x340Var.r(false);
                }
                jto1.b(qim0VarF2, null, null, false, null, null, null, null, null, xu30Var, apo.r(-1418905080, new uvu0(hvu0Var, (byte) 0), x340Var), xu30VarR, null, null, null, apo.r(-1715999731, new uvu0(hvu0Var, (byte) 1), x340Var), x340Var, 0, 196614, 29182);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(hvu0Var, str, i, (byte) 14);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(kvu0 kvu0Var, String str, boolean z, g6p1 g6p1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        qim0 qim0Var2;
        qim0 qim0Var3;
        String strN0;
        af5 af5Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(148471885);
        int i2 = i | (x340Var2.i(kvu0Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.i(g6p1Var) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var4 = nim0.a;
            if (str == null || str.length() == 0) {
                x340Var = x340Var2;
                qim0Var3 = qim0Var4;
                x340Var.i0(-690187746);
                qim0 qim0VarN = anm1.N("playlist_reaction_header_loading", u291.f(qim0Var3, 1.0f));
                gfh0 gfh0VarC = t1c.c(z ? een.g : een.i, false);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                i(160.0f, 12.0f, x340Var, 0);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var2.i0(-689870678);
                boolean z2 = g6p1Var instanceof lvu0;
                jvu0 jvu0Var = jvu0.a;
                if (z2) {
                    x340Var2.i0(-689839771);
                    if (kvu0Var instanceof ivu0) {
                        x340Var2.i0(947580127);
                        strN0 = cwl1.n0(2131959912, new Object[]{((ivu0) kvu0Var).a, str}, x340Var2);
                        x340Var2.r(false);
                    } else {
                        if (!kvu0Var.equals(jvu0Var)) {
                            throw p3d1.k(x340Var2, 947578429, false);
                        }
                        x340Var2.i0(947587097);
                        strN0 = cwl1.n0(2131959913, new Object[]{str}, x340Var2);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else if (g6p1Var instanceof nvu0) {
                    x340Var2.i0(-689372725);
                    if (kvu0Var instanceof ivu0) {
                        x340Var2.i0(947595196);
                        strN0 = cwl1.n0(2131959920, new Object[]{((ivu0) kvu0Var).a, str}, x340Var2);
                        x340Var2.r(false);
                    } else {
                        if (!kvu0Var.equals(jvu0Var)) {
                            throw p3d1.k(x340Var2, 947593495, false);
                        }
                        x340Var2.i0(947602070);
                        strN0 = cwl1.n0(2131959921, new Object[]{str}, x340Var2);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else {
                    if (!(g6p1Var instanceof mvu0)) {
                        throw p3d1.k(x340Var2, 947577581, false);
                    }
                    x340Var2.i0(-688907229);
                    if (kvu0Var instanceof ivu0) {
                        x340Var2.i0(947610208);
                        strN0 = cwl1.n0(2131959917, new Object[]{((ivu0) kvu0Var).a, str}, x340Var2);
                        x340Var2.r(false);
                    } else {
                        if (!kvu0Var.equals(jvu0Var)) {
                            throw p3d1.k(x340Var2, 947608511, false);
                        }
                        x340Var2.i0(947617210);
                        strN0 = cwl1.n0(2131959918, new Object[]{str}, x340Var2);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                }
                uwr uwrVar = cbx.a;
                zma1 zma1Var = new zma1(cbx.a(x340Var2).b.a, 0L, FontWeight.e, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var2).n.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498);
                int iB0 = ihc1.B0(strN0, str, 0, 6);
                if (iB0 >= 0) {
                    ye5 ye5Var = new ye5();
                    ye5Var.g(strN0.substring(0, iB0));
                    int iO = ye5Var.o(zma1Var);
                    try {
                        ye5Var.g(str);
                        ye5Var.k(iO);
                        ye5Var.g(strN0.substring(str.length() + iB0));
                        af5Var = ye5Var.p();
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                } else {
                    StringBuilder sb = new StringBuilder(16);
                    ArrayList arrayListM = xvj1.m();
                    new ArrayList();
                    sb.append(strN0);
                    String string = sb.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    int size = arrayListM.size();
                    for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                    }
                    af5Var = new af5(string, arrayList);
                }
                zic0 zic0Var = new zic0(2);
                qim0Var3 = qim0Var4;
                uwo1.d(af5Var, cbx.a(x340Var2).b.b, u291.f(anm1.N("playlist_reaction_header", qim0Var4), 1.0f), cbx.d(x340Var2).m, new a0e1(z ? 5 : 6), null, 0, false, zic0Var, 0, null, null, x340Var2, 0, 0, 3808);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(kvu0Var, str, z, g6p1Var, qim0Var2, i, (byte) 6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    public static final void g(ovu0 ovu0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        iu30 iu30Var2;
        qim0 qim0Var;
        vu30 vu30Var;
        llj lljVar;
        float f;
        int i3;
        rql rqlVar;
        vu30 vu30Var2;
        boolean z;
        boolean z2;
        String strN0;
        String strK;
        ?? r13;
        qim0 qim0Var2;
        kvu0 kvu0Var = ovu0Var.e;
        mvu0 mvu0Var = ovu0Var.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1374465247);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(ovu0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            boolean z3 = mvu0Var instanceof lvu0;
            rql rqlVar2 = sql.c;
            rql rqlVar3 = tql.c;
            if (z3 || (mvu0Var instanceof nvu0)) {
                if (kvu0Var instanceof ivu0) {
                    rqlVar2 = rqlVar3;
                }
            } else if (!(mvu0Var instanceof mvu0)) {
                eg.o();
                return;
            } else if (mvu0Var.d) {
                rqlVar2 = rql.c;
            } else if (kvu0Var instanceof ivu0) {
                rqlVar2 = rqlVar3;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarT = ltn1.t(u291.f(qim0Var3, 1.0f), ovu0Var.g);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float fY = rqlVar2.y() + 8.0f;
            cvx cvxVar2 = cbx.b(x340Var).b;
            float fX = rqlVar2.x() + 8.0f;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarT, fY, 6.0f, fX, cbx.b(x340Var).b.b);
            cvx cvxVar4 = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            if (mvu0Var.l()) {
                x340Var.i0(-276062549);
                rql rqlVar4 = rqlVar2;
                qim0Var = qim0Var3;
                vu30Var = vu30Var4;
                vu30Var2 = vu30Var3;
                lljVar = lljVar3;
                f = 1.0f;
                rqlVar = rqlVar4;
                f(kvu0Var, ovu0Var.d, rqlVar4 instanceof tql, mvu0Var, null, x340Var, 0);
                i3 = 0;
                x340Var.r(false);
            } else {
                qim0Var = qim0Var3;
                vu30Var = vu30Var4;
                lljVar = lljVar3;
                f = 1.0f;
                i3 = 0;
                rqlVar = rqlVar2;
                vu30Var2 = vu30Var3;
                x340Var.i0(-275847285);
                x340Var.r(false);
            }
            qim0 qim0VarF = u291.f(qim0Var, f);
            fra fraVar = een.N0;
            cvx cvxVar5 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new g21(eraVar, (byte) 29)), fraVar, x340Var, i3);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, vu30Var2);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var);
            boolean z5 = rqlVar instanceof tql;
            if (z5) {
                x340Var.i0(1232777353);
                z = false;
                b(null, x340Var, 0);
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(1232806183);
                x340Var.r(false);
            }
            qim0 qim0VarH = kx40.h(1.0f, anm1.N("playlist_reaction_card", qim0Var), z);
            boolean zI = x340Var.i(ss50Var) | ((i4 & 112) == 32) | x340Var.i(ovu0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                iu30Var2 = iu30Var;
                objT = new mhg(ss50Var, iu30Var2, ovu0Var, (byte) 9);
                x340Var.s0(objT);
            } else {
                iu30Var2 = iu30Var;
            }
            qim0 qim0VarB = f8d1.b(qim0VarH, rih1.a, (PointerInputEventHandler) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar2);
            nko1.H(xos0VarM3, x340Var, vu30Var2);
            x0d.q(iHashCode3, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var);
            if (mvu0Var instanceof mvu0) {
                r13 = 0;
                strK = x0d.k(x340Var, 111556749, 2131959919, x340Var, false);
            } else {
                if (z3 == 0 && !(mvu0Var instanceof nvu0)) {
                    throw p3d1.k(x340Var, 111554727, false);
                }
                x340Var.i0(-836520308);
                hvu0 hvu0VarH = mvu0Var.h();
                String str = hvu0VarH != null ? hvu0VarH.b : null;
                if (str == null) {
                    x340Var.i0(-836520309);
                    z2 = false;
                    x340Var.r(false);
                    strN0 = null;
                } else {
                    z2 = false;
                    x340Var.i0(-836520308);
                    strN0 = cwl1.n0(2131959914, new Object[]{str}, x340Var);
                    x340Var.r(false);
                }
                x340Var.r(z2);
                strK = strN0;
                r13 = z2;
            }
            e(mvu0Var.h(), strK, x340Var, r13);
            lvu0 lvu0Var = z3 ? (lvu0) mvu0Var : null;
            if (lvu0Var == null) {
                x340Var.i0(-836253802);
                x340Var.r((boolean) r13);
                qim0Var2 = null;
            } else {
                x340Var.i0(-836253801);
                String str2 = lvu0Var.c;
                qim0Var2 = null;
                h(6, str2, x340Var, null, z5);
                x340Var.r((boolean) r13);
            }
            x340Var.r(true);
            if (rqlVar instanceof sql) {
                x340Var.i0(1234054057);
                b(qim0Var2, x340Var, r13);
                x340Var.r((boolean) r13);
            } else {
                x340Var.i0(1234082887);
                x340Var.r((boolean) r13);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) ovu0Var, (Object) iu30Var2, i, (byte) 11);
        }
    }

    public static final void h(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-424122265);
        int i2 = i | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).a;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(str, u291.B(k1u.u(eqr0.C(h2c.a.a(anm1.N("playlist_reaction_emoji", qim0Var3), z ? een.Y : een.t), z ? 25.0f : -25.0f, 25.0f), z ? 10.0f : -10.0f), (gra) null, 3), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ltj(str, z, qim0Var2, i, (byte) 5);
        }
    }

    public static final void i(float f, float f2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1831696925);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarH = u291.h(u291.v(uyn1.B(nim0.a, 0.0f, 4.0f, 0.0f, 4.0f, 5), f), f2);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarH, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cru(f, f2, i, (byte) 7);
        }
    }

    public static final void j(boolean z, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1356035888);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            Float fValueOf = Float.valueOf(f);
            boolean zI = x340Var.i(view) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new kzj(z, view, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.t(fValueOf, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nce1(f, i, z);
        }
    }

    public static op80 k(op80 op80Var, op80 op80Var2) {
        if (op80Var == null) {
            op80Var = q6x.b;
        }
        if (op80Var2 == null) {
            op80Var2 = q6x.b;
        }
        q6x q6xVar = q6x.b;
        if (op80Var.equals(q6xVar) && op80Var2.equals(q6xVar)) {
            return q6xVar;
        }
        if (op80Var.equals(q6xVar)) {
            return op80Var2;
        }
        return op80Var2.equals(q6xVar) ? op80Var : new wch(op80Var, op80Var2);
    }

    public static luk0 l(Integer num, r6h1 r6h1Var) {
        return new luk0(num, r6h1Var);
    }

    public static final fu20 m(mr20 mr20Var, iu30 iu30Var, Function0 function0, Function0 function1) {
        return new fu20(mr20Var, new df6((byte) 7, iu30Var, new l811(), function1, new l811(), function0, (lnm) null), (byte) 1);
    }

    public static final boolean n(String str, String str2) {
        return u890.j(str, str2);
    }

    public static lz20 o() {
        return lz20.c;
    }

    public static lz20 p() {
        return lz20.b;
    }

    public static final LinkedHashMap q(e481 e481Var) {
        ArrayList arrayList = new ArrayList();
        j1p1.m("eq", arrayList, "available", e481Var.c);
        j1p1.m("eq", arrayList, "hasTimeLeft", e481Var.i);
        j1p1.m("lt", arrayList, "daysLastPlayed", e481Var.k);
        j1p1.m("gt", arrayList, "timePlayed", e481Var.j);
        j1p1.m("eq", arrayList, "availableOffline", e481Var.d);
        j1p1.m("eq", arrayList, "inCollection", e481Var.f);
        Boolean bool = e481Var.e;
        if (u890.j(bool, Boolean.TRUE)) {
            j1p1.m("gt", arrayList, "timeLeft", 0);
        }
        if (bool != null) {
            arrayList.add("isPlayed ne " + bool);
        }
        j1p1.m("eq", arrayList, "videoEpisode", e481Var.g);
        String str = e481Var.p;
        if (str != null) {
            arrayList.add("text contains " + ((Object) str));
        }
        uqv0 uqv0Var = new uqv0((byte) 9);
        LinkedHashMap linkedHashMap = (LinkedHashMap) uqv0Var.b;
        uqv0Var.b(Integer.valueOf(e481Var.a), "updateThrottling");
        linkedHashMap.put("responseFormat", "protobuf");
        nia1 nia1Var = e481Var.h;
        if (nia1Var != null) {
            linkedHashMap.put("sort", tia1.b(nia1Var));
        }
        if (!arrayList.isEmpty()) {
            ((LinkedHashMap) uqv0Var.b).put("filter", o7h.y0(arrayList, ",", (String) null, (String) null, (iu30) null, 62));
        }
        Double d = e481Var.l;
        if (d != null) {
            linkedHashMap.put("relTimeLeftTolerance", String.valueOf(d.doubleValue()));
        }
        uqv0Var.b(e481Var.m, "absTimeLeftTolerance");
        nqz0 nqz0Var = e481Var.q;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) uqv0Var.b;
        if (nqz0Var != null) {
            int i = nqz0Var.a;
            linkedHashMap2.put("start", String.valueOf(0));
            linkedHashMap2.put("length", String.valueOf(i));
        }
        String str2 = e481Var.n;
        if (str2 != null) {
            linkedHashMap.put("includeInRange", str2);
        }
        uqv0Var.b(e481Var.o, "includeInRangeContext");
        Boolean bool2 = e481Var.r;
        if (bool2 != null && bool2.booleanValue()) {
            linkedHashMap.put("preferCache", String.valueOf(bool2.booleanValue()));
        }
        return linkedHashMap;
    }

    public static lz20 r() {
        return lz20.d;
    }

    public static int s(String str) {
        return str.hashCode();
    }

    public static final s5k1 t(s5k1 s5k1Var, wkt wktVar) {
        q5k1 q5k1Var = s5k1Var.N0;
        o5k1 o5k1Var = q5k1Var instanceof o5k1 ? (o5k1) q5k1Var : null;
        return s5k1.a(s5k1Var, (String) null, (s171) null, 0L, (vve1) null, o5k1Var != null ? new o5k1(o5k1Var.a, o5k1Var.b, wktVar) : q5k1Var, (wkt) null, (String) null, 122879);
    }
}
