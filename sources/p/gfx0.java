package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gfx0 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(1, ngv.e);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    public static final void a(jfx0 jfx0Var, qim0 qim0Var, long j, Function0 function0, b0k b0kVar, int i, int i2) {
        Function0 function1;
        int i3;
        x340 x340Var;
        qim0 qim0Var2;
        long j2;
        Function0 function2;
        qim0 qim0Var3;
        Function0 function3;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        Object objT2;
        tob1 tob1Var;
        boolean z;
        boolean z2;
        Object objT3;
        ven0 ven0Var2;
        tob1 tob1Var2;
        long j3;
        jfx0 jfx0Var2 = jfx0Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-69149458);
        long jH = j;
        int i4 = i | (x340Var2.g(jfx0Var2) ? 4 : 2) | 48 | (((i2 & 4) == 0 && x340Var2.f(jH)) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            function1 = function0;
        } else {
            function1 = function0;
            i3 = i4 | (x340Var2.i(function1) ? 2048 : 1024);
        }
        boolean z3 = true;
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                if ((i2 & 4) != 0) {
                    jH = jfv.h(a);
                    i3 &= -897;
                }
                qim0Var3 = nim0.a;
                if (i5 != 0) {
                    function3 = null;
                }
                x340Var2.s();
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(jfx0Var2 instanceof ifx0 ? (ifx0) jfx0Var2 : null);
                    x340Var2.s0(objT);
                }
                ven0Var = (ven0) objT;
                objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = c13.l(jfx0Var2 instanceof ifx0, x340Var2);
                }
                tob1Var = (ven0) objT2;
                if ((i3 & 14) != 4) {
                    z = false;
                } else {
                    z = true;
                }
                boolean zI = z | x340Var2.i(ven0Var) | x340Var2.i(tob1Var);
                if ((((i3 & 896) ^ 384) > 256 || !x340Var2.f(jH)) && (i3 & 384) != 256) {
                }
                z2 = zI | z3;
                objT3 = x340Var2.T();
                if (!z2 || objT3 == m4cVar) {
                    ven0Var2 = ven0Var;
                    long j4 = jH;
                    tob1Var2 = tob1Var;
                    xn2 xn2Var = new xn2(jfx0Var2, j4, ven0Var2, tob1Var2, (lnm) null, (byte) 10);
                    j3 = j4;
                    x340Var2.s0(xn2Var);
                    objT3 = xn2Var;
                } else {
                    ven0Var2 = ven0Var;
                    j3 = jH;
                    tob1Var2 = tob1Var;
                }
                qxd0.t(jfx0Var2, x340Var2, (vu30) objT3);
                uwr uwrVar = cbx.a;
                long j5 = cbx.c(x340Var2).b.b;
                fq7.g(((Boolean) tob1Var2.getValue()).booleanValue(), (qim0) null, xay.d(irn1.o0((int) jfv.h(j5), 0, ((jhx) cbx.c(x340Var2).a.b).a, 2), een.Z, 12), xay.l(12, irn1.o0((int) jfv.h(j5), 0, ((jhx) cbx.c(x340Var2).a.c).a, 2)), (String) null, apo.r(1448544022, new hho0(ven0Var2, function3, qim0Var3, (byte) 8), x340Var2), x340Var2, 196608, 18);
                x340Var = x340Var2;
                qim0Var2 = qim0Var3;
                function2 = function3;
                j2 = j3;
            } else {
                x340Var2.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                qim0Var3 = qim0Var;
            }
            function3 = function1;
            x340Var2.s();
            objT = x340Var2.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(jfx0Var2 instanceof ifx0 ? (ifx0) jfx0Var2 : null);
                x340Var2.s0(objT);
            }
            ven0Var = (ven0) objT;
            objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = c13.l(jfx0Var2 instanceof ifx0, x340Var2);
            }
            tob1Var = (ven0) objT2;
            if ((i3 & 14) != 4) {
                z = false;
            } else {
                z = true;
            }
            boolean zI2 = z | x340Var2.i(ven0Var) | x340Var2.i(tob1Var);
            z3 = ((i3 & 896) ^ 384) > 256 ? false : false;
            z2 = zI2 | z3;
            objT3 = x340Var2.T();
            if (z2) {
                ven0Var2 = ven0Var;
                long j6 = jH;
                tob1Var2 = tob1Var;
                xn2 xn2Var2 = new xn2(jfx0Var2, j6, ven0Var2, tob1Var2, (lnm) null, (byte) 10);
                j3 = j6;
                x340Var2.s0(xn2Var2);
                objT3 = xn2Var2;
            } else {
                ven0Var2 = ven0Var;
                long j7 = jH;
                tob1Var2 = tob1Var;
                xn2 xn2Var3 = new xn2(jfx0Var2, j7, ven0Var2, tob1Var2, (lnm) null, (byte) 10);
                j3 = j7;
                x340Var2.s0(xn2Var3);
                objT3 = xn2Var3;
            }
            qxd0.t(jfx0Var2, x340Var2, (vu30) objT3);
            uwr uwrVar2 = cbx.a;
            long j8 = cbx.c(x340Var2).b.b;
            fq7.g(((Boolean) tob1Var2.getValue()).booleanValue(), (qim0) null, xay.d(irn1.o0((int) jfv.h(j8), 0, ((jhx) cbx.c(x340Var2).a.b).a, 2), een.Z, 12), xay.l(12, irn1.o0((int) jfv.h(j8), 0, ((jhx) cbx.c(x340Var2).a.c).a, 2)), (String) null, apo.r(1448544022, new hho0(ven0Var2, function3, qim0Var3, (byte) 8), x340Var2), x340Var2, 196608, 18);
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
            function2 = function3;
            j2 = j3;
        } else {
            jfx0Var2 = jfx0Var2;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            j2 = jH;
            function2 = function1;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o9e0(jfx0Var2, qim0Var2, j2, function2, i, i2);
        }
    }

    public static final void b(ifx0 ifx0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        ifx0 ifx0Var2;
        qim0 qim0Var2;
        long j;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(185828737);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(ifx0Var) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | (b0kVar2.i(qim0Var) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarThen = qim0VarF.then(function0 != null ? bin.x(qim0Var3, false, null, new pm31(0), null, function0, 11) : qim0Var3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarThen, 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.g, fraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            int i3 = ifx0Var.d;
            b0kVar2.i0(-82565128);
            String str = ifx0Var.a;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            b0kVar2 = b0kVar2;
            uwo1.e(str, uyn1.B(wnb0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.a, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1712);
            b0kVar2.r(false);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0Var3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            b0kVar2.i0(-6210537);
            b0kVar2.r(false);
            String str2 = ifx0Var.b;
            if (str2 == null) {
                b0kVar2.i0(-5891826);
                b0kVar2.r(false);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2.i0(-5891825);
                lee1 lee1Var = cbx.d(b0kVar2).j;
                b0kVar2.i0(-1935237647);
                long j2 = cbx.a(b0kVar2).b.b;
                b0kVar2.r(false);
                qim0Var2 = qim0Var3;
                uwo1.e(str2, null, lee1Var, j2, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
                b0kVar2.r(false);
            }
            if (function0 != null) {
                b0kVar2.i0(-5591559);
                plx plxVar = plx.c;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                w0h1.a(plxVar, isl.a, u291.r(qim0Var2, 12.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, plx.d | 48, 48);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-5309025);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
            ifx0Var2 = ifx0Var;
            float fO = yoi1.o(ifx0Var2.c, 0.0f, 1.0f);
            qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
            if (i3 == 2) {
                b0kVar2.i0(587200818);
                j = cbx.a(b0kVar2).b.b;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(587202167);
                j = cbx.a(b0kVar2).b.c;
                b0kVar2.r(false);
            }
            tto1.d(fO, 0, 0, j, cbx.a(b0kVar2).a.b.c(), b0kVar2, qim0VarF3);
            b0kVar2.r(true);
        } else {
            ifx0Var2 = ifx0Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(ifx0Var2, function0, qim0Var, i, (byte) 0);
        }
    }
}
