package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class fxe1 implements pf40 {
    public static final fxe1 a;
    private static final h661 descriptor;

    static {
        fxe1 fxe1Var = new fxe1();
        a = fxe1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.TimestampType.Months", fxe1Var, 2);
        m0v0Var.j("month_value", false);
        m0v0Var.j("day", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{wr80.a, chc1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new hxe1(i, iO, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hxe1 hxe1Var = (hxe1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, hxe1Var.b, h661Var);
        z1kVarB.G(h661Var, 1, hxe1Var.c);
        z1kVarB.a(h661Var);
    }
}
