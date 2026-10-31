package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class hr21 {
    public static final o3r a;
    public static final o3r b;

    static {
        jd11 jd11Var = rc11.a;
        a = w3p1.l(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, pl21.X, new j4r(pl21.e), pl21.Y), new l4r(new xv00(jd11Var.b(ydk.class)), 2, pl21.Z, new j4r(pl21.f), pl21.N0), new l4r(new xv00(jd11Var.b(m6k.class)), 2, pl21.O0, new j4r(pl21.g), pl21.P0), new l4r(new xv00(jd11Var.b(jo70.class)), 2, pl21.Q0, new j4r(pl21.h), pl21.R0), ve21.X);
        b = w3p1.n(new l4r(new xv00(jd11Var.b(j6k.class)), 1, pl21.S0, new j4r(pl21.i), pl21.T0), new l4r(new xv00(jd11Var.b(lhe0.class)), 1, pl21.U0, new j4r(pl21.t), pl21.V0), rs11.X0);
    }

    public static boolean a(boolean z, k1r k1rVar) {
        er21 er21Var;
        if (!z) {
            return false;
        }
        i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
        return i1rVar != null && (er21Var = (er21) i1rVar.a) != null && er21Var.a.d == 2 && (er21Var.b.a instanceof z6d);
    }

    public static lt20 b(String str, uu00 uu00Var) {
        return new lt20(new xs4(yoi1.g(((zu00) uu00Var).b(new oi("reserved-onboarding", false, new sc21(str, (byte) 3)))), str, (byte) 14), new q8t0(3, (lnm) null, (byte) 9), (byte) 0);
    }
}
