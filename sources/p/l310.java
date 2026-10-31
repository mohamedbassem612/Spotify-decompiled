package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class l310 implements pf40 {
    public static final l310 a;
    private static final h661 descriptor;

    static {
        l310 l310Var = new l310();
        a = l310Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.ExternalIntegrationBackendErrorResponse", l310Var, 2);
        m0v0Var.j("error_type", true);
        m0v0Var.j("error", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new n310(i, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        n310 n310Var = (n310) obj;
        String str = n310Var.b;
        String str2 = n310Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
