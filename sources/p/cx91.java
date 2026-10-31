package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class cx91 {
    public static final tr80 a = new tr80(200, 299, 1);

    public static final void a(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-369584079);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("SNOOZE_RECOMMENDATIONS_BUTTON_ELEMENT_TEST_TAG", nim0Var);
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
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
            gbx gbxVar = new gbx(z50.c, function0);
            cr31 cr31VarB = er31.b(24.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = yd81.Y0;
                x340Var.s0(objT);
            }
            foo1.c(gbxVar, new hdx(2, (vu30) null, (vu30) objT, (vu30) null, cr31VarB, 10), (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, ijj.b, (vu30) null, ijj.c, x340Var, 805306368, 48, 1500);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, 2131954005), u291.f(nim0Var, 1.0f), cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function0, i, (byte) 12);
        }
    }
}
