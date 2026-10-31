package p;

import android.os.ResultReceiver;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class uah1 {
    public static final List a = p7h.M(new Float[]{Float.valueOf(0.9f), Float.valueOf(0.65f), Float.valueOf(0.8f), Float.valueOf(0.5f), Float.valueOf(0.75f)});

    public static final void a(String str, boolean z, Integer num, Function0 function0, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-248400896);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarZ, er31.b(8.0f)), cbx.a(x340Var).a.a.c(), d4o1.a);
            boolean z3 = (i2 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new sah1(function0, (byte) 0);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF2, z2, (String) null, (pm31) null, (idn0) null, (Function0) objT, 14);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 12.0f, 12.0f);
            fra fraVar = een.N0;
            cvx cvxVar4 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            hrx hrxVar = hrx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            u7h u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
            if (u7hVar == null) {
                x340Var.i0(-120085328);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                x340Var.i0(-120086909);
                x340Var.r(false);
                j = u7hVar.a;
            }
            w0h1.a(hrxVar, isl.a, qim0VarR, j, 0L, false, x340Var, hrx.d | 48, 48);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0((byte) 13, i, str, num, function0, z);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1616712595);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131963452);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            n9p1.i(384, Collections.singletonList(k4d1.a), moj.d, x340Var, (qim0) null);
            qim0 qim0VarA = h2c.a.a(nim0Var, een.i);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), ldxVar, qim0VarA, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1536239086, new zsd1(strO0, (byte) 8), x340Var), x340Var, 0, 48, 2008);
                x340Var.r(true);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function0, i, (byte) 19);
        }
    }

    public static final void c(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(975233074);
        int i2 = (x340Var.d(f) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(2.0f);
            zov0 zov0Var = cbx.b(x340Var).g;
            e(cr31VarB, u291.r(nim0Var, 40.0f), x340Var, 0);
            cua cuaVar2 = cbx.b(x340Var).f;
            cr31 cr31VarB2 = er31.b(2.0f);
            qim0 qim0VarF2 = u291.f(nim0Var, f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            e(cr31VarB2, u291.h(qim0VarF2, 12.0f), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 13, f, i);
        }
    }

    public static final void d(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(819656992);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(qim0VarZ, 0.0f, 12.0f, 0.0f, 6.0f, 5), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsd1(str, i, (byte) 9);
        }
    }

    public static final void e(cr31 cr31Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(315298808);
        int i2 = (x340Var.i(cr31Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0Var, cbx.a(x340Var).a.b.a(), cr31Var), 0L, cr31Var, 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9e0(cr31Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void f(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-907284907);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            scx scxVarM = pno1.m(x340Var);
            function1 = function0;
            ila0.c(scxVarM, moj.b, moj.c, apo.r(-2109674797, new xaf1(cwl1.o0(x340Var, 2131963454), scxVarM, (byte) 19), x340Var), (vu30) null, function1, x340Var, ((i2 << 15) & 458752) | 3504, 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function1, i, (byte) 20);
        }
    }

    public static final void g(String str, rxe1 rxe1Var, List list, List list2, Set set, Set set2, boolean z, Set set3, tsq tsqVar, tsq tsqVar2, Function0 function0, iu30 iu30Var, iu30 iu30Var2, ResultReceiver resultReceiver, avk avkVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z2;
        int i2;
        int i3;
        m4c m4cVar;
        boolean z3;
        rxe1 rxe1Var2 = rxe1Var;
        iu30 iu30Var3 = iu30Var2;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(213690478);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(rxe1Var2) ? 32 : 16) | (x340Var.i(list) ? 256 : 128) | (x340Var.i(list2) ? 2048 : 1024) | (x340Var.g(set) ? 16384 : 8192) | (x340Var.g(set2) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288) | (x340Var.g(set3) ? 8388608 : 4194304) | (x340Var.i(tsqVar) ? 67108864 : 33554432) | (x340Var.i(tsqVar2) ? 536870912 : 268435456);
        int i5 = (x340Var.i(function0) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var3) ? 256 : 128) | (x340Var.i(resultReceiver) ? 2048 : 1024) | (x340Var.g(avkVar) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            Object objT = x340Var.T();
            if (objT == m4cVar2) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object[] objArr = new Object[0];
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar2) {
                objT2 = q9f1.e1;
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var, 48);
            boolean z4 = z || !set3.isEmpty();
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zH = x340Var.h(z4) | x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zH || objT3 == m4cVar2) {
                objT3 = new hj6(z4, ven0Var, null, (byte) 23);
                x340Var.s0(objT3);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF2);
            kiv kivVar = xce0.a;
            qim0 qim0VarH = l6o1.H(zr7.i(qim0VarP, gce0.c), l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
            hzj.A.getClass();
            ven0 ven0Var3 = ven0Var;
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
            ven0 ven0Var4 = ven0Var2;
            boolean zI = x340Var.i(ven0Var4);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar2) {
                objT4 = new aya1(ven0Var4, (byte) 18);
                x340Var.s0(objT4);
            }
            b((Function0) objT4, x340Var, 0);
            d(cwl1.o0(x340Var, 2131963460), x340Var, 0);
            Integer numValueOf = rxe1Var2 != null ? Integer.valueOf(rxe1Var2.c) : null;
            boolean z5 = !z4;
            if (list.isEmpty()) {
                i2 = -1245521768;
                i3 = 2131963453;
                z2 = false;
            } else {
                z2 = false;
                i2 = -1245446376;
                i3 = 2131963443;
            }
            String strK = x0d.k(x340Var, i2, i3, x340Var, z2);
            int i6 = i5;
            a(strK, z5, numValueOf, function0, x340Var, (i5 << 9) & 7168);
            x340 x340Var2 = x340Var;
            x340Var2.i0(-455812403);
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    p7h.T();
                    throw null;
                }
                lbh1 lbh1Var = (lbh1) obj;
                x340Var2.f0(944022432, lbh1Var.a);
                Integer numValueOf2 = Integer.valueOf(i7);
                boolean zE = x340Var2.e(i7);
                Object objT5 = x340Var2.T();
                if (zE || objT5 == m4cVar2) {
                    objT5 = new sl11(i7, (byte) 17);
                    x340Var2.s0(objT5);
                }
                x340 x340Var3 = x340Var2;
                ven0 ven0Var5 = ven0Var3;
                dgo1.c(numValueOf2, (iu30) objT5, apo.r(1881718702, new nai0(set, lbh1Var, z4, set3, set2, rxe1Var2, str, ven0Var5, iu30Var, resultReceiver, tsqVar2), x340Var3), x340Var3, 384);
                x340Var3.r(false);
                rxe1Var2 = rxe1Var;
                ven0Var4 = ven0Var4;
                x340Var2 = x340Var3;
                i6 = i6;
                m4cVar2 = m4cVar2;
                i7 = i8;
                ven0Var3 = ven0Var5;
            }
            int i9 = i6;
            x340 x340Var4 = x340Var2;
            ven0 ven0Var6 = ven0Var4;
            ven0 ven0Var7 = ven0Var3;
            m4c m4cVar3 = m4cVar2;
            x340Var4.r(false);
            if (list2 == null || !list2.isEmpty()) {
                x340Var4.i0(-1244063869);
                d(cwl1.o0(x340Var4, 2131963461), x340Var4, 0);
                x340Var4.r(false);
            } else {
                x340Var4.i0(-1243976418);
                x340Var4.r(false);
            }
            if (list2 == null) {
                x340Var4.i0(-1243936490);
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    c(((Number) it.next()).floatValue(), 0, x340Var4);
                }
                x340Var4.r(false);
                m4cVar = m4cVar3;
            } else {
                x340Var4.i0(-1243776809);
                int i10 = 0;
                for (Object obj2 : list2) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        p7h.T();
                        throw null;
                    }
                    jtc1 jtc1Var = (jtc1) obj2;
                    x340Var4.f0(674684789, jtc1Var.a);
                    Integer numValueOf3 = Integer.valueOf(i10);
                    boolean zE2 = x340Var4.e(i10);
                    Object objT6 = x340Var4.T();
                    m4c m4cVar4 = m4cVar3;
                    if (zE2 || objT6 == m4cVar4) {
                        objT6 = new sl11(i10, (byte) 18);
                        x340Var4.s0(objT6);
                    }
                    dgo1.c(numValueOf3, (iu30) objT6, apo.r(187724008, new j2g1(str, rxe1Var, z4, jtc1Var, resultReceiver, tsqVar), x340Var4), x340Var4, 384);
                    x340Var4.r(false);
                    i10 = i11;
                    m4cVar3 = m4cVar4;
                }
                m4cVar = m4cVar3;
                x340Var4.r(false);
            }
            x340Var4.r(true);
            if (((Boolean) ven0Var6.getValue()).booleanValue()) {
                x340Var4.i0(915719690);
                boolean zI2 = x340Var4.i(ven0Var6);
                Object objT7 = x340Var4.T();
                if (zI2 || objT7 == m4cVar) {
                    objT7 = new aya1(ven0Var6, (byte) 19);
                    x340Var4.s0(objT7);
                }
                z3 = false;
                f((Function0) objT7, x340Var4, 0);
                x340Var4.r(false);
            } else {
                z3 = false;
                x340Var4.i0(915790804);
                x340Var4.r(false);
            }
            lbh1 lbh1Var2 = (lbh1) ven0Var7.getValue();
            if (lbh1Var2 == null) {
                x340Var4.i0(915827476);
                x340Var4.r(z3);
                iu30Var3 = iu30Var2;
                x340Var = x340Var4;
            } else {
                x340Var4.i0(915827477);
                boolean zI3 = x340Var4.i(ven0Var7) | ((i9 & 896) == 256) | x340Var4.i(lbh1Var2);
                Object objT8 = x340Var4.T();
                if (zI3 || objT8 == m4cVar) {
                    iu30Var3 = iu30Var2;
                    objT8 = new o8e1(iu30Var3, lbh1Var2, ven0Var7, (byte) 13);
                    x340Var4.s0(objT8);
                } else {
                    iu30Var3 = iu30Var2;
                }
                Function0 function1 = (Function0) objT8;
                boolean zI4 = x340Var4.i(ven0Var7);
                Object objT9 = x340Var4.T();
                if (zI4 || objT9 == m4cVar) {
                    objT9 = new aya1(ven0Var7, (byte) 20);
                    x340Var4.s0(objT9);
                }
                x340Var = x340Var4;
                otw.c(avkVar, new zuk(function1, (Function0) objT9), (qim0) null, (ipb1) null, x340Var, (i9 >> 12) & 14, 12);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tah1(str, rxe1Var, list, list2, set, set2, z, set3, tsqVar, tsqVar2, function0, iu30Var, iu30Var3, resultReceiver, avkVar, qim0Var2, i);
        }
    }
}
