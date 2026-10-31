package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class o2s0 implements pf40 {
    public static final o2s0 a;
    private static final h661 descriptor;

    static {
        o2s0 o2s0Var = new o2s0();
        a = o2s0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.partnerapps.domain.api.PartnerIntegrationsEntry", o2s0Var, 3);
        m0v0Var.j("connectionStatus", false);
        m0v0Var.j("clientId", true);
        m0v0Var.j("partnerIntegrationId", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{r2s0.d[0].getValue(), m5n1.z(chc1Var), chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = r2s0.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        q2s0 q2s0Var = null;
        String str = null;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                q2s0Var = (q2s0) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), q2s0Var);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new r2s0(i, q2s0Var, str, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        r2s0 r2s0Var = (r2s0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        nma0 nma0Var = (nma0) r2s0.d[0].getValue();
        q2s0 q2s0Var = r2s0Var.a;
        String str = r2s0Var.b;
        z1kVarB.k(h661Var, 0, nma0Var, q2s0Var);
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.G(h661Var, 2, r2s0Var.c);
        z1kVarB.a(h661Var);
    }
}
