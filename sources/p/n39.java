package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n39 implements Function {
    public final yqg a;

    public static o3r a(n39 n39Var, boolean z, int i) {
        boolean z2 = (i & 1) != 0;
        boolean z3 = (i & 4) != 0 ? false : z;
        l4r l4rVarJ = d7p1.j(f9z.d);
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(l4rVarJ);
        jd11 jd11Var = rc11.a;
        smc0VarN.add(new l4r(new xv00(jd11Var.b(hll.class)), 2, c9z.Y0, new j4r(c9z.g), c9z.Z0));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(l1z.class)), 2, c9z.a1, new j4r(c9z.h), c9z.b1));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(den.class)), 2, c9z.c1, new j4r(c9z.i), c9z.d1));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, c9z.e1, new j4r(c9z.t), f9z.b));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(jo70.class)), 2, f9z.c, new j4r(c9z.X), c9z.P0));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(zoy0.class)), 2, c9z.Q0, new j4r(c9z.Y), c9z.R0));
        if (z2) {
            smc0VarN.add(new l4r(new xv00(jd11Var.b(e2k1.class)), 2, c9z.S0, new j4r(c9z.Z), c9z.T0));
        }
        smc0VarN.add(new l4r(new xv00(jd11Var.b(v740.class)), 2, c9z.U0, new j4r(c9z.N0), c9z.V0));
        if (z3) {
            smc0VarN.add(new l4r(new xv00(jd11Var.b(n4v0.class)), 2, c9z.W0, new j4r(c9z.O0), c9z.X0));
        }
        return new o3r(k4p1.k(smc0VarN), new nty(l4rVarJ, n39Var, false), false);
    }

    public Object apply(Object obj) {
        return new gtx0(this.a.b(), hwb.x(), ((yqx0) obj).b);
    }

    public n39(yqg yqgVar, hwb hwbVar) {
        this.a = yqgVar;
    }
}
