package p;

import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jzn1 {
    public static b180 a;

    public static int A() {
        List listQ0 = ihc1.Q0("9.2.0.26", new String[]{"."}, 0, 6);
        if (listQ0.size() != 4) {
            eg.f("Invalid AP version code: 9.2.0.26");
            return 0;
        }
        int i = Integer.parseInt((String) listQ0.get(0));
        int i2 = Integer.parseInt((String) listQ0.get(1));
        int i3 = Integer.parseInt((String) listQ0.get(2));
        int i4 = Integer.parseInt((String) listQ0.get(3));
        if (i < 20 && i2 < 10 && i3 < 100 && i4 < 100000) {
            return (i3 * 100000) + (i2 * 10000000) + (i * 100000000) + i4;
        }
        StringBuilder sbQ = cy30.q(i, i2, "AP version tag overflow (some parts are mangling other parts): (", ", ", ", ");
        sbQ.append(i3);
        sbQ.append(", ");
        sbQ.append(i4);
        sbQ.append(")\nOne possible reason could be that the git tags in the repo are not up to date with upstream.");
        throw new AssertionError(sbQ.toString());
    }

    public static final a8b0 B(y0h1 y0h1Var) {
        kfg kfgVarK = y0h1Var.k();
        if (kfgVarK instanceof kfg) {
            List parameters = kfgVarK.g().getParameters();
            ArrayList arrayList = new ArrayList(q7h.U(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((y0h1) it.next()).g());
            }
            List upperBounds = y0h1Var.getUpperBounds();
            g6b0 g6b0VarE = kht.e(y0h1Var);
            a8b0 a8b0VarH = new l1h1(new qhb1(arrayList, (byte) 0)).h(3, (a8b0) o7h.q0(upperBounds));
            return a8b0VarH == null ? g6b0VarE.p() : a8b0VarH;
        }
        if (!(kfgVarK instanceof ov30)) {
            hhg1.n("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((ov30) kfgVarK).getTypeParameters();
        ArrayList arrayList2 = new ArrayList(q7h.U(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((y0h1) it2.next()).g());
        }
        List upperBounds2 = y0h1Var.getUpperBounds();
        g6b0 g6b0VarE2 = kht.e(y0h1Var);
        a8b0 a8b0VarH2 = new l1h1(new qhb1(arrayList2, (byte) 0)).h(3, (a8b0) o7h.q0(upperBounds2));
        return a8b0VarH2 == null ? g6b0VarE2.p() : a8b0VarH2;
    }

    public static final ArrayList C(jo70 jo70Var) {
        List list = jo70Var.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ho70) obj).b.length() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((ho70) it.next()).a;
            arrayList2.add(new y3g(str, "spotify:search:podcasts-episodes:".concat(p4v0.b.g("%20", p4v0.a.f(str, svu0.d1)))));
        }
        return arrayList2;
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-701529063);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("v2_clear_search_button", qim0Var3);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new us21(function0, (byte) 18);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarN, null, gdxVarS, null, false, null, null, apo.r(-138811870, new nl41(str, (byte) 3), x340Var), x340Var, 48, 6, 984);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 19);
        }
    }

    public static final void b(zv31 zv31Var, Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1800305717);
        int i2 = (x340Var.g(zv31Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strN0 = cwl1.n0(2131951707, new Object[]{zv31Var.b.a}, x340Var);
            fpx fpxVar = fpx.c;
            boolean z = !zv31Var.d;
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new ugj(function0, (byte) 25);
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("row-context-menu-entry-point", bin.x(nim0.a, z, strN0, null, null, (Function0) objT, 12));
            boolean zG = x340Var.g(strN0) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new kjk(strN0, zv31Var, (byte) 15);
                x340Var.s0(objT2);
            }
            w0h1.a(fpxVar, isl.a, s161.a(qim0VarN, (iu30) objT2), 0L, 0L, false, x340Var, fpx.d | 48, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(zv31Var, function0, i, (byte) 18);
        }
    }

    public static final void c(String str, b0k b0kVar, int i) {
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1955907165);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            if (str != null) {
                x340Var.i0(-1390867561);
                qim0 qim0VarN = anm1.N("prompted.playlist.cover.image", i1p1.r(u291.d(nim0Var, 1.0f)));
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                eso1.e(Uri.parse(str), isl.a, u291.f(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, true, true, x340Var, 1600944, 54, 928);
                x340Var.r(true);
                b = 0;
                x340Var.r(false);
            } else {
                x340Var.i0(-1390380768);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                b = 0;
                t1c.a(anm1.N("prompted.playlist.cover.fallback.image", dug.f(qim0VarD, cbx.a(x340Var).d.b, d4o1.a)), x340Var, 0);
                x340Var.r(false);
            }
        } else {
            b = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9y0(str, i, b);
        }
    }

    public static final void d(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        byte b;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-913413390);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, cbx.b(x340Var).b.c, 2);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, 2131957018), uyn1.z(cbx.b(x340Var).b.d, 0.0f, 2, qim0Var3), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            String strO0 = cwl1.o0(x340Var, 2131957020);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hws(iu30Var, (byte) 20);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            cvx cvxVar3 = cbx.b(x340Var).b;
            kuo1.f(strO0, "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/", iu30Var2, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, x340Var, 0, 16);
            b = 1;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var, qim0Var2, i, b);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2133533558);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gra graVar = een.h;
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("allboarding_page_error", voo1.y(dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a), voo1.c));
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            String strO0 = cwl1.o0(x340Var, 2131952273);
            String strO1 = cwl1.o0(x340Var, 2131952272);
            String strO2 = cwl1.o0(x340Var, 2131952271);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ivw(function0, (byte) 27);
                x340Var.s0(objT);
            }
            jap1.l(null, null, strO0, strO1, strO2, new gbx(z50.c, (Function0) objT), null, null, x340Var, 0, 451);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function0, i, (byte) 9);
        }
    }

    public static final void f(n2c0 n2c0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-786008953);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(n2c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            irn1.u(null, apo.r(145121338, new vx90(es41VarC, n2c0Var, (byte) 5), x340Var), null, null, apo.r(1442881792, new kwa0(n2c0Var, es41VarC, iu30Var), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lwa0(n2c0Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void g(String str, String str2, String str3, long j, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(168276668);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str2) ? 32 : 16) | (b0kVar2.g(str3) ? 256 : 128) | (b0kVar2.f(j) ? 2048 : 1024) | (b0kVar2.i(iu30Var) ? 16384 : 8192);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar2).b.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, f, 16.0f, 0.0f, 8);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = jqa0.g;
                b0kVar2.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB2);
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
            uwo1.e(str, null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(5), null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2018);
            b0kVar2 = b0kVar2;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0VarB3 = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean z = (i2 & 57344) == 16384;
            Object objT2 = b0kVar2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new jwa0(iu30Var, (byte) 2);
                b0kVar2.s0(objT2);
            }
            kuo1.f(str2, str3, (iu30) objT2, qim0VarB3, j, b0kVar2, ((i2 >> 3) & 126) | ((i2 << 3) & 57344), 0);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rb9(str, str2, str3, j, iu30Var, i);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(874146777);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131957038);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).d;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = jqa0.h;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0Var, false, (iu30) objT), lee1Var, 0L, new a0e1(5), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 19);
        }
    }

    public static final void i(f7y0 f7y0Var, b0k b0kVar, int i) {
        mrx mrxVar;
        Function0 function0;
        f7y0 f7y0Var2 = f7y0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(213939864);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(f7y0Var2) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("prompted.playlist.share.list.row", u291.f(nim0Var, 1.0f));
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
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
            int iOrdinal = f7y0Var2.d.ordinal();
            if (iOrdinal == 0) {
                mrxVar = ltx.c;
            } else if (iOrdinal == 1) {
                mrxVar = mrx.c;
            } else if (iOrdinal == 2) {
                mrxVar = pkx.c;
            } else {
                if (iOrdinal != 3 && iOrdinal != 4) {
                    eg.o();
                    return;
                }
                mrxVar = mrx.c;
            }
            String str = f7y0Var2.b;
            String str2 = str.length() > 0 ? str : null;
            Uri uri = str2 != null ? Uri.parse(str2) : Uri.EMPTY;
            uri.getClass();
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0Var, 32.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarN2 = anm1.N("prompted.playlist.share.list.row.artwork", i1p1.q(qim0VarR, er31.b(4.0f)));
            as80 as80Var = mif1.P0;
            nux nuxVar = new nux(mrxVar, mrxVar);
            isl islVar = isl.a;
            mrx mrxVar2 = mrxVar;
            eso1.e(uri, islVar, qim0VarN2, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, true, false, x340Var, 1075314736, 6, 2488);
            cvx cvxVar = cbx.b(x340Var).b;
            wnb0 wnb0VarK = c13.k(nim0Var, 8.0f, x340Var, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarK);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Function0 function2 = function0;
            uwo1.e(f7y0Var.a, anm1.N("prompted.playlist.share.list.row.title", u291.f(nim0Var, 1.0f)), cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572912, 0, 1712);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 48);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            w0h1.a(mrxVar2, islVar, anm1.N("prompted.playlist.share.list.row.type.icon", u291.r(nim0Var, 12.0f)), cbx.a(x340Var).b.b, 0L, false, x340Var, 56, 48);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 2.0f));
            f7y0Var2 = f7y0Var;
            uwo1.e(f7y0Var2.c, anm1.N("prompted.playlist.share.list.row.artist", u291.f(nim0Var, 1.0f)), cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572912, 0, 1712);
            us71.m(x340Var, true, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y6w0(f7y0Var2, i, (byte) 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void j(s9y0 s9y0Var, qim0 qim0Var, xu30 xu30Var, xu30 xu30Var2, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        xu30 xu30Var3;
        int i4;
        xu30 xu30Var4;
        int i5;
        boolean z;
        xu30 xu30Var5;
        qim0 qim0Var3;
        xu30 xu30Var6;
        h311 h311VarV;
        qim0 qim0Var4;
        xu30 xu30Var7;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1803636262);
        j06 j06Var = x340Var.a;
        int i6 = (x340Var.g(s9y0Var) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i6 | (x340Var.g(qim0Var2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                xu30Var3 = xu30Var;
                i3 |= x340Var.i(xu30Var3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    xu30Var4 = xu30Var2;
                    if (x340Var.i(xu30Var4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    qim0Var4 = nim0.a;
                    if (i7 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i8 != 0) {
                        xu30Var7 = paj.a;
                    } else {
                        xu30Var7 = xu30Var3;
                    }
                    if (i4 != 0) {
                        xu30Var4 = paj.b;
                    }
                    qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                    graVar = een.h;
                    gfh0VarC = t1c.c(graVar, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z2 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z2) {
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
                    xu30Var7.invoke(apo.r(-1477748975, new q9y0(s9y0Var, (byte) 0), x340Var), x340Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
                    qim0 qim0VarD2 = u291.d(qim0Var4, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarX = uyn1.x(qim0VarD2, 8.0f);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int i9 = i3;
                    xu30 xu30Var8 = xu30Var7;
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    xu30Var4.invoke(apo.r(-407020329, new q9y0(s9y0Var, (byte) 1), x340Var), x340Var, Integer.valueOf(((i9 >> 6) & 112) | 6));
                    x340Var.r(true);
                    x340Var.r(true);
                    xu30Var5 = xu30Var8;
                } else {
                    x340Var.b0();
                    xu30Var5 = xu30Var3;
                }
                qim0Var3 = qim0Var2;
                xu30Var6 = xu30Var4;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m82(i, s9y0Var, qim0Var3, xu30Var5, xu30Var6, i2, (byte) 4);
                }
            }
            i3 |= 3072;
            xu30Var4 = xu30Var2;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i8 != 0) {
                    xu30Var7 = paj.a;
                } else {
                    xu30Var7 = xu30Var3;
                }
                if (i4 != 0) {
                    xu30Var4 = paj.b;
                }
                qim0 qim0VarD3 = u291.d(qim0Var2, 1.0f);
                graVar = een.h;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarD3);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z2 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar7);
                nko1.F(x340Var);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar8);
                xu30Var7.invoke(apo.r(-1477748975, new q9y0(s9y0Var, (byte) 0), x340Var), x340Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
                qim0 qim0VarD4 = u291.d(qim0Var4, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarX2 = uyn1.x(qim0VarD4, 8.0f);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int i10 = i3;
                xu30 xu30Var9 = xu30Var7;
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar5);
                nko1.H(xos0VarM3, x340Var, lljVar6);
                x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar8);
                xu30Var4.invoke(apo.r(-407020329, new q9y0(s9y0Var, (byte) 1), x340Var), x340Var, Integer.valueOf(((i10 >> 6) & 112) | 6));
                x340Var.r(true);
                x340Var.r(true);
                xu30Var5 = xu30Var9;
            } else {
                x340Var.b0();
                xu30Var5 = xu30Var3;
            }
            qim0Var3 = qim0Var2;
            xu30Var6 = xu30Var4;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m82(i, s9y0Var, qim0Var3, xu30Var5, xu30Var6, i2, (byte) 4);
            }
        }
        i3 |= 384;
        xu30Var3 = xu30Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                xu30Var4 = xu30Var2;
                if (x340Var.i(xu30Var4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i8 != 0) {
                    xu30Var7 = paj.a;
                } else {
                    xu30Var7 = xu30Var3;
                }
                if (i4 != 0) {
                    xu30Var4 = paj.b;
                }
                qim0 qim0VarD5 = u291.d(qim0Var2, 1.0f);
                graVar = een.h;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarD5);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z2 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar11);
                nko1.F(x340Var);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar12);
                xu30Var7.invoke(apo.r(-1477748975, new q9y0(s9y0Var, (byte) 0), x340Var), x340Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
                qim0 qim0VarD6 = u291.d(qim0Var4, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarX3 = uyn1.x(qim0VarD6, 8.0f);
                gfh0 gfh0VarC4 = t1c.c(graVar, false);
                int i11 = i3;
                xu30 xu30Var10 = xu30Var7;
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarX3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC4, x340Var, lljVar9);
                nko1.H(xos0VarM4, x340Var, lljVar10);
                x0d.q(iHashCode4, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar12);
                xu30Var4.invoke(apo.r(-407020329, new q9y0(s9y0Var, (byte) 1), x340Var), x340Var, Integer.valueOf(((i11 >> 6) & 112) | 6));
                x340Var.r(true);
                x340Var.r(true);
                xu30Var5 = xu30Var10;
            } else {
                x340Var.b0();
                xu30Var5 = xu30Var3;
            }
            qim0Var3 = qim0Var2;
            xu30Var6 = xu30Var4;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m82(i, s9y0Var, qim0Var3, xu30Var5, xu30Var6, i2, (byte) 4);
            }
        }
        i3 |= 3072;
        xu30Var4 = xu30Var2;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i7 != 0) {
                qim0Var2 = qim0Var4;
            }
            if (i8 != 0) {
                xu30Var7 = paj.a;
            } else {
                xu30Var7 = xu30Var3;
            }
            if (i4 != 0) {
                xu30Var4 = paj.b;
            }
            qim0 qim0VarD7 = u291.d(qim0Var2, 1.0f);
            graVar = een.h;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarD7);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z2 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar13 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar13);
            llj lljVar14 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            llj lljVar15 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar15);
            nko1.F(x340Var);
            llj lljVar16 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar16);
            xu30Var7.invoke(apo.r(-1477748975, new q9y0(s9y0Var, (byte) 0), x340Var), x340Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
            qim0 qim0VarD8 = u291.d(qim0Var4, 1.0f);
            uwr uwrVar4 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarX4 = uyn1.x(qim0VarD8, 8.0f);
            gfh0 gfh0VarC5 = t1c.c(graVar, false);
            int i12 = i3;
            xu30 xu30Var11 = xu30Var7;
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC5, x340Var, lljVar13);
            nko1.H(xos0VarM5, x340Var, lljVar14);
            x0d.q(iHashCode5, x340Var, lljVar15, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar16);
            xu30Var4.invoke(apo.r(-407020329, new q9y0(s9y0Var, (byte) 1), x340Var), x340Var, Integer.valueOf(((i12 >> 6) & 112) | 6));
            x340Var.r(true);
            x340Var.r(true);
            xu30Var5 = xu30Var11;
        } else {
            x340Var.b0();
            xu30Var5 = xu30Var3;
        }
        qim0Var3 = qim0Var2;
        xu30Var6 = xu30Var4;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m82(i, s9y0Var, qim0Var3, xu30Var5, xu30Var6, i2, (byte) 4);
        }
    }

    public static final void k(String str, b0k b0kVar, int i) {
        byte b;
        qim0 qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1085334517);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
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
            if (str != null) {
                x340Var.i0(542800728);
                Uri uri = Uri.parse(str);
                qim0 qim0VarD2 = u291.d(qim0Var2, 1.0f);
                cbx.a.getClass();
                qim0Var = qim0Var2;
                eso1.e(uri, isl.a, qim0VarD2, (p3v) null, (zvx) null, uwr.c(), mif1.V0, (tl3) null, (ColorFilter) null, (qux) null, true, true, x340Var, 1600944, 54, 896);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                x340Var.i0(543195699);
                x340Var.r(false);
            }
            t1c.a(dug.f(u291.d(qim0Var, 1.0f), u7h.b(u7h.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var, 6);
            b = 1;
            x340Var.r(true);
        } else {
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9y0(str, i, b);
        }
    }

    public static final void l(s9y0 s9y0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2003792198);
        int i2 = (x340Var.g(s9y0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            kiv kivVar = t4k.h;
            wat watVar = (wat) x340Var.k(kivVar);
            boolean zG = x340Var.g(watVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new xat(watVar.h(), 1.0f);
                x340Var.s0(objT);
            }
            mod.b(kivVar.a((wat) objT), apo.r(-221719418, new q9y0(s9y0Var, (byte) 2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q9y0(s9y0Var, i);
        }
    }

    public static final void m(y7e1 y7e1Var, String str, String str2, lz20 lz20Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1234086267);
        int i2 = i | (b0kVar3.g(y7e1Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.g(lz20Var) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | (b0kVar3.i(function1) ? 131072 : 65536) | 1572864;
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(b0kVar3).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarJ, cr31Var);
            long jA = cbx.a(b0kVar3).a.b.a();
            avw0 avw0Var = cbx.b(b0kVar3).c;
            qim0 qim0VarN = anm1.N("v2_search_field_text_input", dug.f(d1u.E(1.0f, jA, qim0VarQ, cr31Var), cbx.a(b0kVar3).a.a.a(), d4o1.a));
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == obj) {
                objT = new sc21(str, (byte) 20);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarP = vby0.p(s161.b(qim0VarN, false, (iu30) objT), lz20Var);
            lee1 lee1Var = cbx.d(b0kVar3).g;
            long j = cbx.a(b0kVar3).b.a;
            long j2 = cbx.a(b0kVar3).b.a;
            long j3 = cbx.a(b0kVar3).b.d;
            long j4 = cbx.a(b0kVar3).b.b;
            long j5 = u7h.j;
            zxx zxxVar = new zxx(j, j2, j4, j3, j5, j5, cbx.a(b0kVar3).b.c, 0L, 896);
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarJ = uyn1.j(16.0f, 0.0f, 0.0f, 0.0f, 14);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 3, 119);
            boolean z2 = (57344 & i2) == 16384;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == obj) {
                objT2 = new uy5(function0, (byte) 5);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            rwo1.b(y7e1Var, qim0VarP, null, str, tej.a, apo.r(107460378, new hl11(y7e1Var, str2, function1, (byte) 19), b0kVar3), false, false, null, lee1Var, kua0Var, (yta0) objT2, d6e1.b, null, null, null, null, zzq0VarJ, 8.0f, false, zxxVar, b0kVar2, (i2 & 14) | 221184 | ((i2 << 6) & 7168), 390, 647620);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) y7e1Var, (Object) str, (Object) str2, (Object) lz20Var, function0, function1, qim0Var2, i, (byte) 14);
        }
    }

    public static final void n(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2043473912);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            esx esxVar = esx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0Var = nim0.a;
            w0h1.a(esxVar, isl.a, u291.r(qim0Var, 16.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, esx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 20);
        }
    }

    public static String o(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strP;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strP = "null";
            } else {
                try {
                    strP = obj.toString();
                } catch (Exception e) {
                    String strF = f4i1.f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strF), (Throwable) e);
                    strP = cy30.p("<", strF, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strP;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final qx81 p(a8b0 a8b0Var) {
        qx81 qx81VarW0 = a8b0Var.w0();
        qx81 qx81Var = qx81VarW0 instanceof qx81 ? qx81VarW0 : null;
        if (qx81Var != null) {
            return qx81Var;
        }
        hhg1.o(a8b0Var, "This is should be simple type: ");
        return null;
    }

    public static final qhb1 q(beg begVar, beg begVar2) {
        begVar.n().size();
        begVar2.n().size();
        List listN = begVar.n();
        ArrayList arrayList = new ArrayList(q7h.U(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0h1) it.next()).g());
        }
        List listN2 = begVar2.n();
        ArrayList arrayList2 = new ArrayList(q7h.U(listN2, 10));
        Iterator it2 = listN2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new f1h1(1, ((y0h1) it2.next()).m()));
        }
        return new qhb1(sqg0.T(o7h.v1(arrayList, arrayList2)), (byte) 1);
    }

    public static final void r(ohd ohdVar, qku qkuVar) {
        ohdVar.v(new zku(qkuVar));
    }

    public static final String s(chr0 chr0Var) {
        int iOrdinal = chr0Var.ordinal();
        if (iOrdinal == 0) {
            return "prompted_playlists";
        }
        if (iOrdinal == 1) {
            return "bluejay";
        }
        if (iOrdinal == 2) {
            return "prompted_playlists";
        }
        eg.o();
        return null;
    }

    public static final String t(chr0 chr0Var) {
        int iOrdinal = chr0Var.ordinal();
        if (iOrdinal == 0) {
            return "prompted_playlists";
        }
        if (iOrdinal == 1) {
            return "bluejay_start";
        }
        if (iOrdinal == 2) {
            return "prompted_playlists";
        }
        eg.o();
        return null;
    }

    public static final ohd u(lnm lnmVar) {
        Unsafe unsafe;
        ohd ohdVar;
        ohd ohdVar2;
        if (!(lnmVar instanceof vfu)) {
            return new ohd(1, lnmVar);
        }
        vfu vfuVar = (vfu) lnmVar;
        long j = vfu.i;
        loop0: while (true) {
            unsafe = avg.a;
            Object objectVolatile = unsafe.getObjectVolatile(vfuVar, j);
            jm jmVar = hr80.b;
            ohdVar = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(vfuVar, j, jmVar);
                ohdVar2 = null;
                break;
            }
            if (objectVolatile instanceof ohd) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vfu.h;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(vfuVar, objectVolatile, jmVar)) {
                        ohdVar2 = (ohd) objectVolatile;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(vfuVar) == objectVolatile);
            } else if (objectVolatile != jmVar && !(objectVolatile instanceof Throwable)) {
                eg.m(f4i1.d(objectVolatile, "Inconsistent state "));
                return null;
            }
        }
        if (ohdVar2 != null) {
            long j2 = ohd.i;
            Object objectVolatile2 = unsafe.getObjectVolatile(ohdVar2, j2);
            if (!(objectVolatile2 instanceof lyh) || ((lyh) objectVolatile2).d == null) {
                unsafe.putIntVolatile(ohdVar2, ohd.g, 536870911);
                unsafe.putObjectVolatile(ohdVar2, j2, ra0.a);
                ohdVar = ohdVar2;
            } else {
                ohdVar2.m();
            }
            if (ohdVar != null) {
                return ohdVar;
            }
        }
        return new ohd(2, lnmVar);
    }

    public static final void v(ohd ohdVar, bgd bgdVar) {
        ohdVar.v(bgdVar);
    }

    public static final qim0 w(qim0 qim0Var, iu30 iu30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
        iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
        u85 u85Var = (erl1) x340Var.k(szf0.b);
        if (u85Var == null) {
            x340Var.i0(-241884180);
            WeakHashMap weakHashMap = osl1.x;
            u85Var = lhc.g(x340Var).g;
        } else {
            x340Var.i0(-241885792);
        }
        x340Var.r(false);
        return qim0Var.then(new i5t0(view, iac0Var, u85Var.d((wat) x340Var.k(t4k.h)), iu30Var));
    }

    public static final qx81 x(qx81 qx81Var, List list, e0h1 e0h1Var) {
        if (list.isEmpty() && e0h1Var == qx81Var.s0()) {
            return qx81Var;
        }
        if (list.isEmpty()) {
            return qx81Var.B0(e0h1Var);
        }
        if (!(qx81Var instanceof wjz)) {
            return y3o1.i0(list, e0h1Var, qx81Var.t0(), qx81Var.u0());
        }
        wjz wjzVar = (wjz) qx81Var;
        h0h1 h0h1Var = wjzVar.b;
        wiz wizVar = wjzVar.c;
        zjz zjzVar = wjzVar.d;
        boolean z = wjzVar.f;
        String[] strArr = wjzVar.g;
        return new wjz(h0h1Var, wizVar, zjzVar, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static a8b0 y(a8b0 a8b0Var, List list, fg5 fg5Var, int i) {
        if ((i & 2) != 0) {
            fg5Var = a8b0Var.getAnnotations();
        }
        if ((list.isEmpty() || list == a8b0Var.r0()) && fg5Var == a8b0Var.getAnnotations()) {
            return a8b0Var;
        }
        e0h1 e0h1VarS0 = a8b0Var.s0();
        if ((fg5Var instanceof lf20) && ((lf20) fg5Var).isEmpty()) {
            fg5Var = rzs0.g;
        }
        e0h1 e0h1VarT = prn1.t(e0h1VarS0, fg5Var);
        dq20 dq20VarW0 = a8b0Var.w0();
        if (dq20VarW0 instanceof dq20) {
            dq20 dq20Var = dq20VarW0;
            return y3o1.Z(x(dq20Var.b, list, e0h1VarT), x(dq20Var.c, list, e0h1VarT));
        }
        if (dq20VarW0 instanceof qx81) {
            return x((qx81) dq20VarW0, list, e0h1VarT);
        }
        eg.o();
        return null;
    }

    public static /* synthetic */ qx81 z(qx81 qx81Var, List list, e0h1 e0h1Var, int i) {
        if ((i & 1) != 0) {
            list = qx81Var.r0();
        }
        if ((i & 2) != 0) {
            e0h1Var = qx81Var.s0();
        }
        return x(qx81Var, list, e0h1Var);
    }
}
