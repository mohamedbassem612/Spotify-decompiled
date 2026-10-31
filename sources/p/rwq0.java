package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.spotify.browsita.v1.resolved.Section;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class rwq0 {
    public static b180 a;

    public static final String A(int i, String str, Function0 function0, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        oe41 oe41VarP = ((qe41) x340Var.k(lge0.a)).p();
        ven0 ven0VarS = v8r.s(function0, x340Var);
        boolean zG = x340Var.g(oe41VarP);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            Bundle bundleA = oe41VarP.a(str);
            objT = bundleA != null ? bundleA.getString(str) : null;
            x340Var.s0(objT);
        }
        String str2 = (String) objT;
        boolean zI = x340Var.i(oe41VarP) | x340Var.i(ven0VarS);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new ny51(oe41VarP, str, ven0VarS, (byte) 16);
            x340Var.s0(objT2);
        }
        qxd0.i(oe41VarP, (iu30) objT2, x340Var);
        return str2;
    }

    public static d620 B(float f) {
        return new d620(3, f);
    }

    public static final long C(bff0 bff0Var, iu30 iu30Var) {
        return bff0Var.equals(new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true)) ? u7h.k : z4p1.e(((Number) iu30Var.invoke(bff0Var)).intValue());
    }

    public static final q1v D(h2v h2vVar) {
        if (h2vVar instanceof d2v) {
            return q1v.b;
        }
        if (h2vVar instanceof g2v) {
            return q1v.c;
        }
        if (h2vVar instanceof e2v) {
            return q1v.d;
        }
        if (h2vVar instanceof c2v) {
            return q1v.e;
        }
        if (h2vVar instanceof f2v) {
            return q1v.a;
        }
        eg.o();
        return null;
    }

    public static final xg30 E(qwq0 qwq0Var) {
        if (qwq0Var instanceof pwq0) {
            return ((pwq0) qwq0Var).c;
        }
        if (qwq0Var instanceof owq0) {
            return ((owq0) qwq0Var).c;
        }
        eg.o();
        return null;
    }

    public static final ArrayList F(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hp90 hp90Var = (hp90) it.next();
            arrayList2.add(hp90Var.g ? ly90.a : new my90(hp90Var.d, hp90Var.c, hp90Var.b));
        }
        return arrayList2;
    }

    public static d620 G(float f) {
        return new d620(2, f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(cw3 cw3Var, Function0 function0, Function0 function1, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(53561116);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(cw3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (cw3Var instanceof yv3) {
            x340Var.i0(-2088441664);
            otw.c(new cac(function1), zex0.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
            x340Var.r(false);
        } else if (cw3Var instanceof zv3) {
            x340Var.i0(-2088222680);
            br0 br0Var = new br0(function0, function1);
            qu3 qu3Var = ((zv3) cw3Var).a;
            otw.c(br0Var, new cv3(qu3Var.a, qu3Var.b, qu3Var.d, qu3Var.e, false, qu3Var.f), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        } else if (cw3Var instanceof aw3) {
            x340Var.i0(-2087574935);
            br0 br0Var2 = new br0(function0, function1);
            qu3 qu3Var2 = ((aw3) cw3Var).a;
            otw.c(br0Var2, new cv3(qu3Var2.a, qu3Var2.b, qu3Var2.d, qu3Var2.e, true, qu3Var2.f), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        } else {
            if (!(cw3Var instanceof bw3)) {
                throw p3d1.k(x340Var, -67369471, false);
            }
            x340Var.i0(-67320960);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(cw3Var, function0, function1, i, (byte) 14);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(qhq0 qhq0Var, long j, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(315221958);
        int i2 = i | (b0kVar3.g(qhq0Var) ? 4 : 2) | (b0kVar3.f(j) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = qhq0Var instanceof ohq0;
            nim0 nim0Var = nim0.a;
            if (z) {
                b0kVar3.i0(1978947682);
                qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM = b0kVar3.m();
                qim0 qim0VarE = zr7.E(b0kVar3, qim0VarR);
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
                ohq0 ohq0Var = (ohq0) qhq0Var;
                b0kVar2 = b0kVar3;
                bpo1.c(ohq0Var.a, (String) null, u291.r(nim0Var, 24.0f), ohq0Var.b, false, 0L, false, b0kVar2, 432, 240);
                b0kVar2.r(true);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                if (!(qhq0Var instanceof phq0)) {
                    throw p3d1.k(b0kVar2, -2014374018, false);
                }
                b0kVar2.i0(1979244383);
                e(((phq0) qhq0Var).a, u291.r(nim0Var, 16.0f), null, j, b0kVar2, ((i2 << 6) & 7168) | 48, 4);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(qhq0Var, j, i, (byte) 6);
        }
    }

    public static final void c(l5y l5yVar, iu30 iu30Var, otu otuVar, Function0 function0, qim0 qim0Var, muo muoVar, iu30 iu30Var2, boolean z, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z2;
        boolean z3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1704902000);
        int i2 = i | (x340Var.g(l5yVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(otuVar) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576 | (x340Var.i(muoVar) ? 131072 : 65536) | (x340Var.i(iu30Var2) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            int i3 = i2 & 896;
            boolean z4 = i3 == 256;
            Object objT = x340Var.T();
            if (z4 || objT == m4cVar) {
                objT = new suo(otuVar);
                x340Var.s0(objT);
            }
            suo suoVar = (suo) objT;
            g5y g5yVar = l5yVar.c;
            if (g5yVar == null) {
                x340Var.i0(1548259690);
                x340Var.r(false);
                z3 = false;
                z2 = true;
            } else {
                x340Var.i0(1548259691);
                int i4 = i2 & 112;
                boolean zG = (i4 == 32) | (i3 == 256) | x340Var.g(g5yVar);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new w3y(otuVar, g5yVar, iu30Var, (byte) 0);
                    x340Var.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                boolean zG2 = (i3 == 256) | x340Var.g(g5yVar) | (i4 == 32);
                Object objT3 = x340Var.T();
                if (zG2 || objT3 == m4cVar) {
                    z2 = true;
                    objT3 = new w3y(otuVar, g5yVar, iu30Var, (byte) 1);
                    x340Var.s0(objT3);
                } else {
                    z2 = true;
                }
                o(g5yVar, function1, (Function0) objT3, otuVar, x340Var, (i2 << 3) & 7168);
                z3 = false;
                x340Var.r(false);
            }
            Boolean boolValueOf = Boolean.valueOf(l5yVar.d);
            boolean z5 = ((i2 & 14) == 4 ? z2 : z3) | ((i2 & 7168) == 2048 ? z2 : z3);
            Object objT4 = x340Var.T();
            if (z5 || objT4 == m4cVar) {
                objT4 = new nnu(l5yVar, function0, (lnm) null, (byte) 19);
                x340Var.s0(objT4);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT4);
            kiv kivVar = vvx.a;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var4 = qim0Var3;
            mod.b(kivVar.a(new uvx(0, null, 0, null, uyn1.h(2, 4.0f, 0.0f), null, null, 0, null, 495)), apo.r(900441936, new q3(qim0Var4, z, function0, l5yVar, suoVar, iu30Var2, iu30Var, muoVar), x340Var), x340Var, 56);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(l5yVar, iu30Var, otuVar, function0, qim0Var2, muoVar, iu30Var2, z, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(as40 as40Var, qim0 qim0Var, ujo ujoVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-780568466);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(as40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(ujoVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = as40Var instanceof zr40;
            qim0 qim0Var2 = nim0.a;
            if (z) {
                x340Var.i0(-962041425);
                if (((zr40) as40Var).a) {
                    x340Var.i0(-962015385);
                    sok.i(null, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-961964731);
                    sbl.r((qim0) null, x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                if (!(as40Var instanceof yr40)) {
                    throw p3d1.k(x340Var, 1492986897, false);
                }
                x340Var.i0(-961826502);
                yr40 yr40Var = (yr40) as40Var;
                boolean zG = x340Var.g(yr40Var.a);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = v8r.q(new mmr0(Integer.valueOf(yr40Var.e), Integer.valueOf(yr40Var.f)));
                    x340Var.s0(objT);
                }
                w2g0.c(qim0Var2, (tl3) null, apo.r(149335383, new cy00(objT, (Object) as40Var, (Object) ujoVar, (byte) 6), x340Var), x340Var, ((i3 >> 3) & 14) | 3072, 6);
                x340Var.r(false);
            }
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(as40Var, ujoVar, qim0Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0323  */
    /* JADX WARN: Code duplicated, block: B:103:0x032c  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x021b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0226  */
    /* JADX WARN: Code duplicated, block: B:83:0x024f  */
    /* JADX WARN: Code duplicated, block: B:86:0x025a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0283  */
    /* JADX WARN: Code duplicated, block: B:90:0x028d  */
    /* JADX WARN: Code duplicated, block: B:91:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f0 A[PHI: r2
      0x02f0: PHI (r2v20 boolean) = 
      (r2v4 boolean)
      (r2v5 boolean)
      (r2v6 boolean)
      (r2v7 boolean)
      (r2v8 boolean)
      (r2v9 boolean)
      (r2v10 boolean)
      (r2v11 boolean)
      (r2v12 boolean)
      (r2v13 boolean)
      (r2v14 boolean)
      (r2v15 boolean)
      (r2v21 boolean)
     binds: [B:96:0x02ee, B:92:0x02bc, B:88:0x028a, B:84:0x0256, B:80:0x0222, B:76:0x01ee, B:72:0x01ba, B:68:0x0186, B:64:0x0152, B:60:0x011e, B:56:0x00ea, B:52:0x00b6, B:46:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x02fa  */
    public static final void e(String str, qim0 qim0Var, ksl kslVar, long j, b0k b0kVar, int i, int i2) {
        ksl kslVar2;
        boolean z;
        h311 h311VarV;
        ksl kslVar3;
        boolean z2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-749239764);
        int i4 = (i & 6) == 0 ? (x340Var.g(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                kslVar2 = kslVar;
                i4 |= x340Var.g(kslVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (x340Var.f(j)) {
                    i3 = 2048;
                } else {
                    i3 = 1024;
                }
                i4 |= i3;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    kslVar3 = isl.a;
                } else {
                    kslVar3 = kslVar2;
                }
                switch (str.hashCode()) {
                    case -2010949979:
                        z2 = false;
                        if (str.equals("headphones")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535118521);
                            w0h1.a(unx.c, kslVar3, qim0Var, j, 0L, false, x340Var, unx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case -1603157330:
                        z2 = false;
                        if (str.equals("enhance")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535115478);
                            w0h1.a(zmx.c, kslVar3, qim0Var, j, 0L, false, x340Var, zmx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case -1347046984:
                        z2 = false;
                        if (str.equals("add-to-playlist")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535100188);
                            w0h1.a(ujx.c, kslVar3, qim0Var, j, 0L, false, x340Var, ujx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case -734622710:
                        z2 = false;
                        if (str.equals("chevron-right")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535109627);
                            w0h1.a(plx.c, kslVar3, qim0Var, j, 0L, false, x340Var, plx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case -318184504:
                        z2 = false;
                        if (str.equals("preview")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535127350);
                            w0h1.a(nrx.c, kslVar3, qim0Var, j, 0L, false, x340Var, nrx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case -255263904:
                        z2 = false;
                        if (str.equals("light-bulb")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535124344);
                            w0h1.a(iox.c, kslVar3, qim0Var, j, 0L, false, x340Var, iox.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case 106893:
                        z2 = false;
                        if (str.equals("lab")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535121426);
                            w0h1.a(fox.c, kslVar3, qim0Var, j, 0L, false, x340Var, fox.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case 3108362:
                        z2 = false;
                        if (str.equals("edit")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535112627);
                            w0h1.a(xmx.c, kslVar3, qim0Var, j, 0L, false, x340Var, xmx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case 3540562:
                        z2 = false;
                        if (str.equals("star")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535130195);
                            w0h1.a(xsx.c, kslVar3, qim0Var, j, 0L, false, x340Var, xsx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case 92896879:
                        z2 = false;
                        if (str.equals("album")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535103284);
                            w0h1.a(akx.c, kslVar3, qim0Var, j, 0L, false, x340Var, akx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case 1087726195:
                        z2 = false;
                        if (str.equals("taste-profile")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535133435);
                            w0h1.a(gtx.c, kslVar3, qim0Var, j, 0L, false, x340Var, gtx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case 1394955557:
                        z2 = false;
                        if (str.equals("trending")) {
                            x340Var.i0(344669366);
                            x340Var.r(z2);
                        } else {
                            x340Var.i0(1535136567);
                            w0h1.a(ntx.c, kslVar3, qim0Var, j, 0L, false, x340Var, ntx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                        }
                        break;
                    case 1762399914:
                        if (!str.equals("briefcase")) {
                            x340Var.i0(1535106232);
                            w0h1.a(xkx.c, kslVar3, qim0Var, j, 0L, false, x340Var, xkx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                            x340Var.r(false);
                            break;
                        }
                    default:
                        z2 = false;
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                        break;
                }
                kslVar2 = kslVar3;
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zpy(str, qim0Var, kslVar2, j, i, i2);
            }
        }
        i4 |= 384;
        kslVar2 = kslVar;
        if ((i & 3072) == 0) {
            if (x340Var.f(j)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i4 |= i3;
        }
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i5 != 0) {
                kslVar3 = isl.a;
            } else {
                kslVar3 = kslVar2;
            }
            switch (str.hashCode()) {
                case -2010949979:
                    z2 = false;
                    if (str.equals("headphones")) {
                        x340Var.i0(1535118521);
                        w0h1.a(unx.c, kslVar3, qim0Var, j, 0L, false, x340Var, unx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case -1603157330:
                    z2 = false;
                    if (str.equals("enhance")) {
                        x340Var.i0(1535115478);
                        w0h1.a(zmx.c, kslVar3, qim0Var, j, 0L, false, x340Var, zmx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case -1347046984:
                    z2 = false;
                    if (str.equals("add-to-playlist")) {
                        x340Var.i0(1535100188);
                        w0h1.a(ujx.c, kslVar3, qim0Var, j, 0L, false, x340Var, ujx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case -734622710:
                    z2 = false;
                    if (str.equals("chevron-right")) {
                        x340Var.i0(1535109627);
                        w0h1.a(plx.c, kslVar3, qim0Var, j, 0L, false, x340Var, plx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case -318184504:
                    z2 = false;
                    if (str.equals("preview")) {
                        x340Var.i0(1535127350);
                        w0h1.a(nrx.c, kslVar3, qim0Var, j, 0L, false, x340Var, nrx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case -255263904:
                    z2 = false;
                    if (str.equals("light-bulb")) {
                        x340Var.i0(1535124344);
                        w0h1.a(iox.c, kslVar3, qim0Var, j, 0L, false, x340Var, iox.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case 106893:
                    z2 = false;
                    if (str.equals("lab")) {
                        x340Var.i0(1535121426);
                        w0h1.a(fox.c, kslVar3, qim0Var, j, 0L, false, x340Var, fox.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case 3108362:
                    z2 = false;
                    if (str.equals("edit")) {
                        x340Var.i0(1535112627);
                        w0h1.a(xmx.c, kslVar3, qim0Var, j, 0L, false, x340Var, xmx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case 3540562:
                    z2 = false;
                    if (str.equals("star")) {
                        x340Var.i0(1535130195);
                        w0h1.a(xsx.c, kslVar3, qim0Var, j, 0L, false, x340Var, xsx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case 92896879:
                    z2 = false;
                    if (str.equals("album")) {
                        x340Var.i0(1535103284);
                        w0h1.a(akx.c, kslVar3, qim0Var, j, 0L, false, x340Var, akx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case 1087726195:
                    z2 = false;
                    if (str.equals("taste-profile")) {
                        x340Var.i0(1535133435);
                        w0h1.a(gtx.c, kslVar3, qim0Var, j, 0L, false, x340Var, gtx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case 1394955557:
                    z2 = false;
                    if (str.equals("trending")) {
                        x340Var.i0(1535136567);
                        w0h1.a(ntx.c, kslVar3, qim0Var, j, 0L, false, x340Var, ntx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(344669366);
                        x340Var.r(z2);
                    }
                    break;
                case 1762399914:
                    if (!str.equals("briefcase")) {
                        x340Var.i0(1535106232);
                        w0h1.a(xkx.c, kslVar3, qim0Var, j, 0L, false, x340Var, xkx.d | ((i4 >> 3) & 112) | ((i4 << 3) & 896) | (i4 & 7168), 48);
                        x340Var.r(false);
                        break;
                    }
                default:
                    z2 = false;
                    x340Var.i0(344669366);
                    x340Var.r(z2);
                    break;
            }
            kslVar2 = kslVar3;
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zpy(str, qim0Var, kslVar2, j, i, i2);
        }
    }

    public static final void f(l5y l5yVar, vu30 vu30Var, muo muoVar, suo suoVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        zzq0 zzq0VarH;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(287127626);
        int i2 = i | (x340Var2.g(l5yVar) ? 4 : 2) | (x340Var2.i(vu30Var) ? 32 : 16) | (x340Var2.i(muoVar) ? 256 : 128) | (x340Var2.g(suoVar) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ven0 ven0VarS = v8r.s(vu30Var, x340Var2);
            int i3 = i2 & 14;
            ven0 ven0VarS2 = v8r.s(l5yVar, x340Var2);
            ven0 ven0VarS3 = v8r.s(suoVar, x340Var2);
            boolean z = l5yVar.a;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                x340Var2.i0(-1755308504);
                h(x340Var2, 6);
                x340Var2.r(false);
                x340Var = x340Var2;
                qim0Var2 = qim0Var3;
            } else {
                x340Var2.i0(-1755157410);
                if (l5yVar.b instanceof j5y) {
                    x340Var2.i0(-1755141352);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    zzq0VarH = uyn1.j(0.0f, 8.0f, 0.0f, cbx.b(x340Var2).b.c, 5);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1051766361);
                    x340Var2.r(false);
                    zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                }
                zzq0 zzq0Var = zzq0VarH;
                boolean zI = ((i2 & 112) == 32) | (i3 == 4) | x340Var2.i(muoVar) | x340Var2.g(ven0VarS) | x340Var2.g(ven0VarS2) | x340Var2.g(ven0VarS3);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    j96 j96Var = new j96(l5yVar, muoVar, ven0VarS, ven0VarS2, ven0VarS3, vu30Var);
                    x340Var2.s0(j96Var);
                    objT = j96Var;
                }
                qim0Var2 = qim0Var3;
                ujo1.d(qim0Var2, (xtb0) null, zzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 6, 506);
                x340Var = x340Var2;
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 23, i, l5yVar, vu30Var, muoVar, suoVar, qim0Var2);
        }
    }

    public static final void g(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(201791409);
        int i2 = i | 6 | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            if (z) {
                x340Var.i0(539998715);
                x340Var.r(false);
            } else {
                x340Var.i0(539667170);
                qim0 qim0VarK = d9y0.k(qim0Var2, 0.1f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                rqo1.g(0, 0, x340Var, uyn1.A(qim0VarK, 16.0f, 12.0f, 16.0f, 12.0f));
                x340Var.r(false);
            }
            uwr uwrVar2 = cbx.a;
            x0d.s(qim0Var2, cbx.b(x340Var).b.c, x340Var, true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(qim0Var, z, i, (byte) 10);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(457869883);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = (x340Var.g(nim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
            uwr uwrVar = cbx.a;
            xto1.e(uyn1.z(0.0f, cbx.b(x340Var).b.d, 1, qim0VarA), 5, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx1(i);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0VarJ;
        qim0 qim0VarY;
        boolean z2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(402729170);
        int i2 = i | (x340Var.g(qim0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            qim0 qim0Var2 = nim0.a;
            if (function0 != null) {
                x340Var.i0(475683526);
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(x340Var).d;
                qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0Var2);
                x340Var.r(false);
            } else {
                x340Var.i0(475685658);
                x340Var.r(false);
                qim0VarJ = qim0Var2;
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarJ);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            if (function0 != null) {
                x340Var.i0(420029468);
                gbx gbxVar = new gbx(z50.c, function0);
                ldx ldxVar = ldx.c;
                gdx gdxVarR = yla.r(x340Var);
                qim0 qim0VarA = h2c.a.a(qim0Var2, een.g);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                z3 = true;
                qim0VarY = qim0Var2;
                z2 = false;
                wro1.h(gbxVar, ldxVar, uyn1.B(qim0VarA, 4.0f, 0.0f, 0.0f, 0.0f, 14), (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, cmi.a, x340Var, 48, 6, 984);
                x340Var.r(false);
            } else {
                qim0VarY = qim0Var2;
                z2 = false;
                z3 = true;
                x340Var.i0(420613942);
                x340Var.r(false);
            }
            String strO0 = cwl1.o0(x340Var, z ? 2131957163 : 2131957162);
            uwr uwrVar3 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            cjc0 cjc0Var = new cjc0(2);
            qim0 qim0VarF2 = u291.f(qim0VarY, 1.0f);
            if (function0 != null) {
                x340Var.i0(429225543);
                mta mtaVar2 = cbx.b(x340Var).d;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0VarY = uyn1.y(qim0VarY, 48.0f, 8.0f);
                x340Var.r(z2);
            } else {
                x340Var.i0(429230932);
                x340Var.r(z2);
            }
            uwo1.e(strO0, qim0VarF2.then(qim0VarY), lee1Var, 0L, new a0e1(3), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1704);
            x340Var = x340Var;
            x340Var.r(z3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(qim0Var, z, function0, i, (byte) 10);
        }
    }

    public static final void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1914850802);
        if (x340Var.Y(i & 1, i != 0)) {
            eqr0.a(dm5.I(et40.a), 0, 0, apo.r(-913812120, new gge0((Context) x340Var.k(p4k.b), (byte) 1), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(rhq0 rhq0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(501043320);
        int i2 = i | (x340Var.g(rhq0Var) ? 4 : 2) | 48 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            d36 d36Var = new d36(8.0f, true, new g21(een.P0, (byte) 29));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, u291.f(bin.x(qim0Var3, false, (String) null, (pm31) null, (idn0) null, function0, 15), 1.0f));
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 54);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            qhq0 qhq0Var = rhq0Var.b;
            if (qhq0Var == null) {
                x340Var.i0(1303951503);
            } else {
                x340Var.i0(1303951504);
                b(qhq0Var, j, x340Var, 0);
            }
            x340Var.r(false);
            StringBuilder sb = new StringBuilder(16);
            ArrayList arrayListM = xvj1.m();
            new ArrayList();
            String str = rhq0Var.d;
            String str2 = rhq0Var.a;
            if (str != null) {
                sb.append(nhc1.W(str, "{0}", str2));
            } else {
                sb.append(str2);
            }
            String string = sb.toString();
            ArrayList arrayList = new ArrayList(arrayListM.size());
            int size = arrayListM.size();
            for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
            }
            uwo1.d(new af5(string, arrayList), j, (qim0) null, lee1Var, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (cqs0) null, x340Var, 1572864, 0, 3764);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(rhq0Var, qim0Var2, function0, i, (byte) 16);
        }
    }

    public static final void l(y7e1 y7e1Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2008650059);
        int i2 = (x340Var.i(y7e1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zI = x340Var.i(y7e1Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ime0(y7e1Var, (byte) 13);
                x340Var.s0(objT);
            }
            String strA = A(6, "song_dna_search_query", (Function0) objT, x340Var);
            boolean zG = x340Var.g(strA) | x340Var.i(y7e1Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new x351(strA, y7e1Var);
                x340Var.s0(objT2);
            }
            qxd0.i(strA, (iu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ex1(y7e1Var, i);
        }
    }

    public static final void m(rba1 rba1Var, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        rih1 rih1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(205194594);
        int i2 = (x340Var.i(function0) ? 256 : 128) | i | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strA = A(((i2 >> 3) & 112) | 6, "song_dna_search_landing_chip", function0, x340Var);
            boolean zG = x340Var.g(strA);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                if (strA != null) {
                    c380 c380Var = rba1Var.a;
                    if (!c380Var.isEmpty()) {
                        Iterator it = c380Var.iterator();
                        do {
                            if (!it.hasNext()) {
                                strA = rba1Var.b;
                                break;
                            }
                        } while (!((kba1) it.next()).a.equals(strA));
                    } else {
                        strA = rba1Var.b;
                        break;
                    }
                    iu30Var.invoke(strA);
                    rih1Var = rih1.a;
                } else {
                    rih1Var = null;
                }
                x340Var.s0(rih1Var);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71((byte) 18, i, rba1Var, function0, iu30Var);
        }
    }

    public static final void n(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-778509876);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | 384 | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new gy((byte) 23, z);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT);
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            mgx mgxVar = mgx.e;
            uvx uvxVarB = uvx.b(uvxVar, 0, null, null, 29);
            boolean z3 = (i2 & 7168) == 2048;
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new ivw(function0, (byte) 5);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, uvxVarB, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(2043135091, new aw1((byte) 26, z), b0kVar3), (xu30) null, (xu30) null, apo.r(1008387856, new z3y(str, (byte) 0), b0kVar3), b0kVar2, 64, 196992, 28604);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, z, qim0Var2, function0, i, (byte) 4);
        }
    }

    public static final void o(g5y g5yVar, Function0 function0, Function0 function1, otu otuVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(235517487);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g5yVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(otuVar) : x340Var.i(otuVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            yah0.d(cwl1.o0(x340Var, 2131957156), cwl1.o0(x340Var, 2131957153), cwl1.o0(x340Var, 2131957154), cwl1.o0(x340Var, 2131957155), function0, function1, (Function0) null, x340Var, 516096 & (i2 << 9), 64);
            boolean z = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && x340Var.i(otuVar))) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new nnu(otuVar, g5yVar, (lnm) null, (byte) 20);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, g5yVar, function0, function1, otuVar, (byte) 12);
        }
    }

    public static final void p(fai0 fai0Var, fai0 fai0Var2, fai0 fai0Var3) {
        Boolean bool = (Boolean) fai0Var2.e();
        boolean z = false;
        if (bool != null ? bool.booleanValue() : false) {
            Boolean bool2 = (Boolean) fai0Var3.e();
            if (bool2 != null ? bool2.booleanValue() : false) {
                z = true;
            }
        }
        fai0Var.m(Boolean.valueOf(z));
    }

    public static final String q(Context context, sru sruVar) {
        p1v p1vVar = sruVar.a;
        String str = sruVar.d;
        String str2 = sruVar.c;
        if (str2 == null || str == null) {
            return str != null ? w(context, p1vVar, 2131955030, 2131955042, 2131955036, 2131955033, 2131955039, 2131955027, new String[]{str}) : w(context, p1vVar, 2131955028, 2131955040, 2131955034, 2131955031, 2131955037, 2131955025, new String[0]);
        }
        return w(context, p1vVar, 2131955029, 2131955041, 2131955035, 2131955032, 2131955038, 2131955026, new String[]{str2, str});
    }

    public static jvr r(b8p b8pVar) {
        return (jvr) b8pVar.A0.get();
    }

    public static final void s(View view, xu30 xu30Var) {
        bih1 bih1Var = new bih1(xu30Var, new uc80(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()), (byte) 29);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(view, bih1Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new c9s(view, view, (byte) 18));
        }
    }

    public static final String t(Section section) {
        return Integer.toHexString(section.hashCode());
    }

    public static final mr20 u(ov20 ov20Var) {
        return ((bw20) ov20Var).c("age_assurance_account_warning_timestamp", "");
    }

    public static final mr20 v(ov20 ov20Var) {
        return ((bw20) ov20Var).a("should-assure-age-social", false);
    }

    public static final String w(Context context, p1v p1vVar, int i, int i2, int i3, int i4, int i5, int i6, String[] strArr) {
        if (!(p1vVar instanceof h1v)) {
            if (p1vVar instanceof n1v) {
                i = i2;
            } else if (p1vVar instanceof k1v) {
                i = i3;
            } else if (p1vVar instanceof i1v) {
                i = i4;
            } else if (p1vVar instanceof l1v) {
                i = i5;
            } else {
                if (!p1vVar.equals(f1v.a)) {
                    if (p1vVar.equals(m1v.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                i = i6;
            }
        }
        return context.getString(i, Arrays.copyOf(strArr, strArr.length));
    }

    public static final mr20 x(ov20 ov20Var) {
        return rqt0.u(new c1v0(((bw20) ov20Var).c("estimated-age", "-1"), (byte) 14));
    }

    public static d620 y(float f) {
        return new d620(1, f);
    }

    public static final void z(qtr qtrVar, zu30 zu30Var) {
        qtrVar.b(new lcm(zu30Var, (lnm) null, (byte) 14));
    }
}
