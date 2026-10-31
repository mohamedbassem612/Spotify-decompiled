package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class jxe1 implements pf40 {
    public static final jxe1 a;
    private static final h661 descriptor;

    static {
        jxe1 jxe1Var = new jxe1();
        a = jxe1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.TimestampType.Years", jxe1Var, 3);
        m0v0Var.j("month_value", false);
        m0v0Var.j("day", false);
        m0v0Var.j("year", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{wr80.a, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        String strF = null;
        String strF2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                strF2 = x1kVarB.f(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new lxe1(i, strF, iO, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lxe1 lxe1Var = (lxe1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, lxe1Var.b, h661Var);
        z1kVarB.G(h661Var, 1, lxe1Var.c);
        z1kVarB.G(h661Var, 2, lxe1Var.d);
        z1kVarB.a(h661Var);
    }
}
