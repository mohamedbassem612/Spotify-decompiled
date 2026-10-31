package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class jdn {
    public static final o3r a;

    static {
        jd11 jd11Var = rc11.a;
        a = w3p1.n(new l4r(new wlu(jd11Var.b(xkk1.class)), 1, y6n.V0, new j4r(y6n.Z0), y6n.W0), new l4r(new wlu(jd11Var.b(pjw0.class)), 1, y6n.X0, new j4r(y6n.a1), y6n.Y0), u2m.b1);
    }

    public static final int a(xkk1 xkk1Var) {
        mq70 mq70Var;
        pp70 pp70Var;
        icx icxVar;
        pp70 pp70Var2;
        if (xkk1Var != null && (pp70Var2 = xkk1Var.d) != null) {
            icxVar = pp70Var2.a.a;
        } else {
            if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) {
                return -16777216;
            }
            icxVar = pp70Var.a.a;
        }
        return loo1.r(z4p1.G(icxVar.c));
    }
}
