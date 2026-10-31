package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class a841 implements pf40 {
    public static final a841 a;
    private static final h661 descriptor;

    static {
        a841 a841Var = new a841();
        a = a841Var;
        m0v0 m0v0Var = new m0v0("com.spotify.partneraccountlinking.common.samsung.SamsungLinkingRequest", a841Var, 4);
        m0v0Var.j("access_token", false);
        m0v0Var.j("auth_code", false);
        m0v0Var.j("auth_server_url", false);
        m0v0Var.j("api_server_url", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{m5n1.z(nma0Var), m5n1.z(nma0Var), nma0Var, nma0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String strF = null;
        String strF2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else if (iP == 2) {
                strF = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                strF2 = x1kVarB.f(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new c841(i, str, str2, strF, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        c841 c841Var = (c841) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        chc1 chc1Var = chc1.a;
        z1kVarB.s(h661Var, 0, chc1Var, c841Var.a);
        z1kVarB.s(h661Var, 1, chc1Var, c841Var.b);
        z1kVarB.G(h661Var, 2, c841Var.c);
        z1kVarB.G(h661Var, 3, c841Var.d);
        z1kVarB.a(h661Var);
    }
}
