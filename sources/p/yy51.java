package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class yy51 {
    public static final long a;
    public static final long b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;

    static {
        int i = u7h.l;
        a = u7h.f;
        b = u7h.b;
        c = 1.0f;
        d = 16.0f;
        e = 8.0f;
        f = 12.0f;
        g = 6.0f;
    }

    public static final void a(int i, int i2, y9e1 y9e1Var, id01 id01Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, b0k b0kVar, int i3) {
        zrm0 zrm0Var = y9e1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2274743);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(y9e1Var) ? 256 : 128) | (x340Var.e(id01Var == null ? -1 : id01Var.ordinal()) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function2) ? 8388608 : 4194304);
        if (x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(x340Var);
            int length = y9e1Var.a.a.b.length() - 1;
            int iP = yoi1.p(i, 0, length);
            int iP2 = yoi1.p(i2 - 1, 0, length);
            n511 n511VarB = y9e1Var.b(iP);
            float f2 = y9e1Var.b(iP2).c;
            int iD = zrm0Var.d(iP);
            int iD2 = zrm0Var.d(iP2);
            float f3 = n511VarB.a;
            float fH = iD == iD2 ? (f3 + f2) / 2.0f : (y9e1Var.h(iD) + f3) / 2.0f;
            float fG = iD == iD2 ? fH : (y9e1Var.g(iD2) + f2) / 2.0f;
            float fB = zrm0Var.b(iD2);
            cvx cvxVar = wuxVarB.b;
            int iI0 = watVar.i0(8.0f);
            int iI1 = watVar.i0(d);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.TRUE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean z = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                objT3 = new zy51(n511VarB.b, fB, fH, fG, iI0, iI1, new qg6(drr0Var, (byte) 21), new r9y0(ven0Var, (byte) 18));
                x340Var.s0(objT3);
            }
            sy4.a((zy51) objT3, (Function0) null, new nfv0(16, false, false, false), apo.r(1282894695, new wy51(id01Var, iu30Var, function0, function1, function2, function3, drr0Var, ven0Var, (byte) 0), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xy51(i, i2, y9e1Var, id01Var, iu30Var, function0, function1, function2, function3, i3);
        }
    }

    public static final void b(int i, String str, String str2, Function0 function0, j2i j2iVar, b0k b0kVar) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-643232783);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            era eraVar = een.Q0;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarN = anm1.N(str2, bin.v(nim0.a, (idn0) objT, (ga80) null, false, (String) null, (pm31) null, function0, 28));
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(x340Var, Integer.valueOf(i2 & 14));
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, ((i2 >> 3) & 14) | 3072, 0, 1778);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lyq(j2iVar, str, function0, str2, i);
        }
    }

    public static final void c(id01 id01Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, float f2, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-781482386);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.e(id01Var == null ? -1 : id01Var.ordinal()) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function2) ? 16384 : 8192) | (x340Var.i(function3) ? 131072 : 65536) | (x340Var.d(f2) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4792467 & i2) != 4792466)) {
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(x340Var);
            cwx cwxVarC = cbx.c(x340Var);
            cua cuaVar = wuxVarB.f;
            cr31 cr31VarB = er31.b(16.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            int iH = (int) jfv.h(cwxVarC.b.b);
            wat watVar = (wat) x340Var.k(t4k.h);
            float f3 = f;
            float fX0 = watVar.X0(f3);
            boolean zD = ((i2 & 3670016) == 1048576) | x340Var.d(fX0);
            Object objT2 = x340Var.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new e8(f2, fX0, (byte) 13);
                x340Var.s0(objT2);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarS = u291.s(eqr0.B(nim0Var, (iu30) objT2), f3, g);
            qim0 qim0VarN = anm1.N("ereader_selection_menu", nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z) {
                x340Var.i0(1224602110);
                x340Var.r(false);
            } else {
                x340Var.i0(1224309005);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = wu51.R0;
                    x340Var.s0(objT3);
                }
                j0o1.b(48, x340Var, (iu30) objT3, qim0VarS);
                x340Var.r(false);
            }
            qim0 qim0VarR = i1p1.r(uyn1.y(dug.f(sto1.o(nim0Var, e, cr31VarB, false, 0L, 0L, 28), a, cr31VarB), 16.0f, 12.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zE = x340Var.e(iH) | x340Var.i(cwxVarC);
            Object objT4 = x340Var.T();
            if (zE || objT4 == m4cVar) {
                objT4 = new ym(iH, cwxVarC, (byte) 23);
                x340Var.s0(objT4);
            }
            hm5.a(bool, (qim0) null, (iu30) objT4, (tl3) null, (String) null, (iu30) null, apo.r(704786413, new rw1(id01Var, iu30Var, ven0Var, function0, wuxVarB, function2, function3), x340Var), x340Var, 1572864, 58);
            x340Var.r(true);
            if (z) {
                x340Var.i0(1228630870);
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = wu51.W0;
                    x340Var.s0(objT5);
                }
                j0o1.b(48, x340Var, (iu30) objT5, qim0VarS);
                x340Var.r(false);
            } else {
                x340Var.i0(1228915326);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lz80(id01Var, iu30Var, function0, function1, function2, function3, f2, z, i);
        }
    }
}
