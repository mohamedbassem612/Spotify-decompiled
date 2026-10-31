package p;

import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class eu0 {
    public static final mic0 a;

    static {
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        u7h u7hVar = new u7h(((vex) zscVar.e).f);
        vex vexVar = (vex) zscVar.e;
        a = v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(vexVar.a), new u7h(vexVar.a), new u7h(vexVar.g)}), 0.0f, 0.0f, 14);
    }

    public static final void a(uoa uoaVar, o2u0 o2u0Var, xpw xpwVar, xpw xpwVar2, xpw xpwVar3, xpw xpwVar4, long j, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object au0Var;
        o2u0 o2u0Var2;
        uoa uoaVar2;
        int i2;
        Function0 function1;
        rih1 rih1Var;
        b0k b0kVar2;
        float f;
        float f2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-327721060);
        j06 j06Var = ((x340) b0kVar3).a;
        int i3 = i | (b0kVar3.i(uoaVar) ? 4 : 2) | (b0kVar3.i(o2u0Var) ? 32 : 16) | (b0kVar3.i(xpwVar) ? 256 : 128) | (b0kVar3.i(xpwVar2) ? 2048 : 1024) | (b0kVar3.i(xpwVar3) ? 16384 : 8192) | (b0kVar3.i(xpwVar4) ? 131072 : 65536) | (b0kVar3.f(j) ? 1048576 : 524288) | (b0kVar3.i(function0) ? 8388608 : 4194304) | 100663296;
        if (b0kVar3.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            uvb0 uvb0Var = (crl1) b0kVar3.k(t4k.u);
            boolean z = (i3 & 29360128) == 8388608;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new y1(function0, (byte) 6);
                b0kVar3.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, b0kVar3, false);
            boolean zI = b0kVar3.i(o2u0Var) | b0kVar3.i(uoaVar) | ((i3 & 3670016) == 1048576);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                o2u0Var2 = o2u0Var;
                au0Var = new au0(o2u0Var2, uoaVar, j, (byte) 0);
                uoaVar2 = uoaVar;
                b0kVar3.s0(au0Var);
            } else {
                au0Var = objT2;
                uoaVar2 = uoaVar;
                o2u0Var2 = o2u0Var;
            }
            qxd0.C(o2u0Var2, (Function0) au0Var, b0kVar3);
            if (uvb0Var.b()) {
                uoaVar2.l();
            } else {
                uoaVar2.f();
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarD, lhc.g(b0kVar3).e);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            Function0 function2 = hmb0.t1;
            if (z2) {
                b0kVar3.l(function2);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            pbh pbhVar = pbh.a;
            qim0 qim0VarA = pbhVar.a(0.9f, qim0VarF, true);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            qim0 qim0VarQ = i1p1.q(qim0VarA, er31.d(0.0f, 0.0f, 16.0f, 16.0f, 3));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarQ);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(function2);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            b(uoaVar2, b0kVar3, i3 & 14);
            qim0 qim0VarA2 = h2c.a.a(qim0Var3, een.t);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM3 = b0kVar3.m();
            qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarA2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(function2);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM3, b0kVar3, lljVar2);
            x0d.q(iHashCode3, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE3, b0kVar3, lljVar4);
            float f3 = cbx.b(b0kVar3).b.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarY2 = uyn1.y(qim0Var3, f3, 8.0f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            mbh mbhVarA3 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, b0kVar3, 0);
            int iHashCode4 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM4 = b0kVar3.m();
            qim0 qim0VarE4 = zr7.E(b0kVar3, qim0VarY2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(function2);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA3, b0kVar3, lljVar);
            nko1.H(xos0VarM4, b0kVar3, lljVar2);
            x0d.q(iHashCode4, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE4, b0kVar3, lljVar4);
            rih1 rih1Var2 = rih1.a;
            otw.c(xpwVar, rih1Var2, (qim0) null, (ipb1) null, b0kVar3, ((i3 >> 6) & 14) | 48, 12);
            otw.c(xpwVar2, rih1Var2, (qim0) null, (ipb1) null, b0kVar3, ((i3 >> 9) & 14) | 48, 12);
            b0kVar3.r(true);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            qim0 qim0VarX = uyn1.x(qim0Var3, 16.0f);
            mbh mbhVarA4 = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode5 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM5 = b0kVar3.m();
            qim0 qim0VarE5 = zr7.E(b0kVar3, qim0VarX);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(function2);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA4, b0kVar3, lljVar);
            nko1.H(xos0VarM5, b0kVar3, lljVar2);
            x0d.q(iHashCode5, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE5, b0kVar3, lljVar4);
            if (xpwVar3 != null) {
                b0kVar3.i0(756271912);
                function1 = function2;
                rih1Var = rih1Var2;
                b0kVar2 = b0kVar3;
                i2 = 0;
                f = 1.0f;
                f2 = 0.0f;
                otw.c(xpwVar3, rih1Var, (qim0) null, (ipb1) null, b0kVar2, ((i3 >> 12) & 14) | 48, 12);
                b0kVar2.r(false);
            } else {
                i2 = 0;
                function1 = function2;
                rih1Var = rih1Var2;
                b0kVar2 = b0kVar3;
                f = 1.0f;
                f2 = 0.0f;
                b0kVar2.i0(756330533);
                b0kVar2.r(false);
            }
            us71.m(b0kVar2, true, true, true);
            fra fraVar = een.N0;
            qim0 qim0VarA3 = pbhVar.a(0.1f, u291.f(qim0Var3, f), true);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, f2, 2, qim0VarA3);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, i2);
            int iHashCode6 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM6 = b0kVar2.m();
            qim0 qim0VarE6 = zr7.E(b0kVar2, qim0VarZ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM6, b0kVar2, lljVar2);
            x0d.q(iHashCode6, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE6, b0kVar2, lljVar4);
            wsx wsxVar = wsx.c;
            float f4 = f;
            jsl jslVar = new jsl(cwl1.o0(b0kVar2, 2131951859));
            zov0 zov0Var = cbx.b(b0kVar2).g;
            qim0 qim0VarR = u291.r(qim0Var3, 24.0f);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            b0k b0kVar4 = b0kVar2;
            w0h1.a(wsxVar, jslVar, uyn1.B(qim0VarR, 0.0f, 0.0f, 6.0f, 0.0f, 11), cbx.a(b0kVar2).b.c, 0L, false, b0kVar4, wsx.d, 48);
            uwo1.e(cwl1.o0(b0kVar4, 2131951858), uyn1.B(e9k.n(62, new wnb0(f4, true)), 0.0f, 0.0f, cbx.b(b0kVar4).b.b, 0.0f, 11), cbx.d(b0kVar4).j, 0L, null, null, 0, false, new zic0(1), 0, null, b0kVar4, 0, 0, 1784);
            b0kVar3 = b0kVar4;
            otw.c(xpwVar4, rih1Var, (qim0) null, (ipb1) null, b0kVar3, ((i3 >> 15) & 14) | 48, 12);
            b0kVar3.r(true);
            b0kVar3.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar3.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new bu0(uoaVar, o2u0Var, xpwVar, xpwVar2, xpwVar3, xpwVar4, j, function0, qim0Var2, i);
        }
    }

    public static final void b(uoa uoaVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-143951142);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(uoaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zI = x340Var.i(uoaVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new cu0(uoaVar, (byte) 0);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            qim0 qim0VarS = exd0.s(u291.d(nim0.a, 1.0f), di0.S0);
            boolean zI2 = x340Var.i(uoaVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new cu0(uoaVar, (byte) 1);
                x340Var.s0(objT2);
            }
            dm5.b(iu30Var, qim0VarS, (iu30) null, (iu30) objT2, (iu30) null, x340Var, 0, 20);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(uoaVar, i, b);
        }
    }
}
