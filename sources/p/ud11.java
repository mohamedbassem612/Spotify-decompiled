package p;

import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class ud11 {
    public static final i3u a = new i3u(231, false, false, false, false);

    public static final void a(Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(443210565);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarV = bin.v(too1.y(qim0VarD, new mih1(lhc.g(x340Var).c, lhc.g(x340Var).e)), (idn0) null, (ga80) null, false, (String) null, (pm31) null, function0, 28);
            gfh0 gfh0VarC = t1c.c(een.X, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            ywx0.l(54, j2iVar, h2c.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bu9(function0, j2iVar, i, (byte) 4);
        }
    }

    public static final void b(lz20 lz20Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(843058142);
        int i2 = (x340Var.i(lz20Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
            boolean zI = x340Var.i(lz20Var) | x340Var.i(k6a1Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new td11(lz20Var, k6a1Var, (lnm) null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(lz20Var, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ziz0(lz20Var, i, (byte) 21);
        }
    }

    public static final void c(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1772167384);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            WeakHashMap weakHashMap = osl1.x;
            boolean zF = lhc.g(x340Var).c.f();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ven0 ven0VarS = v8r.s(function0, x340Var);
            Boolean boolValueOf = Boolean.valueOf(zF);
            boolean zH = x340Var.h(zF) | x340Var.i(ven0Var) | x340Var.i(ven0VarS);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                pg6 pg6Var = new pg6(zF, ven0Var, ven0VarS, null, (byte) 6);
                x340Var.s0(pg6Var);
                objT2 = pg6Var;
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 28);
        }
    }

    public static final void d(int i, String str, b0k b0kVar, iu30 iu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1119695057);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            y7e1 y7e1VarD = c4p1.D(i2 & 14, 2, str, x340Var);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            boolean zI = x340Var.i(y7e1VarD) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new efb(iu30Var, y7e1VarD, (byte) 6);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            anm1.a(function0, a, apo.r(212133368, new ffx0(function0, lz20Var, y7e1VarD), x340Var), x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qgd(str, iu30Var, i, (byte) 12);
        }
    }
}
