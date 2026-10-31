package p;

import android.net.Uri;
import com.spotify.messages.TimeMeasurement;
import com.spotify.messages.TimeMeasurementErrorNonAuth;
import com.spotify.messages.TimeMeasurementNonAuth;
import com.spotify.mobius.Next;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class d7e {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    public static final List A(k1r k1rVar, f6l1 f6l1Var) {
        w7l1 w7l1VarZ;
        String str = f6l1Var.e;
        List list = (List) u890.k(k1rVar, (d0r) null, (n4r) null);
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof j1r) {
                    return z6x.a;
                }
            }
        }
        Iterator it2 = list.iterator();
        ArrayList<e6l1> arrayList = f6l1Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (e6l1 e6l1Var : arrayList) {
            if (e6l1Var.e != null) {
                bbl1 bbl1VarW = w(it2);
                bbl1 bbl1VarW2 = w(it2);
                if (bbl1VarW == null || bbl1VarW2 == null) {
                    w7l1VarZ = null;
                } else {
                    w7l1VarZ = z(e6l1Var, bbl1VarW, bbl1VarW2, str);
                }
            } else {
                bbl1 bbl1VarW3 = w(it2);
                if (bbl1VarW3 == null) {
                    w7l1VarZ = null;
                } else {
                    w7l1VarZ = z(e6l1Var, bbl1VarW3, bbl1VarW3, str);
                }
            }
            if (w7l1VarZ != null) {
                arrayList2.add(w7l1VarZ);
            }
        }
        return arrayList2;
    }

    public static Next B(kak0 kak0Var, i2k0 i2k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(lhg1Var.a, (buk1) null, (hez) null, (fa20) null, new px30(i2k0Var.a), (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 40943), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -8650753, 1048575)), kak0Var))), 3);
    }

    public static final xos0 C(ely0[] ely0VarArr, xos0 xos0Var, xos0 xos0Var2) {
        xos0 xos0Var3 = xos0.e;
        wos0 wos0Var = new wos0(xos0Var3);
        wos0Var.g = xos0Var3;
        for (ely0 ely0Var : ely0VarArr) {
            xky0 xky0Var = ely0Var.a;
            if (ely0Var.g || !xos0Var.containsKey(xky0Var)) {
                wos0Var.put(xky0Var, xky0Var.d(ely0Var, (osi1) xos0Var2.get(xky0Var)));
            }
        }
        return wos0Var.h();
    }

    public static final void a(int i, int i2, Function0 function0, b0k b0kVar, boolean z) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1879664452);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i > 0) {
                x340Var.i0(700046507);
                strK = cwl1.U(2131820703, i, new Object[]{Integer.valueOf(i)}, x340Var);
                x340Var.r(false);
            } else {
                strK = x0d.k(x340Var, 700203770, 2131956740, x340Var, false);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = bin.x(u291.h(u291.f(nim0Var, 1.0f), 48.0f), z, (String) null, new pm31(0), (idn0) null, function0, 10);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            w0h1.a(hrx.c, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, hrx.d | 48, 48);
            uwo1.e(strK, (qim0) null, cbx.d(x340Var).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u2y(i, z, function0, i2, (byte) 2);
        }
    }

    public static final void b(File file, float f, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-956598171);
        int i2 = i | (x340Var.i(file) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 48.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            ni7 ni7VarA = oi7.a(Uri.fromFile(file), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070);
            qim0 qim0VarR = r(f < 0.1f ? 0.1f : f, u291.h(nim0Var, 44.0f), false);
            as80 as80Var = mif1.P0;
            uwr uwrVar2 = cbx.a;
            float f2 = f >= 0.1f ? f : 0.1f;
            uwrVar2.getClass();
            eso1.h(ni7VarA, isl.a, qim0VarR, null, null, new ecx(f2), as80Var, null, null, x340Var, 48, 408);
            uwo1.e(cwl1.o0(x340Var, 2131956741), new wnb0(1.0f, true), cbx.d(x340Var).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            anm1.c(z, iu30Var, (qim0) null, (max) null, (idn0) null, x340Var, (i2 >> 6) & 126, 28);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3a(file, f, z, iu30Var, i);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1094539466);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131956750);
            String strO1 = cwl1.o0(x340Var, 2131956749);
            String strO2 = cwl1.o0(x340Var, 2131956752);
            z50 z50Var = z50.c;
            function2 = function0;
            mqo1.d(function2, (i3u) null, (hux) null, strO0, strO1, new zgx(strO2, new gbx(z50Var, function0)), new zgx(cwl1.o0(x340Var, 2131956748), new gbx(z50Var, function1)), x340Var, (i2 & 14) | 2359296, 6);
        } else {
            function2 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function2, function1, i, (byte) 26);
        }
    }

    public static final void d(y7e1 y7e1Var, y7e1 y7e1Var2, y7e1 y7e1Var3, File file, float f, boolean z, int i, boolean z2, boolean z3, String str, Function0 function0, iu30 iu30Var, Function0 function1, Function0 function2, String str2, String str3, boolean z4, Function0 function3, b0k b0kVar, int i2) {
        boolean z5;
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1420776177);
        int i5 = i2 | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.i(y7e1Var2) ? 32 : 16) | (x340Var.i(y7e1Var3) ? 256 : 128) | (x340Var.i(file) ? 2048 : 1024) | (x340Var.d(f) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536) | (x340Var.e(i) ? 1048576 : 524288) | (x340Var.h(z2) ? 8388608 : 4194304) | (x340Var.h(z3) ? 67108864 : 33554432) | (x340Var.g(str) ? 536870912 : 268435456);
        int i6 = (x340Var.i(function0) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192) | (x340Var.g(str3) ? 131072 : 65536) | (x340Var.h(z4) ? 1048576 : 524288) | (x340Var.i(function3) ? 8388608 : 4194304);
        if (x340Var.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 4793491) == 4793490) ? false : true)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            boolean zY0 = ihc1.y0(y7e1Var.d().d);
            boolean z6 = !zY0;
            boolean zY1 = ihc1.y0(y7e1Var2.d().d);
            boolean z7 = !zY1;
            boolean z8 = qm21.a(y7e1Var3.d().d.toString()) != null;
            String strO0 = cwl1.o0(x340Var, 2131956763);
            String strK = null;
            if (!zY0) {
                strO0 = null;
            }
            String strO1 = cwl1.o0(x340Var, 2131956747);
            if (!zY1) {
                strO1 = null;
            }
            if (ihc1.y0(y7e1Var3.d().d)) {
                i3 = 433732399;
                i4 = 2131956757;
                z5 = false;
            } else {
                z5 = false;
                if (z8) {
                    x340Var.i0(560969262);
                    x340Var.r(false);
                } else {
                    i3 = 433735342;
                    i4 = 2131956755;
                }
                String str4 = strK;
                two1.p(function0, u291.d(nim0.a, 1.0f), cwl1.o0(x340Var, 2131956769), str2, z3, true, apo.r(-1902136413, new j490(function3, z2, z6, z7, z8, o7h.y0(f46.i0(new String[]{strO0, strO1, str4}), " ", (String) null, (String) null, (iu30) null, 62), y7e1Var, strO0, y7e1Var2, strO1, y7e1Var3, str4, file, i, function1, z4, function2, str3, str, f, z, iu30Var), x340Var), x340Var, (i6 & 14) | 1769472 | ((i6 >> 3) & 7168) | ((i5 >> 12) & 57344), 0);
            }
            strK = x0d.k(x340Var, i3, i4, x340Var, z5);
            String str5 = strK;
            two1.p(function0, u291.d(nim0.a, 1.0f), cwl1.o0(x340Var, 2131956769), str2, z3, true, apo.r(-1902136413, new j490(function3, z2, z6, z7, z8, o7h.y0(f46.i0(new String[]{strO0, strO1, str5}), " ", (String) null, (String) null, (iu30) null, 62), y7e1Var, strO0, y7e1Var2, strO1, y7e1Var3, str5, file, i, function1, z4, function2, str3, str, f, z, iu30Var), x340Var), x340Var, (i6 & 14) | 1769472 | ((i6 >> 3) & 7168) | ((i5 >> 12) & 57344), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k490(y7e1Var, y7e1Var2, y7e1Var3, file, f, z, i, z2, z3, str, function0, iu30Var, function1, function2, str2, str3, z4, function3, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0254  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:148:0x0380  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final void e(w9i1 w9i1Var, e490 e490Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        b0k b0kVar2;
        Object obj;
        String str;
        Object gh1Var;
        tob1 tob1Var;
        boolean z;
        Integer num;
        tob1 tob1Var2;
        Object obj2;
        y7e1 y7e1Var;
        boolean z2;
        int i3;
        boolean z3;
        boolean zI;
        Object objT;
        boolean z4;
        tob1 tob1Var3;
        ?? r8;
        byte b2;
        int i4;
        boolean zI2;
        Object obj3;
        ?? r7;
        ?? r0;
        Object obj4;
        tob1 tob1Var4;
        ?? r9;
        ?? r1;
        Object obj5;
        Object obj6;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1891520455);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(w9i1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.e(e490Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function1) ? 2048 : 1024;
        }
        int i5 = i2;
        if (b0kVar3.Y(i5 & 1, (i5 & 1171) != 1170)) {
            ven0 ven0VarK = f4p1.k(w9i1Var.f1, (iac0) null, b0kVar3, 7);
            ven0 ven0VarK2 = f4p1.k(w9i1Var.h1, (iac0) null, b0kVar3, 7);
            ven0 ven0VarK3 = f4p1.k(w9i1Var.l1, (iac0) null, b0kVar3, 7);
            ven0 ven0VarK4 = f4p1.k(w9i1Var.n1, (iac0) null, b0kVar3, 7);
            tob1 tob1VarK = f4p1.k(w9i1Var.p1, (iac0) null, b0kVar3, 7);
            ven0 ven0VarK5 = f4p1.k(w9i1Var.r1, (iac0) null, b0kVar3, 7);
            ven0 ven0VarK6 = f4p1.k(w9i1Var.b1, (iac0) null, b0kVar3, 7);
            Object objT2 = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT2 == m4cVar) {
                obj = objT2;
                hrr0 hrr0VarQ = v8r.q((Object) null);
                b0kVar3.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            obj = objT2;
            tob1 tob1Var5 = (ven0) obj;
            boolean z5 = ((ece0) ven0VarK6.getValue()) instanceof sbe0;
            zae0 zae0Var = (ece0) ven0VarK6.getValue();
            zae0 zae0Var2 = zae0Var instanceof zae0 ? zae0Var : null;
            if (zae0Var2 == null) {
                b0kVar3.i0(315945339);
                b0kVar3.r(false);
                str = null;
            } else {
                b0kVar3.i0(315945340);
                String strK = zae0Var2.a;
                if (strK == null) {
                    strK = x0d.k(b0kVar3, 175707136, 2131956759, b0kVar3, false);
                } else {
                    b0kVar3.i0(175706702);
                    b0kVar3.r(false);
                }
                b0kVar3.r(false);
                str = strK;
            }
            fh0 fh0Var = new fh0(3);
            boolean zI3 = b0kVar3.i(w9i1Var);
            Object objT3 = b0kVar3.T();
            Object obj7 = objT3;
            if (zI3 || objT3 == m4cVar) {
                ux70 ux70Var = new ux70(w9i1Var, (byte) 18);
                b0kVar3.s0(ux70Var);
                obj7 = ux70Var;
            }
            ihg0 ihg0VarE = p1p1.E(fh0Var, (iu30) obj7, b0kVar3);
            boolean zH = b0kVar3.h(z5) | b0kVar3.i(tob1VarK) | b0kVar3.i(w9i1Var) | b0kVar3.i(tob1Var5);
            Object objT4 = b0kVar3.T();
            if (zH || objT4 == m4cVar) {
                tob1Var = tob1Var5;
                z = false;
                num = null;
                gh1Var = new gh1(z5, w9i1Var, tob1VarK, tob1Var, (byte) 15);
                tob1Var2 = tob1VarK;
                b0kVar3.s0(gh1Var);
            } else {
                tob1Var2 = tob1VarK;
                gh1Var = objT4;
                tob1Var = tob1Var5;
                z = false;
                num = null;
            }
            iu30 iu30Var = (iu30) gh1Var;
            int i6 = i5 & 896;
            boolean zG = b0kVar3.g(iu30Var) | b0kVar3.i(w9i1Var) | (i6 == 256 ? true : z);
            Object objT5 = b0kVar3.T();
            Object obj8 = objT5;
            if (zG || objT5 == m4cVar) {
                m490 m490Var = new m490(iu30Var, w9i1Var, function0, (byte) 1);
                b0kVar3.s0(m490Var);
                obj8 = m490Var;
            }
            Function0 function3 = (Function0) obj8;
            y7e1 y7e1Var2 = w9i1Var.t1;
            y7e1 y7e1Var3 = w9i1Var.s1;
            y7e1 y7e1Var4 = w9i1Var.u1;
            File file = (File) ven0VarK.getValue();
            float fFloatValue = ((Number) ven0VarK2.getValue()).floatValue();
            boolean zBooleanValue = ((Boolean) ven0VarK3.getValue()).booleanValue();
            int size = ((List) ven0VarK4.getValue()).size();
            boolean z6 = (z5 != 0 || ((Boolean) tob1Var2.getValue()).booleanValue()) ? true : z;
            boolean z7 = (z5 != 0 || ((Boolean) tob1Var2.getValue()).booleanValue()) ? z : true;
            int iIntValue = ((Number) ven0VarK5.getValue()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue <= 0) {
                numValueOf = num;
            }
            if (numValueOf == null) {
                b0kVar3.i0(317193089);
                b0kVar3.r(z);
                obj2 = num;
            } else {
                b0kVar3.i0(317193090);
                int iIntValue2 = numValueOf.intValue();
                String strU = cwl1.U(2131820704, iIntValue2, new Object[]{Integer.valueOf(iIntValue2)}, b0kVar3);
                b0kVar3.r(z);
                obj2 = strU;
            }
            int iOrdinal = e490Var.ordinal();
            if (iOrdinal != 0) {
                z2 = true;
                if (iOrdinal != 1) {
                    y7e1Var = y7e1Var2;
                    if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                        eg.o();
                        return;
                    }
                } else {
                    y7e1Var = y7e1Var2;
                    i3 = 2131956767;
                }
                String strO0 = cwl1.o0(b0kVar3, i3);
                z3 = w9i1Var.T0;
                zI = b0kVar3.i(w9i1Var);
                objT = b0kVar3.T();
                if (!zI || objT == m4cVar) {
                    z4 = z3;
                    tob1Var3 = tob1Var;
                    r8 = 0;
                    b2 = 2;
                    i4 = i6;
                    ft30 ft30Var = new ft30(1, w9i1Var, w9i1.class, "shouldIncludeAutoScreenshot", "shouldIncludeAutoScreenshot(Z)V", 0, (byte) 17);
                    b0kVar3.s0(ft30Var);
                    objT = ft30Var;
                } else {
                    z4 = z3;
                    tob1Var3 = tob1Var;
                    r8 = 0;
                    b2 = 2;
                    i4 = i6;
                }
                iu30 iu30Var2 = (nla0) objT;
                zI2 = b0kVar3.i(ihg0VarE);
                Object objT6 = b0kVar3.T();
                obj3 = objT6;
                if (zI2 || objT6 == m4cVar) {
                    ezk ezkVar = new ezk(ihg0VarE, (byte) 1);
                    b0kVar3.s0(ezkVar);
                    obj3 = ezkVar;
                }
                Function0 function4 = (Function0) obj3;
                int i7 = (b0kVar3.g(iu30Var) ? 1 : 0) | (b0kVar3.i(w9i1Var) ? 1 : 0);
                if ((i5 & 7168) == 2048) {
                    r7 = 1;
                } else {
                    r7 = r8;
                }
                r0 = i7 | r7;
                Object objT7 = b0kVar3.T();
                obj4 = objT7;
                if (r0 == 0 || objT7 == m4cVar) {
                    m490 m490Var2 = new m490(iu30Var, w9i1Var, function1, (byte) r8);
                    b0kVar3.s0(m490Var2);
                    obj4 = m490Var2;
                }
                Function0 function5 = (Function0) obj4;
                tob1Var4 = tob1Var3;
                int i8 = (b0kVar3.i(tob1Var4) ? 1 : 0) | (b0kVar3.i(w9i1Var) ? 1 : 0);
                if (i4 == 256) {
                    r9 = 1;
                } else {
                    r9 = r8;
                }
                r1 = i8 | r9;
                Object objT8 = b0kVar3.T();
                if (r1 == 0 || objT8 == m4cVar) {
                    function2 = function0;
                    xvy xvyVar = new xvy(w9i1Var, function2, tob1Var4, (byte) 26);
                    b0kVar3.s0(xvyVar);
                    obj5 = xvyVar;
                } else {
                    function2 = function0;
                    obj5 = objT8;
                }
                String str2 = str;
                byte b3 = b2;
                d(y7e1Var, y7e1Var3, y7e1Var4, file, fFloatValue, zBooleanValue, size, z6, z7, str2, function3, iu30Var2, function4, function5, strO0, obj2, z4, (Function0) obj5, b0kVar3, 0);
                b0kVar2 = b0kVar3;
                q3p1.b((int) r8, 1, function3, b0kVar2, (boolean) r8);
                if (((Function0) tob1Var4.getValue()) != null || z5 || ((Boolean) tob1Var2.getValue()).booleanValue()) {
                    b0kVar2.i0(318753723);
                    b0kVar2.r((boolean) r8);
                } else {
                    b0kVar2.i0(318561523);
                    boolean zI4 = b0kVar2.i(tob1Var4);
                    Object objT9 = b0kVar2.T();
                    if (zI4 || objT9 == m4cVar) {
                        obj6 = objT9;
                        c470 c470Var = new c470(tob1Var4, (byte) 1);
                        b0kVar2.s0(c470Var);
                        obj6 = c470Var;
                    }
                    Function0 function6 = (Function0) obj6;
                    boolean zI5 = b0kVar2.i(tob1Var4);
                    Object objT10 = b0kVar2.T();
                    Object obj9 = objT10;
                    if (zI5 || objT10 == m4cVar) {
                        c470 c470Var2 = new c470(tob1Var4, b3);
                        b0kVar2.s0(c470Var2);
                        obj9 = c470Var2;
                    }
                    c(function6, (Function0) obj9, b0kVar2, r8);
                    b0kVar2.r((boolean) r8);
                }
            } else {
                y7e1Var = y7e1Var2;
                z2 = true;
            }
            i3 = 2131956768;
            String strO1 = cwl1.o0(b0kVar3, i3);
            z3 = w9i1Var.T0;
            zI = b0kVar3.i(w9i1Var);
            objT = b0kVar3.T();
            if (zI) {
                z4 = z3;
                tob1Var3 = tob1Var;
                r8 = 0;
                b2 = 2;
                i4 = i6;
                ft30 ft30Var2 = new ft30(1, w9i1Var, w9i1.class, "shouldIncludeAutoScreenshot", "shouldIncludeAutoScreenshot(Z)V", 0, (byte) 17);
                b0kVar3.s0(ft30Var2);
                objT = ft30Var2;
            } else {
                z4 = z3;
                tob1Var3 = tob1Var;
                r8 = 0;
                b2 = 2;
                i4 = i6;
                ft30 ft30Var3 = new ft30(1, w9i1Var, w9i1.class, "shouldIncludeAutoScreenshot", "shouldIncludeAutoScreenshot(Z)V", 0, (byte) 17);
                b0kVar3.s0(ft30Var3);
                objT = ft30Var3;
            }
            iu30 iu30Var3 = (nla0) objT;
            zI2 = b0kVar3.i(ihg0VarE);
            Object objT11 = b0kVar3.T();
            obj3 = objT11;
            if (zI2) {
                ezk ezkVar2 = new ezk(ihg0VarE, (byte) 1);
                b0kVar3.s0(ezkVar2);
                obj3 = ezkVar2;
            } else {
                ezk ezkVar3 = new ezk(ihg0VarE, (byte) 1);
                b0kVar3.s0(ezkVar3);
                obj3 = ezkVar3;
            }
            Function0 function7 = (Function0) obj3;
            int i9 = (b0kVar3.g(iu30Var) ? 1 : 0) | (b0kVar3.i(w9i1Var) ? 1 : 0);
            if ((i5 & 7168) == 2048) {
                r7 = 1;
            } else {
                r7 = r8;
            }
            r0 = i9 | r7;
            Object objT12 = b0kVar3.T();
            obj4 = objT12;
            if (r0 == 0) {
                m490 m490Var3 = new m490(iu30Var, w9i1Var, function1, (byte) r8);
                b0kVar3.s0(m490Var3);
                obj4 = m490Var3;
            } else {
                m490 m490Var4 = new m490(iu30Var, w9i1Var, function1, (byte) r8);
                b0kVar3.s0(m490Var4);
                obj4 = m490Var4;
            }
            Function0 function8 = (Function0) obj4;
            tob1Var4 = tob1Var3;
            int i10 = (b0kVar3.i(tob1Var4) ? 1 : 0) | (b0kVar3.i(w9i1Var) ? 1 : 0);
            if (i4 == 256) {
                r9 = 1;
            } else {
                r9 = r8;
            }
            r1 = i10 | r9;
            Object objT13 = b0kVar3.T();
            if (r1 == 0) {
                function2 = function0;
                xvy xvyVar2 = new xvy(w9i1Var, function2, tob1Var4, (byte) 26);
                b0kVar3.s0(xvyVar2);
                obj5 = xvyVar2;
            } else {
                function2 = function0;
                xvy xvyVar3 = new xvy(w9i1Var, function2, tob1Var4, (byte) 26);
                b0kVar3.s0(xvyVar3);
                obj5 = xvyVar3;
            }
            String str3 = str;
            byte b4 = b2;
            d(y7e1Var, y7e1Var3, y7e1Var4, file, fFloatValue, zBooleanValue, size, z6, z7, str3, function3, iu30Var3, function7, function8, strO1, obj2, z4, (Function0) obj5, b0kVar3, 0);
            b0kVar2 = b0kVar3;
            q3p1.b((int) r8, 1, function3, b0kVar2, (boolean) r8);
            if (((Function0) tob1Var4.getValue()) != null) {
                b0kVar2.i0(318753723);
                b0kVar2.r((boolean) r8);
            } else {
                b0kVar2.i0(318753723);
                b0kVar2.r((boolean) r8);
            }
        } else {
            function2 = function0;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, w9i1Var, e490Var, function2, function1, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void f(String str, y7e1 y7e1Var, e6e1 e6e1Var, dk80 dk80Var, kua0 kua0Var, fam famVar, vu30 vu30Var, String str2, b0k b0kVar, int i, int i2) {
        dk80 dk80Var2;
        int i3;
        kua0 kua0Var2;
        int i4;
        int i5;
        fam famVar2;
        int i6;
        int i7;
        int i8;
        vu30 vu30Var2;
        int i9;
        int i10;
        int i11;
        boolean z;
        b0k b0kVar2;
        dk80 dk80Var3;
        kua0 kua0Var3;
        fam famVar3;
        vu30 vu30Var3;
        h311 h311VarV;
        fam famVar4;
        boolean zI;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1048340948);
        int i12 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(y7e1Var) ? 32 : 16) | (b0kVar3.i(e6e1Var) ? 256 : 128);
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 = i12 | 3072;
            dk80Var2 = dk80Var;
        } else {
            dk80Var2 = dk80Var;
            i3 = i12 | (b0kVar3.i(dk80Var2) ? 2048 : 1024);
        }
        if ((i2 & 16) == 0) {
            kua0Var2 = kua0Var;
            int i14 = b0kVar3.i(kua0Var2) ? 16384 : 8192;
            i4 = i3 | i14;
            i5 = i2 & 32;
            if (i5 != 0) {
                i7 = i4 | 196608;
                famVar2 = famVar;
            } else {
                famVar2 = famVar;
                if (b0kVar3.i(famVar2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i7 = i4 | i6;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((i & 1572864) == 0) {
                    vu30Var2 = vu30Var;
                    if (b0kVar3.i(vu30Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i7 |= i9;
                }
                if (b0kVar3.g(str2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i11 = i7 | i10;
                if ((4793491 & i11) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i11 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i13 != 0) {
                            dk80Var2 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            kua0Var2 = kua0.g;
                        }
                        if (i5 != 0) {
                            famVar2 = null;
                        }
                        if (i8 != 0) {
                            vu30Var2 = null;
                        }
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                        }
                    }
                    int i15 = i11;
                    kua0 kua0Var4 = kua0Var2;
                    famVar4 = famVar2;
                    b0kVar3.s();
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(b0kVar3).f;
                    qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(16.0f));
                    zI = b0kVar3.i(famVar4) | ((29360128 & i15) == 8388608);
                    objT = b0kVar3.T();
                    if (zI || objT == fkj0.X) {
                        objT = new vq80(famVar4, str2, (byte) 4);
                        b0kVar3.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0VarQ, false, (iu30) objT);
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    dk80 dk80Var4 = dk80Var2;
                    rwo1.b(y7e1Var, qim0VarB, (max) null, str, vu30Var2, (vu30) null, false, false, dk80Var4, (lee1) null, kua0Var4, (yta0) null, e6e1Var, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).b.c, 0L, 896), b0kVar2, ((i15 >> 3) & 14) | ((i15 << 9) & 7168) | (57344 & (i15 >> 6)) | ((i15 << 15) & 234881024), ((i15 >> 12) & 14) | (i15 & 896), 912100);
                    famVar3 = famVar4;
                    dk80Var3 = dk80Var4;
                    kua0Var3 = kua0Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var3 = dk80Var2;
                    kua0Var3 = kua0Var2;
                    famVar3 = famVar2;
                }
                vu30Var3 = vu30Var2;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new fdx(str, y7e1Var, e6e1Var, dk80Var3, kua0Var3, famVar3, vu30Var3, str2, i, i2);
                }
            }
            i7 |= 1572864;
            vu30Var2 = vu30Var;
            if (b0kVar3.g(str2)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i11 = i7 | i10;
            if ((4793491 & i11) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i11 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        dk80Var2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        kua0Var2 = kua0.g;
                    }
                    if (i5 != 0) {
                        famVar2 = null;
                    }
                    if (i8 != 0) {
                        vu30Var2 = null;
                    }
                } else {
                    if (i13 != 0) {
                        dk80Var2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        kua0Var2 = kua0.g;
                    }
                    if (i5 != 0) {
                        famVar2 = null;
                    }
                    if (i8 != 0) {
                        vu30Var2 = null;
                    }
                }
                int i16 = i11;
                kua0 kua0Var5 = kua0Var2;
                famVar4 = famVar2;
                b0kVar3.s();
                qim0 qim0VarF2 = u291.f(nim0.a, 1.0f);
                uwr uwrVar2 = cbx.a;
                cua cuaVar2 = cbx.b(b0kVar3).f;
                qim0 qim0VarQ2 = i1p1.q(qim0VarF2, er31.b(16.0f));
                zI = b0kVar3.i(famVar4) | ((29360128 & i16) == 8388608);
                objT = b0kVar3.T();
                if (zI) {
                    objT = new vq80(famVar4, str2, (byte) 4);
                    b0kVar3.s0(objT);
                } else {
                    objT = new vq80(famVar4, str2, (byte) 4);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB2 = s161.b(qim0VarQ2, false, (iu30) objT);
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                dk80 dk80Var5 = dk80Var2;
                rwo1.b(y7e1Var, qim0VarB2, (max) null, str, vu30Var2, (vu30) null, false, false, dk80Var5, (lee1) null, kua0Var5, (yta0) null, e6e1Var, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).b.c, 0L, 896), b0kVar2, ((i16 >> 3) & 14) | ((i16 << 9) & 7168) | (57344 & (i16 >> 6)) | ((i16 << 15) & 234881024), ((i16 >> 12) & 14) | (i16 & 896), 912100);
                famVar3 = famVar4;
                dk80Var3 = dk80Var5;
                kua0Var3 = kua0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                dk80Var3 = dk80Var2;
                kua0Var3 = kua0Var2;
                famVar3 = famVar2;
            }
            vu30Var3 = vu30Var2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fdx(str, y7e1Var, e6e1Var, dk80Var3, kua0Var3, famVar3, vu30Var3, str2, i, i2);
            }
        }
        kua0Var2 = kua0Var;
        i4 = i3 | i14;
        i5 = i2 & 32;
        if (i5 != 0) {
            i7 = i4 | 196608;
            famVar2 = famVar;
        } else {
            famVar2 = famVar;
            if (b0kVar3.i(famVar2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i7 = i4 | i6;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((i & 1572864) == 0) {
                vu30Var2 = vu30Var;
                if (b0kVar3.i(vu30Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i7 |= i9;
            }
            if (b0kVar3.g(str2)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i11 = i7 | i10;
            if ((4793491 & i11) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i11 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        dk80Var2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        kua0Var2 = kua0.g;
                    }
                    if (i5 != 0) {
                        famVar2 = null;
                    }
                    if (i8 != 0) {
                        vu30Var2 = null;
                    }
                } else {
                    if (i13 != 0) {
                        dk80Var2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        kua0Var2 = kua0.g;
                    }
                    if (i5 != 0) {
                        famVar2 = null;
                    }
                    if (i8 != 0) {
                        vu30Var2 = null;
                    }
                }
                int i17 = i11;
                kua0 kua0Var6 = kua0Var2;
                famVar4 = famVar2;
                b0kVar3.s();
                qim0 qim0VarF3 = u291.f(nim0.a, 1.0f);
                uwr uwrVar3 = cbx.a;
                cua cuaVar3 = cbx.b(b0kVar3).f;
                qim0 qim0VarQ3 = i1p1.q(qim0VarF3, er31.b(16.0f));
                zI = b0kVar3.i(famVar4) | ((29360128 & i17) == 8388608);
                objT = b0kVar3.T();
                if (zI) {
                    objT = new vq80(famVar4, str2, (byte) 4);
                    b0kVar3.s0(objT);
                } else {
                    objT = new vq80(famVar4, str2, (byte) 4);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB3 = s161.b(qim0VarQ3, false, (iu30) objT);
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                dk80 dk80Var6 = dk80Var2;
                rwo1.b(y7e1Var, qim0VarB3, (max) null, str, vu30Var2, (vu30) null, false, false, dk80Var6, (lee1) null, kua0Var6, (yta0) null, e6e1Var, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).b.c, 0L, 896), b0kVar2, ((i17 >> 3) & 14) | ((i17 << 9) & 7168) | (57344 & (i17 >> 6)) | ((i17 << 15) & 234881024), ((i17 >> 12) & 14) | (i17 & 896), 912100);
                famVar3 = famVar4;
                dk80Var3 = dk80Var6;
                kua0Var3 = kua0Var6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                dk80Var3 = dk80Var2;
                kua0Var3 = kua0Var2;
                famVar3 = famVar2;
            }
            vu30Var3 = vu30Var2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fdx(str, y7e1Var, e6e1Var, dk80Var3, kua0Var3, famVar3, vu30Var3, str2, i, i2);
            }
        }
        i7 |= 1572864;
        vu30Var2 = vu30Var;
        if (b0kVar3.g(str2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        i11 = i7 | i10;
        if ((4793491 & i11) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i11 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    dk80Var2 = null;
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    kua0Var2 = kua0.g;
                }
                if (i5 != 0) {
                    famVar2 = null;
                }
                if (i8 != 0) {
                    vu30Var2 = null;
                }
            } else {
                if (i13 != 0) {
                    dk80Var2 = null;
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    kua0Var2 = kua0.g;
                }
                if (i5 != 0) {
                    famVar2 = null;
                }
                if (i8 != 0) {
                    vu30Var2 = null;
                }
            }
            int i18 = i11;
            kua0 kua0Var7 = kua0Var2;
            famVar4 = famVar2;
            b0kVar3.s();
            qim0 qim0VarF4 = u291.f(nim0.a, 1.0f);
            uwr uwrVar4 = cbx.a;
            cua cuaVar4 = cbx.b(b0kVar3).f;
            qim0 qim0VarQ4 = i1p1.q(qim0VarF4, er31.b(16.0f));
            zI = b0kVar3.i(famVar4) | ((29360128 & i18) == 8388608);
            objT = b0kVar3.T();
            if (zI) {
                objT = new vq80(famVar4, str2, (byte) 4);
                b0kVar3.s0(objT);
            } else {
                objT = new vq80(famVar4, str2, (byte) 4);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB4 = s161.b(qim0VarQ4, false, (iu30) objT);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            dk80 dk80Var7 = dk80Var2;
            rwo1.b(y7e1Var, qim0VarB4, (max) null, str, vu30Var2, (vu30) null, false, false, dk80Var7, (lee1) null, kua0Var7, (yta0) null, e6e1Var, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).d.b, cbx.a(b0kVar3).b.c, 0L, 896), b0kVar2, ((i18 >> 3) & 14) | ((i18 << 9) & 7168) | (57344 & (i18 >> 6)) | ((i18 << 15) & 234881024), ((i18 >> 12) & 14) | (i18 & 896), 912100);
            famVar3 = famVar4;
            dk80Var3 = dk80Var7;
            kua0Var3 = kua0Var7;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            dk80Var3 = dk80Var2;
            kua0Var3 = kua0Var2;
            famVar3 = famVar2;
        }
        vu30Var3 = vu30Var2;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fdx(str, y7e1Var, e6e1Var, dk80Var3, kua0Var3, famVar3, vu30Var3, str2, i, i2);
        }
    }

    public static final void g(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1479118350);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i | (x340Var.i(qim0Var2) ? 4 : 2);
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0Var4 = i4 != 0 ? qim0Var3 : qim0Var2;
            qim0 qim0VarN = anm1.N("PremiumSignifier", qim0Var4);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var5 = qim0Var4;
            w0h1.a(wsx.c, isl.a, anm1.N("PremiumSignifierIcon", u291.r(qim0Var3, 16.0f)), cbx.a(x340Var).c.c, 0L, false, x340Var, wsx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var3, 4.0f));
            uwo1.e(cwl1.o0(x340Var, 2131960353), anm1.N("PremiumSignifierText", qim0Var3), cbx.d(x340Var).n, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0((byte) 29, i, i2, qim0Var2);
        }
    }

    public static final void h(String str, ff ffVar, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-414746430);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(ffVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new sf21(new us21(function0, (byte) 6));
                x340Var.s0(objT);
            }
            sf21 sf21Var = (sf21) objT;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, u291.f(nim0.a, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            otw.c(sf21Var, new rf21(str, gqg0.d(ffVar), gqg0.c(ffVar)), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(str, ffVar, function0, i);
        }
    }

    public static final void i(noq noqVar, ja31 ja31Var, Function0 function0, Function0 function1, xu30 xu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(106040295);
        int i2 = i | (x340Var.g(noqVar) ? 4 : 2) | (x340Var.g(ja31Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(xu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            irn1.u((qim0) null, apo.r(1104140244, new l931(ja31Var, function0, (byte) 1), x340Var), (vu30) null, (erl1) null, apo.r(708287054, new kj21(xu30Var, ja31Var, function1, noqVar, (byte) 1), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(noqVar, ja31Var, function0, function1, xu30Var, i, (byte) 5);
        }
    }

    public static final void j(int i, Function0 function0, b0k b0kVar, boolean z) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(812012094);
        int i2 = i | (b0kVar2.h(z) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = bin.x(u291.h(u291.f(nim0Var, 1.0f), 48.0f), z, (String) null, new pm31(0), (idn0) null, function0, 10);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
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
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            knx knxVar = knx.c;
            long j = cbx.a(b0kVar2).b.e;
            qim0 qim0VarR = u291.r(nim0Var, 24.0f);
            int i3 = knx.d | 48;
            isl islVar = isl.a;
            w0h1.a(knxVar, islVar, qim0VarR, j, 0L, false, b0kVar2, i3, 48);
            uwo1.e(cwl1.o0(b0kVar2, 2131956761), new wnb0(1.0f, true), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.e, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
            b0kVar2 = b0kVar2;
            w0h1.a(plx.c, islVar, u291.r(nim0Var, 16.0f), cbx.a(b0kVar2).b.e, 0L, false, b0kVar2, plx.d | 48, 48);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ie1((byte) 10, i, function0, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void k(s1f1 s1f1Var, vu30 vu30Var, vu30 vu30Var2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        vu30 vu30Var3;
        int i3;
        vu30 vu30Var4;
        int i4;
        boolean z;
        j2i j2iVar2;
        vu30 vu30Var5;
        vu30 vu30Var6;
        h311 h311VarV;
        vu30 vu30Var7;
        vu30 vu30Var8;
        int iT;
        boolean zE;
        Object objT;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1164960590);
        int i5 = (x340Var.i(s1f1Var) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                vu30Var3 = vu30Var;
                i5 |= x340Var.i(vu30Var3) ? 32 : 16;
            }
            i3 = i2 & 4;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    vu30Var4 = vu30Var2;
                    if (x340Var.i(vu30Var4)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i5 |= i4;
                }
                if ((i5 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i5 & 1, z)) {
                    if (i6 != 0) {
                        vu30Var7 = knj.a;
                    } else {
                        vu30Var7 = vu30Var3;
                    }
                    if (i3 != 0) {
                        vu30Var8 = knj.b;
                    } else {
                        vu30Var8 = vu30Var4;
                    }
                    uwr uwrVar = cbx.a;
                    iT = jfv.t(cbx.c(x340Var).b.b, ngv.d);
                    gra graVar = een.h;
                    zE = x340Var.e(iT);
                    objT = x340Var.T();
                    if (zE || objT == m4cVar) {
                        objT = new sl11(iT, (byte) 16);
                        x340Var.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = nhe1.V0;
                        x340Var.s0(objT2);
                    }
                    j2iVar2 = j2iVar;
                    hm5.a(s1f1Var, (qim0) null, iu30Var, graVar, "ToolLoadStateContent", (iu30) objT2, apo.r(95222468, new gk0(vu30Var7, vu30Var8, j2iVar2, (byte) 26), x340Var), x340Var, (i5 & 14) | 1794048, 2);
                    vu30Var5 = vu30Var7;
                    vu30Var6 = vu30Var8;
                } else {
                    j2iVar2 = j2iVar;
                    x340Var.b0();
                    vu30Var5 = vu30Var3;
                    vu30Var6 = vu30Var4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m82(i, s1f1Var, vu30Var5, vu30Var6, j2iVar2, i2, (byte) 5);
                }
            }
            i5 |= 384;
            vu30Var4 = vu30Var2;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                if (i6 != 0) {
                    vu30Var7 = knj.a;
                } else {
                    vu30Var7 = vu30Var3;
                }
                if (i3 != 0) {
                    vu30Var8 = knj.b;
                } else {
                    vu30Var8 = vu30Var4;
                }
                uwr uwrVar2 = cbx.a;
                iT = jfv.t(cbx.c(x340Var).b.b, ngv.d);
                gra graVar2 = een.h;
                zE = x340Var.e(iT);
                objT = x340Var.T();
                if (zE) {
                    objT = new sl11(iT, (byte) 16);
                    x340Var.s0(objT);
                } else {
                    objT = new sl11(iT, (byte) 16);
                    x340Var.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = nhe1.V0;
                    x340Var.s0(objT2);
                }
                j2iVar2 = j2iVar;
                hm5.a(s1f1Var, (qim0) null, iu30Var2, graVar2, "ToolLoadStateContent", (iu30) objT2, apo.r(95222468, new gk0(vu30Var7, vu30Var8, j2iVar2, (byte) 26), x340Var), x340Var, (i5 & 14) | 1794048, 2);
                vu30Var5 = vu30Var7;
                vu30Var6 = vu30Var8;
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m82(i, s1f1Var, vu30Var5, vu30Var6, j2iVar2, i2, (byte) 5);
            }
        }
        i5 |= 48;
        vu30Var3 = vu30Var;
        i3 = i2 & 4;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                vu30Var4 = vu30Var2;
                if (x340Var.i(vu30Var4)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i5 |= i4;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                if (i6 != 0) {
                    vu30Var7 = knj.a;
                } else {
                    vu30Var7 = vu30Var3;
                }
                if (i3 != 0) {
                    vu30Var8 = knj.b;
                } else {
                    vu30Var8 = vu30Var4;
                }
                uwr uwrVar3 = cbx.a;
                iT = jfv.t(cbx.c(x340Var).b.b, ngv.d);
                gra graVar3 = een.h;
                zE = x340Var.e(iT);
                objT = x340Var.T();
                if (zE) {
                    objT = new sl11(iT, (byte) 16);
                    x340Var.s0(objT);
                } else {
                    objT = new sl11(iT, (byte) 16);
                    x340Var.s0(objT);
                }
                iu30 iu30Var3 = (iu30) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = nhe1.V0;
                    x340Var.s0(objT2);
                }
                j2iVar2 = j2iVar;
                hm5.a(s1f1Var, (qim0) null, iu30Var3, graVar3, "ToolLoadStateContent", (iu30) objT2, apo.r(95222468, new gk0(vu30Var7, vu30Var8, j2iVar2, (byte) 26), x340Var), x340Var, (i5 & 14) | 1794048, 2);
                vu30Var5 = vu30Var7;
                vu30Var6 = vu30Var8;
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
                vu30Var5 = vu30Var3;
                vu30Var6 = vu30Var4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m82(i, s1f1Var, vu30Var5, vu30Var6, j2iVar2, i2, (byte) 5);
            }
        }
        i5 |= 384;
        vu30Var4 = vu30Var2;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            if (i6 != 0) {
                vu30Var7 = knj.a;
            } else {
                vu30Var7 = vu30Var3;
            }
            if (i3 != 0) {
                vu30Var8 = knj.b;
            } else {
                vu30Var8 = vu30Var4;
            }
            uwr uwrVar4 = cbx.a;
            iT = jfv.t(cbx.c(x340Var).b.b, ngv.d);
            gra graVar4 = een.h;
            zE = x340Var.e(iT);
            objT = x340Var.T();
            if (zE) {
                objT = new sl11(iT, (byte) 16);
                x340Var.s0(objT);
            } else {
                objT = new sl11(iT, (byte) 16);
                x340Var.s0(objT);
            }
            iu30 iu30Var4 = (iu30) objT;
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = nhe1.V0;
                x340Var.s0(objT2);
            }
            j2iVar2 = j2iVar;
            hm5.a(s1f1Var, (qim0) null, iu30Var4, graVar4, "ToolLoadStateContent", (iu30) objT2, apo.r(95222468, new gk0(vu30Var7, vu30Var8, j2iVar2, (byte) 26), x340Var), x340Var, (i5 & 14) | 1794048, 2);
            vu30Var5 = vu30Var7;
            vu30Var6 = vu30Var8;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            vu30Var5 = vu30Var3;
            vu30Var6 = vu30Var4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m82(i, s1f1Var, vu30Var5, vu30Var6, j2iVar2, i2, (byte) 5);
        }
    }

    public static final boolean l(fjt fjtVar) {
        int iOrdinal = fjtVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return true;
        }
        eg.o();
        return false;
    }

    public static final boolean m(String str) {
        String string = ihc1.e1(str).toString();
        return nhc1.S(string, "/recognize", true) || nhc1.S(string, "/listen", true);
    }

    public static final TimeMeasurement n(pne1 pne1Var) {
        e811 e811VarY = y(pne1Var.e);
        jne1 jne1VarS = TimeMeasurement.s();
        jne1VarS.w(pne1Var.a.toString());
        jne1VarS.u(pne1Var.b);
        jne1VarS.n(pne1Var.d);
        jne1VarS.q(pne1Var.c);
        jne1VarS.t(e811VarY.a);
        jne1VarS.r(e811VarY.b);
        jne1VarS.s(e811VarY.c);
        String str = pne1Var.f;
        if (str != null) {
            jne1VarS.v(str);
        }
        return jne1VarS.build();
    }

    public static final TimeMeasurementErrorNonAuth o(pne1 pne1Var) {
        e811 e811VarY = y(o7h.p1(o7h.d1(pne1Var.e, 25)));
        vne1 vne1VarV = TimeMeasurementErrorNonAuth.v();
        vne1VarV.B(pne1Var.a.toString());
        vne1VarV.y(pne1Var.b);
        vne1VarV.n(pne1Var.d);
        vne1VarV.r(pne1Var.c);
        vne1VarV.w(e811VarY.a);
        vne1VarV.u(e811VarY.b);
        vne1VarV.v(e811VarY.c);
        String str = pne1Var.f;
        if (str != null) {
            vne1VarV.A(str);
        }
        UUID uuid = pne1Var.g;
        if (uuid != null) {
            vne1VarV.C(uuid.toString());
        }
        une1 une1Var = pne1Var.h;
        if (une1Var != null) {
            vne1VarV.z(p3d1.e(une1Var.a));
            vne1VarV.q(une1Var.b);
            e811 e811VarY2 = y(o7h.p1(o7h.d1(une1Var.c, 25)));
            vne1VarV.t(e811VarY2.a);
            vne1VarV.s(e811VarY2.c);
        }
        return vne1VarV.build();
    }

    public static final TimeMeasurementNonAuth p(pne1 pne1Var) {
        e811 e811VarY = y(pne1Var.e);
        eoe1 eoe1VarS = TimeMeasurementNonAuth.s();
        eoe1VarS.w(pne1Var.a.toString());
        eoe1VarS.u(pne1Var.b);
        eoe1VarS.n(pne1Var.d);
        eoe1VarS.q(pne1Var.c);
        eoe1VarS.t(e811VarY.a);
        eoe1VarS.r(e811VarY.b);
        eoe1VarS.s(e811VarY.c);
        String str = pne1Var.f;
        if (str != null) {
            eoe1VarS.v(str);
        }
        return eoe1VarS.build();
    }

    public static final String q(rq2 rq2Var) {
        if (gq2.a[rq2Var.ordinal()] == 1) {
            return "genpods-prompt-chat";
        }
        return null;
    }

    public static final qim0 r(float f, qim0 qim0Var, boolean z) {
        return qim0Var.then(new a57(f, z));
    }

    public static void t(hqt hqtVar, wtr wtrVar) {
        hqtVar.a = wtrVar;
    }

    public static final boolean u(int i, long j, int i2) {
        int iK = hjl.k(j);
        if (i > hjl.i(j) || iK > i) {
            return false;
        }
        return i2 <= hjl.h(j) && hjl.j(j) <= i2;
    }

    public static ksk0 v() {
        return new ksk0((byte) 21);
    }

    public static final bbl1 w(Iterator it) {
        Object next = it.next();
        i1r i1rVar = next instanceof i1r ? (i1r) next : null;
        Object obj = i1rVar != null ? i1rVar.a : null;
        if (obj instanceof bbl1) {
            return (bbl1) obj;
        }
        return null;
    }

    public static final Object x(xos0 xos0Var, xky0 xky0Var) {
        Object objB = xos0Var.get(xky0Var);
        if (objB == null) {
            objB = xky0Var.b();
        }
        return ((osi1) objB).a(xos0Var);
    }

    public static final e811 y(Set set) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            di40 di40Var = (di40) it.next();
            Object obj = di40Var.c;
            String str = di40Var.a;
            Long l = (Long) obj;
            if (l != null) {
                map.put(str, Long.valueOf(l.longValue()));
            }
            Long l2 = di40Var.d;
            if (l2 != null) {
                map2.put(str, Long.valueOf(l2.longValue()));
            }
            String str2 = di40Var.b;
            if (str2 != null) {
                map3.put(str, str2);
            }
        }
        return new e811(map, map2, map3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static final w7l1 z(e6l1 e6l1Var, bbl1 bbl1Var, bbl1 bbl1Var2, String str) {
        kjj1 jjj1Var;
        String str2;
        afx afxVar;
        afx afxVar2;
        bbl1 bbl1Var3 = (bbl1Var2.h != null || bbl1Var2.b.length() > 0) ? bbl1Var2 : bbl1Var;
        zal1 zal1Var = bbl1Var3.h;
        abl1 abl1Var = bbl1Var.d;
        u7h u7hVar = null;
        if (abl1Var != null) {
            String str3 = abl1Var.a;
            int iC = l1d.C(abl1Var.b);
            if (iC == 0) {
                jjj1Var = new jjj1(abl1Var.c, abl1Var.d, str3);
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                jjj1Var = new kjj1(abl1Var.c, abl1Var.d, str3);
            }
        } else {
            jjj1Var = null;
        }
        if (jjj1Var != null) {
            zal1 zal1Var2 = bbl1Var.c;
            if (zal1Var2 != null) {
                str2 = zal1Var2.a;
            } else {
                str2 = null;
            }
        } else {
            zal1 zal1Var3 = bbl1Var.e;
            if (zal1Var3 != null) {
                str2 = zal1Var3.a;
            } else {
                str2 = null;
            }
        }
        String str4 = bbl1Var3.b;
        String str5 = zal1Var == null ? str4 : "";
        String str6 = bbl1Var3.g;
        if (str6.length() <= 0) {
            str6 = null;
        }
        String str7 = str6 == null ? str4 : str6;
        Double d = bbl1Var.f;
        t7l1 t7l1Var = new t7l1(new h8l1(str5, (String) null, (String) null, str7, str2 == null ? "" : str2, (k4m) null, d != null ? Float.valueOf((float) d.doubleValue()) : null, zal1Var != null ? zal1Var.a : null, 228), new s7l1(jjj1Var, str, jjj1Var != null));
        String str8 = e6l1Var.c;
        String str9 = e6l1Var.d;
        String str10 = str9 == null ? "" : str9;
        String str11 = bbl1Var2.j;
        if (str11.length() <= 0) {
            str11 = null;
        }
        if (str11 == null && (str11 = e6l1Var.e) == null) {
            str11 = e6l1Var.b;
        }
        String str12 = str11;
        String str13 = e6l1Var.b;
        String str14 = e6l1Var.a;
        yal1 yal1Var = bbl1Var2.i;
        if (yal1Var == null || (afxVar2 = yal1Var.c) == null) {
            yal1 yal1Var2 = bbl1Var.i;
            if (yal1Var2 != null && (afxVar = yal1Var2.c) != null) {
                u7hVar = new u7h(afxVar.b.b);
            }
        } else {
            u7hVar = new u7h(afxVar2.b.b);
        }
        return new w7l1(t7l1Var, str8, str10, str12, str13, str14, u7hVar);
    }
}
