package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class slk0 {
    public static final cr31 a = er31.b(12.0f);

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1168635112);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(false) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-655307538);
            x340Var.r(false);
            x340Var.i0(948696376);
            long j = cbx.a(x340Var).b.a;
            x340Var.r(false);
            uwo1.e(str, new wnb0(1.0f, false), (lee1) null, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1716);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 10);
        }
    }

    public static final void b(int i, int i2, Function0 function0, b0k b0kVar) {
        String str;
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(1846223459, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958851);
            gbx gbxVar = new gbx(z50.c, function0);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qlk0.d;
                x340Var.s0(objT);
            }
            vu30 vu30Var = (vu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qlk0.e;
                x340Var.s0(objT2);
            }
            hdx hdxVar = new hdx(0, vu30Var, (vu30) objT2, (vu30) null, a, 9);
            gdx gdxVarS = yla.s(x340Var);
            qim0 qim0VarR = u291.r(nim0.a, 36.0f);
            if (i == 1) {
                str = "Plus";
            } else if (i == 2) {
                str = "PlusAlt";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "AddBelow";
            }
            wro1.h(gbxVar, hdxVar, anm1.N("mixing_track_swap_".concat(str), qim0VarR), (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-1203520532, new ue0(i, strO0, (byte) 15), x340Var), x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1(i, function0, i2, (byte) 19);
        }
    }
}
