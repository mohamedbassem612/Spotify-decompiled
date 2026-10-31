package p;

import android.content.Intent;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dzo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(gt40 gt40Var, z9h z9hVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-525156579);
        if (((i | 6 | (x340Var.g(z9hVar) ? 32 : 16)) & 19) == 18 && x340Var.H()) {
            x340Var.b0();
        } else {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                gt40Var = et40.a;
            } else {
                x340Var.b0();
            }
            x340Var.s();
            int i2 = tcg.a;
            x340Var.j0(-1115894518);
            x340Var.j0(1886828752);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(new wam1(0, (byte) 29));
            } else {
                x340Var.v0();
            }
            nko1.H(gt40Var, x340Var, eqe.b1);
            nko1.H(z9hVar, x340Var, eqe.c1);
            x340Var.r(true);
            x340Var.r(false);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(gt40Var, z9hVar, i, (byte) 20);
        }
    }

    public static final void b(Function0 function0, qim0 qim0Var, boolean z, idn0 idn0Var, b0k b0kVar, int i) {
        boolean z2;
        idn0 idn0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(451283746);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | 3456;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var3 = (idn0) objT;
            c(function0, qim0Var, idn0Var3, lsi.a, x340Var, (i2 & 112) | (i2 & 14) | 24576 | 3456);
            idn0Var2 = idn0Var3;
            z2 = true;
        } else {
            x340Var.b0();
            z2 = z;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xk70(function0, qim0Var, z2, idn0Var2, i, (byte) 0);
        }
    }

    public static final void c(Function0 function0, qim0 qim0Var, idn0 idn0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        long jC;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-631194408);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(idn0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (((Boolean) k1u.m(idn0Var, x340Var2, (i2 >> 9) & 14).getValue()).booleanValue()) {
                x340Var2.i0(-987424323);
                uwr uwrVar = cbx.a;
                jC = cbx.a(x340Var2).a.b.b();
                x340Var2.r(false);
            } else {
                x340Var2.i0(-987422527);
                uwr uwrVar2 = cbx.a;
                jC = cbx.a(x340Var2).a.b.c();
                x340Var2.r(false);
            }
            x340Var = x340Var2;
            qim0 qim0VarF = dug.f(uyn1.z(0.0f, 8.0f, 1, bin.v(u291.s(qim0Var, 32.0f, 48.0f), idn0Var, null, true, null, new pm31(0), function0, 8)), ((u7h) w191.a(jC, null, "Background color", x340Var2, 384, 10).getValue()).a, er31.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            dv20.l((i2 >> 12) & 14, j2iVar, x340Var, true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20((byte) 14, i, function0, idn0Var, j2iVar, qim0Var);
        }
    }

    public static final void d(Function0 function0, qim0 qim0Var, boolean z, idn0 idn0Var, b0k b0kVar, int i) {
        boolean z2;
        idn0 idn0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1686682626);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | 3456;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var3 = (idn0) objT;
            c(function0, qim0Var, idn0Var3, lsi.b, x340Var, (i2 & 112) | (i2 & 14) | 24576 | 3456);
            idn0Var2 = idn0Var3;
            z2 = true;
        } else {
            x340Var.b0();
            z2 = z;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xk70(function0, qim0Var, z2, idn0Var2, i, (byte) 1);
        }
    }

    public static final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(874238102);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new g0s0(iu30Var, (byte) 27);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(8);
            gdx gdxVarR = yla.r(x340Var);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.c(gbxVar, idxVar, anm1.N("allboarding_contextual_audio_play_button", nim0.a), null, gdx.b(gdxVarR, new zzq0(f, 8.0f, f, 8.0f), 0.0f, 0.0f, 0.0f, 62), null, null, null, null, null, f8j.a, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 28, i, iu30Var, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(x1j1 x1j1Var, iu30 iu30Var, kuq kuqVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-497765787);
        int i2 = (x340Var.g(x1j1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(kuqVar) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            boolean z = x1j1Var instanceof w1j1;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(1892742922);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = kuqVar.a(new y0j1(iu30Var, (byte) 3), new ceg1(iu30Var, (byte) 17));
                    x340Var.s0(objT);
                }
                w1j1 w1j1Var = (w1j1) x1j1Var;
                otw.c((y2j1) objT, new x2j1(w1j1Var.c, w1j1Var.b, w1j1Var.a), anm1.N("success", nim0Var), (ipb1) null, x340Var, 72, 8);
                x340Var.r(false);
            } else {
                if (!(x1j1Var instanceof v1j1)) {
                    throw p3d1.k(x340Var, 892338877, false);
                }
                x340Var.i0(1893357590);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new h2j1(new y0j1(iu30Var, (byte) 1), new y0j1(iu30Var, (byte) 2), new ceg1(iu30Var, (byte) 16));
                    x340Var.s0(objT2);
                }
                v1j1 v1j1Var = (v1j1) x1j1Var;
                otw.c((h2j1) objT2, new f2j1(v1j1Var.a, v1j1Var.b), anm1.N("failure", nim0Var), (ipb1) null, x340Var, 0, 8);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, x1j1Var, iu30Var, kuqVar, qim0Var, (byte) 28);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:47|22|(1:34)(1:25)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r11 = r9;
        r9 = r1;
        r1 = r11;
        r12 = r2;
        r11 = r7;
        r2 = r10;
        r7 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v1, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b8 -> B:36:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c1 -> B:38:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(int r18, p.iu30 r19, p.vu30 r20, p.onm r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dzo1.g(int, p.iu30, p.vu30, p.onm):java.lang.Object");
    }

    public static final xnj0 h(w6e0 w6e0Var, Object obj, tlj0 tlj0Var) {
        int iOrdinal = syo1.l((ioj0) ((xe01) w6e0Var.c).a.getValue(), o(tlj0Var, obj)).ordinal();
        if (iOrdinal == 0) {
            return unj0.a;
        }
        if (iOrdinal == 1) {
            return new vnj0(obj);
        }
        if (iOrdinal == 2) {
            return wnj0.a;
        }
        eg.o();
        return null;
    }

    public static wzn i(j21 j21Var, oj80 oj80Var, kp5 kp5Var) {
        return new wzn(j21Var, oj80Var, kp5Var);
    }

    public static dbm j(Object obj, Looper looper, String str) {
        zod.t(obj, "Listener must not be null");
        zod.t(looper, "Looper must not be null");
        dbm dbmVar = new dbm();
        dbmVar.a = new g960(looper);
        zod.t(obj, "Listener must not be null");
        zod.o(str);
        dbmVar.b = new c9d0(obj, str);
        return dbmVar;
    }

    public static final void k(Intent intent, mmr0... mmr0VarArr) {
        intent.putExtras(mno1.h((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length)));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    public static final Next l(Next next, kak0 kak0Var) {
        x6b x6bVar;
        Float fM;
        kak0 kak0Var2 = (kak0) x1p1.l(next);
        if (kak0Var2 != null) {
            Float f = kak0Var2.j1;
            lhg1 lhg1Var = kak0Var2.S0;
            q6w0 q6w0Var = lhg1Var.a;
            ruq0 ruq0Var = lhg1Var.b;
            x6b x6bVar2 = q6w0Var.P0;
            if (x6bVar2 != null) {
                List list = x6bVar2.a;
                ekc1 ekc1Var = (ekc1) o7h.X0(list);
                if (ekc1Var == null || ekc1Var.a != 1) {
                    ekc1Var = null;
                }
                if (ekc1Var != null) {
                    int i = kak0Var.S0.b.X;
                    int i2 = ruq0Var.X;
                    if (i <= 0 || i2 <= 0) {
                        x6bVar = null;
                    } else {
                        float f2 = (ekc1Var.c * i) / i2;
                        float fP = pqo.p(ruq0Var, f);
                        ekc1 ekc1Var2 = (ekc1) o7h.X0(list);
                        if (ekc1Var2 == null || ekc1Var2.a != 1) {
                            ekc1Var2 = null;
                        }
                        if (ekc1Var2 == null) {
                            x6bVar = null;
                        } else {
                            float f3 = ekc1Var2.b;
                            if (pqo.l(f2, f3, fP) && (fM = pqo.m(f3, fP)) != null) {
                                float fFloatValue = fM.floatValue();
                                if (f2 > fFloatValue) {
                                    f2 = fFloatValue;
                                }
                                x6bVar = new x6b(Collections.singletonList(ekc1.a(ekc1Var2, 0.0f, f2, 1.0f, 3)));
                            } else {
                                x6bVar = null;
                            }
                        }
                    }
                    k7f0 k7f0Var = lhg1Var.a.g;
                    if (k7f0Var == null) {
                        k7f0Var = new k7f0(m7f0.i);
                    }
                    x6b x6bVarZ = xto.z(new l7f0(k7f0Var, x6bVar2, (x6b) null), x6bVar, ruq0Var, f);
                    if (!u890.j(x6bVarZ, x6bVar2)) {
                        if (x6bVarZ == null) {
                            Logger.k("Resetting invalid saved loop after duration change (%d -> %d ms)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                        }
                        return Next.i(kak0.a(kak0Var2, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(lhg1Var.a, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, x6bVarZ, 32767), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575), next.b());
                    }
                }
            }
        }
        return next;
    }

    public static final xnj0 m(w6e0 w6e0Var, Object obj, tlj0 tlj0Var, x340 x340Var, int i) {
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(wnj0.a);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Map mapO = o(tlj0Var, obj);
        Set setKeySet = mapO.keySet();
        boolean zI = ((((i & 112) ^ 48) > 32 && x340Var.i(obj)) || (i & 48) == 32) | x340Var.i(w6e0Var) | x340Var.i(mapO);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            z290 z290Var = new z290(w6e0Var, mapO, obj, ven0Var, (lnm) null, (byte) 29);
            x340Var.s0(z290Var);
            objT2 = z290Var;
        }
        qxd0.t(setKeySet, x340Var, (vu30) objT2);
        return (xnj0) ven0Var.getValue();
    }

    public static final smc0 n(Set set) {
        smc0 smc0VarN = k4p1.n();
        if (set.contains(drc0.a)) {
            smc0VarN.add(new ma20());
            smc0VarN.add(new na20());
        } else if (set.contains(crc0.a)) {
            smc0VarN.add(new ma20());
        } else if (set.contains(krc0.a)) {
            smc0VarN.add(new na20());
        }
        if (set.contains(brc0.a)) {
            smc0VarN.add(new la20());
        }
        return k4p1.k(smc0VarN);
    }

    public static final Map o(tlj0 tlj0Var, Object obj) {
        Map map = (Map) tlj0Var.a.invoke(obj);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object obj2 = tlj0Var.b.get(entry.getKey());
            obj2.getClass();
            Set set = (Set) obj2;
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new mmr0((String) it.next(), set));
            }
            r7h.W(arrayList2, arrayList);
        }
        return sqg0.T(arrayList);
    }
}
