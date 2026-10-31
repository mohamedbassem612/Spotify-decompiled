package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class nuc1 implements pf40 {
    public static final nuc1 a;
    private static final h661 descriptor;

    static {
        nuc1 nuc1Var = new nuc1();
        a = nuc1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.endpoint.SuggestionData", nuc1Var, 5);
        m0v0Var.j("deviceId", false);
        m0v0Var.j("confidenceLevel", false);
        m0v0Var.j("recommendationId", false);
        m0v0Var.j("recommendationType", false);
        m0v0Var.j("shouldObserveOutcome", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
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
            } else if (iP == 2) {
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                strF4 = x1kVarB.f(h661Var, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new puc1(strF, i, strF2, strF3, zM, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        puc1 puc1Var = (puc1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = puc1Var.a;
        boolean z = puc1Var.e;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, puc1Var.b);
        z1kVarB.G(h661Var, 2, puc1Var.c);
        z1kVarB.G(h661Var, 3, puc1Var.d);
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 4, z);
        }
        z1kVarB.a(h661Var);
    }
}
