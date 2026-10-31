package p;

import android.os.Build;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fno1 {
    public static final a2g a = new a2g((byte) 5);
    public static b180 b;

    public static final void a(y4g0 y4g0Var, lxr0 lxr0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        lxr0 lxr0Var2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2006693420);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(y4g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            lxr0Var2 = lxr0Var;
            i2 |= x340Var.g(lxr0Var2) ? 32 : 16;
        } else {
            lxr0Var2 = lxr0Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 2048 : 1024;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            otw.c(lxr0Var2, new kxr0(y4g0Var.e, y4g0Var.f, y4g0Var.b, y4g0Var.c, y4g0Var.d), qim0Var2, (ipb1) null, x340Var, (i2 >> 3) & 910, 8);
            if (z) {
                x340Var.i0(-245621275);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0.a, 8.0f, x340Var, false);
            } else {
                x340Var.i0(-245543434);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(y4g0Var, lxr0Var, z, qim0Var, i, (byte) 5);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1120189333);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            List listQ0 = ihc1.Q0(cwl1.n0(2131954618, new Object[]{"__DATE__"}, x340Var), new String[]{"__DATE__"}, 2, 2);
            boolean z2 = listQ0.size() > 1;
            String str2 = (String) listQ0.get(0);
            String str3 = z2 ? (String) listQ0.get(1) : "";
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = u291.B(qim0Var3, (gra) null, 3);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xrx xrxVar = xrx.c;
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.e;
            vex vexVar2 = (vex) zscVar.b;
            w0h1.a(xrxVar, isl.a, u291.r(uyn1.B(qim0Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11), 12.0f), vexVar.m, 0L, false, x340Var, xrx.d | 48, 48);
            uwo1.e(str2, null, cbx.d(x340Var).j, vexVar2.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
            x340Var = x340Var;
            if (z2) {
                x340Var.i0(158077979);
                uwo1.e(str, null, cbx.d(x340Var).j, vexVar2.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1714);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(158312649);
                x340Var.r(false);
            }
            if (str3.length() > 0) {
                x340Var.i0(158357506);
                uwo1.e(str3, null, cbx.d(x340Var).j, vexVar2.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
                x340Var.r(z);
            } else {
                x340Var.i0(158585449);
                x340Var.r(z);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 19);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i3;
        boolean z;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1902625663);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, u291.b(0.0f, 48.0f, 1, u291.f(qim0Var, 1.0f)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            fux fuxVar = fux.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131958434));
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean z3 = (i3 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new msh0(iu30Var, (byte) 9);
                x340Var.s0(objT2);
            }
            nim0 nim0Var = nim0.a;
            w0h1.a(fuxVar, jslVar, anm1.N("toolbar_icon", uyn1.B(bin.v(nim0Var, idn0Var, jtrVar, false, null, null, (Function0) objT2, 28), 0.0f, 0.0f, 8.0f, 0.0f, 11)), 0L, 0L, false, x340Var, fux.d, 56);
            qim0 qim0VarH = kx40.h(1.0f, u291.f(nim0Var, 1.0f), true);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            int iC = l1d.C(i);
            if (iC == 0 || iC == 1) {
                z = false;
                i4 = -1741511010;
                i5 = 2131958443;
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -1741517725, false);
                }
                i4 = -1741515844;
                i5 = 2131958444;
                z = false;
            }
            String strK = x0d.k(x340Var, i4, i5, x340Var, z);
            uwr uwrVar = cbx.a;
            uwo1.e(strK, anm1.N("toolbar_title", uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 2.0f, 7)), cbx.d(x340Var).h, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1720);
            x340Var = x340Var;
            x340Var.r(true);
            op71.g(x340Var, u291.v(nim0Var, 24.0f));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry1(i, iu30Var, qim0Var, i2, (byte) 1);
        }
    }

    public static final void d(String str, String str2, c380 c380Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1913797171);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(c380Var) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("series_row", u291.f(uyn1.z(4.0f, 0.0f, 2, qim0Var3), 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, new uvx(0, (pgx) null, 5, new zzq0(12.0f, 8.0f, 12.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499), null, false, null, null, new gbx(z50.c, function0), null, null, apo.r(1542188010, new iww0(str, (byte) 21), b0kVar3), null, apo.r(-2108292757, new ql50(c380Var, (byte) 4), b0kVar3), null, null, null, apo.r(-623708817, new iww0(str2, (byte) 22), b0kVar3), b0kVar2, 805306432, 196656, 30140);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(str, str2, c380Var, function0, qim0Var2, i, (byte) 8);
        }
    }

    public static final void e(i2c i2cVar, ArrayList arrayList, jkr0 jkr0Var, boolean z, db60 db60Var, slx0 slx0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(937434986);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(arrayList) : b0kVar3.i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(jkr0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(db60Var) : b0kVar3.i(db60Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? b0kVar3.g(slx0Var) : b0kVar3.i(slx0Var) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).e.a;
            float fMin = Math.min(Math.min(i2cVar.d() * 0.74f, zjy.p(0.0f, new p3v(i2cVar.c() - (f * 2.0f))).a * 0.5625f), 440.0f);
            float f2 = fMin / 0.5625f;
            float fD = i2cVar.d();
            cvx cvxVar = cbx.b(b0kVar3).b;
            szd szdVar = new szd(fMin, 8.0f - (z ? (0.14999998f * fMin) / 2.0f : 0.0f), (fD - fMin) / 2.0f);
            int iT = jfv.t(cbx.c(b0kVar3).b.d, ngv.d);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            p3v p3vVar = new p3v(fMin);
            p3v p3vVar2 = new p3v(i2cVar.c());
            boolean zI = b0kVar3.i(jkr0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                z2 = false;
                objT2 = new hc60(jkr0Var, (lnm) null, (byte) 0);
                b0kVar3.s0(objT2);
            } else {
                z2 = false;
            }
            qxd0.s(p3vVar, p3vVar2, (vu30) objT2, b0kVar3);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, f, 1, u291.d(nim0Var, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.h, z2);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarZ);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), f2);
            int i3 = i2;
            bkr0 bkr0Var = new bkr0();
            if (!z) {
                iT = 0;
            }
            pxg1 pxg1VarO0 = irn1.o0(iT, 0, null, 6);
            int i4 = (i3 >> 6) & 14;
            b0kVar2 = b0kVar3;
            qmo1.e(jkr0Var, szdVar, qim0VarH, q0o1.j(jkr0Var, bkr0Var, pxg1VarO0, b0kVar3, i4, 20), apo.r(-2042199697, new j6v((byte) 2, jkr0Var, arrayList, db60Var, slx0Var, c9nVar, z), b0kVar2), b0kVar2, i4 | 24576, 0);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(i2cVar, arrayList, jkr0Var, z, db60Var, slx0Var, i);
        }
    }

    public static final String f(String str) {
        Set set = s4b1.f;
        return uic.v("podcast-chapters", str).z();
    }

    public static soz0 g(long j, long j2, b0k b0kVar) {
        long j3 = u7h.k;
        dah dahVar = (dah) ((x340) b0kVar).k(eah.a);
        soz0 soz0Var = dahVar.c0;
        if (soz0Var == null) {
            soz0 soz0Var2 = new soz0(eah.d(dahVar, 26), eah.d(dahVar, 19), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
            dahVar.c0 = soz0Var2;
            soz0Var = soz0Var2;
        }
        long j4 = j != 16 ? j : soz0Var.a;
        long j5 = j2 != 16 ? j2 : soz0Var.b;
        long j6 = j3 != 16 ? j3 : soz0Var.c;
        if (j3 == 16) {
            j3 = soz0Var.d;
        }
        return new soz0(j4, j5, j6, j3);
    }

    public static final long h() {
        return System.currentTimeMillis() / 1000;
    }

    public static final i930 i(int i) {
        if (1 > i || i >= 1001) {
            rf80.a("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        return hm5.d(new a930[]{o0c.a(14, (FontWeight) null, new ja30(new ga30[]{new ia30(i)}))});
    }

    public static final boolean j(dxc0 dxc0Var) {
        Long l = dxc0Var.k;
        return (l != null ? l.longValue() : 0L) >= 2;
    }

    public static final boolean k() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final Next l(lmb1 lmb1Var) {
        List listD = lmb1Var.d();
        Set setC = lmb1Var.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (!setC.contains(((vd21) obj).a)) {
                arrayList.add(obj);
            }
        }
        ce21 ce21Var = !arrayList.isEmpty() ? new ce21(arrayList) : null;
        return ce21Var != null ? Next.i(lmb1Var, Collections.singleton(new tgw(ce21Var))) : Next.h(lmb1Var);
    }

    public static boolean m(String str, List list) {
        if (nhc1.Y(str, "spotify:", false)) {
            str = str.substring(8);
        }
        List<String> listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
        if (listQ0.size() == list.size()) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : listQ0) {
                if (str2.length() == 0) {
                    arrayList.add(new ol00(""));
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "as Base62}", false)) {
                    arrayList.add(h9a.c);
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "as Hex64}", false)) {
                    arrayList.add(h9a.d);
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "as text}", false)) {
                    arrayList.add(h9a.f);
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "as Username}", false)) {
                    arrayList.add(h9a.h);
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "as GidID}", false)) {
                    arrayList.add(tr40.b);
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "as Query}", false)) {
                    arrayList.add(h9a.e);
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "as URL}", false)) {
                    arrayList.add(h9a.g);
                } else if (str2.charAt(0) == '{' && nhc1.R(str2, "}", false)) {
                    arrayList.add(y2i1.a);
                } else {
                    arrayList.add(new ol00(str2));
                }
            }
            List list2 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                if (((y2i1) arrayList.get(i)).a((String) list.get(i))) {
                }
            }
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((y2i1) arrayList.get(i2)).b((String) list.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final int n(ptb0 ptb0Var) {
        List list = ptb0Var.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((qtb0) list.get(i2)).q;
        }
        return (i / list.size()) + ptb0Var.s;
    }

    public static boolean o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
