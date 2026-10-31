package p;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.carapplibrary.api.CommandFailedException;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nmn1 {
    public static b180 a;

    public static final void a(umx0 umx0Var, b0k b0kVar, int i) {
        int i2;
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-447832557);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(umx0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = umx0Var.j;
            if (str == null || ihc1.y0(str)) {
                b = 0;
                String str2 = umx0Var.n;
                if (str2 == null || ihc1.y0(str2)) {
                    x340Var.i0(-1210615601);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1210851170);
                    String str3 = umx0Var.n;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str3, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 2, false, new cjc0(4), 0, null, x340Var, 1572864, 0, 1698);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-1211164053);
                String str4 = umx0Var.j;
                uwr uwrVar2 = cbx.a;
                b = 0;
                uwo1.e(str4, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 2, false, new cjc0(4), 0, null, x340Var, 1572864, 0, 1698);
                x340Var.r(false);
            }
        } else {
            b = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new smx0(umx0Var, i, b);
        }
    }

    public static final void b(WidgetState widgetState, gt40 gt40Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-973661537);
        int i2 = (x340Var.i(widgetState) ? 4 : 2) | i | 48 | (x340Var.h(false) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gt40Var = et40.a;
            gt40 gt40VarI = dm5.I(gt40Var);
            if (z) {
                gt40VarI = gt40VarI.c(new i8n(new x4u()));
            }
            j2h1.b(gt40VarI, (ql3) null, apo.r(1987391741, new utt(widgetState, (byte) 14), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        gt40 gt40Var2 = gt40Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs((Object) widgetState, (Object) gt40Var2, z, i, (byte) 13);
        }
    }

    public static final void c(String str, String str2, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        String str3;
        String str4;
        int i2;
        String strO0;
        String strO1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1691418135);
        int i3 = i | 18 | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                i2 = i3 & (-127);
                strO0 = cwl1.o0(x340Var, 2131956385);
                strO1 = cwl1.o0(x340Var, 2131956382);
            } else {
                x340Var.b0();
                i2 = i3 & (-127);
                strO0 = str;
                strO1 = str2;
            }
            x340Var.s();
            mqo1.e(function0, null, null, apo.r(-939059177, new dz40(strO0, (byte) 3), x340Var), apo.r(-653923274, new dz40(strO1, (byte) 4), x340Var), apo.r(-368787371, new vgz(function1, (byte) 19), x340Var), apo.r(-83651468, new vgz(function0, (byte) 20), x340Var), x340Var, ((i2 >> 6) & 14) | 1797120, 6);
            str3 = strO0;
            str4 = strO1;
        } else {
            x340Var.b0();
            str3 = str;
            str4 = str2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ga50(str3, str4, function0, function1, i, (byte) 0);
        }
    }

    public static final void d(umx0 umx0Var, b0k b0kVar, int i) {
        int i2;
        long j;
        String str = umx0Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-373207413);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(umx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str2 = umx0Var.d;
            String str3 = umx0Var.g;
            Set set = s4b1.f;
            if (uic.g(str2, blc0.fh)) {
                x340Var.i0(1448409997);
                if ((str3 == null || str3.length() == 0) && umx0Var.b.length() <= 0) {
                    x340Var.i0(2124938354);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                } else {
                    x340Var.i0(2124936663);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var).b.c;
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(2124940306);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            }
            nim0 nim0Var = nim0.a;
            if (str3 == null || ihc1.y0(str3)) {
                long j2 = j;
                if (!ihc1.y0(umx0Var.c())) {
                    x340Var.i0(1449081488);
                    String strC = umx0Var.c();
                    lee1 lee1Var = cbx.d(x340Var).j;
                    cvx cvxVar = cbx.b(x340Var).b;
                    uwo1.e(strC, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), lee1Var, j2, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1696);
                    x340Var.r(false);
                } else if (ihc1.y0(str)) {
                    x340Var.i0(1449769719);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1449455348);
                    lee1 lee1Var2 = cbx.d(x340Var).j;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    uwo1.e(str, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), lee1Var2, j2, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1696);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(1448716029);
                String str4 = umx0Var.g;
                lee1 lee1Var3 = cbx.d(x340Var).j;
                cvx cvxVar3 = cbx.b(x340Var).b;
                uwo1.e(str4, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), lee1Var3, j, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1696);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new smx0(umx0Var, i, (byte) 1);
        }
    }

    public static final void e(iyr0 iyr0Var, String str, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-305246915);
        int i3 = i | (x340Var.e(iyr0Var.ordinal()) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = iyr0Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131952286;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return;
                }
                i2 = 2131952765;
            }
            bzn1.e(null, apo.r(1967277085, new ue0(i2, str, (byte) 13), x340Var), false, j2iVar, null, null, null, null, x340Var, 3120, 245);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(iyr0Var, str, j2iVar, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e1  */
    public static final void f(umx0 umx0Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar4;
        j2i j2iVar5;
        umx0 umx0Var2;
        qim0 qim0Var2;
        vu30 vu30Var;
        b0k b0kVar2;
        akx akxVar;
        boolean z;
        qim0 wnb0Var;
        String str;
        boolean z2;
        float f;
        qim0 qim0VarD;
        String str2 = umx0Var.c;
        String str3 = umx0Var.m;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1290762513);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(umx0Var) ? 4 : 2) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            af afVarA = ef.c(b0kVar3).a();
            boolean z3 = afVarA.compareTo(af.e) >= 0 && afVarA.compareTo(af.i) <= 0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = z3 ? u291.j(142.0f, 0.0f, 2, qim0Var3) : u291.h(qim0Var3, 142.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarThen = u291.f(dug.f(i1p1.q(qim0Var3, er31.b(8.0f)), cbx.a(b0kVar3).a.a.a(), d4o1.a), 1.0f).then(qim0VarJ);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            vu30 vu30Var2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, vu30Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar2);
            nko1.F(b0kVar3);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar3);
            qim0 qim0VarF = z3 ? u291.f(qim0Var3, 1.0f) : u291.d(qim0Var3, 1.0f);
            fra fraVar = een.Z;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarF);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, vu30Var2);
            x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar3);
            Uri uri = Uri.parse(umx0Var.e);
            String str4 = umx0Var.d;
            Set set = s4b1.f;
            if (uic.h(str4, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6}) || uic.g(str4, blc0.fh)) {
                vu30Var = vu30Var2;
                b0kVar2 = b0kVar3;
                akxVar = mrx.c;
            } else {
                vu30Var = vu30Var2;
                b0kVar2 = b0kVar3;
                if (uic.h(str4, new blc0[]{blc0.g1, blc0.h1, blc0.j1})) {
                    akxVar = akx.c;
                } else {
                    akxVar = (uic.i(str4, s4b1.g) || uic.g(str4, blc0.Yc)) ? grx.c : box.c;
                }
            }
            vu30 vu30Var3 = vu30Var;
            b0k b0kVar4 = b0kVar2;
            eso1.e(uri, isl.a, u291.r(qim0Var3, 142.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(akxVar, akxVar), false, false, b0kVar4, 1073742256, 0, 3576);
            b0kVar3 = b0kVar4;
            qim0 qim0VarF2 = z3 ? u291.f(qim0Var3, 1.0f) : u291.d(qim0Var3, 1.0f);
            era eraVar = een.P0;
            b36 b36Var = h36.g;
            mbh mbhVarA = jbh.a(b36Var, eraVar, b0kVar3, 6);
            int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM3 = b0kVar3.m();
            qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarF2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM3, b0kVar3, vu30Var3);
            x0d.q(iHashCode3, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE3, b0kVar3, lljVar3);
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarF3 = u291.f(uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f);
            if (z3) {
                z = true;
                wnb0Var = qim0Var3;
            } else {
                z = true;
                wnb0Var = new wnb0(1.0f, true);
            }
            qim0 qim0VarThen2 = qim0VarF3.then(wnb0Var);
            jw31 jw31VarA2 = ew31.a(b36Var, fraVar, b0kVar3, 6);
            int iHashCode4 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM4 = b0kVar3.m();
            qim0 qim0VarE4 = zr7.E(b0kVar3, qim0VarThen2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM4, b0kVar3, vu30Var3);
            x0d.q(iHashCode4, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE4, b0kVar3, lljVar3);
            pw31 pw31Var = pw31.a;
            qim0 qim0VarA = pw31Var.a(1.0f, qim0Var3, z);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            if (str3 == null || ihc1.y0(str3)) {
                str = str2;
                z2 = false;
                if (!ihc1.h0(str, "prerelease", false)) {
                    b0kVar3.i0(835661617);
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    b0kVar3.r(false);
                    f = 16.0f;
                }
                boolean z5 = z2;
                qim0 qim0VarB = uyn1.B(qim0VarA, 16.0f, 0.0f, 0.0f, f, 6);
                if (z3) {
                    qim0VarD = u291.f(qim0Var3, 1.0f);
                } else {
                    qim0VarD = u291.d(qim0Var3, 1.0f);
                }
                qim0 qim0VarThen3 = qim0VarB.then(qim0VarD);
                mbh mbhVarA2 = jbh.a(h36.c, eraVar, b0kVar3, z5 ? 1 : 0);
                int iHashCode5 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM5 = b0kVar3.m();
                qim0 qim0VarE5 = zr7.E(b0kVar3, qim0VarThen3);
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(mbhVarA2, b0kVar3, lljVar);
                nko1.H(xos0VarM5, b0kVar3, vu30Var3);
                x0d.q(iHashCode5, b0kVar3, lljVar2, b0kVar3);
                nko1.H(qim0VarE5, b0kVar3, lljVar3);
                int i3 = i2 & 14;
                umx0Var2 = umx0Var;
                d(umx0Var2, b0kVar3, i3);
                j(umx0Var2, b0kVar3, i3);
                i(umx0Var2, b0kVar3, i3);
                a(umx0Var2, b0kVar3, i3);
                b0kVar3.r(true);
                j2iVar5 = j2iVar3;
                j2iVar5.invoke(pw31Var, b0kVar3, 54);
                b0kVar3.r(true);
                if ((str3 != null || ihc1.y0(str3)) && !ihc1.h0(str, "prerelease", false)) {
                    j2iVar4 = j2iVar;
                    qim0Var2 = qim0Var3;
                    b0kVar3.i0(-1211651311);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(-1212324011);
                    qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), cbx.b(b0kVar3).b.e);
                    cvx cvxVar4 = cbx.b(b0kVar3).b;
                    cvx cvxVar5 = cbx.b(b0kVar3).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarH, 4.0f, 0.0f, 8.0f, 0.0f, 10);
                    jw31 jw31VarA3 = ew31.a(b36Var, een.N0, b0kVar3, 54);
                    int iHashCode6 = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM6 = b0kVar3.m();
                    qim0 qim0VarE6 = zr7.E(b0kVar3, qim0VarB2);
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(n4kVar);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(jw31VarA3, b0kVar3, lljVar);
                    nko1.H(xos0VarM6, b0kVar3, vu30Var3);
                    x0d.q(iHashCode6, b0kVar3, lljVar2, b0kVar3);
                    nko1.H(qim0VarE6, b0kVar3, lljVar3);
                    j2iVar2.invoke(pw31Var, b0kVar3, 54);
                    j2iVar4 = j2iVar;
                    j2iVar4.invoke(pw31Var, b0kVar3, 54);
                    b0kVar3.r(true);
                    qim0Var2 = qim0Var3;
                    qim0 qim0VarF4 = u291.f(qim0Var2, 1.0f);
                    cvx cvxVar6 = cbx.b(b0kVar3).b;
                    op71.g(b0kVar3, u291.h(qim0VarF4, 4.0f));
                    b0kVar3.r(false);
                }
                us71.m(b0kVar3, true, true, true);
            } else {
                str = str2;
                z2 = false;
            }
            b0kVar3.i0(835660495);
            b0kVar3.r(z2);
            f = 0.0f;
            boolean z6 = z2;
            qim0 qim0VarB3 = uyn1.B(qim0VarA, 16.0f, 0.0f, 0.0f, f, 6);
            if (z3) {
                qim0VarD = u291.f(qim0Var3, 1.0f);
            } else {
                qim0VarD = u291.d(qim0Var3, 1.0f);
            }
            qim0 qim0VarThen4 = qim0VarB3.then(qim0VarD);
            mbh mbhVarA3 = jbh.a(h36.c, eraVar, b0kVar3, z6 ? 1 : 0);
            int iHashCode7 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM7 = b0kVar3.m();
            qim0 qim0VarE7 = zr7.E(b0kVar3, qim0VarThen4);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA3, b0kVar3, lljVar);
            nko1.H(xos0VarM7, b0kVar3, vu30Var3);
            x0d.q(iHashCode7, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE7, b0kVar3, lljVar3);
            int i4 = i2 & 14;
            umx0Var2 = umx0Var;
            d(umx0Var2, b0kVar3, i4);
            j(umx0Var2, b0kVar3, i4);
            i(umx0Var2, b0kVar3, i4);
            a(umx0Var2, b0kVar3, i4);
            b0kVar3.r(true);
            j2iVar5 = j2iVar3;
            j2iVar5.invoke(pw31Var, b0kVar3, 54);
            b0kVar3.r(true);
            if (str3 != null) {
                j2iVar4 = j2iVar;
                qim0Var2 = qim0Var3;
                b0kVar3.i0(-1211651311);
                b0kVar3.r(false);
            } else {
                j2iVar4 = j2iVar;
                qim0Var2 = qim0Var3;
                b0kVar3.i0(-1211651311);
                b0kVar3.r(false);
            }
            us71.m(b0kVar3, true, true, true);
        } else {
            j2iVar4 = j2iVar;
            j2iVar5 = j2iVar3;
            umx0Var2 = umx0Var;
            b0kVar3.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 29, i, umx0Var2, j2iVar4, j2iVar2, j2iVar5, qim0Var2);
        }
    }

    public static final void g(i2c i2cVar, boolean z, int i, b0k b0kVar, int i2) {
        int i3;
        h311 h311VarV;
        xj41 xj41Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1891898701);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g("WrappedStory") ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                Integer numValueOf = Integer.valueOf(i);
                boolean z2 = (i3 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new ga5(i, (lnm) null);
                    x340Var.s0(objT);
                }
                qxd0.t(numValueOf, x340Var, (vu30) objT);
                gk30.a(uyn1.B(i2cVar.a(nim0.a, een.d), 8.0f, 48.0f, 0.0f, 0.0f, 12), x340Var, ((i3 >> 3) & 112) | 6);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    xj41Var = new xj41(i2cVar, z, i, i2, (byte) 0);
                }
            }
            h311VarV.d = xj41Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            xj41Var = new xj41(i2cVar, z, i, i2, (byte) 1);
            h311VarV.d = xj41Var;
        }
    }

    public static final void h(boolean z, float f, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z2;
        Function0 function2;
        h311 h311VarV;
        f1b1 f1b1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(877111003);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new pt61(function0, (byte) 21));
                x340Var.s0(objT);
            }
            if (((Boolean) ((tob1) objT).getValue()).booleanValue()) {
                z2 = z;
                function2 = function0;
                String strO0 = cwl1.o0(x340Var, z2 ? 2131959688 : 2131959827);
                gbx gbxVar = new gbx(z50.c, function1);
                idx idxVar = new idx(18);
                qim0 qim0VarN = anm1.N("sponsored_playlist_header_video_playback_control", u291.r(eqr0.D(0.0f, f - 32.0f, 1, qim0Var), 64.0f));
                boolean z3 = (i2 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new hii0(function2, (byte) 27);
                    x340Var.s0(objT2);
                }
                wro1.h(gbxVar, idxVar, i541.C(qim0VarN, (iu30) objT2), null, null, null, false, null, null, apo.r(842232370, new mv8(z2, strO0, (byte) 13), x340Var), x340Var, 12582912, 6, 888);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    f1b1Var = new f1b1(z, f, function0, function1, qim0Var, i, (byte) 0);
                }
            }
            h311VarV.d = f1b1Var;
        }
        z2 = z;
        function2 = function0;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            f1b1Var = new f1b1(z2, f, function2, function1, qim0Var, i, (byte) 1);
            h311VarV.d = f1b1Var;
        }
    }

    public static final void i(umx0 umx0Var, b0k b0kVar, int i) {
        int i2;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-639639989);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(umx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str2 = umx0Var.d;
            String strY0 = umx0Var.b;
            Set set = s4b1.f;
            if (uic.g(str2, blc0.fh)) {
                x340Var.i0(-513701195);
                List list = umx0Var.l;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ilx0.X;
                    x340Var.s0(objT);
                }
                strY0 = o7h.y0(list, ", ", (String) null, (String) null, (iu30) objT, 30);
                x340Var.r(false);
            } else if (ihc1.y0(strY0) || (!((str = umx0Var.g) == null || ihc1.y0(str)) || strY0.equals(umx0Var.f))) {
                x340Var.i0(1255238035);
                x340Var.r(false);
                strY0 = "";
            } else {
                x340Var.i0(-513698509);
                x340Var.r(false);
            }
            String str3 = strY0;
            if (ihc1.y0(str3)) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new smx0(umx0Var, i, (byte) 2);
                    return;
                }
                return;
            }
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str3, uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).m, j, new a0e1(5), null, 2, false, new cjc0(4), 0, null, x340Var, 1572864, 0, 1696);
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new smx0(umx0Var, i, (byte) 3);
        }
    }

    public static final void j(umx0 umx0Var, b0k b0kVar, int i) {
        int i2;
        long j;
        String str = umx0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1008582161);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(umx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (ihc1.y0(str)) {
            x340Var.i0(920450195);
            x340Var.r(false);
        } else {
            x340Var.i0(920131980);
            if (umx0Var.o) {
                x340Var.i0(1415158427);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                x340Var.i0(1415159923);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            uwo1.e(str, null, cbx.d(x340Var).k, j, new a0e1(5), null, 2, false, new cjc0(2), 0, null, x340Var, 1572864, 0, 1698);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new smx0(umx0Var, i, (byte) 4);
        }
    }

    public static void k(LinkedHashMap linkedHashMap, String str, int i, i1z i1zVar) {
        String strB = i1zVar.b(i);
        if (strB.length() > 0) {
            linkedHashMap.put(str, strB);
        }
    }

    public static c1z l() {
        g1z g1zVar = g1z.d;
        cen cenVar = new cen();
        cen cenVar2 = new cen();
        d1z d1zVar = d1z.d;
        c1z c1zVar = new c1z();
        c1zVar.a = 0;
        c1zVar.b = 0;
        c1zVar.c = "";
        c1zVar.d = "";
        c1zVar.e = null;
        c1zVar.f = null;
        c1zVar.g = null;
        c1zVar.h = false;
        c1zVar.i = "";
        c1zVar.j = "";
        c1zVar.k = g1zVar;
        c1zVar.l = cenVar;
        c1zVar.m = false;
        c1zVar.n = null;
        c1zVar.o = null;
        c1zVar.p = false;
        c1zVar.q = false;
        c1zVar.r = false;
        c1zVar.s = "";
        c1zVar.t = cenVar2;
        c1zVar.u = false;
        c1zVar.v = false;
        c1zVar.w = false;
        c1zVar.x = false;
        c1zVar.y = false;
        c1zVar.z = false;
        c1zVar.A = d1zVar;
        c1zVar.B = false;
        c1zVar.C = rwp0.a;
        c1zVar.D = tu00.a;
        c1zVar.E = 1;
        return c1zVar;
    }

    public static axq0 m(vzq0 vzq0Var, p3v p3vVar, p3v p3vVar2, p3v p3vVar3, p3v p3vVar4, int i) {
        if ((i & 1) != 0) {
            p3vVar = null;
        }
        if ((i & 2) != 0) {
            p3vVar2 = null;
        }
        if ((i & 4) != 0) {
            p3vVar3 = null;
        }
        if ((i & 8) != 0) {
            p3vVar4 = null;
        }
        return new axq0(p3vVar, p3vVar2, p3vVar3, p3vVar4, vzq0Var);
    }

    public static ij81 n() {
        ij81 ij81Var = new ij81((byte) 23);
        ij81Var.b = -1;
        return ij81Var;
    }

    public static final String o(Resources resources, boolean z) {
        String string = z ? resources.getString(2131956543) : resources.getString(2131956545);
        string.getClass();
        return string;
    }

    public static void p(zf30 zf30Var) {
        lt50 application;
        c8o.j(zf30Var, "fragment");
        zf30 zf30Var2 = zf30Var;
        while (true) {
            zf30Var2 = zf30Var2.X0;
            if (zf30Var2 == null) {
                lt50 lt50VarF0 = zf30Var.f0();
                if (lt50VarF0 instanceof lt50) {
                    application = lt50VarF0;
                    break;
                } else if (lt50VarF0.getApplication() instanceof lt50) {
                    application = lt50VarF0.getApplication();
                    break;
                } else {
                    hhg1.n(l1d.m("No injector was found for ", zf30Var.getClass().getCanonicalName()));
                    return;
                }
            }
            if (zf30Var2 instanceof lt50) {
                application = (lt50) zf30Var2;
                break;
            }
        }
        if (Log.isLoggable("dagger.android.support", 3)) {
            application.getClass();
        }
        jgu jguVarF = application.f();
        c8o.k(jguVarF, "%s.androidInjector() returned null", application.getClass());
        jguVarF.w(zf30Var);
    }

    public static final Integer q(String str) {
        Long lD0;
        if (str != null && !ihc1.y0(str)) {
            String strH0 = ihc1.H0(str, "#");
            int length = strH0.length();
            if (length != 6) {
                if (length == 8 && (lD0 = nhc1.d0(16, strH0)) != null) {
                    return Integer.valueOf((int) lD0.longValue());
                }
                return null;
            }
            Long lD1 = nhc1.d0(16, strH0);
            if (lD1 != null) {
                return Integer.valueOf((int) (lD1.longValue() | 4278190080L));
            }
        }
        return null;
    }

    public static final String r(Object obj) {
        return f4i1.f(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final String s(Throwable th) {
        if (th instanceof CommandFailedException) {
            return l1d.m("Reasons:", ((CommandFailedException) th).a);
        }
        String message = th.getMessage();
        return message == null ? j2h1.I(th) : message;
    }
}
