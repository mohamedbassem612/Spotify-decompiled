package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class cvd1 {
    public static final kiv a = new kiv(orc1.N0, (byte) 0);
    public static final float b = 40.0f;
    public static final float c = 280.0f;

    public static final void a(sud1 sud1Var, kly0 kly0Var, i8h1 i8h1Var, gw10 gw10Var, boolean z, String str, b0k b0kVar, int i) {
        i8h1 i8h1Var2;
        gw10 gw10Var2;
        boolean z2;
        b0k b0kVar2;
        h311 h311VarV;
        yud1 yud1Var;
        Object next;
        int i2;
        List list = sud1Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-678407944);
        int i3 = i | (b0kVar3.g(sud1Var) ? 4 : 2) | (b0kVar3.i(kly0Var) ? 32 : 16) | (b0kVar3.i(i8h1Var) ? 256 : 128) | (b0kVar3.i(gw10Var) ? 2048 : 1024) | (b0kVar3.h(z) ? 16384 : 8192) | (b0kVar3.g(str) ? 131072 : 65536);
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            List list2 = list;
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!nhc1.R(((dvd1) next).a, "_general", false));
            dvd1 dvd1Var = (dvd1) next;
            if (dvd1Var == null) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    yud1Var = new yud1(sud1Var, kly0Var, i8h1Var, gw10Var, z, str, i, (byte) 1);
                }
            } else {
                i8h1Var2 = i8h1Var;
                gw10Var2 = gw10Var;
                z2 = z;
                boolean zG = b0kVar3.g(kly0Var) | b0kVar3.g(i8h1Var2) | b0kVar3.g(gw10Var2);
                Object objT = b0kVar3.T();
                if (zG || objT == fkj0.X) {
                    objT = new ogl(kly0Var, i8h1Var2, gw10Var2);
                    b0kVar3.s0(objT);
                }
                ogl oglVar = (ogl) objT;
                Iterator it2 = list2.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    List list3 = ((dvd1) it2.next()).e;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it3 = list3.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            if (((ct10) it3.next()).e && (i2 = i2 + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    i4 += i2;
                }
                lgl lglVar = new lgl(dvd1Var, i4, z2, str);
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                otw.c(oglVar, lglVar, uyn1.z(16.0f, 0.0f, 2, qim0VarF), (ipb1) null, b0kVar2, 0, 8);
            }
            h311VarV.d = yud1Var;
        }
        i8h1Var2 = i8h1Var;
        gw10Var2 = gw10Var;
        z2 = z;
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            yud1Var = new yud1(sud1Var, kly0Var, i8h1Var2, gw10Var2, z2, str, i, (byte) 0);
            h311VarV.d = yud1Var;
        }
    }

    public static final void b(lgl lglVar, kly0 kly0Var, i8h1 i8h1Var, gw10 gw10Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z;
        float f;
        String str;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1711593050);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(lglVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(kly0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(i8h1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(gw10Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            dvd1 dvd1Var = lglVar.a;
            List list = dvd1Var.g;
            String str2 = dvd1Var.a;
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new j5c();
                b0kVar3.s0(objT);
            }
            j5c j5cVar = (j5c) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            az20 az20Var = (az20) b0kVar3.k(t4k.i);
            icr0 icr0Var = (icr0) b0kVar3.k(a);
            es41 es41Var = icr0Var != null ? icr0Var.a : null;
            boolean zG = b0kVar3.g(str2);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                n2m0 n2m0Var = new n2m0(new brl0((byte) 13), str2);
                b0kVar3.s0(n2m0Var);
                objT3 = n2m0Var;
            }
            n2m0 n2m0Var2 = (n2m0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            ven0 ven0VarH = rwq.h(gw10Var.l, b0kVar3, 0);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            es41 es41Var2 = es41Var;
            qim0 qim0VarM = m(qim0VarF, er31.b(16.0f), cbx.a(b0kVar3).a.d, b0kVar3.k(t4k.n) == flb0.b);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarN = anm1.N("consolidated_notes_card", uyn1.B(qim0VarM, 0.0f, 16.0f, 0.0f, 8.0f, 5));
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
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
            int i3 = lglVar.b;
            boolean z2 = lglVar.c;
            String str3 = lglVar.d;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            int i4 = (i2 << 3) & 896;
            c(dvd1Var, i3, kly0Var, z2, str3, aym.n(uyn1.z(16.0f, 0.0f, 2, nim0Var), j5cVar), b0kVar3, i4);
            if (list.isEmpty() || ((Boolean) ven0VarH.getValue()).booleanValue()) {
                b0kVar2 = b0kVar3;
                z = false;
                b0kVar2.i0(756459521);
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                f = 16.0f;
                x0d.s(nim0Var, 16.0f, b0kVar2, false);
            } else {
                b0kVar3.i0(755775475);
                cvx cvxVar5 = cbx.b(b0kVar3).b;
                op71.g(b0kVar3, u291.h(nim0Var, 8.0f));
                boolean z3 = (i2 & 57344) == 16384;
                Object objT5 = b0kVar3.T();
                if (z3 || objT5 == m4cVar) {
                    objT5 = new iuy0(iu30Var, (byte) 22);
                    b0kVar3.s0(objT5);
                }
                vu30 vu30Var = (vu30) objT5;
                cvx cvxVar6 = cbx.b(b0kVar3).b;
                zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                boolean zI = b0kVar3.i(i8h1Var) | b0kVar3.i(n2m0Var2);
                Object objT6 = b0kVar3.T();
                if (zI || objT6 == m4cVar) {
                    objT6 = new sdb1(i8h1Var, n2m0Var2, (byte) 18);
                    b0kVar3.s0(objT6);
                }
                h(list, vu30Var, null, zzq0VarH, (vu30) objT6, b0kVar3, 0);
                b0kVar2 = b0kVar3;
                cvx cvxVar7 = cbx.b(b0kVar2).b;
                z = false;
                x0d.s(nim0Var, 12.0f, b0kVar2, false);
                f = 16.0f;
            }
            cvx cvxVar8 = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, nim0Var);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            String str4 = lglVar.d;
            boolean zI2 = b0kVar2.i(az20Var) | ((i2 & 57344) == 16384 ? true : z) | b0kVar2.i(ven0Var) | b0kVar2.i(c9nVar) | b0kVar2.i(es41Var2) | b0kVar2.i(j5cVar);
            Object objT7 = b0kVar2.T();
            if (zI2 || objT7 == m4cVar) {
                str = str4;
                ndp0 ndp0Var = new ndp0(az20Var, iu30Var, c9nVar, ven0Var, es41Var2, j5cVar, (byte) 7);
                b0kVar2.s0(ndp0Var);
                objT7 = ndp0Var;
            } else {
                str = str4;
            }
            b0kVar3 = b0kVar2;
            d(dvd1Var, zBooleanValue, kly0Var, str, (Function0) objT7, qim0VarZ, b0kVar3, i4);
            b0kVar3.r(true);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(lglVar, kly0Var, i8h1Var, false, gw10Var, iu30Var, i, (byte) 9);
        }
    }

    public static final void c(dvd1 dvd1Var, int i, kly0 kly0Var, boolean z, String str, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        kly0 kly0Var2;
        boolean z2;
        String str2;
        String str3 = dvd1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(822189766);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(dvd1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            kly0Var2 = kly0Var;
            i3 |= x340Var.i(kly0Var2) ? 256 : 128;
        } else {
            kly0Var2 = kly0Var;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= x340Var.h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i2 & 24576) == 0) {
            str2 = str;
            i3 |= x340Var.g(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean zG = x340Var.g(str3);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = (zv10) kly0Var2.get();
                x340Var.s0(objT);
            }
            zv10 zv10Var = (zv10) objT;
            zv10Var.getClass();
            otw.c(zv10Var, new vv10(new tv10(str3), "", (Long) null, false, dvd1Var.e.size(), i4, str2, dvd1Var.f, dvd1Var.c, z2, 12), qim0Var, (ipb1) null, x340Var, (i3 >> 9) & 896, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lkf(dvd1Var, i, kly0Var2, z, str, qim0Var, i2);
        }
    }

    public static final void d(dvd1 dvd1Var, boolean z, kly0 kly0Var, String str, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        kly0 kly0Var2;
        String str2;
        boolean z2;
        Function0 function1;
        h311 h311VarV;
        zud1 zud1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1887215359);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? (x340Var.g(dvd1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            kly0Var2 = kly0Var;
            i2 |= x340Var.i(kly0Var2) ? 256 : 128;
        } else {
            kly0Var2 = kly0Var;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            List list = dvd1Var.e;
            List listD1 = z ? list : o7h.d1(list, 1);
            boolean z3 = list.size() > 1;
            if (listD1.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    zud1Var = new zud1(dvd1Var, z, kly0Var2, str2, function0, qim0Var, i, (byte) 0);
                }
            } else {
                function1 = function0;
                z2 = z;
                qim0 qim0VarD = o0c.d(u291.f(qim0Var, 1.0f), (ni20) null, 3);
                era eraVar = een.P0;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
                boolean z4 = z3;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z5 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z5) {
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
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                x340Var.i0(1288720581);
                int i4 = 0;
                for (Object obj : listD1) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ct10 ct10Var = (ct10) obj;
                    boolean zG = x340Var.g(ct10Var.a);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = (zv10) kly0Var.get();
                        x340Var.s0(objT);
                    }
                    zv10 zv10Var = (zv10) objT;
                    String str3 = ct10Var.a;
                    boolean zE = x340Var.e(i4);
                    Object objT2 = x340Var.T();
                    if (zE || objT2 == m4cVar) {
                        objT2 = new sl11(i4, (byte) 14);
                        x340Var.s0(objT2);
                    }
                    dgo1.c(str3, (iu30) objT2, apo.r(-1939074375, new avd1(zv10Var, ct10Var, dvd1Var, str, (byte) 0), x340Var), x340Var, 384);
                    i4 = i5;
                }
                x340Var.r(false);
                x340Var.r(true);
                if (z4) {
                    x340Var.i0(363015293);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 4.0f));
                    g(((i3 >> 3) & 14) | ((i3 >> 9) & 112), function1, x340Var, z2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(363163287);
                    x340Var.r(false);
                }
                x340Var.r(true);
            }
            h311VarV.d = zud1Var;
        }
        z2 = z;
        function1 = function0;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            zud1Var = new zud1(dvd1Var, z2, kly0Var, str, function1, qim0Var, i, (byte) 1);
            h311VarV.d = zud1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [int] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void e(sud1 sud1Var, xsq xsqVar, d0r d0rVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object next;
        boolean z;
        Function0 function0;
        ?? r1;
        float f;
        Function0 function1;
        boolean z2;
        boolean z3;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        List list = sud1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1003603370);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(sud1Var) ? 4 : 2) | (x340Var.g(xsqVar) ? 32 : 16) | (x340Var.i(d0rVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            List list2 = list;
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!nhc1.R(((dvd1) next).a, "_overview", false));
            dvd1 dvd1Var = (dvd1) next;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                dvd1 dvd1Var2 = (dvd1) next2;
                Iterator it3 = it2;
                j06 j06Var2 = j06Var;
                if (!nhc1.R(dvd1Var2.a, "_general", false) && !nhc1.R(dvd1Var2.a, "_overview", false)) {
                    arrayList.add(next2);
                }
                it2 = it3;
                j06Var = j06Var2;
            }
            j06 j06Var3 = j06Var;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!((dvd1) obj).d.isEmpty()) {
                    arrayList2.add(obj);
                }
            }
            if (dvd1Var == null && arrayList2.isEmpty()) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new juc1((Object) sud1Var, (Object) xsqVar, (Object) d0rVar, i, (byte) 5);
                    return;
                }
                return;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarM = m(qim0VarZ, er31.b(16.0f), cbx.a(x340Var).a.d, x340Var.k(t4k.n) == flb0.b);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("consolidated_review_card", uyn1.x(qim0VarM, 16.0f));
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var3 == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z4) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            String str = dvd1Var != null ? dvd1Var.b : null;
            if (str == null) {
                x340Var.i0(129098912);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(129098913);
                i(str, cbx.d(x340Var).d, x340Var, 0);
                x340Var.r(false);
            }
            if (dvd1Var == null) {
                x340Var.i0(129225020);
                x340Var.r(z);
                r1 = z;
                function0 = function2;
                f = 1.0f;
            } else {
                x340Var.i0(129225021);
                int i3 = i2 << 3;
                function0 = function2;
                r1 = 0;
                f = 1.0f;
                j(dvd1Var.a, mqo1.A(dvd1Var.d), xsqVar, d0rVar, 2, x340Var, (i3 & 7168) | (i3 & 896) | 24576, 0);
                x340Var.r(false);
            }
            x340Var.i0(4180151);
            ?? r11 = r1;
            for (Object obj2 : arrayList2) {
                int i4 = r11 + 1;
                if (r11 < 0) {
                    p7h.T();
                    throw null;
                }
                dvd1 dvd1Var3 = (dvd1) obj2;
                qim0 qim0VarF2 = u291.f(qim0Var3, f);
                mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, (int) r1);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function1 = function0;
                    x340Var.l(function1);
                } else {
                    function1 = function0;
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                if (r11 > 0 || dvd1Var != null) {
                    x340Var.i0(42892912);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    z2 = false;
                    z3 = true;
                    rqo1.g((int) r1, (int) r1, x340Var, uyn1.z(0.0f, 8.0f, 1, qim0Var3));
                    x340Var.r((boolean) r1);
                } else {
                    x340Var.i0(43000544);
                    x340Var.r((boolean) r1);
                    z2 = false;
                    z3 = true;
                }
                String str2 = dvd1Var3.b;
                if (str2 == null) {
                    x340Var.i0(43033093);
                    x340Var.r((boolean) r1);
                } else {
                    x340Var.i0(43033094);
                    uwr uwrVar3 = cbx.a;
                    i(str2, cbx.d(x340Var).e, x340Var, r1);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    x0d.s(qim0Var3, 8.0f, x340Var, (boolean) r1);
                }
                int i5 = i2 << 3;
                function0 = function1;
                j(dvd1Var3.a, mqo1.A(dvd1Var3.d), xsqVar, d0rVar, 3, x340Var, (i5 & 896) | 24576 | (i5 & 7168), 0);
                x340Var.r(z3);
                r11 = i4;
                f = 1.0f;
            }
            x340Var.r((boolean) r1);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new bvd1(i, (Object) sud1Var, (Object) xsqVar, (Object) d0rVar, (Object) qim0Var2, (byte) 0);
        }
    }

    public static final void f(int i, String str, b0k b0kVar, iu30 iu30Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-313876480);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = eyo1.y(str, new b1c1(iu30Var, (byte) 5));
                b0kVar3.s0(objT);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).m;
            long j = cbx.a(b0kVar3).b.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            uwo1.d((af5) objT, j, uyn1.z(16.0f, 0.0f, 2, nim0.a), lee1Var, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4080);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qgd(str, iu30Var, i, (byte) 14);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        char c2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(697407316);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = z ? 2131963097 : 2131963095;
            String string = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getString(z ? 2131963098 : 2131963096);
            qlx qlxVar = z ? qlx.c : mlx.c;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.b, een.Z, x340Var, 0);
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
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                c2 = 7;
                objT = new uuc1(function0, (byte) 7);
                x340Var.s0(objT);
            } else {
                c2 = 7;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            boolean zG = x340Var.g(string);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new hqa1(string, (byte) 18);
                x340Var.s0(objT2);
            }
            foo1.c(gbxVar, ldx.c, anm1.N("consolidated_toggle_button", s161.b(nim0Var, false, (iu30) objT2)), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(667181879, new q4f(i3, qlxVar, (byte) 3), x340Var), x340Var, 0, 48, 2008);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u2y((byte) 7, i, function0, z);
        }
    }

    public static final void h(List list, vu30 vu30Var, qim0 qim0Var, zzq0 zzq0Var, vu30 vu30Var2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1186702204);
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | 384 | (x340Var.i(zzq0Var) ? 2048 : 1024) | (x340Var.i(vu30Var2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = o7h.j0(list);
                x340Var.s0(objT);
            }
            List list2 = (List) objT;
            qim0 qim0VarN = anm1.N("prompt_suggestion_chips", u291.f(qim0Var3, 1.0f));
            boolean zG = ((57344 & i2) == 16384) | x340Var.g(list2) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = new rsc1(list2, vu30Var2, vu30Var, (byte) 5);
                x340Var.s0(objT2);
            }
            too1.b(qim0VarN, (xtb0) null, zzq0Var, (iu30) objT2, x340Var, (i2 >> 3) & 896, 2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(list, vu30Var, qim0Var2, zzq0Var, vu30Var2, i, (byte) 26);
        }
    }

    public static final void i(String str, lee1 lee1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(997995156);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(lee1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarJ = u291.j(b, 0.0f, 2, u291.f(nim0Var, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
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
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = pod1.S0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(nim0Var, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 & 14) | ((i2 << 3) & 896), 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(str, lee1Var, i, (byte) 19);
        }
    }

    public static final void j(String str, c380 c380Var, xsq xsqVar, d0r d0rVar, int i, b0k b0kVar, int i2, int i3) {
        c380 c380Var2;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1693683985);
        int i5 = 4;
        int i6 = (i2 & 6) == 0 ? (x340Var.g(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            c380Var2 = c380Var;
            i6 |= x340Var.g(c380Var2) ? 32 : 16;
        } else {
            c380Var2 = c380Var;
        }
        if ((i2 & 384) == 0) {
            i6 |= (i2 & 512) == 0 ? x340Var.g(xsqVar) : x340Var.i(xsqVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= x340Var.i(d0rVar) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i6 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i6 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 16384 : 8192;
        }
        if (x340Var.Y(i6 & 1, (i6 & 9363) != 9362)) {
            i4 = i7 != 0 ? 1 : i;
            int i8 = 0;
            for (Object obj : c380Var2) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    p7h.T();
                    throw null;
                }
                evd1 evd1Var = (evd1) obj;
                boolean zE = ((i6 & 14) == i5) | x340Var.e(i8);
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    fns fnsVar = igu.a;
                    b3s b3sVar = b3s.c;
                    objT = new svd1(d0rVar);
                    x340Var.s0(objT);
                }
                int i10 = i8;
                otw.c((svd1) objT, new lvd1(i8 == 0 ? str : l1d.k(i8, str, "|"), evd1Var.a, evd1Var.b, evd1Var.c, i4), (qim0) null, (ipb1) null, x340Var, 0, 12);
                if (i10 < p7h.L(c380Var2)) {
                    x340Var.i0(1360279601);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    x0d.s(nim0.a, 16.0f, x340Var, false);
                } else {
                    x340Var.i0(1360357442);
                    x340Var.r(false);
                }
                i8 = i9;
                i5 = 4;
            }
        } else {
            x340Var.b0();
            i4 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kih(str, c380Var2, xsqVar, d0rVar, i4, i2, i3);
        }
    }

    public static final void k(c380 c380Var, xsq xsqVar, d0r d0rVar, kly0 kly0Var, i8h1 i8h1Var, boolean z, boolean z2, String str, b0k b0kVar, int i) {
        x340 x340Var;
        j5c j5cVar;
        long j;
        List listM;
        m4c m4cVar;
        qim0 qim0Var;
        Throwable th;
        x340 x340Var2;
        int i2;
        List listD1;
        boolean z3;
        qim0 qim0Var2;
        int i3;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        era eraVar = een.P0;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1599885693);
        j06 j06Var = x340Var3.a;
        int i4 = i | (x340Var3.g(c380Var) ? 4 : 2) | (x340Var3.g(xsqVar) ? 32 : 16) | (x340Var3.i(d0rVar) ? 256 : 128) | (x340Var3.i(kly0Var) ? 2048 : 1024) | (x340Var3.i(i8h1Var) ? 16384 : 8192) | (x340Var3.h(z) ? 131072 : 65536) | (x340Var3.h(z2) ? 1048576 : 524288) | (x340Var3.g(str) ? 8388608 : 4194304);
        if (x340Var3.Y(i4 & 1, (i4 & 4793491) != 4793490)) {
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                dvd1 dvd1Var = (dvd1) it.next();
                String str2 = dvd1Var.a;
                List list = dvd1Var.e;
                boolean zG = x340Var3.g(str2);
                Object objT = x340Var3.T();
                if (zG || objT == m4cVar2) {
                    n2m0 n2m0Var = new n2m0(new brl0((byte) 13), str2);
                    x340Var3.s0(n2m0Var);
                    objT = n2m0Var;
                }
                n2m0 n2m0Var2 = (n2m0) objT;
                cr31 cr31VarB = er31.b(16.0f);
                Object objT2 = x340Var3.T();
                if (objT2 == m4cVar2) {
                    objT2 = new j5c();
                    x340Var3.s0(objT2);
                }
                j5c j5cVar2 = (j5c) objT2;
                Object objT3 = x340Var3.T();
                if (objT3 == m4cVar2) {
                    objT3 = qxd0.M(o6x.a, x340Var3);
                    x340Var3.s0(objT3);
                }
                c9n c9nVar = (c9n) objT3;
                long jB = u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14);
                if (x340Var3.k(t4k.n) == flb0.b) {
                    long j2 = u7h.j;
                    j5cVar = j5cVar2;
                    listM = p7h.M(new u7h[]{new u7h(j2), new u7h(jB)});
                    j = j2;
                } else {
                    j5cVar = j5cVar2;
                    u7h u7hVar = new u7h(jB);
                    j = u7h.j;
                    listM = p7h.M(new u7h[]{u7hVar, new u7h(j)});
                }
                qim0 qim0Var3 = nim0.a;
                m4c m4cVar3 = m4cVar2;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                qim0 qim0VarE = dug.e(dug.e(dug.f(uyn1.z(16.0f, 0.0f, 2, qim0VarF), cbx.a(x340Var3).a.d, cr31VarB), v9c.h(listM, 0.0f, 0.0f, 14), cr31VarB, 0.0f, 4), v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(jB)}), 0.0f, 0.0f, 14), cr31VarB, 0.0f, 4);
                cvx cvxVar2 = cbx.b(x340Var3).b;
                cvx cvxVar3 = cbx.b(x340Var3).b;
                cvx cvxVar4 = cbx.b(x340Var3).b;
                cvx cvxVar5 = cbx.b(x340Var3).b;
                qim0 qim0VarA = uyn1.A(qim0VarE, 16.0f, 16.0f, 16.0f, 8.0f);
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var3, 0);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarA);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                boolean z4 = x340Var3.S;
                n4k n4kVar = hmb0.t1;
                if (z4) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var3, lljVar3);
                nko1.H(xos0VarM, x340Var3, lljVar2);
                x0d.q(iHashCode, x340Var3, lljVar, x340Var3);
                nko1.H(qim0VarE2, x340Var3, vu30Var);
                String str3 = dvd1Var.b;
                if (str3 == null) {
                    x340Var3.i0(20399149);
                    x340Var3.r(false);
                    x340Var2 = x340Var3;
                    m4cVar = m4cVar3;
                    qim0Var = qim0Var3;
                    th = null;
                } else {
                    x340Var3.i0(20399150);
                    lee1 lee1Var = cbx.d(x340Var3).d;
                    long j3 = cbx.a(x340Var3).b.a;
                    Object objT4 = x340Var3.T();
                    m4cVar = m4cVar3;
                    if (objT4 == m4cVar) {
                        objT4 = pod1.T0;
                        x340Var3.s0(objT4);
                    }
                    x340 x340Var4 = x340Var3;
                    qim0Var = qim0Var3;
                    th = null;
                    uwo1.e(str3, s161.b(qim0Var, false, (iu30) objT4), lee1Var, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
                    x340Var2 = x340Var4;
                    x340Var2.r(false);
                }
                j(dvd1Var.a, mqo1.A(dvd1Var.d), xsqVar, d0rVar, 0, x340Var2, (i4 << 3) & 8064, 16);
                if (z) {
                    x340Var2.i0(21002131);
                    boolean zG2 = x340Var2.g(str2);
                    Object objT5 = x340Var2.T();
                    if (zG2 || objT5 == m4cVar) {
                        objT5 = (zv10) kly0Var.get();
                        x340Var2.s0(objT5);
                    }
                    zv10 zv10Var = (zv10) objT5;
                    cvx cvxVar6 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.h(qim0Var, 16.0f));
                    zv10Var.getClass();
                    tv10 tv10Var = new tv10(str2);
                    int size = list.size();
                    Iterator it2 = c380Var.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        List list2 = ((dvd1) it2.next()).e;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            i3 = 0;
                        } else {
                            Iterator it3 = list2.iterator();
                            i3 = 0;
                            while (it3.hasNext()) {
                                x340 x340Var5 = x340Var2;
                                if (((ct10) it3.next()).e && (i3 = i3 + 1) < 0) {
                                    p7h.S();
                                    throw th;
                                }
                                x340Var2 = x340Var5;
                            }
                        }
                        i5 += i3;
                        x340Var2 = x340Var2;
                    }
                    x340 x340Var6 = x340Var2;
                    j5c j5cVar3 = j5cVar;
                    otw.c(zv10Var, new vv10(tv10Var, "", (Long) null, false, size, i5, str, dvd1Var.f, (String) null, z2, 1292), aym.n(qim0Var, j5cVar3), (ipb1) null, x340Var6, 0, 8);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.h(qim0Var, 16.0f));
                    Object objT6 = x340Var6.T();
                    if (objT6 == m4cVar) {
                        objT6 = v8r.q(Boolean.FALSE);
                        x340Var6.s0(objT6);
                    }
                    ven0 ven0Var = (ven0) objT6;
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        listD1 = list;
                        i2 = 1;
                    } else {
                        i2 = 1;
                        listD1 = o7h.d1(list, 1);
                    }
                    boolean z5 = list.size() > i2;
                    if (listD1.isEmpty()) {
                        vu30Var = vu30Var;
                        lljVar = lljVar;
                        x340Var2 = x340Var6;
                        z3 = false;
                        x340Var2.i0(25022707);
                        x340Var2.r(false);
                    } else {
                        x340Var6.i0(22157966);
                        qim0 qim0VarD = o0c.d(u291.f(qim0Var, 1.0f), th, 3);
                        mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var6, 0);
                        int iHashCode2 = Long.hashCode(x340Var6.T);
                        xos0 xos0VarM2 = x340Var6.m();
                        qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarD);
                        hzj.A.getClass();
                        x340Var6.m0();
                        if (x340Var6.S) {
                            x340Var6.l(n4kVar);
                        } else {
                            x340Var6.v0();
                        }
                        nko1.H(mbhVarA2, x340Var6, lljVar3);
                        nko1.H(xos0VarM2, x340Var6, lljVar2);
                        x0d.q(iHashCode2, x340Var6, lljVar, x340Var6);
                        nko1.H(qim0VarE3, x340Var6, vu30Var);
                        qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                        mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var6, 0);
                        int iHashCode3 = Long.hashCode(x340Var6.T);
                        xos0 xos0VarM3 = x340Var6.m();
                        qim0 qim0VarE4 = zr7.E(x340Var6, qim0VarF2);
                        x340Var6.m0();
                        if (x340Var6.S) {
                            x340Var6.l(n4kVar);
                        } else {
                            x340Var6.v0();
                        }
                        nko1.H(mbhVarA3, x340Var6, lljVar3);
                        nko1.H(xos0VarM3, x340Var6, lljVar2);
                        x0d.q(iHashCode3, x340Var6, lljVar, x340Var6);
                        nko1.H(qim0VarE4, x340Var6, vu30Var);
                        x340Var6.i0(2129610041);
                        int i6 = 0;
                        for (Object obj : listD1) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                p7h.T();
                                throw null;
                            }
                            ct10 ct10Var = (ct10) obj;
                            boolean zG3 = x340Var6.g(ct10Var.a);
                            Object objT7 = x340Var6.T();
                            if (zG3 || objT7 == m4cVar) {
                                objT7 = (zv10) kly0Var.get();
                                x340Var6.s0(objT7);
                            }
                            zv10 zv10Var2 = (zv10) objT7;
                            String str4 = ct10Var.a;
                            boolean zE = x340Var6.e(i6);
                            Object objT8 = x340Var6.T();
                            if (zE || objT8 == m4cVar) {
                                objT8 = new sl11(i6, (byte) 15);
                                x340Var6.s0(objT8);
                            }
                            dgo1.c(str4, (iu30) objT8, apo.r(899840717, new avd1(zv10Var2, ct10Var, dvd1Var, str, (byte) 1), x340Var6), x340Var6, 384);
                            i6 = i7;
                        }
                        x340Var6.r(false);
                        x340Var6.r(true);
                        if (z5) {
                            x340Var6.i0(1221723810);
                            uwr uwrVar3 = cbx.a;
                            cvx cvxVar8 = cbx.b(x340Var6).b;
                            op71.g(x340Var6, u291.h(qim0Var, 4.0f));
                            int i8 = ((Boolean) ven0Var.getValue()).booleanValue() ? 2131963097 : 2131963095;
                            String string = ((Context) x340Var6.k(AndroidCompositionLocals_androidKt.b)).getString(((Boolean) ven0Var.getValue()).booleanValue() ? 2131963098 : 2131963096);
                            boolean zI = x340Var6.i(i8h1Var) | x340Var6.i(ven0Var) | x340Var6.i(n2m0Var2) | x340Var6.i(c9nVar) | x340Var6.i(j5cVar3);
                            Object objT9 = x340Var6.T();
                            if (zI || objT9 == m4cVar) {
                                qim0Var2 = qim0Var;
                                z3 = false;
                                objT9 = new kbp0(i8h1Var, n2m0Var2, c9nVar, ven0Var, j5cVar3, (byte) 18);
                                x340Var6.s0(objT9);
                            } else {
                                z3 = false;
                                qim0Var2 = qim0Var;
                            }
                            gbx gbxVar = new gbx(z50.c, (Function0) objT9);
                            boolean zG4 = x340Var6.g((Object) 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0533: INVOKE (r0v39 'zG4' boolean) = (r27v1 'x340Var6' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r16v28 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[DECLARE_VAR] (LINE:1332) in method: p.cvd1.k(p.c380, p.xsq, p.d0r, p.kly0, p.i8h1, boolean, boolean, java.lang.String, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes11.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v28 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 1565
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p.cvd1.k(p.c380, p.xsq, p.d0r, p.kly0, p.i8h1, boolean, boolean, java.lang.String, p.b0k, int):void");
                        }

                        public static final void l(b0k b0kVar, int i) {
                            x340 x340Var = (x340) b0kVar;
                            x340Var.k0(-1310992876);
                            if (x340Var.Y(i & 1, i != 0)) {
                                j2i j2iVar = omj.a;
                                uwr uwrVar = cbx.a;
                                bzn1.e((qim0) null, j2iVar, false, (vu30) null, new qgr0(cbx.a(x340Var).a.c), (ngr0) null, (ygr0) null, (Function0) null, x340Var, 48, 237);
                            } else {
                                x340Var.b0();
                            }
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new t491(i, (byte) 29);
                            }
                        }

                        public static final qim0 m(qim0 qim0Var, cr31 cr31Var, long j, boolean z) {
                            long j2;
                            List listM;
                            long jB = u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14);
                            if (z) {
                                j2 = u7h.j;
                                listM = p7h.M(new u7h[]{new u7h(j2), new u7h(jB)});
                            } else {
                                u7h u7hVar = new u7h(jB);
                                j2 = u7h.j;
                                listM = p7h.M(new u7h[]{u7hVar, new u7h(j2)});
                            }
                            return dug.e(dug.e(dug.f(qim0Var, j, cr31Var), v9c.h(listM, 0.0f, 0.0f, 14), cr31Var, 0.0f, 4), v9c.s(p7h.M(new u7h[]{new u7h(j2), new u7h(jB)}), 0.0f, 0.0f, 14), cr31Var, 0.0f, 4);
                        }
                    }
