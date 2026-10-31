package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class mos0 implements pf40 {
    public static final mos0 a;
    private static final h661 descriptor;

    static {
        mos0 mos0Var = new mos0();
        a = mos0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.bluejay.onboarding.customization.steps.location.PersistedLocationSuggestion", mos0Var, 3);
        m0v0Var.j("name", false);
        m0v0Var.j("country", false);
        m0v0Var.j("geonameId", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, wr80.a};
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
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                iO = x1kVarB.o(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new oos0(i, strF, strF2, iO);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        oos0 oos0Var = (oos0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, oos0Var.a);
        z1kVarB.G(h661Var, 1, oos0Var.b);
        z1kVarB.e(2, oos0Var.c, h661Var);
        z1kVarB.a(h661Var);
    }
}
